package ru.isntrui.holodos.models.receipt;

@lombok.Data
public class Request {
    private String qrraw;
    private Manual manual;
    private String qrfile;
    private String qrurl;
}
