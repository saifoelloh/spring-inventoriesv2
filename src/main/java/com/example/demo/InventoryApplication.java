package com.example.demo;

import com.example.demo.entity.Customer;
import com.example.demo.entity.Item;
import com.example.demo.entity.Purchase;
import com.example.demo.repository.RepositoryCustomer;
import com.example.demo.repository.RepositoryItem;
import com.example.demo.repository.RepositoryPurchase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import javax.print.attribute.standard.PrinterURI;
import java.util.List;
import java.util.Scanner;

@SpringBootApplication
public class InventoryApplication {

    @Autowired private RepositoryCustomer repositoryCustomer;
    @Autowired private RepositoryItem repositoryItem;
    @Autowired private RepositoryPurchase repositoryPurchase;

    public static void main(String[] args) {
        SpringApplication.run(InventoryApplication.class, args);
    }

    @Bean
            public CommandLineRunner demo() {
                return args -> {
//                    Scanner scanner = new Scanner(System.in);
//                    System.out.print("Masukan banyak item: ");
//                    Integer limit = Integer.parseInt(scanner.nextLine());
//                    for (int i = 0; i < limit; i++) {
//                        Item item = new Item();
//                        System.out.print("masukan nama: ");
//                        item.setName(scanner.nextLine());
//                        System.out.print("masukan harga beli: ");
//                        item.setPurchasePrice(Float.parseFloat(scanner.nextLine()));
//                        System.out.print("masukan harga jual: ");
//                        item.setSellingPrice(Float.parseFloat(scanner.nextLine()));
//                        System.out.print("masukan stock: ");
//                        item.setStock(Integer.parseInt(scanner.nextLine()));
//                        System.out.print("masukan terbeli: ");
//                        item.setSold(Integer.parseInt(scanner.nextLine()));
//                        repositoryItem.save(item);
//                    }
                    for (Item item: repositoryItem.findAll()) {
                        System.out.println(item.getName());
                    }
//            Customer customer = new Customer("jaka", "sesama", "0814", "jaka@joko.com", 10);
//            Purchase purchase = new Purchase(customer);
//            Purchase purchase1 = new Purchase(customer);
//            Purchase purchase2 = new Purchase(customer);
//
//            repositoryCustomer.save(customer);
//            repositoryPurchase.save(purchase);
//            repositoryPurchase.save(purchase1);
//            repositoryPurchase.save(purchase2);
//            for (Customer customer: repositoryCustomer.findAll()) {
//                System.out.println(customer.getName());
//                for (Purchase ps: customer.getPurchases()) {
//                    System.out.println(ps.getCustomer().getName());
//                }
//            }
        };
    }

}
