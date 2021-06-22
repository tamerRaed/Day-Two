
package daytwo;

import java.util.ArrayList;

public class MediaController {
    private ArrayList<Media> medias;

    public MediaController(ArrayList<Media> medias) {
        this.medias = medias;
    }
    
    public void listMedias(){
        for(Media media : medias){
            System.out.println(media.toString());
            System.out.println("----------------------------------");
        }
    }
    
    public void addToFavorite(Media media){
        media.setIsFavorit(true);
    }
}
