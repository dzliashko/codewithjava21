package com.codewithjava21.chapter2;

import java.math.RoundingMode;
import java.text.DecimalFormat;

public class MeasurementValue {
    private double inputValue;
    private String inputUOM;

    //    metric
    private double centimeters;
    private double meters;
    private double kilometers;

    //    imperial
    private double inches;
    private double feet;
    private double miles;

    private final int CENTIMETERS_PER_METER = 100;
    private final int METERS_PER_KILOMETER = 1000;
    private final int INCHES_PER_FOOT = 12;
    private final int FEET_PER_MILE = 5280;
    private final double METER_PER_FOOT = 0.3048d;

    private static final DecimalFormat dFormat = new DecimalFormat("0.00");
    private static final DecimalFormat mKmFormat = new DecimalFormat("0.0000");

    public MeasurementValue(String valueStr) throws Exception {
        parseInput(valueStr);
        runConversions();
    }

    public MeasurementValue(double value, String uom) throws Exception {
        this.inputValue = value;
        this.inputUOM = uom;
        runConversions();
    }

    private void parseInput(String input) {
        String[] params = input.trim().split(" ");
        inputValue = Double.parseDouble(params[0]);
        inputUOM = params[1];
    }

    private void runConversions() throws Exception {
        switch (inputUOM) {
            case "in" -> {
                inches = inputValue;
                feet = inches / INCHES_PER_FOOT;
                miles = feet / FEET_PER_MILE;
                convertImperialToMetric();
            }
            case "ft" -> {
                feet = inputValue;
                inches = feet * INCHES_PER_FOOT;
                miles = feet / FEET_PER_MILE;
                convertImperialToMetric();
            }
            case "mi" -> {
                miles = inputValue;
                feet = miles * FEET_PER_MILE;
                inches = feet * INCHES_PER_FOOT;
                convertImperialToMetric();
            }
            case "cm" -> {
                centimeters = inputValue;
                meters = centimeters / CENTIMETERS_PER_METER;
                kilometers = meters / METERS_PER_KILOMETER;
                convertMetricToImperial();
            }
            case "m" -> {
                meters = inputValue;
                centimeters = meters * CENTIMETERS_PER_METER;
                kilometers = meters / METERS_PER_KILOMETER;
                convertMetricToImperial();
            }
            case "km" -> {
                kilometers = inputValue;
                meters = kilometers * METERS_PER_KILOMETER;
                centimeters = meters * CENTIMETERS_PER_METER;
                convertMetricToImperial();
            }
            default -> throw new InvalidUOMException();
        }
    }

    private void convertImperialToMetric() {
        meters = feet * METER_PER_FOOT;
        centimeters = meters * CENTIMETERS_PER_METER;
        kilometers = meters * METERS_PER_KILOMETER;
    }

    private void convertMetricToImperial() {
        feet = meters / METER_PER_FOOT;
        inches = feet * INCHES_PER_FOOT;
        miles = feet / FEET_PER_MILE;
    }

    public String toString() {
        dFormat.setRoundingMode(RoundingMode.UP);
        mKmFormat.setRoundingMode(RoundingMode.UP);

        return "\ninches = " +
                dFormat.format(inches) +
                "\nfeet = " +
                dFormat.format(feet) +
                "\nmiles = " +
                dFormat.format(miles) +
                "\ncentimeters = " +
                dFormat.format(centimeters) +
                "\nmeters = " +
                dFormat.format(meters) +
                "\nkilometers = " +
                dFormat.format(kilometers);
    }
}

