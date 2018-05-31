package ir.charnal.davod.a4nalfinal.DataFakeGenerator;

import android.content.Context;
import android.support.v4.content.res.ResourcesCompat;
import ir.charnal.davod.a4nalfinal.R;
import java.util.ArrayList;
import java.util.List;

import ir.charnal.davod.a4nalfinal.datamodel.DataModelNotice;
import ir.charnal.davod.a4nalfinal.datamodel.DataModelNoticeCategory;

public class DataFakeGeneratorNotice {

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
}
