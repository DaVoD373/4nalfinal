package ir.charnal.davod.a4nalfinal.activity;

import android.content.Context;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;
import java.util.List;

import ir.charnal.davod.a4nalfinal.Data.DataFromServer;
import ir.charnal.davod.a4nalfinal.R;
import ir.charnal.davod.a4nalfinal.adapter.ProductShopMainPageAdapter;
import ir.charnal.davod.a4nalfinal.datamodel.dataModelShop.DataModelProducts;
import uk.co.chrisjenx.calligraphy.CalligraphyConfig;
import uk.co.chrisjenx.calligraphy.CalligraphyContextWrapper;

public class AllProductsActivity extends AppCompatActivity {

    private DataFromServer dataFromServer = new DataFromServer();
    private List<DataModelProducts> list_of_products = new ArrayList<>();
    private int numberOfSpan=2;
    private  RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setupFont();
        setContentView(R.layout.activity_all_products);

        setups();
    }

    private void setups() {

        setupToolbar();
        setupRecyclerView();

    }


    private void setupRecyclerView() {
        recyclerView = findViewById(R.id.recycler_view_all_products);
        dataFromServer.getProductsFromServer(new DataFromServer.OnProductsReceived() {
            @Override
            public void onReceived(List<DataModelProducts> products) {
                list_of_products = products;
                ProductShopMainPageAdapter adapter = new ProductShopMainPageAdapter(AllProductsActivity.this,products,ProductShopMainPageAdapter.ALL_PRODUCTS);
                GridLayoutManager gridLayoutManager = new GridLayoutManager(AllProductsActivity.this, numberOfSpan);
                recyclerView.setLayoutManager(gridLayoutManager);
                recyclerView.setAdapter(adapter);
            }
        },"per_page","50");

    }

    private void setupToolbar() {
        Toolbar toolbar = findViewById(R.id.toolbar_all_products);
        toolbar.setTitleTextColor(getResources().getColor(R.color.white));
        setSupportActionBar(toolbar);

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

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_notice,menu);
        menu.removeItem(R.id.filter_toolbar_advertising);
        return true;

    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (numberOfSpan == 2 && item.getItemId() == R.id.ordering) {
            item.setIcon(R.drawable.vc_grid_on_white);
            numberOfSpan = 1;
        }else if (numberOfSpan == 1 && item.getItemId() == R.id.ordering){
            item.setIcon(R.drawable.vc_view_agenda_white);
            numberOfSpan = 2;
        }

        ProductShopMainPageAdapter productShopMainPageAdapter = new ProductShopMainPageAdapter(this, list_of_products,ProductShopMainPageAdapter.ALL_PRODUCTS);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this, numberOfSpan);
        recyclerView.setLayoutManager(gridLayoutManager);
        recyclerView.setAdapter(productShopMainPageAdapter);
        return super.onOptionsItemSelected(item);
    }
}
