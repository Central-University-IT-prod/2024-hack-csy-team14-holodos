package ru.isntrui.holodos.models.receipt;

import java.util.ArrayList;
import java.util.Date;

@lombok.Data
public class Json {
    private int code;
    private String user;
    private ArrayList<Item> items;
    private int nds10;
    private int nds18;
    private String region;
    private String userInn;
    private Date dateTime;
    private String kktRegId;
    private Metadata metadata;
    private int totalSum;
    private int creditSum;
    private String numberKkt;
    private int fiscalSign;
    private int prepaidSum;
    private Properties properties;
    private String retailPlace;
    private int shiftNumber;
    private int cashTotalSum;
    private int internetSign;
    private int provisionSum;
    private int ecashTotalSum;
    private String machineNumber;
    private int operationType;
    private int redefine_mask;
    private int requestNumber;
    private String sellerAddress;
    private String fiscalDriveNumber;
    private double messageFiscalSign;
    private String retailPlaceAddress;
    private int appliedTaxationType;
    private String buyerPhoneOrAddress;
    private int fiscalDocumentNumber;
    private int fiscalDocumentFormatVer;
}
