package ir.charnal.davod.a4nalfinal.datamodel.dataModelShop;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class DataModelProducts {

    @SerializedName("id")
    private String id;
    @SerializedName("name")
    private String title;
    @SerializedName("price")
    private String price;
    @SerializedName("description")
    private String description;
    @SerializedName("short_description")
    private String short_description;
    @SerializedName("images")
    private List<DataModelImage> image_url;
    @SerializedName("attributes")
    private List<DataModelAttributes> attributes;
    @SerializedName("categories")
    private List<DataModelCategories> category ;
    @SerializedName("updated_at")
    private String date;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getShort_description() {
        return short_description;
    }

    public void setShort_description(String short_description) {
        this.short_description = short_description;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public List<DataModelAttributes> getAttributes() {
        return attributes;
    }

    public void setAttributes(List<DataModelAttributes> attributes) {
        this.attributes = attributes;
    }

    public List<DataModelImage> getImage_url() {
        return image_url;
    }

    public void setImage_url(List<DataModelImage> image_url) {
        this.image_url = image_url;
    }

    public List<DataModelCategories> getCategory() {
        return category;
    }

    public void setCategory(List<DataModelCategories> category) {
        this.category = category;
    }
}
