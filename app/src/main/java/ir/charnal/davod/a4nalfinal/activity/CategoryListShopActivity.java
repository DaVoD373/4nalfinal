package ir.charnal.davod.a4nalfinal.activity;

import android.content.Context;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

import ir.charnal.davod.a4nalfinal.R;
import ir.charnal.davod.a4nalfinal.adapter.CategoryShopListViewPagerAdapter;

public class CategoryListShopActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category_list_shop);
        TabLayout categoryShopListTabLayout = findViewById(R.id.category_shop_list_tab_layout);
        ViewPager categoryShopListViewPager = findViewById(R.id.category_shop_list_view_pager);
        CategoryShopListViewPagerAdapter categoryListViewPagerAdapter = new CategoryShopListViewPagerAdapter(getSupportFragmentManager());
        categoryShopListViewPager.setAdapter(categoryListViewPagerAdapter);
        categoryShopListTabLayout.setupWithViewPager(categoryShopListViewPager);
        categoryShopListViewPager.setCurrentItem(9);
        Toolbar toolbarCategoryFragment = findViewById(R.id.toolbar_category_shop_fragment);
        toolbarCategoryFragment.setTitleTextColor(0xFFFFFFFF);
        setSupportActionBar(toolbarCategoryFragment);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setHomeButtonEnabled(true);
        actionBar.setDisplayHomeAsUpEnabled(true);


    }
//for set font
//    @Override
//    protected void attachBaseContext(Context newBase) {
//        super.attachBaseContext(CalligraphyContextWrapper.wrap(newBase));
//    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                finish();
        }
        return true;
    }
}
