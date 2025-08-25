package com.codewithjava21.chapter2;

import java.util.Scanner;

public class MetricUnitConverter {
    public static void main(String[] args) {
        System.out.println("Convert metric to imperial and vice versa");
        System.out.println("Use only these UM: (in, ft, mi, cm, m, km)");
        System.out.println("Examples: (14 ft, 5 km)");
        System.out.print("Enter a number and it's UM:");

        Scanner input = new Scanner(System.in);
        String inputStr = input.nextLine();
        input.close();

        // check for spaces
        int spacePos = inputStr.indexOf(" ");
        if (spacePos > 0) {
            try {
                MeasurementValue measurementValue = new MeasurementValue(inputStr);
                System.out.println(measurementValue.toString());
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } else {
            System.out.println("Check your input format\n must be a space between value and UM");
        }
    }
}
