package ir.charnal.davod.a4nalfinal.DataFakeGenerator;

import android.content.Context;
import android.support.v4.content.res.ResourcesCompat;
import ir.charnal.davod.a4nalfinal.R;
import java.util.ArrayList;
import java.util.List;

import ir.charnal.davod.a4nalfinal.datamodel.DataModelCategoryShopMainPage;
import ir.charnal.davod.a4nalfinal.datamodel.DataModelNotice;
import ir.charnal.davod.a4nalfinal.datamodel.DataModelNoticeCategory;
import ir.charnal.davod.a4nalfinal.datamodel.DataModelProductShopMainPage;

public class DataFakeGenerator {

    public static List<DataModelNotice> getFakeData(Context context){
        List<DataModelNotice> models = new ArrayList<>();
        DataModelNotice model = new DataModelNotice();
        for (int i = 0; i < 10; i++) {
            model.setContent("لورم ایپسوم متن ساختگی با تولید سادگی نامفهوم از صنعت چاپ و با استفاده از طراحان گرافیک است.");
            model.setTitle("آگهی");
            model.setDate("1 ساعت پیش");
            model.setImage(ResourcesCompat.getDrawable(context.getResources(), R.drawable.vc_notice_black_24dp,null));
            models.add(model);
        }

        return models;

    }
//for notice category, but is not necessary now.
    public static List<DataModelNoticeCategory> getCategoryNotice (Context context){
        List<DataModelNoticeCategory> noticeCategoryModels = new ArrayList<>();
        DataModelNoticeCategory dataModelNoticeCategory = new DataModelNoticeCategory();
        for (int i = 0; i < 3; i++) {
            switch (i) {
                case 0:
                    dataModelNoticeCategory.setNoticeCategory("کشش");
                case 1:
                    dataModelNoticeCategory.setNoticeCategory("لوازم سوارکار");
                case 2:
                    dataModelNoticeCategory.setNoticeCategory("لوازم اسب");
                case 3:
                    dataModelNoticeCategory.setNoticeCategory("اسب");
            }

                    noticeCategoryModels.add(dataModelNoticeCategory);

        }

        return noticeCategoryModels;

    }

    public static List<DataModelCategoryShopMainPage> getCategoryShopDataMainPage(Context context){
        List<DataModelCategoryShopMainPage> categoriesShopMainPage = new ArrayList<>();

        for (int i = 1; i <= 8; i++) {
            DataModelCategoryShopMainPage categoryShopMainPage = new DataModelCategoryShopMainPage();
            categoryShopMainPage.setId(i);
            switch (i){
                case 1:
                    categoryShopMainPage.setProductName("کالای دیجیتال");
                    break;
                case 2:
                    categoryShopMainPage.setProductName("مد و پوشاک");
                    break;
                case 3:
                    categoryShopMainPage.setProductName("خانه، آشپزخانه و ابزار");
                    break;
                case 4:
                    categoryShopMainPage.setProductName("آرایشی و بهداشتی");
                    break;
                case 5:
                    categoryShopMainPage.setProductName("کتاب، فرهنگ و هنر");
                    break;
                case 6:
                    categoryShopMainPage.setProductName("ورزش و سفر");
                    break;

                case 7:
                    categoryShopMainPage.setProductName("مادر و کودک");
                    break;
                case 8:
                    categoryShopMainPage.setProductName("وسایل نقلیه و صنعتی");
                    break;
            }
            categoriesShopMainPage.add(categoryShopMainPage);
        }
        return categoriesShopMainPage;
    }

