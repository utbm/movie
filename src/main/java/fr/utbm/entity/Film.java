package fr.utbm.entity;

public class Film  implements java.io.Serializable {

     private Integer id;
     private String title;
     private int copies;
     private String movieType;
     private Actor mainActor;

    public Film() {
    }

    public Film(Integer id, String title, int copies, String movieType) {
        this.id = id;
        this.title = title;
        this.copies = copies;
        this.movieType = movieType;
    }
    public Film(Integer id, String title, int copies, String movieType, Actor mainActor) {
       this.id = id;
       this.title = title;
       this.copies = copies;
       this.movieType = movieType;
       this.mainActor = mainActor;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public String getTitle() {
        return this.title;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }
    public int getCopies() {
        return this.copies;
    }
    
    public void setCopies(int copies) {
        this.copies = copies;
    }
    public String getMovieType() {
        return this.movieType;
    }
    
    public void setMovieType(String movieType) {
        this.movieType = movieType;
    }
    public Actor getMainActor() {
        return this.mainActor;
    }
    
    public void setMainActor(Actor mainActor) {
        this.mainActor = mainActor;
    }

    @Override
    public String toString() {
        return "Film{" + "id=" + id + ", title=" + title + ", copies=" + copies + ", movieType=" + movieType + ", mainActor=" + mainActor + '}';
    }

    public String serialize() {
        return id + ";" + title + ";" + copies + ";" + movieType + ";" + mainActor;
    }
}


