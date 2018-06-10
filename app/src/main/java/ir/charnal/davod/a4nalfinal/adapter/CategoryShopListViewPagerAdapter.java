package ir.charnal.davod.a4nalfinal.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import ir.charnal.davod.a4nalfinal.fragment.CategoryShopListFragment;


public class CategoryShopListViewPagerAdapter extends FragmentPagerAdapter {


    public CategoryShopListViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }


    @Override
    public Fragment getItem(int position) {
        return CategoryShopListFragment.newInstance();
    }

    @Override
    public int getCount() {
        return 8;
    }

    public CharSequence getPageTitle(int position) {

//         this tabs is reverse. so I should write the tab number inverted.
        switch (position){
            case 0:
                return "کالای دیجیتال";
            case 1:
                return "مد و پوشاک";
            case 2:
                return "خانه، آشپزخانه و ابزار";
            case 3:
                return "آرایشی و بهداشتی";
            case 4:
                return "کتاب، فرهنگ و هنر";
            case 5:
                return "ورزش و سفر";
            case 6:
                return "مادر و کودک";
            case 7:
                return "وسایل نقلیه و صنعتی";
            default:
                return "";
        }
//        return "";
    }
}
