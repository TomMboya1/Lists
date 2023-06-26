package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> cityNames = Arrays.asList(
                "nairobi",
                "mombasa",
                "kakamega"
        );

        try {
            cityNames.add("kisumu");
        } catch (UnsupportedOperationException e) {
            System.out.println("Cannot add a city to the non-mutable list.");
        }

        // Try to change the 2nd item of the array to "Tegucigalpa"
        cityNames.set(1, "Tegucigalpa");

        // Print the content of cityNames
        System.out.println("cityNames: " + cityNames);

        // Define a mutable empty List of strings called kingsOfRome
        List<String> kingsOfRome = new ArrayList<>();

        // Insert the names of the 7 kings of Rome into the mutable list
        kingsOfRome.addAll(Arrays.asList(
                "Romulus",
                "Numa Pompilius",
                "Tullus Hostilius",
                "Ancus Marcius",
                "Tarquinius Priscus",
                "Servius Tullius",
                "Tarquinius Superbus"
        ));

        // Print the content of kingsOfRome
        System.out.println("kingsOfRome: " + kingsOfRome);

        // Convert kingsOfRome into an array called kingsOfRomeArray
        String[] kingsOfRomeArray = kingsOfRome.toArray(new String[0]);


        kingsOfRomeArray[6] = "Lucius Tarquinius Supercar";

        // Print the content of kingsOfRomeArray
        System.out.println("kingsOfRomeArray: " + Arrays.toString(kingsOfRomeArray));
    }
}

