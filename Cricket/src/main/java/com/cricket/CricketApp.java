package com.cricket;

public class CricketApp {
    public static void main(String[] args) {
        // Create an instance of the Class
        Class player = new Class("Shiraaz", 50, 30);

        // Print the player's details
        System.out.println(player);

        // Update the player's batting and bowling numbers
        player.setNumberB(100);
        player.setNumberBowl(12);

        // Print the updated player's details
        System.out.println("Player Name: " + player.getPlayerName());
        System.out.println("Batting: Runs Made " + player.getNumberB());
        System.out.println("Bowling Overs: " + player.getNumberBowl());



    }
}
