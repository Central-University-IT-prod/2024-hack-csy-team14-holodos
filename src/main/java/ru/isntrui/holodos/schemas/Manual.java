package ru.isntrui.holodos.schemas;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class Manual {

    @SerializedName("fn")
    @Expose
    private String fn;
    @SerializedName("fd")
    @Expose
    private String fd;
    @SerializedName("fp")
    @Expose
    private String fp;
    @SerializedName("check_time")
    @Expose
    private String checkTime;
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("sum")
    @Expose
    private String sum;

    public String getFn() {
        return fn;
    }

    public void setFn(String fn) {
        this.fn = fn;
    }

    public String getFd() {
        return fd;
    }

    public void setFd(String fd) {
        this.fd = fd;
    }

    public String getFp() {
        return fp;
    }

    public void setFp(String fp) {
        this.fp = fp;
    }

    public String getCheckTime() {
        return checkTime;
    }

    public void setCheckTime(String checkTime) {
        this.checkTime = checkTime;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSum() {
        return sum;
    }

    public void setSum(String sum) {
        this.sum = sum;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Manual.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("fn");
        sb.append('=');
        sb.append(((this.fn == null)?"<null>":this.fn));
        sb.append(',');
        sb.append("fd");
        sb.append('=');
        sb.append(((this.fd == null)?"<null>":this.fd));
        sb.append(',');
        sb.append("fp");
        sb.append('=');
        sb.append(((this.fp == null)?"<null>":this.fp));
        sb.append(',');
        sb.append("checkTime");
        sb.append('=');
        sb.append(((this.checkTime == null)?"<null>":this.checkTime));
        sb.append(',');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
        sb.append(',');
        sb.append("sum");
        sb.append('=');
        sb.append(((this.sum == null)?"<null>":this.sum));
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
        result = ((result* 31)+((this.checkTime == null)? 0 :this.checkTime.hashCode()));
        result = ((result* 31)+((this.fn == null)? 0 :this.fn.hashCode()));
        result = ((result* 31)+((this.fp == null)? 0 :this.fp.hashCode()));
        result = ((result* 31)+((this.sum == null)? 0 :this.sum.hashCode()));
        result = ((result* 31)+((this.type == null)? 0 :this.type.hashCode()));
        result = ((result* 31)+((this.fd == null)? 0 :this.fd.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Manual) == false) {
            return false;
        }
        Manual rhs = ((Manual) other);
        return (((((((this.checkTime == rhs.checkTime)||((this.checkTime!= null)&&this.checkTime.equals(rhs.checkTime)))&&((this.fn == rhs.fn)||((this.fn!= null)&&this.fn.equals(rhs.fn))))&&((this.fp == rhs.fp)||((this.fp!= null)&&this.fp.equals(rhs.fp))))&&((this.sum == rhs.sum)||((this.sum!= null)&&this.sum.equals(rhs.sum))))&&((this.type == rhs.type)||((this.type!= null)&&this.type.equals(rhs.type))))&&((this.fd == rhs.fd)||((this.fd!= null)&&this.fd.equals(rhs.fd))));
    }

}