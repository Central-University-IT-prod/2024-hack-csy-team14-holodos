package ru.isntrui.holodos.schemas;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class Request {

    @SerializedName("qrurl")
    @Expose
    private String qrurl;
    @SerializedName("qrfile")
    @Expose
    private String qrfile;
    @SerializedName("qrraw")
    @Expose
    private String qrraw;
    @SerializedName("manual")
    @Expose
    private Manual manual;

    public String getQrurl() {
        return qrurl;
    }

    public void setQrurl(String qrurl) {
        this.qrurl = qrurl;
    }

    public String getQrfile() {
        return qrfile;
    }

    public void setQrfile(String qrfile) {
        this.qrfile = qrfile;
    }

    public String getQrraw() {
        return qrraw;
    }

    public void setQrraw(String qrraw) {
        this.qrraw = qrraw;
    }

    public Manual getManual() {
        return manual;
    }

    public void setManual(Manual manual) {
        this.manual = manual;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Request.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("qrurl");
        sb.append('=');
        sb.append(((this.qrurl == null)?"<null>":this.qrurl));
        sb.append(',');
        sb.append("qrfile");
        sb.append('=');
        sb.append(((this.qrfile == null)?"<null>":this.qrfile));
        sb.append(',');
        sb.append("qrraw");
        sb.append('=');
        sb.append(((this.qrraw == null)?"<null>":this.qrraw));
        sb.append(',');
        sb.append("manual");
        sb.append('=');
        sb.append(((this.manual == null)?"<null>":this.manual));
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
        result = ((result* 31)+((this.qrraw == null)? 0 :this.qrraw.hashCode()));
        result = ((result* 31)+((this.qrurl == null)? 0 :this.qrurl.hashCode()));
        result = ((result* 31)+((this.manual == null)? 0 :this.manual.hashCode()));
        result = ((result* 31)+((this.qrfile == null)? 0 :this.qrfile.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Request) == false) {
            return false;
        }
        Request rhs = ((Request) other);
        return (((((this.qrraw == rhs.qrraw)||((this.qrraw!= null)&&this.qrraw.equals(rhs.qrraw)))&&((this.qrurl == rhs.qrurl)||((this.qrurl!= null)&&this.qrurl.equals(rhs.qrurl))))&&((this.manual == rhs.manual)||((this.manual!= null)&&this.manual.equals(rhs.manual))))&&((this.qrfile == rhs.qrfile)||((this.qrfile!= null)&&this.qrfile.equals(rhs.qrfile))));
    }

}