package ir.charnal.davod.a4nalfinal.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import java.util.List;
import ir.charnal.davod.a4nalfinal.datamodel.dataModelShop.DataModelCategoriseOfProducts;
import ir.charnal.davod.a4nalfinal.fragment.CategoryShopListFragment;


public class CategoryShopListViewPagerAdapter extends FragmentPagerAdapter {



    private List<DataModelCategoriseOfProducts> limit_category;


    public CategoryShopListViewPagerAdapter(FragmentManager fm,List<DataModelCategoriseOfProducts> limit_category) {
        super(fm);
        this.limit_category = limit_category;
    }


    @Override
    public Fragment getItem(int position) {
        return CategoryShopListFragment.newInstance();
    }

    @Override
    public int getCount() {
        return 8;
    }

    public CharSequence getPageTitle( int position) {

              switch (position) {
                case 0:
                    return limit_category.get(position).getName();
                case 1:
                    return limit_category.get(position).getName();
                case 2:
                    return limit_category.get(position).getName();
                case 3:
                    return limit_category.get(position).getName();
                case 4:
                    return limit_category.get(position).getName();
                case 5:
                    return limit_category.get(position).getName();
                case 6:
                    return limit_category.get(position).getName();
                default:
                    return "";
            }

    }


}
