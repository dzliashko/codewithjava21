package com.codewithjava21.chapter7;

import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

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

        System.out.println();

        Set<Integer> randomMissions = new HashSet<>();
        Random random = new Random();
        // generate 3 random numbers
        while (randomMissions.size() < 3) {
            int missionNumber = random.nextInt(10) + 3;
            randomMissions.add(missionNumber);
        }

        for (Integer missionNum : randomMissions) {

            StringBuilder mission = new StringBuilder("Gemini ");
            mission.append(missionNum.toString());
            List<AstronautPostgresDAL.AstronautMission> missionAstronauts =
                    astronautDAL.getMissionAstronauts(mission.toString());

            for (AstronautPostgresDAL.AstronautMission astronautMission : missionAstronauts) {
                System.out.print(astronautMission.missionName() + " ");
                System.out.print(astronautMission.startDate() + " -> ");
                System.out.print(astronautMission.endDate() + " - ");
                System.out.println(astronautMission.astronautName());
            }

            System.out.println();
        }

        PostgresConn.closePostgresConnection();

    }
}
