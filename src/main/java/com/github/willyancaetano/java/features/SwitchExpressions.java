package com.github.willyancaetano.java.features;

public class SwitchExpressions {

    public static void main(String[] args) {
        String value = "AMARELO";
        System.out.println(translateToEnglish(value));
        System.out.println(translateToEnglishV2(value));
    }

    private static String translateToEnglish(String color) {
        switch (color) {
            case "AMARELO" -> { return "YELLOW"; }
            default -> { return "NOT EXISTS";}
        }
    }

    private static String translateToEnglishV2(String color) {
        var result = switch (color) {
            case "AMARELO" -> "YELLOW";
            case "VERMELHO" -> "RED";
            case "VERDE" -> "GREEN";
            default -> "NOT EXISTS";
        };

        return result;
    }

    private static boolean isTodayHoliday(String dayOfWeek) {
        return switch (dayOfWeek) {
            case "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY" -> false;
            case "SATURDAY", "SUNDAY" -> true;
            default -> throw new IllegalArgumentException("What's a " + dayOfWeek);
        };
    }
}
