package ir.charnal.davod.a4nalfinal.fragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import ir.charnal.davod.a4nalfinal.DataFakeGenerator.DataFakeGenerator;
import ir.charnal.davod.a4nalfinal.R;
import ir.charnal.davod.a4nalfinal.adapter.CategoryShopListAdapter;

public class CategoryShopListFragment extends Fragment {
    private RecyclerView categoryShopListRecyclerView;
    private View view;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_category_shop_list, container, false);
        categoryShopListRecyclerView = view.findViewById(R.id.recycler_view_category_shop_list_fragment);
        CategoryShopListAdapter categoryListAdapter = new CategoryShopListAdapter(getActivity(), DataFakeGenerator.getCategoryShopListData(getActivity()));
        categoryShopListRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity(), LinearLayoutManager.VERTICAL, false));
        categoryShopListRecyclerView.setAdapter(categoryListAdapter);
        return view;
    }

    public static Fragment newInstance() {

        Bundle args = new Bundle();

        CategoryShopListFragment fragment = new CategoryShopListFragment();
        fragment.setArguments(args);
        return fragment;
    }
}