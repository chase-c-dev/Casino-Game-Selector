package game;
import util.gameSelector;

import java.util.ArrayList;
import java.util.Scanner;

//Blackjack game still work in progress

//This is a modified version of blackjack where only two cards are drawn and whoever is closer to 21 wins
public class blackjack extends game {

    public blackjack(int score, String name) {
        super(score, name); // takes constructor from game class, refers to parent class
    }

    public void card() throws InterruptedException {
        String[]cards = {"One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King", "Ace"};
        Integer[]values = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10, 11}; //Does not include ace values, ace counts as 1 or 11
        ArrayList<String> dealer = new ArrayList<String>();
        ArrayList<String> player = new ArrayList<String>();
        int min = 0;
        int max = cards.length;
        for (int i = 0; i < 2; i++){ //runs twice to add two cards to the player and dealer to compare
            dealer.add(cards[min + (int)(Math.random() * ((max - min) + 1))]); // adds a random card to the dealer
            player.add(cards[min + (int)(Math.random() * ((max - min) + 1))]); // adds a random card to the player
        }

        //array without ace card
        String[]cards2 = {"One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King", "Ace"};
        int dealtotal = 0;
        int playertotal = 0;
        for (int j = 0; j < cards2.length; j++){
            if (cards2[j] == dealer.get(0) || cards2[j] == dealer.get(1)){ //parses through deck and grabs card values
                dealtotal += values[j]; //adds from integer array to match card value
            }
            if (cards2[j] == player.get(0) || cards2[j] == player.get(1)){ //parses through deck and grabs card values
                playertotal += values[j]; //adds from integer array to match card value
            }

        int counter1  = dealtotal-21; // subtracts dealer total from winning number
        int counter2 = playertotal-21;  //subtracts dealer total from winning number
        //Now find if playertotal and dealtotal, which one is closer to 21??
            if (counter1 > counter2){ //checks for winner and loser
                System.out.println("Dealer Wins, You Lose!");
            }
            if (counter2 > counter1){ //checks for winner and loser
                System.out.println("You Win!");
            }
            if (counter1 == counter2){ //checks for winner and loser
                System.out.println("Tie!");
            }

            redo(); //checks to see if user wants to play again

        }

    }

    public void redo() throws InterruptedException {
        Scanner scan = new Scanner(System.in);
        System.out.println("Would you like to play again?");
        System.out.println("type y for yes and n for no?");
        System.out.println("Or type exit to return to game menu");
        String answer1 = scan.next();
        if (answer1.equals("y")) {
            card(); //runs blackjack again
        }
        if (answer1.equals("n")) {
            System.out.println("Game Over, Good Bye");
        }
        if (answer1.equals("exit")) {
            gameSelector gameSelector = new gameSelector();
            gameSelector.startUP(); //runs original game menu to choose another game
        }
    }


}
