package com.zero.hmbrowser.log;

public class Log {
    private static final int LEVEL_DEBUG = 3;
    private static final int LEVEL_INFO = 2;
    private static final int LEVEL_WARN = 1;
    private static final int LEVEL_ERROR = 0;

    private static final int LEVEL = 3;

    public static void d(String tag, String msg) {
        if (LEVEL >= LEVEL_DEBUG) {
            log(tag, msg);
        }
    }

    public static void i(String tag, String msg) {
        if (LEVEL >= LEVEL_INFO) {
            log(tag, msg);
        }
    }

    public static void w(String tag, String msg) {
        if (LEVEL >= LEVEL_WARN) {
            log(tag, msg);
        }
    }

    public static void e(String tag, String msg) {
        if (LEVEL >= LEVEL_ERROR) {
            log(tag, msg);
        }
    }

    private static void log(String tag, String msg) {
        System.out.println(Thread.currentThread().getId() + "|" + tag + '|' + msg);
    }

}
