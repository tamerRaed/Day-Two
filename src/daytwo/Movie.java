
package daytwo;

import java.util.ArrayList;

public class Movie extends Media{
    private boolean isWatched;
    private int watchTime;

    public Movie(boolean isWatched, int watchTime, String title, String releaseDate, float rating, int duration, String language, String poster, Category category, ArrayList<Person> persons, boolean isFavorit) {
        super(title, releaseDate, rating, duration, language, poster, category, persons, isFavorit);
        this.isWatched = isWatched;
        this.watchTime = watchTime;
    }

    @Override
    public String toString() {
        super.toString();
        return super.toString() + "\nIs Watched : " + isWatched + "\nWatch Time : " + watchTime;
    }

    public boolean isIsWatched() {
        return isWatched;
    }

    public void setIsWatched(boolean isWatched) {
        this.isWatched = isWatched;
    }

    public int getWatchTime() {
        return watchTime;
    }

    public void setWatchTime(int watchTime) {
        this.watchTime = watchTime;
    }
   
    
}
