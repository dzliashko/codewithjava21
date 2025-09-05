package com.codewithjava21.chapter4;

public class CoordinateArrays {
    private static final String[][] gameGrid = new String[5][5];

    public static void main(String[] args) {
        gameGrid[3][2] = "Byorki - Ranger";
        gameGrid[3][3] = "K'lar - Fighter";
        gameGrid[4][3] = "Tyrenni - Wizard";
        gameGrid[1][3] = "Athena - Rogue";
        gameGrid[0][1] = "Jarrod - Cleric";

        System.out.println(gameGrid[4][3]);

        printGrid();
        movePlayer('N', 1, 3);
        printGrid();
    }

    private static void printGrid() {
        System.out.println();
        for (int indexY = 4; indexY > -1; indexY--) {
            System.out.print(indexY);
            for (int indexX = 0; indexX < 5; indexX++) {
                if ((gameGrid[indexX][indexY] == null) || (gameGrid[indexX][indexY].isEmpty())) {
                    System.out.print((char) 9634);
                } else {
                    System.out.print(gameGrid[indexX][indexY].charAt(0));
                }
            }
            System.out.println();
        }
        System.out.println(" 01234");
    }

    private static void movePlayer(char direction, int currentX, int currentY) {
        int newX = currentX;
        int newY = currentY;

        switch (Character.toUpperCase(direction)) {
            case 'N' -> newY++;
            case 'Y' -> newY--;
            case 'W' -> newX--;
            case 'E' -> newX++;
        }

        String hero = gameGrid[currentX][currentY];
        gameGrid[newX][newY] = hero;
        gameGrid[currentX][currentY] = "";
        System.out.printf("Hero moved from %d-%d to %d-%d\n", currentX, currentY, newX, newY);
    }
}
