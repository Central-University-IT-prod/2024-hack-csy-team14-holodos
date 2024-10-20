package ru.isntrui.holodos.schemas;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class Metadata {

    @SerializedName("id")
    @Expose
    private long id;
    @SerializedName("ofdId")
    @Expose
    private String ofdId;
    @SerializedName("address")
    @Expose
    private String address;
    @SerializedName("subtype")
    @Expose
    private String subtype;
    @SerializedName("receiveDate")
    @Expose
    private String receiveDate;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getOfdId() {
        return ofdId;
    }

    public void setOfdId(String ofdId) {
        this.ofdId = ofdId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getSubtype() {
        return subtype;
    }

    public void setSubtype(String subtype) {
        this.subtype = subtype;
    }

    public String getReceiveDate() {
        return receiveDate;
    }

    public void setReceiveDate(String receiveDate) {
        this.receiveDate = receiveDate;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Metadata.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("id");
        sb.append('=');
        sb.append(this.id);
        sb.append(',');
        sb.append("ofdId");
        sb.append('=');
        sb.append(((this.ofdId == null)?"<null>":this.ofdId));
        sb.append(',');
        sb.append("address");
        sb.append('=');
        sb.append(((this.address == null)?"<null>":this.address));
        sb.append(',');
        sb.append("subtype");
        sb.append('=');
        sb.append(((this.subtype == null)?"<null>":this.subtype));
        sb.append(',');
        sb.append("receiveDate");
        sb.append('=');
        sb.append(((this.receiveDate == null)?"<null>":this.receiveDate));
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
        result = ((result* 31)+((this.receiveDate == null)? 0 :this.receiveDate.hashCode()));
        result = ((result* 31)+((int)(this.id^(this.id >>> 32))));
        result = ((result* 31)+((this.address == null)? 0 :this.address.hashCode()));
        result = ((result* 31)+((this.ofdId == null)? 0 :this.ofdId.hashCode()));
        result = ((result* 31)+((this.subtype == null)? 0 :this.subtype.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Metadata) == false) {
            return false;
        }
        Metadata rhs = ((Metadata) other);
        return ((((((this.receiveDate == rhs.receiveDate)||((this.receiveDate!= null)&&this.receiveDate.equals(rhs.receiveDate)))&&(this.id == rhs.id))&&((this.address == rhs.address)||((this.address!= null)&&this.address.equals(rhs.address))))&&((this.ofdId == rhs.ofdId)||((this.ofdId!= null)&&this.ofdId.equals(rhs.ofdId))))&&((this.subtype == rhs.subtype)||((this.subtype!= null)&&this.subtype.equals(rhs.subtype))));
    }

}
