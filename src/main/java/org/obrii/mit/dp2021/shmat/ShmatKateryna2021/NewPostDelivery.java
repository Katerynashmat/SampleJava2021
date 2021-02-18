package org.obrii.mit.dp2021.shmat.ShmatKateryna2021;

public class NewPostDelivery extends AbstractDelivery {
    @Override
    public String deliver(ProductInterface product){
        return "Deliver with post product: " + product.getName();
    }
}
