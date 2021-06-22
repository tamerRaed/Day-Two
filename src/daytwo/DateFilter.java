
package daytwo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class DateFilter implements MediaFilter{

    @Override
    public ArrayList<Media> filter(ArrayList<Media> medias) {
        Collections.sort(medias, new Comparator<Media>() {
            @Override
            public int compare(Media t, Media t1) {
                return t.getReleaseDate().compareTo(t1.getReleaseDate());
            }
        });
        return medias;
    }
    
}
