package com.chmnu_ki_123.k3;

public class UnicodeCharacterDemo {
    public static void main(String[] args) {
        // Storing Unicode characters using escape sequences
        char letterLo = '\u15dc';
        // Storing Unicode characters directly
        char voiceSymbol = 'ˬ';
        // Printing the stored Unicode characters
        System.out.println("Stored Unicode Characters using Escape Sequences:");
        System.out.println("Canadian Syllabics Carrier Thu: " + letterLo);
        System.out.println("\nStored Unicode Characters Directly:");
        System.out.println("Modifier Letter Voicing: " + voiceSymbol);
    }
}