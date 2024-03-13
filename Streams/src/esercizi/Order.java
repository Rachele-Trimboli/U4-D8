package esercizi;

import java.time.LocalDate;
import java.util.List;
import java.util.Locale;
import java.util.Random;


public class Order {

    int id;
    String status;
    LocalDate orderDate;
    LocalDate deliveryDate;
    List<Product> products;
    Customer customer;

    public Order(String status, LocalDate orderDate, LocalDate deliveryDate,List<Product> products, Customer customer ){
        this.id=orderId();
        this.status=status;
        this.orderDate=orderDate;
        this.deliveryDate=deliveryDate;
        this.products=products;
        this.customer=customer;


    }

    public List<Product> getProducts() {
        return products;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public LocalDate getDeliveryDate() {
        return deliveryDate;
    }

    public int orderId(){
        Random random = new Random();
        return random.nextInt(2000, 5000);
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", status='" + status + '\'' +
                ", orderDate=" + orderDate +
                ", deliveryDate=" + deliveryDate +
                ", products=" + products +
                ", customer=" + customer +
                '}';
    }
}
