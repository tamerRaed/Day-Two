package daytwo;

import java.util.ArrayList;

public class MediaControllerEditor {

    private ArrayList<Media> medias;

    public MediaControllerEditor(ArrayList<Media> medias) {
        this.medias = medias;
    }

    private boolean validateMediaInfo(Media media) {
        if (media.getDuration() < 0) {
            return false;
        } else {
            return true;
        }

    }

    public void saveMedia(Media media) {
        if (validateMediaInfo(media)) {
            medias.add(media);
        }
    }

    public void update() {
        
    }
}
