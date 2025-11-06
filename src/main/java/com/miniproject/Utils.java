package com.miniproject;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Utility class for common helper functions
 */
public class Utils {
    
    private static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
    
    /**
     * Gets the current timestamp as a formatted string
     * @return Current timestamp
     */
    public static String getCurrentTimestamp() {
        return LocalDateTime.now().format(FORMATTER);
    }
    
    /**
     * Validates if a number is within a specific range
     * @param number The number to validate
     * @param min Minimum value (inclusive)
     * @param max Maximum value (inclusive)
     * @return true if number is within range, false otherwise
     */
    public static boolean isInRange(double number, double min, double max) {
        return number >= min && number <= max;
    }
    
    /**
     * Formats a number to specified decimal places
     * @param number The number to format
     * @param decimalPlaces Number of decimal places
     * @return Formatted number as string
     */
    public static String formatNumber(double number, int decimalPlaces) {
        return String.format("%%.%df", decimalPlaces).formatted(number);
    }
}