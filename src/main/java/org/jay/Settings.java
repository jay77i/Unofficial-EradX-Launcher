package org.jay;

import org.jay.view.Launcher;

public class Settings {

    public static String clientUrl = "https://github.com/jay77i/Unofficial-EradX-Launcher/raw/main/.bin/EradicationX.jar";
    public static String clientPath = "C:\\Users\\" + System.getenv("USERNAME") + "\\EXPP.dat";
    public static String cachePath = "C:\\Users\\" + System.getenv("USERNAME") + "\\PPcache";

    public static String JvmArgs = "--add-opens java.base/java.lang.reflect=ALL-UNNAMED --add-opens java.base/java.lang=ALL-UNNAMED --add-opens java.desktop/java.beans=ALL-UNNAMED -jar";
    public static String JarArgs = "";

}
