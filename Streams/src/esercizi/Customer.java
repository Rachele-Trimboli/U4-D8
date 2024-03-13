package esercizi;

import java.util.Random;

public class Customer {

   int id;
   String name;
   int tier;

   public Customer(String name, int tier){
       this.id=getId();
       this.name=name;
       this.tier=tier;

   }

   public int getId(){
       Random random = new Random();
       return random.nextInt(0,1000);
   }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", tier=" + tier +
                '}';
    }
}
