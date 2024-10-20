package ru.isntrui.holodos.models.receipt;

import java.util.Date;

@lombok.Data
public class Metadata {
    private long id;
    private String ofdId;
    private String address;
    private String subtype;
    private Date receiveDate;
}
