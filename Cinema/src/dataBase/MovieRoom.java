package dataBase;

import javax.xml.transform.Source;

public class MovieRoom {

    private final String name;
    private final String [][] seats;

    public MovieRoom (String name, int rowNum, int columnNum) {
        this.name = name;
        this.seats = new String[rowNum][columnNum];
    }



    public String getName() {
        return name;
    }

    public int getSeats() {
        return seats[0].length;
    }

    public int getRows() {
        return seats.length;
    }

    public void printVenue() {


        printCenteredProjectionScreen();

        printCenteredSeats();
    }



    private void printCenteredProjectionScreen() {

        StringBuilder centerScreen = new StringBuilder();
        StringBuilder screen = new StringBuilder();
        centerProjectScreen(centerScreen, screen);

        System.out.print(centerScreen);
        System.out.print(screen);
        System.out.println(centerScreen);
        System.out.print(centerScreen);
        System.out.print(screen);
        System.out.println(centerScreen);
    }

    private void centerProjectScreen(StringBuilder centerScreen, StringBuilder screen) {
        try {
            if (!(seats[0].length <= 9)) {
                centerScreen.append(" ".repeat(Math.max(1, seats[0].length + (seats[0].length - 9)/2)));

            } else {
                centerScreen.append(" ".repeat(Math.max(1, seats[0].length)));
            }
            screen.append("========".repeat(seats[0].length));
        } catch (ArrayIndexOutOfBoundsException ignored) {
        }

    }

    private void printCenteredSeats() {
        String blank;
        System.out.println();
        for (int i = 0; i < seats.length; i++) {
            for (int j = 0; j < seats[i].length; j++) {
                blank = (i < 9) ? " " : "";
                if (seats[i][j] == null) {
                    System.out.print("[ " + blank  + (i+1) + "-"+ (j + 1) +  "  ] ");
                } else {
//                    System.out.println("[ " + blank + " x   ] ");
                    System.out.print("[ " + blank  + "-" + "X"+ "-" +  "  ] ");
                }
            }
            System.out.println();
        }
        System.out.println("\n\nThis is the scheme of the room: "+ name +"\n");
    }

    public void setSetUnavailable(int row, int seat) {
        seats[row][seat] = "*";
    }


    public boolean isRowValid(int row) {
        return row < seats.length;
    }

    public boolean isSeatValid(int row) {
        return row < seats[0].length;
    }
}
