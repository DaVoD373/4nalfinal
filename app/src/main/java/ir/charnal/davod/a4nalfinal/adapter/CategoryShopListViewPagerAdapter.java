package ir.charnal.davod.a4nalfinal.adapter;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import ir.charnal.davod.a4nalfinal.fragment.CategoryShopListFragment;


public class CategoryShopListViewPagerAdapter extends FragmentPagerAdapter {


    public CategoryShopListViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }


//please check this line error
    @Override
    public Fragment getItem(int position) {
        return CategoryShopListFragment.newInstance();
    }

    @Override
    public int getCount() {
        return 7;
    }

    public CharSequence getPageTitle(int position) {

//         this tabs is reverse. so I should write the tab number inverted.
        switch (position){
            case 0:
                return "مادر و کودک";
            case 1:
                return "کالای دیجیتال";
            case 2:
                return "مد و پوشاک";
            case 3:
                return "خانه";
            case 4:
                return "آرایشی و بهداشتی";
            case 5:
                return "کتاب، فرهنگ و هنر";
            case 6:
                return "ورزش و سفر";
            default:
                return "";
        }
//        return "";
    }
}
