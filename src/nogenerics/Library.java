package nogenerics;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Newspaper> newspaperList = new ArrayList<>();
    private List<Video> videoList = new ArrayList<>();
    private List<Book> bookList = new ArrayList<>();

    public Library() {
    }

    public void addBook(Book book){
        bookList.add(book);
    }
    public void addNewspaper(Newspaper newspaper){
        newspaperList.add(newspaper);
    }

    public void addVideo(Video video){
        videoList.add(video);
    }

    public void getBookList(){
        for ( Book book  : bookList){
            System.out.println(book);
        }

    }
    public void getVideoList(){
        for ( Video video  : videoList){
            System.out.println(video);
        }
    }
    public void getNewspaperList(){
        for ( Newspaper newspaper  : newspaperList){
            System.out.println(newspaper);
        }

    }





}
