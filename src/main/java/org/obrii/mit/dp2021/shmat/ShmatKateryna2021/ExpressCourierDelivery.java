package org.obrii.mit.dp2021.shmat.ShmatKateryna2021;

public class ExpressCourierDelivery extends AbstractDelivery implements ExpressDeliveryInterface {
    @Override
    public String deliver(ProductInterface product){
        return "Express deliver with courier product: " + product.getName();
    }
}
