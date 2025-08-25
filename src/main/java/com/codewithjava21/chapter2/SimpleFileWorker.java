package com.codewithjava21.chapter2;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class SimpleFileWorker {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("gamesCatalog.txt");
            writer.write("name, company, year\n");
            writer.write("Pitfall!, Activision, 1982\n");
            writer.close();
        } catch (IOException e) {
            System.out.println("Error writing to file");
            e.printStackTrace();
        }
        System.out.println("Writing to file finished");
    }
}
