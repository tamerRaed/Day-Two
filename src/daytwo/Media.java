package daytwo;

import java.util.ArrayList;

public class Media {

    private String title;
    private String releaseDate;
    private float rating;
    private int duration;
    private String language;
    private String poster;
    private Category category;
    private ArrayList<Person> persons;
    private boolean isFavorit;

    @Override
    public String toString() {
        return "Title : " + title + "\nReleaseDate : " + releaseDate + "\nRating : " + rating 
                + "\nDuration : " + duration + "\nLanguage : " + language + "\nPoster : " 
                + poster + "Category : " + category + ", isFavorit=" + isFavorit;
    }
    
    public Media(String title, String releaseDate, float rating, int duration,
            String language, String poster, Category category, ArrayList<Person> persons, boolean isFavorit) {
        this.title = title;
        this.releaseDate = releaseDate;
        this.rating = rating;
        this.duration = duration;
        this.language = language;
        this.poster = poster;
        this.category = category;
        this.persons = persons;
        this.isFavorit = isFavorit;
    }

    public boolean isIsFavorit() {
        return isFavorit;
    }

    public void setIsFavorit(boolean isFavorit) {
        this.isFavorit = isFavorit;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public float getRating() {
        return rating;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getPoster() {
        return poster;
    }

    public void setPoster(String poster) {
        this.poster = poster;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public ArrayList<Person> getPersons() {
        return persons;
    }

    public void setPersons(ArrayList<Person> persons) {
        this.persons = persons;
    }

}
