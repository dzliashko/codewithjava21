package com.codewithjava21.chapter3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WorkingWithStrings {
    public static void main(String[] args) {
        String email = "victoria.ploetz@largecorp.com";
        int dotPos = email.indexOf(".");
        int dot2Pos = email.lastIndexOf(".");
        int atPos = email.indexOf("@");
        String firstName = email.substring(0, dotPos);
        String lastName = email.substring(dotPos + 1, atPos);
        String company = email.substring(atPos + 1, dot2Pos);

        firstName = properCase(firstName);
        lastName = properCase(lastName);
        company = properCase(company);

        System.out.printf("Name: %s\n", firstName);
        System.out.printf("Last Name: %s\n", lastName);
        System.out.printf("Company: %s\n", company);

        String messedUpEmail = "bObJoNeS@BIGGERCOMPANY.com";
        System.out.printf("messedUpEmail.toLower(): %s\n", messedUpEmail.toLowerCase());

        if (firstName.equals("Victoria")) {
            System.out.println("Your name is Victoria");
        } else {
            System.out.println("Sorry, your name is not Victoria");
        }

        String email2 = "khadiya8821@mnsu.edu";

        System.out.printf("Is business email? %s, %s\n", email, isBusinessEmail(email));
        System.out.printf("Is business email? %s, %s\n", email2, isBusinessEmail(email2));

        if (lastName.toUpperCase().startsWith("PL")) {
            System.out.printf("%s last name is definitely starts with PL\n", firstName);
        }

        String phoneNumber1 = "444-867-5309";
        String phoneNumber2 = "444-188-2300";

        if (phoneNumber1.contains("-188-")) {
            System.out.printf("%s phone number is definitely contains 188\n", phoneNumber1);
        }
        if (phoneNumber2.contains("-188-")) {
            System.out.printf("%s phone number is definitely contains 188\n", phoneNumber2);
        }

        Pattern phone188Pattern = Pattern.compile("[0-9]{3}-188-[0-9]{4}");
        Matcher phone188Matcher1 = phone188Pattern.matcher(phoneNumber1);
        Matcher phone188Matcher2 = phone188Pattern.matcher(phoneNumber2);

        if (phone188Matcher1.find()) {
            System.out.printf("%s phone number is definitely contains 188 (regex)\n", phoneNumber1);
        }
        if (phone188Matcher2.find()) {
            System.out.printf("%s phone number is definitely contains 188 (regex)\n", phoneNumber2);
        }

        Pattern validPhonePattern = Pattern.compile("[0-9]{3}-[0-9]{3}-[0-9]{4}");
        Matcher phoneMatcher1 = validPhonePattern.matcher(phoneNumber1);
        Matcher phoneMatcher2 = validPhonePattern.matcher(phoneNumber2);

        if (phoneMatcher1.find()) {
            System.out.printf("%s phone number is correct phone number (regex)\n", phoneNumber1);
        }
        if (phoneMatcher2.find()) {
            System.out.printf("%s phone number is correct phone number (regex)\n", phoneNumber2);
        }

        String nickname = "Toria";
        String nickname2 = "Vicky";
        String robert = "Robert";
        String nickname3 = "Rob";
        String nickname4 = "Bob";

        System.out.println("\nPattern for Bob: ");
        Pattern bobPattern = Pattern.compile("[B][R]ob");

        matchName(bobPattern, nickname);
        matchName(bobPattern, nickname2);
        matchName(bobPattern, nickname3);
        matchName(bobPattern, nickname4);
        matchName(bobPattern, robert);
        matchName(bobPattern, firstName);

        System.out.println("\nPattern for Victoria: ");
        Pattern victoriaPattern = Pattern.compile("[Vic][T|t]oria");

        matchName(bobPattern, nickname);
        matchName(bobPattern, nickname2);
        matchName(bobPattern, nickname3);
        matchName(bobPattern, nickname4);
        matchName(bobPattern, robert);
        matchName(bobPattern, firstName);
    }

    private static String properCase(String str) {
        char firstLetter = Character.toUpperCase(str.charAt(0));
        return firstLetter + str.substring(1);
    }

    private static boolean isBusinessEmail(String email) {
        boolean validEmail = true;

        if (email.endsWith("@gmail.com") || email.endsWith(".edu")) {
            validEmail = false;
        }
        return validEmail;
    }

    private static void matchName(Pattern pattern, String name) {
        Matcher matcher = pattern.matcher(name);
        if (matcher.find()) {
            System.out.printf("Match found! You welcome %s!\n", name);
        } else {
            System.out.printf("Match not found! %s\n", name);
        }
    }
}
