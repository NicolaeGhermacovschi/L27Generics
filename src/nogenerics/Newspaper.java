package nogenerics;

public class Newspaper{
    private String name;
    private String author;
    private double price;
    private int nrPage;

    public Newspaper(String name, String author, double price, int nrPage) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.nrPage = nrPage;
    }

    @Override
    public String toString() {
        return "Newspaper{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                ", nrPage=" + nrPage +
                '}';
    }
}
