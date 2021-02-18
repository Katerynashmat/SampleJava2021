package org.obrii.mit.dp2021.shmat.ShmatKateryna2021;

public class Main {

    public static void main(String[] args) {
        Product p = new Product("Coca-Cola");
        AbstractDelivery delivery = new NewPostDelivery();
        System.out.println(delivery.deliver(p));

        delivery = new CourierDelivery();
        System.out.println(delivery.deliver(p));

        delivery = new ExpressCourierDelivery();
        System.out.println(delivery.deliver(p));

    }
}
