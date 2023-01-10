package com.hemebiotech.analytics;


import java.util.List;
import java.util.Map;
import java.util.TreeMap;


public class AnalyticsCounter {

    /**
     * Basically a Mapper method, instance of a TreeMap for sorting purpose, and processes to count number of
     * occurrences to map it to the symptom.
     * @param symptomsList , a string list of symptoms
     * @return symptomsMapped , TreeMap object of the list of symptoms mapped with the number of occurrences
     * found on the symptomsList
     */
    public Map<String, Integer> getSymptomsCounted(List<String> symptomsList) {

        Map<String, Integer> symptomsMapped = new TreeMap<>();
        symptomsList.forEach( symptom ->
                // Integer::sum is equivalent as ( previous , one) -> previous + one
                symptomsMapped.merge(symptom, 1 , Integer::sum)
        );

        return symptomsMapped;
    }

}
