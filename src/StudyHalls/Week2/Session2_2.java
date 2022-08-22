package StudyHalls.Week2;

import java.util.Scanner;

public class Session2_2 {

    public static void main(String[] args) {

        //Set-up scanner to get data from User.
        Scanner input=new Scanner(System.in);

        System.out.println("What's your team ?");

        String userTeam=input.nextLine();

        String teamMascot=""; // we will use this variable to put our mascot.

        switch (userTeam){

            case "team1":
                teamMascot="eagle";
                break;
            case "team2":
                teamMascot="lion";
                break;
            case "team3":
                teamMascot="bull";
                break;
            case "team4":
                teamMascot="Dragon";
                break;
            case "team5":
                teamMascot="allogator";
                break;
            case "team6":
                teamMascot="Dolphin";
                break;
            default:
                teamMascot="Unknown";
        }

        System.out.println("you entered "+userTeam);
        System.out.println("Team's Mascot "+teamMascot);




    }
}
