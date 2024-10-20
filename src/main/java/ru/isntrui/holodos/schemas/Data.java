package ru.isntrui.holodos.schemas;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;

@Generated("jsonschema2pojo")
public class Data {

    @SerializedName("json")
    @Expose
    private Json json;
    @SerializedName("html")
    @Expose
    private String html;

    public Json getJson() {
        return json;
    }

    public void setJson(Json json) {
        this.json = json;
    }

    public String getHtml() {
        return html;
    }

    public void setHtml(String html) {
        this.html = html;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Data.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("json");
        sb.append('=');
        sb.append(((this.json == null)?"<null>":this.json));
        sb.append(',');
        sb.append("html");
        sb.append('=');
        sb.append(((this.html == null)?"<null>":this.html));
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
        result = ((result* 31)+((this.json == null)? 0 :this.json.hashCode()));
        result = ((result* 31)+((this.html == null)? 0 :this.html.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Data) == false) {
            return false;
        }
        Data rhs = ((Data) other);
        return (((this.json == rhs.json)||((this.json!= null)&&this.json.equals(rhs.json)))&&((this.html == rhs.html)||((this.html!= null)&&this.html.equals(rhs.html))));
    }

}