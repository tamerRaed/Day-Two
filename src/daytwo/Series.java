
package daytwo;

import java.util.ArrayList;

public class Series extends Media{
    private String seasons;

    public Series(String seasons, String title, String releaseDate, float rating, int duration, String language, String poster, Category category, ArrayList<Person> persons, boolean isFavorit) {
        super(title, releaseDate, rating, duration, language, poster, category, persons, isFavorit);
        this.seasons = seasons;
    }

    @Override
    public String toString() {
        return super.toString() + "\nSeasons : " + seasons;
    }
    
   

    public String getSeasons() {
        return seasons;
    }

    public void setSeasons(String seasons) {
        this.seasons = seasons;
    }
    
}
