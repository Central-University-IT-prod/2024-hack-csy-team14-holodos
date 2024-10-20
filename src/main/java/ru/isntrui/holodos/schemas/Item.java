package ru.isntrui.holodos.schemas;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class Item {

    @SerializedName("nds")
    @Expose
    private int nds;
    @SerializedName("sum")
    @Expose
    private int sum;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("price")
    @Expose
    private int price;
    @SerializedName("quantity")
    @Expose
    private int quantity;
    @SerializedName("paymentType")
    @Expose
    private int paymentType;
    @SerializedName("productType")
    @Expose
    private int productType;
    @SerializedName("itemsQuantityMeasure")
    @Expose
    private int itemsQuantityMeasure;

    public int getNds() {
        return nds;
    }

    public void setNds(int nds) {
        this.nds = nds;
    }

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(int paymentType) {
        this.paymentType = paymentType;
    }

    public int getProductType() {
        return productType;
    }

    public void setProductType(int productType) {
        this.productType = productType;
    }

    public int getItemsQuantityMeasure() {
        return itemsQuantityMeasure;
    }

    public void setItemsQuantityMeasure(int itemsQuantityMeasure) {
        this.itemsQuantityMeasure = itemsQuantityMeasure;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Item.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("nds");
        sb.append('=');
        sb.append(this.nds);
        sb.append(',');
        sb.append("sum");
        sb.append('=');
        sb.append(this.sum);
        sb.append(',');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("price");
        sb.append('=');
        sb.append(this.price);
        sb.append(',');
        sb.append("quantity");
        sb.append('=');
        sb.append(this.quantity);
        sb.append(',');
        sb.append("paymentType");
        sb.append('=');
        sb.append(this.paymentType);
        sb.append(',');
        sb.append("productType");
        sb.append('=');
        sb.append(this.productType);
        sb.append(',');
        sb.append("itemsQuantityMeasure");
        sb.append('=');
        sb.append(this.itemsQuantityMeasure);
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result* 31)+ this.quantity);
        result = ((result* 31)+ this.price);
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+ this.sum);
        result = ((result* 31)+ this.itemsQuantityMeasure);
        result = ((result* 31)+ this.nds);
        result = ((result* 31)+ this.productType);
        result = ((result* 31)+ this.paymentType);
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Item) == false) {
            return false;
        }
        Item rhs = ((Item) other);
        return ((((((((this.quantity == rhs.quantity)&&(this.price == rhs.price))&&((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name))))&&(this.sum == rhs.sum))&&(this.itemsQuantityMeasure == rhs.itemsQuantityMeasure))&&(this.nds == rhs.nds))&&(this.productType == rhs.productType))&&(this.paymentType == rhs.paymentType));
    }

}
