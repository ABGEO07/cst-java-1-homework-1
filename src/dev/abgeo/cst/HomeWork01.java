package dev.abgeo.cst;

/**
 * CST Java I - Homework 01.
 *
 * @author Temuri Takalandze <me@abgeo.dev>
 */
public class HomeWork01 {
    private final double MILE_CONSTANT = 0.62137;
    private final double FAHRENHEIT_CONSTANT_1 = 32;
    private final double FAHRENHEIT_CONSTANT_2 = 9.0 / 5.0;
    private final double POUND_CONSTANT = 2.2046;

    /**
     * Convert given Kilometers to Miles.
     *
     * @param kilometers Distance in Kilometers for converting.
     * @return Converted distance in Miles.
     */
    public double km2Mile(double kilometers) {
        return kilometers * MILE_CONSTANT;
    }

    /**
     * Convert given Miles to Kilometers.
     *
     * @param miles Distance in Miles for converting.
     * @return Converted distance in Kilometers.
     */
    public double mile2Km(double miles) {
        return miles / MILE_CONSTANT;
    }

    /**
     * Convert given Celsius to Fahrenheit.
     *
     * @param celsius Temperature in Celsius for converting.
     * @return Converted temperature in Fahrenheit.
     */
    public double celsius2Fahrenheit(double celsius) {
        return celsius * FAHRENHEIT_CONSTANT_2 + FAHRENHEIT_CONSTANT_1;
    }

    /**
     * Convert given Fahrenheit to Celsius.
     *
     * @param fahrenheit Temperature in Fahrenheit for converting.
     * @return Converted temperature in Celsius.
     */
    public double fahrenheit2Celsius(double fahrenheit) {
        return (fahrenheit - FAHRENHEIT_CONSTANT_1) / FAHRENHEIT_CONSTANT_2;
    }

    /**
     * Convert given Kilograms to Pounds.
     *
     * @param kilograms Weight in Kilograms for converting.
     * @return Converted weight in Pounds.
     */
    public double kg2Lbs(double kilograms) {
        return kilograms * POUND_CONSTANT;
    }

    /**
     * Convert given Pounds to Kilograms.
     *
     * @param pounds Weight in Pounds for converting.
     * @return Converted weight in Kilograms.
     */
    public double lbs2Kg(double pounds) {
        return pounds / POUND_CONSTANT;
    }
}
