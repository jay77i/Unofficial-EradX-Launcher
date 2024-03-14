package org.jay.jlog;

import org.jay.jlog.utils.ANSI;

public class Logger {

    public static void write(String content) {
        System.out.print(content);
    }
    public static void writeln(String content) {
        System.out.println(content);
    }

    public static void log(LogLevel level, String content) {
        String callerClass = new Exception().getStackTrace()[1].getClassName();
        write(ANSI.MAGENTA + callerClass + ANSI.RESET + " $\n");
        writeln(level.getColorCode() + level.name().toLowerCase() + ANSI.RESET + " : " + content);
    }

    public static void handle(Throwable throwable) {
        log(LogLevel.CRITICAL, throwable.getMessage());
        write(LogLevel.ERROR.getColorCode());
        throwable.printStackTrace();
        write(ANSI.RESET + "\n");
    }

}
