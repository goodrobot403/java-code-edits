package com.goodrobot.misc;

public class MethodStackTrace {

    public static void main(String[] args) {
        firstMethod();
    }

    public static void firstMethod() {
        secondMethod();
    }

    public static void secondMethod() {
        nextMethod();
    }

    public static void nextMethod() {
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        for (int i = stackTraceElements.length - 1; i > 0; i--) {
            StackTraceElement ste = stackTraceElements[i];
            String classname = ste.getClassName();
            String methodName = ste.getMethodName();
            int lineNumber = ste.getLineNumber();
            System.out.println(classname + "." + methodName + ":" + lineNumber);
        }
    }
}
