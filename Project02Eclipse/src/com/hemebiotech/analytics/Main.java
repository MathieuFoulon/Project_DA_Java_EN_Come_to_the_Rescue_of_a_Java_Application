package com.hemebiotech.analytics;

import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

//      Read the data from text file and returns a list of symptoms
        ReadSymptomDataFromFile dataToRead = new ReadSymptomDataFromFile("Project02Eclipse/Symptoms.txt");
        List<String> symptomsList = dataToRead.getSymptoms();

//      Mapping and counting number of occurrences of symptoms to symptoms
        AnalyticsCounter analyticsCounter = new AnalyticsCounter();
        Map<String, Integer> symptomsMappedAndCounted = analyticsCounter.getSymptomsCounted(symptomsList);
        System.out.println(symptomsMappedAndCounted);
    }
}
