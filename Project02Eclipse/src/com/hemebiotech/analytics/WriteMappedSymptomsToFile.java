package com.hemebiotech.analytics;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

public class WriteMappedSymptomsToFile implements ISymptomWriter {
    private final File filepath;

    /**
     * @param filepath a full or partial path to file to write symptoms in it, has to be File object.
     */
    public WriteMappedSymptomsToFile(File filepath) {
        this.filepath = filepath;
    }

    @Override
    public void writeSymptoms(Map<String, Integer> symptomsMapped) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(filepath));
        try {
            // iterates map entries and formats "String : Integer"
            for (Map.Entry<String, Integer> entry :
                    symptomsMapped.entrySet()) {
                bufferedWriter.write(entry.getKey() + " : " + entry.getValue());
                bufferedWriter.newLine();
            }
            bufferedWriter.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bufferedWriter.close();
                System.out.println("File " + filepath +" wrote and closed");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
