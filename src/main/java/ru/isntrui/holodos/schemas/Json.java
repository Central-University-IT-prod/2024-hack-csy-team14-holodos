package ru.isntrui.holodos.schemas;

import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class Json {

    @SerializedName("code")
    @Expose
    private int code;
    @SerializedName("user")
    @Expose
    private String user;
    @SerializedName("items")
    @Expose
    private List<Item> items;
    @SerializedName("nds10")
    @Expose
    private int nds10;
    @SerializedName("nds18")
    @Expose
    private int nds18;
    @SerializedName("region")
    @Expose
    private String region;
    @SerializedName("userInn")
    @Expose
    private String userInn;
    @SerializedName("dateTime")
    @Expose
    private String dateTime;
    @SerializedName("kktRegId")
    @Expose
    private String kktRegId;
    @SerializedName("metadata")
    @Expose
    private Metadata metadata;
    @SerializedName("totalSum")
    @Expose
    private int totalSum;
    @SerializedName("creditSum")
    @Expose
    private int creditSum;
    @SerializedName("numberKkt")
    @Expose
    private String numberKkt;
    @SerializedName("fiscalSign")
    @Expose
    private int fiscalSign;
    @SerializedName("prepaidSum")
    @Expose
    private int prepaidSum;
    @SerializedName("properties")
    @Expose
    private Properties properties;
    @SerializedName("retailPlace")
    @Expose
    private String retailPlace;
    @SerializedName("shiftNumber")
    @Expose
    private int shiftNumber;
    @SerializedName("cashTotalSum")
    @Expose
    private int cashTotalSum;
    @SerializedName("internetSign")
    @Expose
    private int internetSign;
    @SerializedName("provisionSum")
    @Expose
    private int provisionSum;
    @SerializedName("ecashTotalSum")
    @Expose
    private int ecashTotalSum;
    @SerializedName("machineNumber")
    @Expose
    private String machineNumber;
    @SerializedName("operationType")
    @Expose
    private int operationType;
    @SerializedName("redefine_mask")
    @Expose
    private int redefineMask;
    @SerializedName("requestNumber")
    @Expose
    private int requestNumber;
    @SerializedName("sellerAddress")
    @Expose
    private String sellerAddress;
    @SerializedName("fiscalDriveNumber")
    @Expose
    private String fiscalDriveNumber;
    @SerializedName("messageFiscalSign")
    @Expose
    private double messageFiscalSign;
    @SerializedName("retailPlaceAddress")
    @Expose
    private String retailPlaceAddress;
    @SerializedName("appliedTaxationType")
    @Expose
    private int appliedTaxationType;
    @SerializedName("buyerPhoneOrAddress")
    @Expose
    private String buyerPhoneOrAddress;
    @SerializedName("fiscalDocumentNumber")
    @Expose
    private int fiscalDocumentNumber;
    @SerializedName("fiscalDocumentFormatVer")
    @Expose
    private int fiscalDocumentFormatVer;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public int getNds10() {
        return nds10;
    }

    public void setNds10(int nds10) {
        this.nds10 = nds10;
    }

    public int getNds18() {
        return nds18;
    }

    public void setNds18(int nds18) {
        this.nds18 = nds18;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getUserInn() {
        return userInn;
    }

    public void setUserInn(String userInn) {
        this.userInn = userInn;
    }

    public String getDateTime() {
        return dateTime;
    }

    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }

    public String getKktRegId() {
        return kktRegId;
    }

    public void setKktRegId(String kktRegId) {
        this.kktRegId = kktRegId;
    }

    public Metadata getMetadata() {
        return metadata;
    }

    public void setMetadata(Metadata metadata) {
        this.metadata = metadata;
    }

    public int getTotalSum() {
        return totalSum;
    }

    public void setTotalSum(int totalSum) {
        this.totalSum = totalSum;
    }

    public int getCreditSum() {
        return creditSum;
    }

    public void setCreditSum(int creditSum) {
        this.creditSum = creditSum;
    }

    public String getNumberKkt() {
        return numberKkt;
    }

    public void setNumberKkt(String numberKkt) {
        this.numberKkt = numberKkt;
    }

    public int getFiscalSign() {
        return fiscalSign;
    }

    public void setFiscalSign(int fiscalSign) {
        this.fiscalSign = fiscalSign;
    }

    public int getPrepaidSum() {
        return prepaidSum;
    }

    public void setPrepaidSum(int prepaidSum) {
        this.prepaidSum = prepaidSum;
    }

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    public String getRetailPlace() {
        return retailPlace;
    }

    public void setRetailPlace(String retailPlace) {
        this.retailPlace = retailPlace;
    }

    public int getShiftNumber() {
        return shiftNumber;
    }

    public void setShiftNumber(int shiftNumber) {
        this.shiftNumber = shiftNumber;
    }

    public int getCashTotalSum() {
        return cashTotalSum;
    }

    public void setCashTotalSum(int cashTotalSum) {
        this.cashTotalSum = cashTotalSum;
    }

    public int getInternetSign() {
        return internetSign;
    }

    public void setInternetSign(int internetSign) {
        this.internetSign = internetSign;
    }

    public int getProvisionSum() {
        return provisionSum;
    }

    public void setProvisionSum(int provisionSum) {
        this.provisionSum = provisionSum;
    }

    public int getEcashTotalSum() {
        return ecashTotalSum;
    }

    public void setEcashTotalSum(int ecashTotalSum) {
        this.ecashTotalSum = ecashTotalSum;
    }

    public String getMachineNumber() {
        return machineNumber;
    }

    public void setMachineNumber(String machineNumber) {
        this.machineNumber = machineNumber;
    }

    public int getOperationType() {
        return operationType;
    }

    public void setOperationType(int operationType) {
        this.operationType = operationType;
    }

    public int getRedefineMask() {
        return redefineMask;
    }

    public void setRedefineMask(int redefineMask) {
        this.redefineMask = redefineMask;
    }

    public int getRequestNumber() {
        return requestNumber;
    }

    public void setRequestNumber(int requestNumber) {
        this.requestNumber = requestNumber;
    }

    public String getSellerAddress() {
        return sellerAddress;
    }

    public void setSellerAddress(String sellerAddress) {
        this.sellerAddress = sellerAddress;
    }

    public String getFiscalDriveNumber() {
        return fiscalDriveNumber;
    }

    public void setFiscalDriveNumber(String fiscalDriveNumber) {
        this.fiscalDriveNumber = fiscalDriveNumber;
    }

    public double getMessageFiscalSign() {
        return messageFiscalSign;
    }

    public void setMessageFiscalSign(double messageFiscalSign) {
        this.messageFiscalSign = messageFiscalSign;
    }

    public String getRetailPlaceAddress() {
        return retailPlaceAddress;
    }

    public void setRetailPlaceAddress(String retailPlaceAddress) {
        this.retailPlaceAddress = retailPlaceAddress;
    }

    public int getAppliedTaxationType() {
        return appliedTaxationType;
    }

    public void setAppliedTaxationType(int appliedTaxationType) {
        this.appliedTaxationType = appliedTaxationType;
    }

    public String getBuyerPhoneOrAddress() {
        return buyerPhoneOrAddress;
    }

    public void setBuyerPhoneOrAddress(String buyerPhoneOrAddress) {
        this.buyerPhoneOrAddress = buyerPhoneOrAddress;
    }

    public int getFiscalDocumentNumber() {
        return fiscalDocumentNumber;
    }

    public void setFiscalDocumentNumber(int fiscalDocumentNumber) {
        this.fiscalDocumentNumber = fiscalDocumentNumber;
    }

    public int getFiscalDocumentFormatVer() {
        return fiscalDocumentFormatVer;
    }

    public void setFiscalDocumentFormatVer(int fiscalDocumentFormatVer) {
        this.fiscalDocumentFormatVer = fiscalDocumentFormatVer;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Json.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("code");
        sb.append('=');
        sb.append(this.code);
        sb.append(',');
        sb.append("user");
        sb.append('=');
        sb.append(((this.user == null)?"<null>":this.user));
        sb.append(',');
        sb.append("items");
        sb.append('=');
        sb.append(((this.items == null)?"<null>":this.items));
        sb.append(',');
        sb.append("nds10");
        sb.append('=');
        sb.append(this.nds10);
        sb.append(',');
        sb.append("nds18");
        sb.append('=');
        sb.append(this.nds18);
        sb.append(',');
        sb.append("region");
        sb.append('=');
        sb.append(((this.region == null)?"<null>":this.region));
        sb.append(',');
        sb.append("userInn");
        sb.append('=');
        sb.append(((this.userInn == null)?"<null>":this.userInn));
        sb.append(',');
        sb.append("dateTime");
        sb.append('=');
        sb.append(((this.dateTime == null)?"<null>":this.dateTime));
        sb.append(',');
        sb.append("kktRegId");
        sb.append('=');
        sb.append(((this.kktRegId == null)?"<null>":this.kktRegId));
        sb.append(',');
        sb.append("metadata");
        sb.append('=');
        sb.append(((this.metadata == null)?"<null>":this.metadata));
        sb.append(',');
        sb.append("totalSum");
        sb.append('=');
        sb.append(this.totalSum);
        sb.append(',');
        sb.append("creditSum");
        sb.append('=');
        sb.append(this.creditSum);
        sb.append(',');
        sb.append("numberKkt");
        sb.append('=');
        sb.append(((this.numberKkt == null)?"<null>":this.numberKkt));
        sb.append(',');
        sb.append("fiscalSign");
        sb.append('=');
        sb.append(this.fiscalSign);
        sb.append(',');
        sb.append("prepaidSum");
        sb.append('=');
        sb.append(this.prepaidSum);
        sb.append(',');
        sb.append("properties");
        sb.append('=');
        sb.append(((this.properties == null)?"<null>":this.properties));
        sb.append(',');
        sb.append("retailPlace");
        sb.append('=');
        sb.append(((this.retailPlace == null)?"<null>":this.retailPlace));
        sb.append(',');
        sb.append("shiftNumber");
        sb.append('=');
        sb.append(this.shiftNumber);
        sb.append(',');
        sb.append("cashTotalSum");
        sb.append('=');
        sb.append(this.cashTotalSum);
        sb.append(',');
        sb.append("internetSign");
        sb.append('=');
        sb.append(this.internetSign);
        sb.append(',');
        sb.append("provisionSum");
        sb.append('=');
        sb.append(this.provisionSum);
        sb.append(',');
        sb.append("ecashTotalSum");
        sb.append('=');
        sb.append(this.ecashTotalSum);
        sb.append(',');
        sb.append("machineNumber");
        sb.append('=');
        sb.append(((this.machineNumber == null)?"<null>":this.machineNumber));
        sb.append(',');
        sb.append("operationType");
        sb.append('=');
        sb.append(this.operationType);
        sb.append(',');
        sb.append("redefineMask");
        sb.append('=');
        sb.append(this.redefineMask);
        sb.append(',');
        sb.append("requestNumber");
        sb.append('=');
        sb.append(this.requestNumber);
        sb.append(',');
        sb.append("sellerAddress");
        sb.append('=');
        sb.append(((this.sellerAddress == null)?"<null>":this.sellerAddress));
        sb.append(',');
        sb.append("fiscalDriveNumber");
        sb.append('=');
        sb.append(((this.fiscalDriveNumber == null)?"<null>":this.fiscalDriveNumber));
        sb.append(',');
        sb.append("messageFiscalSign");
        sb.append('=');
        sb.append(this.messageFiscalSign);
        sb.append(',');
        sb.append("retailPlaceAddress");
        sb.append('=');
        sb.append(((this.retailPlaceAddress == null)?"<null>":this.retailPlaceAddress));
        sb.append(',');
        sb.append("appliedTaxationType");
        sb.append('=');
        sb.append(this.appliedTaxationType);
        sb.append(',');
        sb.append("buyerPhoneOrAddress");
        sb.append('=');
        sb.append(((this.buyerPhoneOrAddress == null)?"<null>":this.buyerPhoneOrAddress));
        sb.append(',');
        sb.append("fiscalDocumentNumber");
        sb.append('=');
        sb.append(this.fiscalDocumentNumber);
        sb.append(',');
        sb.append("fiscalDocumentFormatVer");
        sb.append('=');
        sb.append(this.fiscalDocumentFormatVer);
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
        result = ((result* 31)+((this.dateTime == null)? 0 :this.dateTime.hashCode()));
        result = ((result* 31)+ this.provisionSum);
        result = ((result* 31)+((this.metadata == null)? 0 :this.metadata.hashCode()));
        result = ((result* 31)+ this.fiscalDocumentFormatVer);
        result = ((result* 31)+ this.code);
        result = ((result* 31)+ this.shiftNumber);
        result = ((result* 31)+((this.fiscalDriveNumber == null)? 0 :this.fiscalDriveNumber.hashCode()));
        result = ((result* 31)+((this.sellerAddress == null)? 0 :this.sellerAddress.hashCode()));
        result = ((result* 31)+ this.requestNumber);
        result = ((result* 31)+ this.ecashTotalSum);
        result = ((result* 31)+ this.fiscalDocumentNumber);
        result = ((result* 31)+ this.nds18);
        result = ((result* 31)+((this.numberKkt == null)? 0 :this.numberKkt.hashCode()));
        result = ((result* 31)+ this.nds10);
        result = ((result* 31)+ this.internetSign);
        result = ((result* 31)+((this.buyerPhoneOrAddress == null)? 0 :this.buyerPhoneOrAddress.hashCode()));
        result = ((result* 31)+((int)(Double.doubleToLongBits(this.messageFiscalSign)^(Double.doubleToLongBits(this.messageFiscalSign)>>> 32))));
        result = ((result* 31)+((this.userInn == null)? 0 :this.userInn.hashCode()));
        result = ((result* 31)+((this.kktRegId == null)? 0 :this.kktRegId.hashCode()));
        result = ((result* 31)+ this.creditSum);
        result = ((result* 31)+ this.cashTotalSum);
        result = ((result* 31)+ this.redefineMask);
        result = ((result* 31)+ this.appliedTaxationType);
        result = ((result* 31)+ this.totalSum);
        result = ((result* 31)+((this.machineNumber == null)? 0 :this.machineNumber.hashCode()));
        result = ((result* 31)+((this.retailPlaceAddress == null)? 0 :this.retailPlaceAddress.hashCode()));
        result = ((result* 31)+ this.fiscalSign);
        result = ((result* 31)+ this.operationType);
        result = ((result* 31)+ this.prepaidSum);
        result = ((result* 31)+((this.region == null)? 0 :this.region.hashCode()));
        result = ((result* 31)+((this.user == null)? 0 :this.user.hashCode()));
        result = ((result* 31)+((this.items == null)? 0 :this.items.hashCode()));
        result = ((result* 31)+((this.retailPlace == null)? 0 :this.retailPlace.hashCode()));
        result = ((result* 31)+((this.properties == null)? 0 :this.properties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Json) == false) {
            return false;
        }
        Json rhs = ((Json) other);
        return (((((((((((((((((((((((((((((((((((this.dateTime == rhs.dateTime)||((this.dateTime!= null)&&this.dateTime.equals(rhs.dateTime)))&&(this.provisionSum == rhs.provisionSum))&&((this.metadata == rhs.metadata)||((this.metadata!= null)&&this.metadata.equals(rhs.metadata))))&&(this.fiscalDocumentFormatVer == rhs.fiscalDocumentFormatVer))&&(this.code == rhs.code))&&(this.shiftNumber == rhs.shiftNumber))&&((this.fiscalDriveNumber == rhs.fiscalDriveNumber)||((this.fiscalDriveNumber!= null)&&this.fiscalDriveNumber.equals(rhs.fiscalDriveNumber))))&&((this.sellerAddress == rhs.sellerAddress)||((this.sellerAddress!= null)&&this.sellerAddress.equals(rhs.sellerAddress))))&&(this.requestNumber == rhs.requestNumber))&&(this.ecashTotalSum == rhs.ecashTotalSum))&&(this.fiscalDocumentNumber == rhs.fiscalDocumentNumber))&&(this.nds18 == rhs.nds18))&&((this.numberKkt == rhs.numberKkt)||((this.numberKkt!= null)&&this.numberKkt.equals(rhs.numberKkt))))&&(this.nds10 == rhs.nds10))&&(this.internetSign == rhs.internetSign))&&((this.buyerPhoneOrAddress == rhs.buyerPhoneOrAddress)||((this.buyerPhoneOrAddress!= null)&&this.buyerPhoneOrAddress.equals(rhs.buyerPhoneOrAddress))))&&(Double.doubleToLongBits(this.messageFiscalSign) == Double.doubleToLongBits(rhs.messageFiscalSign)))&&((this.userInn == rhs.userInn)||((this.userInn!= null)&&this.userInn.equals(rhs.userInn))))&&((this.kktRegId == rhs.kktRegId)||((this.kktRegId!= null)&&this.kktRegId.equals(rhs.kktRegId))))&&(this.creditSum == rhs.creditSum))&&(this.cashTotalSum == rhs.cashTotalSum))&&(this.redefineMask == rhs.redefineMask))&&(this.appliedTaxationType == rhs.appliedTaxationType))&&(this.totalSum == rhs.totalSum))&&((this.machineNumber == rhs.machineNumber)||((this.machineNumber!= null)&&this.machineNumber.equals(rhs.machineNumber))))&&((this.retailPlaceAddress == rhs.retailPlaceAddress)||((this.retailPlaceAddress!= null)&&this.retailPlaceAddress.equals(rhs.retailPlaceAddress))))&&(this.fiscalSign == rhs.fiscalSign))&&(this.operationType == rhs.operationType))&&(this.prepaidSum == rhs.prepaidSum))&&((this.region == rhs.region)||((this.region!= null)&&this.region.equals(rhs.region))))&&((this.user == rhs.user)||((this.user!= null)&&this.user.equals(rhs.user))))&&((this.items == rhs.items)||((this.items!= null)&&this.items.equals(rhs.items))))&&((this.retailPlace == rhs.retailPlace)||((this.retailPlace!= null)&&this.retailPlace.equals(rhs.retailPlace))))&&((this.properties == rhs.properties)||((this.properties!= null)&&this.properties.equals(rhs.properties))));
    }

}
