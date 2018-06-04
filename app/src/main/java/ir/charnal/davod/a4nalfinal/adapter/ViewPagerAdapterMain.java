package ir.charnal.davod.a4nalfinal.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.widget.Toolbar;

import ir.charnal.davod.a4nalfinal.fragment.NoticeFragment;
import ir.charnal.davod.a4nalfinal.fragment.ProfileFragment;
import ir.charnal.davod.a4nalfinal.fragment.ShopFragment;
import me.majiajie.pagerbottomtabstrip.NavigationController;

public class ViewPagerAdapterMain extends FragmentPagerAdapter {


    private NavigationController mNavigationController;
    private Toolbar toolbar;
    private DrawerLayout drawerLayout;

    public ViewPagerAdapterMain(FragmentManager fm, NavigationController mNavigationController, Toolbar toolbar, DrawerLayout drawerLayout) {
        super(fm);
        this.mNavigationController = mNavigationController;
        this.toolbar = toolbar;
        this.drawerLayout = drawerLayout;

    }

    @Override
    public Fragment getItem(int position) {
        Fragment fragment;
        switch (position){
            case 0:
                fragment = new ShopFragment(toolbar,drawerLayout);
                break;
            case 1:
                 fragment = new NoticeFragment(toolbar,drawerLayout);
                break;
            case 2:
                 fragment = new ProfileFragment(toolbar);
                break;
                default:
                    fragment = null;
        }

        return fragment;

    }

    @Override
    public int getCount() {
        return mNavigationController.getItemCount();
    }
}
