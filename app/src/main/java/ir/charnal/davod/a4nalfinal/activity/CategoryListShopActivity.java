package ir.charnal.davod.a4nalfinal.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;

import ir.charnal.davod.a4nalfinal.R;
import ir.charnal.davod.a4nalfinal.adapter.CategoryShopListAdapter;
import ir.charnal.davod.a4nalfinal.adapter.CategoryShopListViewPagerAdapter;
import ir.charnal.davod.a4nalfinal.adapter.CategoryShopMainPageAdapter;
import ir.charnal.davod.a4nalfinal.fragment.CategoryShopListFragment;
import uk.co.chrisjenx.calligraphy.CalligraphyConfig;
import uk.co.chrisjenx.calligraphy.CalligraphyContextWrapper;

public class CategoryListShopActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setupFont();
        setContentView(R.layout.activity_category_list_shop);

        Intent intent = getIntent();
        int recyclerPosition = intent.getIntExtra(CategoryShopMainPageAdapter.RECYCLER_POSITION, 0);
        int idOfAdapter = intent.getIntExtra(CategoryShopListAdapter.ID_OF_ADAPTER, 0);

        TabLayout categoryShopListTabLayout = findViewById(R.id.category_shop_list_tab_layout);
        ViewPager categoryShopListViewPager = findViewById(R.id.category_shop_list_view_pager);

        if (idOfAdapter == 1) {

            categoryShopListTabLayout.setVisibility(View.GONE);
            FragmentManager fragmentManager = getSupportFragmentManager();
            FragmentTransaction transaction = fragmentManager.beginTransaction();
            transaction.add(R.id.fragment_container, new CategoryShopListFragment());
            transaction.commit();

        } else {


            CategoryShopListViewPagerAdapter categoryListViewPagerAdapter = new CategoryShopListViewPagerAdapter(getSupportFragmentManager());
            categoryShopListViewPager.setAdapter(categoryListViewPagerAdapter);
            categoryShopListTabLayout.setupWithViewPager(categoryShopListViewPager);
            //gozashtam dame dast bashe
//            categoryShopListViewPager.setCurrentItem(9);
            categoryShopListViewPager.setCurrentItem(recyclerPosition);

        }

        Toolbar toolbarCategoryFragment = findViewById(R.id.toolbar_category_shop_fragment);
        toolbarCategoryFragment.setTitleTextColor(0xFFFFFFFF);
        setSupportActionBar(toolbarCategoryFragment);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setHomeButtonEnabled(true);
        actionBar.setDisplayHomeAsUpEnabled(true);


    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                finish();
        }
        return true;
    }

    private void setupFont() {
        CalligraphyConfig.initDefault(new CalligraphyConfig.Builder()
                .setDefaultFontPath("fonts/iran_sans.ttf")
                .setFontAttrId(R.attr.fontPath)
                .build());
    }

    @Override
    protected void attachBaseContext(Context newBase) {
        super.attachBaseContext(CalligraphyContextWrapper.wrap(newBase));
    }
}
