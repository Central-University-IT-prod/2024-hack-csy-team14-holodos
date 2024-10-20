package ru.isntrui.holodos.models.receipt;

@lombok.Data
public class Item {
    private int nds;
    private int sum;
    private String name;
    private int price;
    private int quantity;
    private int paymentType;
    private int productType;
    private int itemsQuantityMeasure;
}
