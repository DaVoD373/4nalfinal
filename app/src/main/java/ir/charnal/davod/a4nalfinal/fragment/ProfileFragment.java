package ir.charnal.davod.a4nalfinal.fragment;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import ir.charnal.davod.a4nalfinal.R;
import ir.charnal.davod.a4nalfinal.activity.LoginActivity;

public class ProfileFragment extends Fragment {

    private Toolbar toolbar;
    private Button btnRegister;

    public ProfileFragment() {
    }

    @SuppressLint("ValidFragment")
    public ProfileFragment(Toolbar toolbar) {
        this.toolbar = toolbar;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        btnRegister = view.findViewById(R.id.btn_submit);
        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), LoginActivity.class));
            }
        });


    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.layout_profile, container, false);

      //  setupToolbar(view);
        return view;
    }





    private void setupToolbar(View view) {


        ActionBar actionBar =((AppCompatActivity)getActivity()).getSupportActionBar();
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true);
            actionBar.setHomeButtonEnabled(true);
        }


    }

}
//    @Override
//    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
//        MenuInflater menuInflater = getMenuInflater();
//        menuInflater.inflate(R.menu.menu_notice, menu);
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
