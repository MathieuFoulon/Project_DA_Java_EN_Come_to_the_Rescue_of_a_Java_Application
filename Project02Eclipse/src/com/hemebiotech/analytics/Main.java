package com.hemebiotech.analytics;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {

        // Read the data from text file and returns a list of symptoms
        ReadSymptomDataFromFile dataToRead = new ReadSymptomDataFromFile("Project02Eclipse/Symptoms.txt");
        List<String> symptomsList = dataToRead.getSymptoms();

        // Mapping and counting number of occurrences of symptoms to symptoms
        AnalyticsCounter analyticsCounter = new AnalyticsCounter();
        Map<String, Integer> symptomsMappedAndCounted = analyticsCounter.getSymptomsCounted(symptomsList);
        System.out.println(symptomsMappedAndCounted);

        // Creating results file to write, return filepath if ok, null if not
        CreateFile result = new CreateFile();
        File createdFile = result.createFile("results.out");

        // if file ok, write the mapped symptoms in it
        if (createdFile != null) {
            WriteMappedSymptomsToFile dataToWrite = new WriteMappedSymptomsToFile(createdFile.toString());
            dataToWrite.writeSymptoms(symptomsMappedAndCounted);
        }

    }
}
