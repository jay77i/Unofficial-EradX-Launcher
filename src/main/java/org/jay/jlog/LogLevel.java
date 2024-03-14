package org.jay.jlog;

import lombok.Getter;
import lombok.Setter;
import org.jay.jlog.utils.ANSI;

public enum LogLevel {
    ERROR(ANSI.RED),
    WARNING(ANSI.YELLOW),
    CRITICAL(ANSI.BG_BRIGHT_RED),
    SUCCESS(ANSI.GREEN),
    OUTPUT(ANSI.BLUE);

    @Getter @Setter
    private String colorCode;

    LogLevel(String code) {
        setColorCode(code);
    }
}
