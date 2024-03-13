package esercizi;

import java.util.Random;

public class Product {


    int id;
    String name;
    String category;
    double price;

    public Product(String name, String category, double price){
        this.id= generateId();
        this.name=name;
        this.category=category;
        this.price=price;


    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public String getCategory() {
        return category;
    }

    public int generateId(){
        Random random = new Random();
        return random.nextInt(2000);
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", category='" + category + '\'' +
                ", price=" + price +
                '}';
    }
}
