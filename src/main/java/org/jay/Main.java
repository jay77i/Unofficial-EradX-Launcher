package org.jay;

import org.jay.jlog.LogLevel;
import org.jay.jlog.Logger;
import org.jay.view.Launcher;

public class Main {

    public static Launcher launcher;

    public static void main(String[] args) {
        Logger.log(LogLevel.OUTPUT, "creating sequence...");

        launcher = new Launcher();

        launcher.init();
    }

}