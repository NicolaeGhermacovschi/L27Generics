package nogenerics;

import java.util.List;

public class Book  {
    private String name;
    private String author;
    private double price;
    private int nrPage;
    private String type;

    public Book(String name, String author, double price, int nrPage, String type) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.nrPage = nrPage;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                ", nrPage=" + nrPage +
                ", type='" + type + '\'' +
                '}';
    }
}
