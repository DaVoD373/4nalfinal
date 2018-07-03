package ir.charnal.davod.a4nalfinal.fragment;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;

import ir.charnal.davod.a4nalfinal.Data.DataFromServer;
import ir.charnal.davod.a4nalfinal.R;
import ir.charnal.davod.a4nalfinal.activity.AllProductsActivity;
import ir.charnal.davod.a4nalfinal.activity.CategoryListShopActivity;
import ir.charnal.davod.a4nalfinal.activity.ShoppingCartActivity;
import ir.charnal.davod.a4nalfinal.adapter.CategoryShopMainPageAdapter;
import ir.charnal.davod.a4nalfinal.adapter.ProductShopMainPageAdapter;
import ir.charnal.davod.a4nalfinal.datamodel.dataModelShop.DataModelCategoriseOfProducts;
import ir.charnal.davod.a4nalfinal.datamodel.dataModelShop.DataModelProducts;
import ss.com.bannerslider.banners.Banner;
import ss.com.bannerslider.banners.DrawableBanner;
import ss.com.bannerslider.views.BannerSlider;

public class ShopFragment extends Fragment {

    private BannerSlider bannerSlider;
    private Toolbar toolbar;
    private DrawerLayout drawerLayout;
    private Button btnSeeListMostPopular;
    private Button btnSeeListMostSales;
    private Button btnSeeListNewest;
    private ProductShopMainPageAdapter mostPopularProductShopMainPageAdapter, mostSalesProductShopMainPageAdapter, newestProductShopMainPageAdapter;
    private RecyclerView recyclerViewCategoryShopMainPage, recyclerViewMostPopularProductShopMainPage, recyclerViewMostSalesProductShopMainPage, recyclerViewNewestProductShopMainPage;
    private DataFromServer dataFromServer = new DataFromServer();


    @SuppressLint("ValidFragment")
    public ShopFragment(Toolbar toolbar, DrawerLayout drawerLayout) {
        this.toolbar = toolbar;
        this.drawerLayout = drawerLayout;

    }

    public ShopFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.layout_shop, container, false);

        return view;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setHasOptionsMenu(true);
        setupToolbar();


    }

    //Todo set listener for see full lists buttons.
    private void listeners() {
        btnSeeListMostPopular = getView().findViewById(R.id.btn_see_full_list_most_popular);
        btnSeeListMostSales = getView().findViewById(R.id.btn_see_full_list_most_sales);
        btnSeeListNewest = getView().findViewById(R.id.btn_see_full_list_newest);

        btnSeeListMostPopular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), AllProductsActivity.class);
                getContext().startActivity(intent);
            }
        });
        btnSeeListMostSales.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), AllProductsActivity.class);
                getContext().startActivity(intent);
            }
        });
        btnSeeListNewest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), AllProductsActivity.class);
                getContext().startActivity(intent);
            }
        });

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.menu_category_shop:
                startActivity(new Intent(getActivity(), CategoryListShopActivity.class));
                break;
            case R.id.menu_shopping_cart:
                startActivity(new Intent(getActivity(), ShoppingCartActivity.class));
                break;
        }
        return true;
    }

    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        super.onCreateOptionsMenu(menu, inflater);
        inflater.inflate(R.menu.menu_shop, menu);
    }


    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        //Todo complete this method.
        listeners();

        getDataFromServer();


        bannerSlider = view.findViewById(R.id.banner_slider_shop);
        List<Banner> banners = new ArrayList<>();
        banners.add(new DrawableBanner(R.drawable.banner1));
        banners.add(new DrawableBanner(R.drawable.horse_sample_pic));
        banners.add(new DrawableBanner(R.drawable.ad_store_banner_2));
        bannerSlider.setBanners(banners);


        recyclerViewMostPopularProductShopMainPage = view.findViewById(R.id.recycler_view_most_popular_shop_main_page);
        recyclerViewMostSalesProductShopMainPage = view.findViewById(R.id.recycler_view_most_sales_shop_main_page);
        recyclerViewNewestProductShopMainPage = view.findViewById(R.id.recycler_view_newest_products_shop_main_page);
        recyclerViewCategoryShopMainPage = view.findViewById(R.id.recycler_view_category_shop);


//        recyclerView.addItemDecoration(new DividerItemDecoration(view.getContext(),DividerItemDecoration.VERTICAL));

    }


    private void setupToolbar() {


        ActionBarDrawerToggle drawerToggle = new ActionBarDrawerToggle(getActivity(), drawerLayout, toolbar, 0, 0);
        drawerLayout.addDrawerListener(drawerToggle);
        drawerToggle.syncState();
    }

    private void getDataFromServer() {


        dataFromServer.getProductsFromServer(new DataFromServer.OnProductsReceived() {
            @Override
            public void onReceived(List<DataModelProducts> products) {
                //recycler most popular
                mostPopularProductShopMainPageAdapter = new ProductShopMainPageAdapter(getActivity(), products,ProductShopMainPageAdapter.MAIN_PAGE);
                recyclerViewMostPopularProductShopMainPage.setLayoutManager(new LinearLayoutManager(getActivity(), LinearLayoutManager.HORIZONTAL, false));
                recyclerViewMostPopularProductShopMainPage.setAdapter(mostPopularProductShopMainPageAdapter);

                //recycler most sales
                mostSalesProductShopMainPageAdapter = new ProductShopMainPageAdapter(getActivity(), products,ProductShopMainPageAdapter.MAIN_PAGE);
                recyclerViewMostSalesProductShopMainPage.setLayoutManager(new LinearLayoutManager(getActivity(), LinearLayoutManager.HORIZONTAL, false));
                recyclerViewMostSalesProductShopMainPage.setAdapter(mostSalesProductShopMainPageAdapter);

                //recycler newest
                newestProductShopMainPageAdapter = new ProductShopMainPageAdapter(getActivity(), products,ProductShopMainPageAdapter.MAIN_PAGE);
                recyclerViewNewestProductShopMainPage.setLayoutManager(new LinearLayoutManager(getActivity(), LinearLayoutManager.HORIZONTAL, false));
                recyclerViewNewestProductShopMainPage.setAdapter(newestProductShopMainPageAdapter);
            }

        },"","");


        dataFromServer.getCategoriesFromServer(new DataFromServer.OnCategoriesReceived() {
            @Override
            public void onReceived(List<DataModelCategoriseOfProducts> limit_category) {
                //recycler category names
                CategoryShopMainPageAdapter categoryShopMainPageAdapter = new CategoryShopMainPageAdapter(getActivity(), limit_category);
                recyclerViewCategoryShopMainPage.setLayoutManager(new LinearLayoutManager(getActivity(), LinearLayoutManager.HORIZONTAL, false));
                recyclerViewCategoryShopMainPage.setAdapter(categoryShopMainPageAdapter);
            }
        },"parent","0");


    }


}
