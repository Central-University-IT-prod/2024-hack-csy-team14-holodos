package ru.isntrui.holodos.schemas;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class Properties {

    @SerializedName("propertyName")
    @Expose
    private String propertyName;
    @SerializedName("propertyValue")
    @Expose
    private String propertyValue;

    public String getPropertyName() {
        return propertyName;
    }

    public void setPropertyName(String propertyName) {
        this.propertyName = propertyName;
    }

    public String getPropertyValue() {
        return propertyValue;
    }

    public void setPropertyValue(String propertyValue) {
        this.propertyValue = propertyValue;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Properties.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("propertyName");
        sb.append('=');
        sb.append(((this.propertyName == null)?"<null>":this.propertyName));
        sb.append(',');
        sb.append("propertyValue");
        sb.append('=');
        sb.append(((this.propertyValue == null)?"<null>":this.propertyValue));
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
        result = ((result* 31)+((this.propertyName == null)? 0 :this.propertyName.hashCode()));
        result = ((result* 31)+((this.propertyValue == null)? 0 :this.propertyValue.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Properties) == false) {
            return false;
        }
        Properties rhs = ((Properties) other);
        return (((this.propertyName == rhs.propertyName)||((this.propertyName!= null)&&this.propertyName.equals(rhs.propertyName)))&&((this.propertyValue == rhs.propertyValue)||((this.propertyValue!= null)&&this.propertyValue.equals(rhs.propertyValue))));
    }

}
