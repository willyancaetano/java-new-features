package com.github.willyancaetano.java.features;

import java.text.NumberFormat;
import java.util.Locale;

public class CompactNumberFormat {

    public static void main(String[] args) {
        NumberFormat formatPtBr = NumberFormat.getCompactNumberInstance(new Locale("pt", "BR"), NumberFormat.Style.SHORT);
        formatPtBr.setMaximumFractionDigits(2);
        System.out.println(formatPtBr.format(10_000L));


        NumberFormat formatEnUs = NumberFormat.getCompactNumberInstance(new Locale("en", "US"), NumberFormat.Style.SHORT);
        formatEnUs.setMaximumFractionDigits(2);
        System.out.println(formatEnUs.format(10_000L));
    }
}