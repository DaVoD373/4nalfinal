package ir.charnal.davod.a4nalfinal.activity;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.travijuu.numberpicker.library.NumberPicker;

import ir.charnal.davod.a4nalfinal.Data.DataFakeGenerator;
import ir.charnal.davod.a4nalfinal.R;
import ir.charnal.davod.a4nalfinal.adapter.ShoppingCartAdapter;
import uk.co.chrisjenx.calligraphy.CalligraphyConfig;
import uk.co.chrisjenx.calligraphy.CalligraphyContextWrapper;

public class ShoppingCartActivity extends AppCompatActivity {
    @Override
    protected void attachBaseContext(Context newBase) {
        super.attachBaseContext(CalligraphyContextWrapper.wrap(newBase));
    }

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
        setContentView(R.layout.activity_shopping_cart);

        listeners();
        setupViews();

    }

    private void listeners() {
        ImageView imageViewClearShoppingCart = findViewById(R.id.image_view_clear_shopping_cart);
        TextView textViewBrandShoppingCart = findViewById(R.id.text_view_brand_product_shopping_cart);
        TextView textViewNameProductShoppingCart = findViewById(R.id.text_view_name_product_shopping_cart);
        NumberPicker numberPickerShoppingCart = findViewById(R.id.num_pick_number_shopping_cart);
        TextView textViewColorShoppingCart = findViewById(R.id.text_view_second_column_color_shopping_cart);
        TextView textViewSizeShoppingCart = findViewById(R.id.text_view_second_column_size_shopping_cart);
        TextView textViewPriceOneShoppingCart = findViewById(R.id.text_view_second_column_price_one_shopping_cart);
        TextView textViewPriceNumberShoppingCart = findViewById(R.id.text_view_second_column_price_number_shopping_cart);
        TextView textViewPriceFinalShoppingCart = findViewById(R.id.text_view_second_column_price_number_shopping_cart);
        TextView textViewPriceAllShoppingCart = findViewById(R.id.text_view_second_column_final_price_shopping_cart);
        Button btnFinalizeShoppingCart = findViewById(R.id.btn_finalize_shopping_cart);
        btnFinalizeShoppingCart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ShoppingCartActivity.this, FinalizeShoppingActivity.class));
            }
        });

    }

    private void setupViews() {
        setupToolbar();
        setupRecycler();
    }

    private void setupRecycler() {
        RecyclerView recyclerViewShoppingCart = findViewById(R.id.recycler_view_shopping_cart);
        ShoppingCartAdapter shoppingCartAdapter = new ShoppingCartAdapter(ShoppingCartActivity.this, DataFakeGenerator.getShoppingCartListData(ShoppingCartActivity.this));
        recyclerViewShoppingCart.setLayoutManager(new LinearLayoutManager(ShoppingCartActivity.this, LinearLayoutManager.VERTICAL, false));
        recyclerViewShoppingCart.setAdapter(shoppingCartAdapter);
    }

    private void setupToolbar() {
        Toolbar toolbarShoppingCart = findViewById(R.id.toolbar_shopping_cart);
        toolbarShoppingCart.setTitleTextColor(0xFFFFFFFF);
        setSupportActionBar(toolbarShoppingCart);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setHomeButtonEnabled(true);
        actionBar.setDisplayHomeAsUpEnabled(true);
    }

    private void setupFont() {
        CalligraphyConfig.initDefault(new CalligraphyConfig.Builder()
                .setDefaultFontPath("fonts/iran_sans.ttf")
                .setFontAttrId(R.attr.fontPath)
                .build());
    }

}
