package com.company;

import java.io.*;

/**
 * Created by User on 2017-12-20.
 */
public class Printer {

    public void scanFile(String fileName) {
        try (
                BufferedReader in = new BufferedReader(new FileReader(fileName))
        ) {
            String line;
            while ((line = in.readLine()) != null) {
                System.out.println(line);

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void copyFile(String fileName, String newFileName) {
        try {
            try (
                    BufferedWriter out = new BufferedWriter(new FileWriter(newFileName));
                    BufferedReader in = new BufferedReader(new FileReader(fileName))
            ) {
                String line;
                while ((line = in.readLine()) != null) {
                    out.write(line);

                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void countWords(String filename) {
        int count = 0;
        try (
                BufferedReader in = new BufferedReader(new FileReader(filename))
        ) {
            String line;
            while ((line = in.readLine()) != null) {
                String[] array = line.split(" ");
                int ilgis = array.length;
                count += ilgis;
            }
            System.out.println(count);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
