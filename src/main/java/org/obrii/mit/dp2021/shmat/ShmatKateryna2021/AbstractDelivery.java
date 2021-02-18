package org.obrii.mit.dp2021.shmat.ShmatKateryna2021;
        
public abstract class AbstractDelivery implements DeliveryInterface {
    @Override
    public String deliver(ProductInterface product){
        return "Deliver product: " + product.getName();
    }
}
