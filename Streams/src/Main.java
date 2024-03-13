import esercizi.Customer;
import esercizi.Order;
import esercizi.Product;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {

        Product product1 = new Product("Il piccolo Principe", "Books", 12.99);
        Product product2 = new Product("Harry Potter Saga", "Books", 122);
        Product product3 = new Product("Scarpe", "Boys", 150);
        Product product4 = new Product("Pigiama", "Boys", 10.90);
        Product product5 = new Product("Coperta", "Baby", 10.50);
        Product product6 = new Product("Passeggino", "Baby", 250);
        Product product7 = new Product("Giocattolo", "Baby", 11);
        Product product8 = new Product("Pannolini", "Baby", 19.50);


        List<Product> productList = new ArrayList<>();
        productList.add(product1);
        productList.add(product2);
        productList.add(product3);
        productList.add(product4);
        System.out.println(productList);


        Customer customer = new Customer("Pinco Panco", 2);
        Customer customer2 = new Customer("Panco Pinco", 2);
        List<Product> prodottiPerBambini = new ArrayList<>();
        prodottiPerBambini.add(product5);
        prodottiPerBambini.add(product6);


        Order ordineBambino = new Order("In preparazione", LocalDate.now().minusDays(1), LocalDate.now(), prodottiPerBambini, customer);
        Order ordine2 = new Order("In preparazione", LocalDate.of(2021, 3, 3), LocalDate.now(), productList, customer);
        List<Order> ordini = new ArrayList<>();
        ordini.add(ordineBambino);
        ordini.add(ordine2);


        System.out.println(ordini);


        // ESERCIZIO 1
        System.out.println("-----ESERCIZIO 1 -------");
        List<Product> books = productList.stream().filter(product -> product.getPrice() > 100 && product.getCategory().equals("Books")).toList();
        System.out.println(books);

        //ESERCIZIO 2
        System.out.println("-----ESERCIZIO 2 -------");

        List<Order> ordiniFiltrati = ordini.stream().filter(ordine -> ordine.getProducts().stream()
                        .anyMatch(prodotto -> prodotto.getCategory().equals("Baby")))
                .toList();

        System.out.println(ordiniFiltrati);

        //ESERCIZIO 3
        System.out.println("-----ESERCIZIO 3 -------");
        List<Product> prodottiBoys = productList.stream().filter(prodotto -> prodotto.getCategory().equals("Boys")).toList();
        System.out.println(prodottiBoys);
        for (int i = 0; i < prodottiBoys.size(); i++) {
            double nuovoPrezzo = prodottiBoys.get(i).getPrice() * 0.9;

            System.out.println(nuovoPrezzo);
        }

        //ESERCIZIO 4
        List<Order> ordiniDate = ordini.stream().filter(ordine -> ordine.getOrderDate().isAfter(LocalDate.of(2021, 12, 1)) &&
                        ordine.getDeliveryDate().isBefore(LocalDate.of(2022, 4, 1))).toList();
        System.out.println(ordiniDate);


    }
}