    public static List<DataModelProductShopMainPage> getProductShopDataMainPage(Context context) {
        List<DataModelProductShopMainPage> productsListShopMainPage = new ArrayList<>();
        String moneyUnit = " تومان";

        DataModelProductShopMainPage productShopMainPage = new DataModelProductShopMainPage();
        productShopMainPage.setProductImage(ResourcesCompat.getDrawable(context.getResources(), R.drawable.horse_sample_pic,null));
        for (int i = 1; i <= 8; i++) {
            productShopMainPage.setId(i);
            switch (i){
                case 1:
                    productShopMainPage.setContent("1 لورم ایپسوم متن ساختگی با تولید سادگی نامفهوم از صنعت چاپ و با استفاد" +
                            "ه از طراحان گرافیک است. چاپگرها و متون بلکه روزنامه و مجله در ستون و سطرآنچنان که لا" +
                            "زم است و برای شرایط فعلی تکنولوژی مورد نیاز و کاربردهای متنوع با هدف بهبود ابزارهای" +
                            " کاربردی می باشد.لورم ایپسوم متن ساختگی با تولید سادگی نامفهوم از صنعت چاپ و با استفاد" +
                            "ه از طراحان گرافیک است. چاپگرها و متون بلکه روزنامه و مجله در ستون و سطرآنچنان که لازم " +
                            "است و برای شرایط فعلی تکنولوژی مورد نیاز و کاربردهای متنوع با هدف بهبود ابزارهای کاربردی می باشد.");
                    productShopMainPage.setPrice("10,000" + moneyUnit);
                    break;
                case 2:
                    productShopMainPage.setContent("2 لورم ایپسوم متن ساختگی با تولید سادگی نامفهوم از صنعت چاپ و با استفاد" +
                            "ه از طراحان گرافیک است. چاپگرها و متون بلکه روزنامه و مجله در ستون و سطرآنچنان که لا" +
                            "زم است و برای شرایط فعلی تکنولوژی مورد نیاز و کاربردهای متنوع با هدف بهبود ابزارهای" +
                            " کاربردی می باشد.لورم ایپسوم متن ساختگی با تولید سادگی نامفهوم از صنعت چاپ و با استفاد" +
                            "ه از طراحان گرافیک است. چاپگرها و متون بلکه روزنامه و مجله در ستون و سطرآنچنان که لازم " +
                            "است و برای شرایط فعلی تکنولوژی مورد نیاز و کاربردهای متنوع با هدف بهبود ابزارهای کاربردی می باشد.");
                    productShopMainPage.setPrice("100,000" + moneyUnit);
                    break;
                case 3:
                    productShopMainPage.setContent("3 لورم ایپسوم متن ساختگی با تولید سادگی نامفهوم از صنعت چاپ و با استفاد" +
                            "ه از طراحان گرافیک است. چاپگرها و متون بلکه روزنامه و مجله در ستون و سطرآنچنان که لا" +
                            "زم است و برای شرایط فعلی تکنولوژی مورد نیاز و کاربردهای متنوع با هدف بهبود ابزارهای" +
                            " کاربردی می باشد.لورم ایپسوم متن ساختگی با تولید سادگی نامفهوم از صنعت چاپ و با استفاد" +
                            "ه از طراحان گرافیک است. چاپگرها و متون بلکه روزنامه و مجله در ستون و سطرآنچنان که لازم " +
                            "است و برای شرایط فعلی تکنولوژی مورد نیاز و کاربردهای متنوع با هدف بهبود ابزارهای کاربردی می باشد.");
                    productShopMainPage.setPrice("150,000" + moneyUnit);
                    break;
                case 4:
                    productShopMainPage.setContent("4 لورم ایپسوم متن ساختگی با تولید سادگی نامفهوم از صنعت چاپ و با استفاد" +
                            "ه از طراحان گرافیک است. چاپگرها و متون بلکه روزنامه و مجله در ستون و سطرآنچنان که لا" +
                            "زم است و برای شرایط فعلی تکنولوژی مورد نیاز و کاربردهای متنوع با هدف بهبود ابزارهای" +
                            " کاربردی می باشد.لورم ایپسوم متن ساختگی با تولید سادگی نامفهوم از صنعت چاپ و با استفاد" +
                            "ه از طراحان گرافیک است. چاپگرها و متون بلکه روزنامه و مجله در ستون و سطرآنچنان که لازم " +
                            "است و برای شرایط فعلی تکنولوژی مورد نیاز و کاربردهای متنوع با هدف بهبود ابزارهای کاربردی می باشد.");
                    productShopMainPage.setPrice("170,000" + moneyUnit);
                    break;
                case 5:
                    productShopMainPage.setContent("5 لورم ایپسوم متن ساختگی با تولید سادگی نامفهوم از صنعت چاپ و با استفاد" +
                            "ه از طراحان گرافیک است. چاپگرها و متون بلکه روزنامه و مجله در ستون و سطرآنچنان که لا" +
                            "زم است و برای شرایط فعلی تکنولوژی مورد نیاز و کاربردهای متنوع با هدف بهبود ابزارهای" +
                            " کاربردی می باشد.لورم ایپسوم متن ساختگی با تولید سادگی نامفهوم از صنعت چاپ و با استفاد" +
                            "ه از طراحان گرافیک است. چاپگرها و متون بلکه روزنامه و مجله در ستون و سطرآنچنان که لازم " +
                            "است و برای شرایط فعلی تکنولوژی مورد نیاز و کاربردهای متنوع با هدف بهبود ابزارهای کاربردی می باشد.");
                    productShopMainPage.setPrice("210,000" + moneyUnit);
                    break;
                case 6:
                    productShopMainPage.setContent("6 لورم ایپسوم متن ساختگی با تولید سادگی نامفهوم از صنعت چاپ و با استفاد" +
                            "ه از طراحان گرافیک است. چاپگرها و متون بلکه روزنامه و مجله در ستون و سطرآنچنان که لا" +
                            "زم است و برای شرایط فعلی تکنولوژی مورد نیاز و کاربردهای متنوع با هدف بهبود ابزارهای" +
                            " کاربردی می باشد.لورم ایپسوم متن ساختگی با تولید سادگی نامفهوم از صنعت چاپ و با استفاد" +
                            "ه از طراحان گرافیک است. چاپگرها و متون بلکه روزنامه و مجله در ستون و سطرآنچنان که لازم " +
                            "است و برای شرایط فعلی تکنولوژی مورد نیاز و کاربردهای متنوع با هدف بهبود ابزارهای کاربردی می باشد.");
                    productShopMainPage.setPrice("674,000" + moneyUnit);
                    break;
                case 7:
                    productShopMainPage.setContent("7 لورم ایپسوم متن ساختگی با تولید سادگی نامفهوم از صنعت چاپ و با استفاد" +
                            "ه از طراحان گرافیک است. چاپگرها و متون بلکه روزنامه و مجله در ستون و سطرآنچنان که لا" +
                            "زم است و برای شرایط فعلی تکنولوژی مورد نیاز و کاربردهای متنوع با هدف بهبود ابزارهای" +
                            " کاربردی می باشد.لورم ایپسوم متن ساختگی با تولید سادگی نامفهوم از صنعت چاپ و با استفاد" +
                            "ه از طراحان گرافیک است. چاپگرها و متون بلکه روزنامه و مجله در ستون و سطرآنچنان که لازم " +
                            "است و برای شرایط فعلی تکنولوژی مورد نیاز و کاربردهای متنوع با هدف بهبود ابزارهای کاربردی می باشد.");
                    productShopMainPage.setPrice("7,000" + moneyUnit);
                    break;
                case 8:
                    productShopMainPage.setContent("8 لورم ایپسوم متن ساختگی با تولید سادگی نامفهوم از صنعت چاپ و با استفاد" +
                            "ه از طراحان گرافیک است. چاپگرها و متون بلکه روزنامه و مجله در ستون و سطرآنچنان که لا" +
                            "زم است و برای شرایط فعلی تکنولوژی مورد نیاز و کاربردهای متنوع با هدف بهبود ابزارهای" +
                            " کاربردی می باشد.لورم ایپسوم متن ساختگی با تولید سادگی نامفهوم از صنعت چاپ و با استفاد" +
                            "ه از طراحان گرافیک است. چاپگرها و متون بلکه روزنامه و مجله در ستون و سطرآنچنان که لازم " +
                            "است و برای شرایط فعلی تکنولوژی مورد نیاز و کاربردهای متنوع با هدف بهبود ابزارهای کاربردی می باشد.");
                    productShopMainPage.setPrice("7,658,000" + moneyUnit);
                    break;
            }
            productsListShopMainPage.add(productShopMainPage);

        }
        return productsListShopMainPage;
    }


}
