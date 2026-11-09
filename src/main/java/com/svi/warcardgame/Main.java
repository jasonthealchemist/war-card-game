
package com.svi.warcardgame;

import com.svi.warcardgame.game.GameSetup;
import com.svi.warcardgame.game.WarCardGame;
import com.svi.warcardgame.models.Deck;
import com.svi.warcardgame.models.Player;
import java.util.NoSuchElementException;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        displayTitle();

        try {
            GameSetup gameSetup = new GameSetup(scanner);
            gameSetup.start();

        } catch (NoSuchElementException e) {
            System.out.println("\nInput closed. Exiting War Card Game.....");
        }finally{
            scanner.close();
        }
    }

        private static void displayTitle(){
            System.out.println("========== WAR CARD GAME ==========");
            System.out.println(" ");
    }
}