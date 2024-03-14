package org.jay.view;

import org.jay.jlog.Logger;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;

public class Launcher extends JFrame {

    public static Dimension size;

    public Launcher() {

        size = new Dimension(950 / 2, 540 / 2);

        setTitle("Eradication X Launcher");
        setUndecorated(true);
        setAlwaysOnTop(true);
        setResizable(false);
        setBackground(new Color(1.0f, 1.0f, 1.0f, 0f));
        setSize(size);
        BufferedImage banner;
        try {
            banner = ImageIO.read(getClass().getClassLoader().getResource("Banner.png"));
            banner.getScaledInstance(size.width, size.height, Image.SCALE_SMOOTH);
            ImageIcon icon = new ImageIcon(banner);
            JLabel label = new JLabel();
            label.setIcon(icon);
            this.add(label);
        } catch (IOException e) {
            Logger.handle(e);
        }
        setLocationRelativeTo(null);
    }

    public void init() {
        setVisible(true);
    }

}
