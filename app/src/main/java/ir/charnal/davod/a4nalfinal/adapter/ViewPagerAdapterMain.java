package ir.charnal.davod.a4nalfinal.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v7.app.AppCompatActivity;

import ir.charnal.davod.a4nalfinal.activity.MainActivity;
import ir.charnal.davod.a4nalfinal.fragment.NoticeFragment;
import ir.charnal.davod.a4nalfinal.fragment.ProfileFragment;
import ir.charnal.davod.a4nalfinal.fragment.ShopFragment;
import me.majiajie.pagerbottomtabstrip.NavigationController;

public class ViewPagerAdapterMain extends FragmentPagerAdapter {


    private NavigationController mNavigationController;

    public ViewPagerAdapterMain(FragmentManager fm, NavigationController mNavigationController) {
        super(fm);
        this.mNavigationController = mNavigationController;
    }

    @Override
    public Fragment getItem(int position) {

        switch (position){
            case 0:

                return new ShopFragment();
            case 1:
                return new NoticeFragment();
            case 2:
                return new ProfileFragment();
            default:
                return null;
        }

    }

    @Override
    public int getCount() {
        return mNavigationController.getItemCount();
    }
}
