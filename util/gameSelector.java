package util;

import game.blackjack;
import game.slotmachine;

import java.util.Scanner;
public class gameSelector {

    public void startUP () throws InterruptedException {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to the Casino Game");
        System.out.println("Please input the name of one of the games listed below");
        System.out.println("slotmachine" + "  " + "blackjack");

        String gamename = input.next(); //user input

        gameAsk(gamename);

    }

    public void gameAsk (String gamename) throws InterruptedException { //method compares user input to game names
        if (gamename.equals("slotmachine")) {
            System.out.println("What is Your Username?");
            Scanner input = new Scanner(System.in);
            String name = input.next(); //gets users username
            slotmachine slotmachine = new slotmachine(0, name);
            slotmachine.slot(); //Starts up slotmachine program
        }
        else if (gamename.equals("blackjack")) {
            System.out.println("What is your Username?");
            Scanner input = new Scanner(System.in);
            String name2 = input.next();
            blackjack blackjack = new blackjack(0, name2);
            blackjack.card();
        } else {
            System.out.println("Incorrect Input\n");
            startUP();
        }
    }
}
