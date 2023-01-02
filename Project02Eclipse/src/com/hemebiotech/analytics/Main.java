package com.hemebiotech.analytics;

import java.util.List;

public class Main {
    public static void main(String[] args) {
//      Read the data from text file and returns a list of symptoms
        ReadSymptomDataFromFile dataToRead = new ReadSymptomDataFromFile("Project02Eclipse/Symptoms.txt");
        List<String> symptomsList = dataToRead.getSymptoms();


    }
}
