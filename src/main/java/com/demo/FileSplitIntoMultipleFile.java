package com.demo;

import java.io.*;

public class FileSplitIntoMultipleFile {
    public static void main(String[] args) {
        String fileName = "D:\\Siddharth_Sahu\\Projects\\BNCBDataConversion\\csvfiles\\240\\20200514\\profile_240_202005141954.csv";
        int splitFileSize = 40000;
        int totalRecords = 57699;

        if (splitFileSize < totalRecords) {
            int noOfFiles = (int) Math.ceil((double) totalRecords / splitFileSize);
            String newFileName = fileName.substring(0, fileName.lastIndexOf("."));
            String record;
            int recordCount = 0;

            System.out.println("No. of files created " + noOfFiles);

            try (BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(fileName)))) {
                for (int i = 1; i <= noOfFiles; i++) {
                    String splitFileName = newFileName + "_" + i + ".txt";
                    try (BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(splitFileName)))) {
                        while ((record = br.readLine()) != null) {
                            bw.write(record);
                            bw.newLine();
                            recordCount++;

                            if (recordCount == splitFileSize) {
                                recordCount = 0;
                                break;
                            }
                        }
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}