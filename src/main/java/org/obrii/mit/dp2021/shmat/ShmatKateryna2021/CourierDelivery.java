package org.obrii.mit.dp2021.shmat.ShmatKateryna2021;

public class CourierDelivery extends AbstractDelivery {
    @Override
    public String deliver(ProductInterface product){
        return "Deliver with courier product: " + product.getName();
    }
}
