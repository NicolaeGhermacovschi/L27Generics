import generics.LibraryGenerics;
import nogenerics.*;
public class Main {
    public static void main(String[] args) {



        Library library = new Library();
        library.addBook(new Book("book name1","autho1",124.4, 150, "drama"));
        library.addBook(new Book("book name2","autho1",126.4, 165, "drama"));
        library.addBook(new Book("book name3","autho1",125.4, 1230, "drama"));
        library.addVideo(new Video("video name1","autho2",1425.4, "Movies",120.0));
        library.addVideo(new Video("video name2","autho2",2425.4, "Movies",126.0));
        library.addVideo(new Video("video name3","autho2",425.4, "Movies",110.0));
        library.addNewspaper(new Newspaper("newspaper name","autho3",55.4,12));
        library.addNewspaper(new Newspaper("newspaper name1","autho3",15.4,12));
        library.addNewspaper(new Newspaper("newspaper name2","autho3",14.4,12));

        System.out.println("All book in library\n ");
        library.getBookList();
        System.out.println("All video in library\n");
        library.getVideoList();
        System.out.println("All newspaper in library\n");
        library.getNewspaperList();

        LibraryGenerics<Book>  libraryGenerics = new LibraryGenerics();
        libraryGenerics.addMedia(new Book("book name11","autho11",1214.4, 190, "horor"));
        libraryGenerics.addMedia(new Book("book name11","autho11",1214.4, 190, "horor"));
        libraryGenerics.getMedia();

        LibraryGenerics<Video> libraryGenericsVideo = new LibraryGenerics<>();
        libraryGenericsVideo.addMedia(new Video("video name1","autho2",1425.4, "Movies",120.0));
        libraryGenericsVideo.getMedia();

        LibraryGenerics<Newspaper> newspaperLibraryGenerics = new LibraryGenerics<>();
        newspaperLibraryGenerics.addMedia(new Newspaper("newspaper name2","autho3",14.4,12));
        newspaperLibraryGenerics.getMedia();







    }
}