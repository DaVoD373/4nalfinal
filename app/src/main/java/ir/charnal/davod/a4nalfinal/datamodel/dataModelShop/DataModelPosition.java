package ir.charnal.davod.a4nalfinal.datamodel.dataModelShop;

import com.google.gson.annotations.SerializedName;

public class DataModelPosition {

    @SerializedName("name")
    private String name;
    @SerializedName("options")
    private DataModelOptions options ;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public DataModelOptions getOptions() {
        return options;
    }

    public void setOptions(DataModelOptions options) {
        this.options = options;
    }
}
