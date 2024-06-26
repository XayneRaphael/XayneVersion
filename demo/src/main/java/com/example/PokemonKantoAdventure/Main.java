package com.example.PokemonKantoAdventure;

import java.util.Scanner;

public class Main {

    public static Player player1;
    public static Player player2;
    public static Player player3;

    // private static Map<String, PokemonKantoAdventure.City> cities = new HashMap<>();
    private static CityManager cityManager;// = new PokemonKantoAdventure.CityManager();
    private static String currentCity = "Pallet Town"; // Start at Pallet Town
    public static char[][] maze =
            {
                    {'#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#'},
                    {'#', 'S', '.', '.', '.', '.', '#', '.', '.', '.', '.', '.', '.', '.', '.', '.', '#'},
                    {'#', '#', '#', '#', '#', '.', '#', '.', '#', '#', '#', '#', '#', '#', '#', '#', '#'},
                    {'#', '.', '.', '.', '#', '.', '#', '.', '#', '.', '.', '.', 'G', '.', '.', '.', '#'},
                    {'#', '#', '#', '.', '#', '.', '#', '.', '#', 'G', '#', '#', '#', '.', '#', '.', '#'},
                    {'#', '.', '.', '.', '#', '.', '.', '.', '.', '.', '.', '.', '.', '.', 'G', '.', '#'},
                    {'#', '#', '#', '#', '#', 'G', '#', '.', '#', '#', '#', '#', '#', '#', '#', '.', '#'},
                    {'#', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '.', '#', '.', '.', '.', '#'},
                    {'#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', '#', 'E', '#'}
            };

    public static Player currentPlayer;

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        GameFlow gameFlow = new GameFlow();
        gameFlow.setPokemon();
        cityManager = new CityManager();
        gameFlow.start();


        MemoryCartridge.getUserSelection();

//        System.out.println("HEREEEEEEEEEEEE");
////        System.out.println(player1.printPokemon());
        while (true) {
            gameFlow.intermediate(currentPlayer);
        }

    }


}