package com.hemebiotech.analytics;

import java.io.File;
import java.io.IOException;

public class CreateFile {
    public File createFile(String filepath){
        try {
            File myFile = new File(filepath);
            if (myFile.createNewFile()) {
                System.out.println("File has been created : " + myFile.getName());
            } else {
                System.out.println("File already exists.");
            }
            return myFile;
        } catch (IOException e){
            System.out.println("Error occurred.");
            e.printStackTrace();
        }

        return null;
    }
}
