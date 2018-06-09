package ir.charnal.davod.a4nalfinal.datamodel;

import android.graphics.drawable.Drawable;

import com.travijuu.numberpicker.library.NumberPicker;

public class DataModelListShoppingCart {

    private Drawable image;
    private String name;
    private String color;
    private String size;
    private String priceOne;
    private String priceAll;
    private NumberPicker number;

    public Drawable getImage() {
        return image;
    }

    public void setImage(Drawable image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getPriceOne() {
        return priceOne;
    }

    public void setPriceOne(String priceOne) {
        this.priceOne = priceOne;
    }

    public String getPriceAll() {
        return priceAll;
    }

    public void setPriceAll(String priceAll) {
        this.priceAll = priceAll;
    }

    public NumberPicker getNumber() {
        return number;
    }

    public void setNumber(NumberPicker number) {
        this.number = number;
    }
}
