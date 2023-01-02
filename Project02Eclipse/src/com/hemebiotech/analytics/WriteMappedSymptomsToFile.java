package com.hemebiotech.analytics;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

public class WriteMappedSymptomsToFile implements ISymptomWriter {
    private final String filepath;

    /**
     * @param filepath a full or partial path to file to write symptoms in it
     */
    public WriteMappedSymptomsToFile(String filepath) {
        this.filepath = filepath;
    }

    @Override
    public void writeSymptoms(Map<String, Integer> symptomsMapped) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(filepath));
        try {
            // iterate map entries
            for (Map.Entry<String, Integer> entry :
                    symptomsMapped.entrySet()) {
                // put key and value separated by a colon
                bufferedWriter.write(entry.getKey() + ":" + entry.getValue());
                // new line
                bufferedWriter.newLine();
            }
            bufferedWriter.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                // always close the writer
                bufferedWriter.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }

}
