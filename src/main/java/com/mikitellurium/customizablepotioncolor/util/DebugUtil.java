package com.mikitellurium.customizablepotioncolor.util;

import java.util.ArrayList;

public class DebugUtil {

    public static <T> void debugPrint(String message, T toPrint) {
        System.out.println("-----" + message.toUpperCase() + ": " + toPrint);
    }

    public static void debugPrint(String message, ArrayList<String> toPrint) {
        for (String s : toPrint) {
            System.out.println("-----FROM ARRAYLIST<>-" + message.toUpperCase() + ": " + s);
        }
    }

    public static void debugPrint(String message, String[] toPrint) {
        for (String s : toPrint) {
            System.out.println("-----FROM ARRAY[]-" + message.toUpperCase() + ": " + s);
        }
    }

}
