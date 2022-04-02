package com.savin.one.book;

import java.util.Arrays;
import java.util.Objects;

public class Book {
    private String name;
    private Author[] authors;
    private double price;
    private int qty = 0;

    public Book(String name,
                Author[] authors,
                double price){
        this.name = name;
        this.authors = authors;
        this.price = price;
    }

    public Book(String name,
                Author[] authors,
                double price,
                int qty){
        this(name, authors, price);
        this.qty = qty;
    }

    public String getName() {
        return name;
    }

    public Author[] getAuthors() {
        return authors;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price){
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", authors=" + Arrays.toString(authors) +
                ", price=" + price +
                ", qty=" + qty +
                '}';
    }

    public String getAuthorNames(){
        String res = "";
        for (int i = 0; i<=authors.length-1; i++){
            if (i == authors.length-1){
                res += authors[i].getName() + ".";
            }
            else{
                res += authors[i].getName() + ", ";
            }
        }
        return res;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || !(this.getClass().equals(object.getClass()))) return false;

        Book book = (Book) object;
        return Double.compare(book.price, this.price) == 0 && this.qty == book.qty && this.name.equals(book.name) &&
                this.authors.equals(book.authors);
    }

    @Override
    public int hashCode() {
        int result = 17;

        result = 31 * result + qty;
        result = 31 * result + (name == null? 0 : name.hashCode());
        result = 31 * result + (int) (Double.doubleToLongBits(price) ^ (Double.doubleToLongBits(price) >>> 32));
        result = 31 * result + (authors == null ? 0 : hashMass(authors));

        return result;
    }

    private int hashMass(Object[] obj){
        int result = 17;

        if (obj == null) return 0;
        for (int i = 0; i<obj.length-1; i++){
            Object temp = obj[i];
            result = 31 * result + (temp == null? 0 : temp.hashCode());
        }

        return result;
    }
}
