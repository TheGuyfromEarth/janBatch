package oop;

public class Team {

    public static void main(String[] args) {

        // first player
        Player player1 = new Player();
        player1.name = "MS Dhoni";
        player1.isCaptain = true;
        player1.team = "CSK";
        player1.isRightHanded = true;
        player1.type = "Keeper Batsman";
        player1.jerseyNumber = 7;
        player1.runsScored = 300;

        // second player
        Player player2 = new Player();
        player2.name = "Sir Jadeja";
        player2.type = "All rounder";
        player2.jerseyNumber = 8;
        player2.team = "CSK";
        player2.isCaptain = false;
        player2.isRightHanded = false;
        player2.runsScored = 250;

        // third player
        Player player3 = new Player();
        player3.name = "Sir Jadeja";
        player3.type = "All rounder";
        player3.jerseyNumber = 8;
        player3.team = "CSK";
        player3.isCaptain = false;
        player3.isRightHanded = false;
        player3.runsScored = 400;

//        System.out.println(player2.name);
//        System.out.println(player1.name);
//        System.out.println(player1.isRightHanded);

        Player[] team = new Player[3];

        team[0] = player1;
        team[1] = player2;
        team[2] = player3;

        Player cricketer = team[1];
        System.out.println(cricketer.jerseyNumber);

        // find avg of runs scored
//        int sum = team[0].runsScored + team[1].runsScored;

        int sum = 0;

        for (int i = 0; i < team.length; i++) {
            sum += team[i].runsScored;
        }
        double avg = sum / team.length;
//        System.out.println(avg);

//        player1.printPlayerDetails();
//        player2.printPlayerDetails();

//        player1.printCricketerType("Good");

        System.out.println(player1.playerName("Mr"));
    }
}
