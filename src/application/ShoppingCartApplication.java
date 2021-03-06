package application;

import com.thoughtworks.ddd.domain.*;
import com.thoughtworks.ddd.domain.domain_service.CompetitorBasedPricing;
import com.thoughtworks.ddd.domain.domain_service.OrderService;

import java.util.Currency;

public class ShoppingCartApplication {

    public static void main(String[] args) {
        Cart cart = new Cart();

        Weight grams = new Weight(3, "GRAMS");
        Product ipadPro = new Product("IPad Pro",
                new Price(CompetitorBasedPricing.getPrice("IPad Pro"), Currency.getInstance("INR")), grams);
       Product heroInkPen = new Product("Hero Ink Pen",
               new Price(CompetitorBasedPricing.getPrice("Hero Ink Pen"), Currency.getInstance("INR")), grams );
       Product gmCricketBat = new Product("GM Cricket Bat",
               new Price(CompetitorBasedPricing.getPrice("GM Cricket Bat"), Currency.getInstance("INR")), grams);

       Item iPadProItem = new Item(ipadPro);
       Item heroInkPenItem = new Item(heroInkPen);
       Item gmCricketBatItem = new Item(gmCricketBat, 2);

       cart.add(iPadProItem);
       cart.add(heroInkPenItem);
       cart.add(gmCricketBatItem);

       cart.checkout();
       Order order = OrderService.getOrder(cart);

        System.out.println(order);
        System.out.println(order.getTotalAmount());
       // System.out.println(cart.getItems());

       cart.remove(iPadProItem);

       // System.out.println(cart.getItems());
       //  System.out.println(cart.getDeletedItems());
    }
}
