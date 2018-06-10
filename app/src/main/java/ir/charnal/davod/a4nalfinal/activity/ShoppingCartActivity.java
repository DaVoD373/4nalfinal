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

import ir.charnal.davod.a4nalfinal.DataFakeGenerator.DataFakeGenerator;
import ir.charnal.davod.a4nalfinal.R;
import ir.charnal.davod.a4nalfinal.adapter.ShoppingCartAdapter;
import uk.co.chrisjenx.calligraphy.CalligraphyConfig;
import uk.co.chrisjenx.calligraphy.CalligraphyContextWrapper;

public class ShoppingCartActivity extends AppCompatActivity {

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
        Button btnFinalizeShoppingCart = findViewById(R.id.btn_finalize_shopping_cart);
        btnFinalizeShoppingCart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ShoppingCartActivity.this,FinalizeShoppingActivity.class));
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
        recyclerViewShoppingCart.setLayoutManager(new LinearLayoutManager(ShoppingCartActivity.this,LinearLayoutManager.VERTICAL,false));
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
    @Override
    protected void attachBaseContext(Context newBase) {
        super.attachBaseContext(CalligraphyContextWrapper.wrap(newBase));
    }


}
