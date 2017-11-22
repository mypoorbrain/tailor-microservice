package ng.com.soh.ms.core.model;

/**
 * Created by Blurryface on 11/14/17.
 */

public enum AddressType {
    BILLING_ADDRESS("billingAddress"),
    SHIPPING_ADDRESS("shippingAddress");

    private String addressType;

    AddressType(String addressType){
        this.addressType = addressType;
    }

    public String getAddressType(){
        return this.addressType;
    }
}

