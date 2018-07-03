package ir.charnal.davod.a4nalfinal.datamodel.dataModelShop;

import com.google.gson.annotations.SerializedName;

public class DataModelImage {

    @SerializedName("id")
    private String id;
    @SerializedName("src")
    private String src;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSrc() {
        return src;
    }

    public void setSrc(String src) {
        this.src = src;
    }
}
