package com.pluralsight;

import java.util.Scanner;

public class ArcadeApp {
    public static void main(String[] args) {
/*      Write a program named ArcadeApp.
        Prompt the user for how much money (in dollars) they want to spend at the arcade.
        Example: "Enter the amount of money you want to spend: "
        Use a Scanner to read the input as a double.
        Convert the money into tokens.
        Each token costs $0.25.
        Use arithmetic to calculate how many tokens the user gets.
        Use casting if necessary to make sure the token count is an int.
        Now, let the user choose what type of game they want to play with a switch statement:
        Select a game:
        1 - Racing (cost: 4 tokens)
        2 - Shooting (cost: 3 tokens)
        3 - Dance (cost: 2 tokens)
        4 - Pinball (cost: 1 token)
        Using a switch, determine:
        The game’s token cost.
        How many times they can play that game (use integer division).
        How many tokens will be left over (use the modulo operator).
        Display the result using a format specifier for neatness, and a little string concatenation.
        Example output if the user entered $5 and chose option 2:
        You have $5.00, which gives you 20 tokens.
        You selected Shooting. Each game costs 3 tokens.
        You can play 6 times and will have 2 tokens left over.*/

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the amount of money you want to spend: $");
        double amount = input.nextDouble();
        input.nextLine();

        int tokens = (int) (amount / 0.25);

        System.out.print("1 - Racing (cost: 4 tokens) \n2 - Shooting (cost: 3 tokens) \n3 - Dance (cost: 2 tokens) \n4 - Pinball (cost: 1 token) \nSelect a game: ");
        int game = input.nextInt();

/*      double tokenCost = 0;
        int gameReplay = 0;
        int tokensLeft = 0;
        switch (game.toLowerCase()){ //Initially had switch (game) cases set to integer values corresponding to the game number, issue was needed to store game name to print later on
            case "racing":
                tokenCost = 4;
                gameReplay = (int) tokens / 4;
                tokensLeft = (int) tokens % 4;
                break;
            case "shooting":
                tokenCost = 3;
                gameReplay = (int) tokens / 3;
                tokensLeft = (int) tokens % 3;
                break;
            case "dance":
                tokenCost = 2;
                gameReplay = (int) tokens / 2;
                tokensLeft = (int) tokens % 2;
                break;
            case "pinball":
                tokenCost = 1;
                gameReplay = (int) tokens;
                break;
            default:
                System.out.println(game + " is not a valid game option.");
                System.exit(0);
        }*/

        int tokenCost;
        String gameName;
        int replays;
        int leftover = 0;
        switch (game) {
            case 1:
                tokenCost = 4;
                replays = tokens / tokenCost;
                leftover = tokens % tokenCost;
                gameName = "Racing";
                break;
            case 2:
                tokenCost = 3;
                replays = tokens / tokenCost;
                leftover = tokens % tokenCost;
                gameName = "Shooting";
                break;
            case 3:
                tokenCost = 2;
                replays = tokens / tokenCost;
                leftover = tokens % tokenCost;
                gameName = "Dance";
                break;
            case 4:
                tokenCost = 1;
                replays = tokens;
                gameName = "Pinball";
                break;
            default:
                System.out.println(game + " is not a valid game option.");
                return;
        }
        
        System.out.println("You have $" + amount + ", which gives you " + tokens + " tokens.");
        System.out.println("You selected " + gameName + ". Each game costs " + tokenCost + " tokens.");
        System.out.println("You can play " + replays + " times and will have " + leftover + " token(s) left over.");


    }
}
