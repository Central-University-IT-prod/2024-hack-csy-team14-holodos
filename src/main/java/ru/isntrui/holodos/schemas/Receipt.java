package ru.isntrui.holodos.schemas;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class Receipt {

    @SerializedName("code")
    @Expose
    private int code;
    @SerializedName("first")
    @Expose
    private int first;
    @SerializedName("data")
    @Expose
    private Data data;
    @SerializedName("request")
    @Expose
    private Request request;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public int getFirst() {
        return first;
    }

    public void setFirst(int first) {
        this.first = first;
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public Request getRequest() {
        return request;
    }

    public void setRequest(Request request) {
        this.request = request;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Receipt.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("code");
        sb.append('=');
        sb.append(this.code);
        sb.append(',');
        sb.append("first");
        sb.append('=');
        sb.append(this.first);
        sb.append(',');
        sb.append("data");
        sb.append('=');
        sb.append(((this.data == null)?"<null>":this.data));
        sb.append(',');
        sb.append("request");
        sb.append('=');
        sb.append(((this.request == null)?"<null>":this.request));
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
        result = ((result* 31)+((this.request == null)? 0 :this.request.hashCode()));
        result = ((result* 31)+ this.code);
        result = ((result* 31)+((this.data == null)? 0 :this.data.hashCode()));
        result = ((result* 31)+ this.first);
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Receipt) == false) {
            return false;
        }
        Receipt rhs = ((Receipt) other);
        return (((((this.request == rhs.request)||((this.request!= null)&&this.request.equals(rhs.request)))&&(this.code == rhs.code))&&((this.data == rhs.data)||((this.data!= null)&&this.data.equals(rhs.data))))&&(this.first == rhs.first));
    }

}
