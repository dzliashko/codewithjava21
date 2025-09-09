package com.codewithjava21.chapter7;

import java.util.List;

public class GeminiAstronautsRDBMS {
    public static void main(String[] args) {
//        String url="jdbc:postgresql://localhost:5432/postgres";
        String url = System.getenv("POSTGRES_URL");
        String username = System.getenv("POSTGRES_USER");
        String password = System.getenv("POSTGRES_PASSWORD");

        AstronautPostgresDAL astronautDAL = new AstronautPostgresDAL(url, username, password);

        System.out.println("Project Gemini Astronauts:");

        List<String> geminiAstronauts = astronautDAL.getGeminiRoster();
        for (String g : geminiAstronauts) {
            System.out.println(g);
        }
    }
}
