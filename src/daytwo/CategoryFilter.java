package daytwo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CategoryFilter implements MediaFilter {

    @Override
    public ArrayList<Media> filter(ArrayList<Media> medias) {
        Collections.sort(medias, new Comparator<Media>() {
            @Override
            public int compare(Media t, Media t1) {
                return t.getCategory().compareTo(t1.getCategory());
            }
        });
        return medias;
    }

}
