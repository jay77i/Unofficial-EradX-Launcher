package org.jay;

import org.jay.jlog.LogLevel;
import org.jay.jlog.Logger;
import org.jay.view.Launcher;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class Main {

    public static Launcher launcher  = new Launcher();

    public static void main(String[] args) {
        Logger.log(LogLevel.OUTPUT, "creating sequence...");

        try {
            Logger.log(LogLevel.OUTPUT, "downloading latest jar from " + Settings.clientUrl);
            InputStream input = new URL(Settings.clientUrl).openStream();
            Logger.log(LogLevel.WARNING, "copying client to " + Settings.clientPath);
            Files.copy(input, Paths.get(Settings.clientPath), StandardCopyOption.REPLACE_EXISTING);

        } catch (Throwable e) {
            Logger.log(LogLevel.ERROR, "failed to connect to " + Settings.clientUrl);
            Logger.handle(e);
        }

        try {
            Logger.log(LogLevel.SUCCESS, "launching " + Settings.clientPath);
            Process process = Runtime.getRuntime().exec(Settings.JvmArgs + Settings.clientPath);
            while (!process.isAlive())
                Thread.sleep(1);
        } catch (IOException | InterruptedException e) {
            Logger.log(LogLevel.ERROR, "failed to launch client!");
            Logger.handle(e);
        }

        System.exit(0);
    }

}