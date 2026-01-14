package com.alaharranhonor.swlm.util;

public class SWLMUtil {

    public static String checkTextOverflow(String text, int maxLimit) {
        if (text.length() > maxLimit - 2) {
            return text.substring(0, maxLimit - 2) + "...";
        } else {
            return text;
        }
    }
}