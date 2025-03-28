package fr.utbm;

import fr.utbm.controller.DefaultFilmController;
import fr.utbm.entity.Film;
import fr.utbm.service.FilmService;

public class App1{
    public static void main(String[] args) {
        Film ducobu = new Film(0, "Ducobu 1", 500, "Comédie");
        // Film film = 
        DefaultFilmController controller = new DefaultFilmController();
        // var film = controller.registerFilmFromConsoleInput();
        FilmService filmService = new FilmService();
        filmService.registerFilm(ducobu);
    }
}