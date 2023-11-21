public class Book {

    private String name;
    private Author author;
    private double price;
    private int qty;

    Book(String name, Author author, double price, int qty){
        this.name = name;
        this.author = author;
        this.price = price;
        this.qty = qty;
    }

    String getName() {return name;}

    Author getAuthor() {return author;}

    double getPrice() {return price;}

    void setPrice(double price) {this.price = price;}

    int getQty() {return qty;}

    void setQty(int qty) {this.qty = qty;}

    public String toString() {
        return String.format("%s от %s",name, author.toString());
    }
}
