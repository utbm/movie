package fr.utbm.service;

import fr.utbm.entity.Film;
import fr.utbm.repository.FileMovieDao;

public class FilmService{
    public void registerFilm(Film f){
        FileMovieDao dao = new FileMovieDao();
        boolean isRegistered = dao.save(f);
        if (isRegistered) {
            System.out.println(f.toString());
        }else{
            System.out.println("enregistrement échoué");
        }
    }
}