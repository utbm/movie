package fr.utbm.controller;

import java.util.Scanner;

public class DefaultFilmController {
    public void registerFilmFromConsoleInput(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Quel est le nom du film ?");
        String titre = sc.nextLine();
        System.out.println("Quel est le nombre d'exemplaire du film à afficher ?");
        int nbExemplaire = Integer.parseInt(sc.nextLine());
    }
}
