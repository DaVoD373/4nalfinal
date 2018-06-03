package ir.charnal.davod.a4nalfinal.datamodel;

import android.graphics.drawable.Drawable;

/**
 * Created by Sajjad on 4/17/2018.
 */

public class DataModelCategoryShopListFragments {
    private int id;
    private Drawable categoryImage;
    private String categoryName;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Drawable getCategoryImage() {
        return categoryImage;
    }

    public void setCategoryImage(Drawable categoryImage) {
        this.categoryImage = categoryImage;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }
}

