package ir.charnal.davod.a4nalfinal.DataFakeGenerator;

import android.content.Context;
import android.support.v4.content.res.ResourcesCompat;
import ir.charnal.davod.a4nalfinal.R;
import java.util.ArrayList;
import java.util.List;

import ir.charnal.davod.a4nalfinal.datamodel.DataModelNotice;

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
}
