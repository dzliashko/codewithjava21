package com.codewithjava21.chapter7;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class AstronautPostgresDAL {
    private static PostgresConn postgresConn;

    protected record AstronautMission(
            String missionName,
            String startDate,
            String endDate,
            String astronautName
    ) {
    }

    public AstronautPostgresDAL(String url, String username, String password) {
        postgresConn = new PostgresConn(url, username, password);
    }

    public List<String> getGeminiRoster() {
        return getGeminiRoster(20);
    }

    private List<String> getGeminiRoster(int limit) {
        List<String> geminiRoster = new ArrayList<>();
        String astronautSQL = "select name from astronauts LIMIT " + limit;

        try {
            Statement pgStatement = postgresConn.getConn().createStatement();
            ResultSet geminiAstronauts = pgStatement.executeQuery(astronautSQL);
            while (geminiAstronauts.next()) {
                geminiRoster.add(geminiAstronauts.getString("name"));
            }
        } catch (SQLException e) {
            System.out.println(e.getErrorCode());
        }
        return geminiRoster;
    }
}
