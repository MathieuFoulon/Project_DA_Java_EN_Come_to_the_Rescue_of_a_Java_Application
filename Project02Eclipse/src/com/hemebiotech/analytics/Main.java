package com.hemebiotech.analytics;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;

public class Main {

    public static final String symptomFilepath = "Project02Eclipse/Symptoms.txt";
    public static final String resultFilepath = "results.out";
    public static void main(String[] args) throws IOException {

        // Read the data from text file and returns a list of symptoms
        ReadSymptomDataFromFile dataToRead = new ReadSymptomDataFromFile(symptomFilepath);
        List<String> symptomsList = dataToRead.getSymptoms();

        // Mapping and counting number of occurrences of symptoms to symptoms
        AnalyticsCounter analyticsCounter = new AnalyticsCounter();
        Map<String, Integer> symptomsMappedAndCounted = analyticsCounter.getSymptomsCounted(symptomsList);

        // Creating results file to write, return filepath if ok, null if not
        CreateFile result = new CreateFile();
        File createdFile = result.createFile(resultFilepath);

        // If file ok, write the mapped symptoms in it
        WriteMappedSymptomsToFile dataToWrite = new WriteMappedSymptomsToFile(createdFile);
        dataToWrite.writeSymptoms(symptomsMappedAndCounted);


    }
}
