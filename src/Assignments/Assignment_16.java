package Assignments;

import java.util.Scanner;

public class Assignment_16 {
    public static void main(String[] args) {
        /*
         *John and Mike both play basketball in different teams. In the latest 3 games, John's team scored 89,
         * 120 and 103 points, while Mike's team scored 116, 94, and 123 points.
         *
         * 1. Calculate the average score for each team.
         *
         * 2. Decide which teams wins in average (highest average score), and print the winner to the console with if else statement.
         * Also include the average score in the output.
         *
         * 3. Then change the scores to show different winners.
         * Don't forget to take into acount there might be a draw (the same average score).
         */

        double JohnTeamAve=0; double MikeTeamAve=0;
        int JohnTeam1st=100;int JohnTeam2nd=100;int JohnTeam3rd=100;
        int MikeTeam1st=100;int MikeTeam2nd=100;int MikeTeam3rd=100;
        String winner="";

        JohnTeamAve=(JohnTeam1st+JohnTeam2nd+JohnTeam3rd)/3;
        MikeTeamAve=(MikeTeam1st+MikeTeam2nd+MikeTeam3rd)/3;

        if (JohnTeamAve>MikeTeamAve){
            winner="John's TEAM average score is : "+JohnTeamAve+"\nMike's TEAM average score is : " + MikeTeamAve
            +"\n\nThe winner is John's TEAM  \n\uD83C\uDFC6 Congratulations \uD83C\uDFC6";
        } else if (MikeTeamAve>JohnTeamAve){
            winner="Mike's TEAM average score is : "+MikeTeamAve+"\nJohn's TEAM average score is : " + JohnTeamAve
                    +"\n\nThe winner is Mike's TEAM  \n\uD83C\uDFC6 Congratulations \uD83C\uDFC6";
        }else winner="---- DRAW ---- "+ "\nJohn's TEAM average score is : " + JohnTeamAve
                + "\nMike's TEAM average score is : "+MikeTeamAve;

        System.out.println(winner);

    }
}
