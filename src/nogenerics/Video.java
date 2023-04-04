package nogenerics;

public class Video {
    private String name;
    private String author;
    private double price;
    private String type;
    private double lenghtVideo;


    public Video(String name, String author, double price, String type, double lenghtVideo) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.type = type;
        this.lenghtVideo = lenghtVideo;
    }

    @Override
    public String toString() {
        return "Video{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                ", type='" + type + '\'' +
                ", lenghtVideo=" + lenghtVideo +
                '}';
    }
}
