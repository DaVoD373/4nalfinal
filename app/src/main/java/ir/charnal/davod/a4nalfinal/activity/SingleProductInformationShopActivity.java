package ir.charnal.davod.a4nalfinal.activity;

import android.graphics.Color;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Gravity;
import android.view.MenuItem;
import android.view.View;
import android.widget.HorizontalScrollView;

import ir.charnal.davod.a4nalfinal.R;
import ir.charnal.davod.a4nalfinal.adapter.CategoryShopListViewPagerAdapter;

public class SingleProductInformationShopActivity extends AppCompatActivity {

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                finish();
        }

        return true;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_single_product_information_shop);

        final Toolbar toolbarSingleProductInformation = findViewById(R.id.toolbar_single_product_shop);
        toolbarSingleProductInformation.setTitleTextColor(0xFFFFFFFF);
        setSupportActionBar(toolbarSingleProductInformation);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setHomeButtonEnabled(true);
        actionBar.setDisplayHomeAsUpEnabled(true);


        CollapsingToolbarLayout collapsingToolbarSingleProduct;

        collapsingToolbarSingleProduct = (CollapsingToolbarLayout) findViewById(R.id.collapsing_toolbar_single_product_shop_information);
                collapsingToolbarSingleProduct.setTitle("نام کالا");
                collapsingToolbarSingleProduct.setCollapsedTitleTextColor(Color.WHITE);
                collapsingToolbarSingleProduct.setExpandedTitleColor(Color.TRANSPARENT);
                collapsingToolbarSingleProduct.setExpandedTitleGravity(Gravity.LEFT);
                collapsingToolbarSingleProduct.setCollapsedTitleGravity(Gravity.RIGHT);





// fek nakonam lazem she vali bashe felan. bara appBar layoute.

//        final CollapsingToolbarLayout collapsingToolbarLayout = (CollapsingToolbarLayout) findViewById(R.id.collapsing_toolbar_single_product_shop_information);
//        AppBarLayout appBarLayout = (AppBarLayout) findViewById(R.id.app_bar_product_information_shop);
//        appBarLayout.addOnOffsetChangedListener(new AppBarLayout.OnOffsetChangedListener() {
//            boolean isShow = true;
//            int scrollRange = -1;
//
//            @Override
//            public void onOffsetChanged(AppBarLayout appBarLayout, int verticalOffset) {
//                collapsingToolbarLayout.setTitle("کیف پول و مدارک چرم طبیعی گلیما مدل کلا");
//                collapsingToolbarLayout.setCollapsedTitleTextColor(Color.WHITE);
//                collapsingToolbarLayout.setExpandedTitleColor(Color.TRANSPARENT);
//
//                if (scrollRange == -1) {
//                    scrollRange = appBarLayout.getTotalScrollRange();
//                    collapsingToolbarLayout.setCollapsedTitleTextColor(Color.TRANSPARENT);
//                }
//                if (scrollRange + verticalOffset == 0) {
//
//                    collapsingToolbarLayout.setCollapsedTitleTextColor(Color.WHITE);
//                    isShow = true;
//                } else if(isShow) {
//
//                    //carefull there should a space between double quote otherwise it wont work
//                    isShow = false;
//                }
//            }
//        });


    }
}
