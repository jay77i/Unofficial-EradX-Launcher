package org.jay.view;

import org.jay.Settings;
import org.jay.jlog.LogLevel;
import org.jay.jlog.Logger;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class Launcher extends JFrame {

    public static Dimension size;

    public Launcher() {

        setTitle("Eradication X Launcher");
        setUndecorated(true);
        setAlwaysOnTop(true);
        setResizable(false);
        setBackground(new Color(1.0f, 1.0f, 1.0f, 0f));

        BufferedImage banner;
        ImageIcon icon;
        JLabel label = new JLabel();

        // alternative tiny gif
//      size = new Dimension(128, 128);
//      ImageIcon icon = new ImageIcon(getClass().getClassLoader().getResource("Icon.gif"));
//      JLabel label = new JLabel(icon);
//      this.setContentPane(label);

        // big banner
        size = new Dimension(800, 160);
        try {
            banner = ImageIO.read(getClass().getClassLoader().getResource("Banner.png"));
            icon = new ImageIcon(banner);
            label.setIcon(icon);
            this.add(label);
        } catch (IOException e) {
            Logger.handle(e);
        }

        setSize(size);
        setLocationRelativeTo(null);
        setVisible(true);
    }

}
