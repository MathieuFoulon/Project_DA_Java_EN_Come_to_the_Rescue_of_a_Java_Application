package com.hemebiotech.analytics;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        ReadSymptomDataFromFile dataToRead = new ReadSymptomDataFromFile("Project02Eclipse/Symptoms.txt");
        List<String> symptomsList = dataToRead.getSymptoms();
        System.out.println(symptomsList);
    }
}
