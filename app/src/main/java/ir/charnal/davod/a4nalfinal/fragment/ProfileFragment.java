package ir.charnal.davod.a4nalfinal.fragment;

import android.app.SearchManager;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.SearchView;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

import ir.charnal.davod.a4nalfinal.DataFakeGenerator.DataFakeGeneratorNotice;
import ir.charnal.davod.a4nalfinal.R;
import ir.charnal.davod.a4nalfinal.activity.MainActivity;
import ir.charnal.davod.a4nalfinal.adapter.RecyclerViewNoticeAdapter;

public class ProfileFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        return inflater.inflate(R.layout.profile, container, false);
    }







}
//    @Override
//    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
//        MenuInflater menuInflater = getMenuInflater();
//        menuInflater.inflate(R.menu.menu_advertising, menu);
//
//        MenuItem searchItem = menu.findItem(R.id.search_toolbar_advertising);
//
//        SearchManager searchManager = (SearchManager) getContext().getSystemService(Context.SEARCH_SERVICE);
//
//        SearchView searchView = null;
//        if (searchItem != null) {
//            searchView = (SearchView) searchItem.getActionView();
//        }
//        if (searchView != null) {
//            searchView.setSearchableInfo(searchManager.getSearchableInfo(MainActivity.this.getComponentName()));
//        }
//        super.onCreateOptionsMenu(menu, inflater);
//    }

//delete the recyclerView in this fragment

//}
