package com.codewithjava21.chapter2;

import java.io.*;

public class SimpleFileWorker {
    public static void main(String[] args) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("gamesCatalog.txt"));
            writer.write("name, company, year\n");
            writer.write("Pitfall!, Activision, 1982\n");
            writer.write("Crackpots, Activision, 1983\n");
            writer.write("Yar's Revenge, Atari, 1981\n");
            writer.write("Warlords, Atari, 1981\n");
            writer.write("Defender, Atari, 1981\n");
            writer.write("Adventure, Atari, 1980\n");
            writer.close();
        } catch (IOException e) {
            System.out.println("Error writing to file");
            e.printStackTrace();
        }
        System.out.println("Writing to file finished");
        System.out.println();

        try {
            BufferedReader reader = new BufferedReader(new FileReader("gamesCatalog.txt"));
            String gameLine;
            while ((gameLine = reader.readLine()) != null) {
                System.out.println(gameLine);
            }
        } catch (IOException e) {
            System.out.println("Error writing to file");
            e.printStackTrace();
        }
    }
}
