package com.hemebiotech.analytics;


import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class AnalyticsCounter {

    public Map<String, Integer> getSymptomsCounted(List<String> symptomsList) {

        Map<String, Integer> symptomsMapped = new TreeMap<>(); // we use treemap for automatic sorting purpose
        symptomsList.forEach( symptom ->
                symptomsMapped.merge(symptom, 1 , Integer::sum) // Integer::sum is equivalent as ( previous , one) -> previous + one
        );

        return symptomsMapped;
    }

}
