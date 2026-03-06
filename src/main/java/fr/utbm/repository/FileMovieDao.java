package fr.utbm.repository;

import java.io.FileWriter;
import java.io.IOException;

import fr.utbm.entity.Film;

public class FileMovieDao {
    public boolean save(Film movie){
        FileWriter writer;
        boolean isOk = false;
        try {
            writer = new FileWriter("./films.txt", true);
            writer.write(movie.toString());
            isOk = true;
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e){
            e.printStackTrace();
        }

        return isOk;
    }
}
