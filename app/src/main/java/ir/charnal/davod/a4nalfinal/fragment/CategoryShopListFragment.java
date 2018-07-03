package ir.charnal.davod.a4nalfinal.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import ir.charnal.davod.a4nalfinal.Data.DataFakeGenerator;
import ir.charnal.davod.a4nalfinal.Data.DataFromServer;
import ir.charnal.davod.a4nalfinal.R;
import ir.charnal.davod.a4nalfinal.adapter.CategoryShopListAdapter;
import ir.charnal.davod.a4nalfinal.adapter.CategoryShopMainPageAdapter;
import ir.charnal.davod.a4nalfinal.adapter.ProductShopMainPageAdapter;
import ir.charnal.davod.a4nalfinal.datamodel.dataModelShop.DataModelCategoriseOfProducts;
import ir.charnal.davod.a4nalfinal.datamodel.dataModelShop.DataModelProducts;

public class CategoryShopListFragment extends Fragment {
    private RecyclerView categoryShopListRecyclerView;
    private View view;
    private int numberOfSpan=2;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_category_shop_list, container, false);

        Intent intent = getActivity().getIntent();
        int idOfAdapter = intent.getIntExtra(CategoryShopListAdapter.ID_OF_ADAPTER,0);
        final int recyclerPosition = intent.getIntExtra(CategoryShopMainPageAdapter.RECYCLER_POSITION, 0);

        categoryShopListRecyclerView = view.findViewById(R.id.recycler_view_category_shop_list_fragment);
        DataFromServer dataFromServer = new DataFromServer();

        if (idOfAdapter == 1){
            dataFromServer.getProductsFromServer(new DataFromServer.OnProductsReceived() {
                @Override
                public void onReceived(List<DataModelProducts> products) {
                    ProductShopMainPageAdapter productShopMainPageAdapter = new ProductShopMainPageAdapter(getActivity(),products,ProductShopMainPageAdapter.ALL_PRODUCTS);
                    GridLayoutManager gridLayoutManager = new GridLayoutManager(getActivity(),numberOfSpan);
                    categoryShopListRecyclerView.setLayoutManager(gridLayoutManager);
                    categoryShopListRecyclerView.setAdapter(productShopMainPageAdapter);
                }

            },"","");

        }else {

            dataFromServer.getCategoriesFromServer(new DataFromServer.OnCategoriesReceived() {
                @Override
                public void onReceived(List<DataModelCategoriseOfProducts> limit_category) {

                    CategoryShopListAdapter categoryListAdapter = new CategoryShopListAdapter(getActivity(), limit_category);
                    categoryShopListRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity(), LinearLayoutManager.VERTICAL, false));
                    categoryShopListRecyclerView.setAdapter(categoryListAdapter);
                }
            },"parent","203");


        }
        return view;
    }

    public static Fragment newInstance() {

        Bundle args = new Bundle();

        CategoryShopListFragment fragment = new CategoryShopListFragment();
        fragment.setArguments(args);
        return fragment;
    }

//    @Override
//    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
//        super.onCreateOptionsMenu(menu, inflater);
////        if (numberOfSpan==2) {
////            menu.add("چینش").setIcon(R.drawable.vc_view_agenda_white);
////        }else{
////            menu.add("چینش").setIcon(R.drawable.vc_grid_on_white);
////        }
//        inflater.inflate(R.menu.menu_notice,menu);
//
//    }
//
//    @Override
//    public boolean onOptionsItemSelected(MenuItem item) {
//        if (numberOfSpan == 2) {
//            item.setIcon(R.drawable.vc_grid_on_white);
//            numberOfSpan = 1;
//        }else {
//            item.setIcon(R.drawable.vc_view_agenda_white);
//            numberOfSpan = 2;
//        }
//
//        ProductShopMainPageAdapter productShopMainPageAdapter = new ProductShopMainPageAdapter(getActivity(), DataFakeGenerator.getProductShopDataMainPage(getActivity()));
//        GridLayoutManager gridLayoutManager = new GridLayoutManager(getActivity(), numberOfSpan);
//        categoryShopListRecyclerView.setLayoutManager(gridLayoutManager);
//        categoryShopListRecyclerView.setAdapter(productShopMainPageAdapter);
//        return true;
//
//    }
}