package com.hemebiotech.analytics;

import java.io.IOException;
import java.util.Map;

/**
 *
 * Write symptom data to a file
 * The file has to be created before calling this class
 */

public interface ISymptomWriter {
    /**
     *
     * @param symptomsMapped the data to write, any Map object like "String,Int"
     * @throws IOException Throws exception if file can't be created properly
     */
    void writeSymptoms(Map<String, Integer> symptomsMapped) throws IOException;
}
