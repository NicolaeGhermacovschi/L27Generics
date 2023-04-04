package generics;

import java.util.ArrayList;
import java.util.List;

public class LibraryGenerics<T> {
    private List<T> collectionMedia = new ArrayList<>();

    public void addMedia(T media){
        collectionMedia.add(media);
    }

    public void getMedia(){
        for (T media : collectionMedia){
            System.out.println(media);
        }
    }

}
