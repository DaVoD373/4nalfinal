package ir.charnal.davod.a4nalfinal.datamodel.dataModelShop;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class DataModelAttributes {

    @SerializedName("name")
    private String name ;
    @SerializedName("1")
    private List<String> options ;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getOptions() {
        return options;
    }

    public void setOptions(List<String> options) {
        this.options = options;
    }
}
