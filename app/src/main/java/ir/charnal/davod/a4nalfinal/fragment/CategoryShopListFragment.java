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

import ir.charnal.davod.a4nalfinal.DataFakeGenerator.DataFakeGenerator;
import ir.charnal.davod.a4nalfinal.R;
import ir.charnal.davod.a4nalfinal.adapter.CategoryShopListAdapter;
import ir.charnal.davod.a4nalfinal.adapter.ProductShopMainPageAdapter;

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

        categoryShopListRecyclerView = view.findViewById(R.id.recycler_view_category_shop_list_fragment);

        if (idOfAdapter == 1){
            ProductShopMainPageAdapter productShopMainPageAdapter = new ProductShopMainPageAdapter(getActivity(),DataFakeGenerator.getProductShopDataMainPage(getActivity()));
            GridLayoutManager gridLayoutManager = new GridLayoutManager(getActivity(),numberOfSpan);
            categoryShopListRecyclerView.setLayoutManager(gridLayoutManager);
            categoryShopListRecyclerView.setAdapter(productShopMainPageAdapter);
        }else {
            CategoryShopListAdapter categoryListAdapter = new CategoryShopListAdapter(getActivity(), DataFakeGenerator.getCategoryShopListData(getActivity()));
            categoryShopListRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity(), LinearLayoutManager.VERTICAL, false));
            categoryShopListRecyclerView.setAdapter(categoryListAdapter);
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
////            menu.add("چینش").setIcon(R.drawable.vc_view_agenda_black);
////        }else{
////            menu.add("چینش").setIcon(R.drawable.vc_grid_on_black);
////        }
//        inflater.inflate(R.menu.menu_notice,menu);
//
//    }
//
//    @Override
//    public boolean onOptionsItemSelected(MenuItem item) {
//        if (numberOfSpan == 2) {
//            item.setIcon(R.drawable.vc_grid_on_black);
//            numberOfSpan = 1;
//        }else {
//            item.setIcon(R.drawable.vc_view_agenda_black);
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