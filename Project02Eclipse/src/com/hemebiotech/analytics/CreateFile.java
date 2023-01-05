package com.hemebiotech.analytics;

import java.io.File;
import java.io.IOException;

/**
 * The only purpose of this class is to create a file with his method createFile
 */
public class CreateFile {
    /**
     * @param filepath the filepath to the file to create like "/directory/file.extension"
     * @return myFile if ok, null if not.
     */
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
