package ir.charnal.davod.a4nalfinal.activity;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.support.constraint.ConstraintLayout;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Gravity;
import android.view.MenuItem;
import android.view.View;

import com.jaredrummler.materialspinner.MaterialSpinner;

import ir.charnal.davod.a4nalfinal.R;
import uk.co.chrisjenx.calligraphy.CalligraphyConfig;
import uk.co.chrisjenx.calligraphy.CalligraphyContextWrapper;

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

        setupFont();
        setContentView(R.layout.activity_single_product_information_shop);

        listeners();
        setupViews();




    }



    private void listeners() {
        ConstraintLayout constraintLayout = findViewById(R.id.constraint_add_shopping_cart);

        constraintLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SingleProductInformationShopActivity.this, ShoppingCartActivity.class));
            }
        });
    }

    private void setupViews() {
        setupToolbar();
        setupSpinners();
    }

    private void setupSpinners() {
        MaterialSpinner colorSpinner = findViewById(R.id.spin_color_single_product);
        MaterialSpinner sizeSpinner = findViewById(R.id.spin_size_single_product);
        String[] colors = {"قهوه ای", "مشکی", "سفید"};
        Integer[] sizes = {37, 38, 39, 40, 41};

        colorSpinner.setItems(colors);
        sizeSpinner.setItems(sizes);
    }

    private void setupToolbar() {
        final Toolbar toolbarSingleProductInformation = findViewById(R.id.toolbar_single_product_shop);
        toolbarSingleProductInformation.setTitleTextColor(0xFFFFFFFF);
        setSupportActionBar(toolbarSingleProductInformation);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setHomeButtonEnabled(true);
        actionBar.setDisplayHomeAsUpEnabled(true);


        CollapsingToolbarLayout collapsingToolbarSingleProduct;

        collapsingToolbarSingleProduct = findViewById(R.id.collapsing_toolbar_single_product_shop_information);
        collapsingToolbarSingleProduct.setTitle("نام کالا");
        collapsingToolbarSingleProduct.setCollapsedTitleTextColor(Color.WHITE);
        collapsingToolbarSingleProduct.setExpandedTitleColor(Color.TRANSPARENT);
        collapsingToolbarSingleProduct.setExpandedTitleGravity(Gravity.LEFT);
        collapsingToolbarSingleProduct.setCollapsedTitleGravity(Gravity.RIGHT);
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
