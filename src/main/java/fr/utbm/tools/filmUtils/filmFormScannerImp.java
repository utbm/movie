package fr.utbm.tools.filmUtils;

import java.util.Scanner;

import fr.utbm.entity.Film;

public class filmFormScannerImp implements IFilmForm {
    public Film createFilmFromInput(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Quel est le nom du film ?");
        String titre = sc.nextLine();
        System.out.println("Quel est le nombre d'exemplaire du film ?");
        int nbExemplaire = Integer.parseInt(sc.nextLine());

        Film film = new Film(0, titre, nbExemplaire, "Comédie");
        
        return film;
    }
}