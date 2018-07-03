package ir.charnal.davod.a4nalfinal.datamodel.dataModelShop;

import com.google.gson.annotations.SerializedName;

public class DataModelCategoriseOfProducts {

    @SerializedName("id")
    private String id;
    @SerializedName("name")
    private String name;
    @SerializedName("parent")
    private String parent;
    @SerializedName("count")
    private String count;
    @SerializedName("image")
    private String image;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getParent() {
        return parent;
    }

    public void setParent(String parent) {
        this.parent = parent;
    }

    public String getCount() {
        return count;
    }

    public void setCount(String count) {
        this.count = count;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
