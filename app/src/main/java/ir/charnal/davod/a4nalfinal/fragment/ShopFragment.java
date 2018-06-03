package ir.charnal.davod.a4nalfinal.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.view.menu.MenuBuilder;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

import com.daimajia.slider.library.SliderLayout;
import com.daimajia.slider.library.SliderTypes.TextSliderView;

import ir.charnal.davod.a4nalfinal.DataFakeGenerator.DataFakeGenerator;
import ir.charnal.davod.a4nalfinal.R;
import ir.charnal.davod.a4nalfinal.activity.CategoryListShopActivity;
import ir.charnal.davod.a4nalfinal.adapter.CategoryShopMainPageAdapter;
import ir.charnal.davod.a4nalfinal.adapter.ProductShopMainPageAdapter;

public class ShopFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        return inflater.inflate(R.layout.layout_shop,container,false);
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setHasOptionsMenu(true);

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.menu_category_shop:
                startActivity(new Intent(getActivity(), CategoryListShopActivity.class));
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
        //recycler category names
        RecyclerView recyclerViewCategoryShopMainPage = view.findViewById(R.id.recycler_view_category_shop);
        CategoryShopMainPageAdapter categoryShopMainPageAdapter = new CategoryShopMainPageAdapter(getActivity(),DataFakeGenerator.getCategoryShopDataMainPage(getActivity()));
        recyclerViewCategoryShopMainPage.setLayoutManager(new LinearLayoutManager(getActivity(),LinearLayoutManager.HORIZONTAL,false));
        recyclerViewCategoryShopMainPage.setAdapter(categoryShopMainPageAdapter);

        //recycler most popular
        RecyclerView recyclerViewMostPopularProductShopMainPage = view.findViewById(R.id.recycler_view_most_popular_shop_main_page);
        ProductShopMainPageAdapter mostPopularProductShopMainPageAdapter = new ProductShopMainPageAdapter(getActivity(),DataFakeGenerator.getProductShopDataMainPage(getActivity()));
        recyclerViewMostPopularProductShopMainPage.setLayoutManager(new LinearLayoutManager(getActivity(),LinearLayoutManager.HORIZONTAL,false));
        recyclerViewMostPopularProductShopMainPage.setAdapter(mostPopularProductShopMainPageAdapter);

        //recycler most sales
        RecyclerView recyclerViewMostSalesProductShopMainPage = view.findViewById(R.id.recycler_view_most_sales_shop_main_page);
        ProductShopMainPageAdapter mostSalesProductShopMainPageAdapter = new ProductShopMainPageAdapter(getActivity(),DataFakeGenerator.getProductShopDataMainPage(getActivity()));
        recyclerViewMostSalesProductShopMainPage.setLayoutManager(new LinearLayoutManager(getActivity(),LinearLayoutManager.HORIZONTAL,false));
        recyclerViewMostSalesProductShopMainPage.setAdapter(mostSalesProductShopMainPageAdapter);

        //recycler newest
        RecyclerView recyclerViewNewestProductShopMainPage = view.findViewById(R.id.recycler_view_newest_products_shop_main_page);
        ProductShopMainPageAdapter newestProductShopMainPageAdapter = new ProductShopMainPageAdapter(getActivity(),DataFakeGenerator.getProductShopDataMainPage(getActivity()));
        recyclerViewNewestProductShopMainPage.setLayoutManager(new LinearLayoutManager(getActivity(),LinearLayoutManager.HORIZONTAL,false));
        recyclerViewNewestProductShopMainPage.setAdapter(newestProductShopMainPageAdapter);


//        recyclerView.addItemDecoration(new DividerItemDecoration(view.getContext(),DividerItemDecoration.VERTICAL));

    }
}
