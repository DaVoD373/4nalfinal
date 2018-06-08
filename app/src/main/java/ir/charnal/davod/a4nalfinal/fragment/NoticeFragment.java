package ir.charnal.davod.a4nalfinal.fragment;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.ScaleAnimation;
import android.widget.Button;

import ir.charnal.davod.a4nalfinal.DataFakeGenerator.DataFakeGenerator;
import ir.charnal.davod.a4nalfinal.R;
import ir.charnal.davod.a4nalfinal.activity.AddNewNoticeActivity;
import ir.charnal.davod.a4nalfinal.activity.SingleProductInformationShopActivity;
import ir.charnal.davod.a4nalfinal.adapter.RecyclerViewNoticeAdapter;

public class NoticeFragment extends Fragment {

    private Toolbar toolbar;
    private DrawerLayout drawerLayout;
    private FloatingActionButton fab;


    public NoticeFragment() {
    }

    @SuppressLint("ValidFragment")
    public NoticeFragment(Toolbar toolbar, DrawerLayout drawerLayout) {
        this.toolbar = toolbar;
        this.drawerLayout = drawerLayout;

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.layout_notice, container, false);

        return view;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {

        setupFloatActionButton(view);

        RecyclerView recyclerViewNoticeList = view.findViewById(R.id.recycler_view_newest_notices);
        recyclerViewNoticeList.setAdapter(new RecyclerViewNoticeAdapter(getActivity(), DataFakeGenerator.getFakeData(getActivity())));
        recyclerViewNoticeList.addItemDecoration(new DividerItemDecoration(view.getContext(), DividerItemDecoration.VERTICAL));

        recyclerViewNoticeList.addOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public void onScrollStateChanged(RecyclerView recyclerView, int newState) {
                super.onScrollStateChanged(recyclerView, newState);
            }

            @Override
            public void onScrolled(RecyclerView recyclerView, int dx, int dy) {
                if (dy>0 && fab.isShown())
                    fab.hide();
                if (dy<0)
                    fab.show();
            }
        });


        //for notice category and show or hide the category buttons.
        setupCategoryButton();

      //  setupToolbar(view);



    }

    private void setupCategoryButton() {
        Button btnNoticeCategory = getView().findViewById(R.id.btn_notice_category);
        final Button btn = getView().findViewById(R.id.button);
        final Button btn1 = getView().findViewById(R.id.button1);
        final Button btn2 = getView().findViewById(R.id.button2);
        final Button btn3 = getView().findViewById(R.id.button3);
        btnNoticeCategory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (btn.getVisibility() == View.GONE) {
                    btn.setVisibility(View.VISIBLE);
                    btn1.setVisibility(View.VISIBLE);
                    btn2.setVisibility(View.VISIBLE);
                    btn3.setVisibility(View.VISIBLE);
                } else {
                    btn.setVisibility(View.GONE);
                    btn1.setVisibility(View.GONE);
                    btn2.setVisibility(View.GONE);
                    btn3.setVisibility(View.GONE);
                }
            }
        });
    }


    private void setupToolbar() {

        ActionBarDrawerToggle drawerToggle = new ActionBarDrawerToggle(getActivity(),drawerLayout,toolbar,0,0);
        drawerLayout.addDrawerListener(drawerToggle);
        drawerToggle.syncState();
    }

    private void setupFloatActionButton(View view) {
        fab = view.findViewById(R.id.fab_notice);
        final ScaleAnimation scaleAnimation = new ScaleAnimation
                (1.0f,0.5f,1.0f,0.5f, Animation.RELATIVE_TO_SELF,0.5f,Animation.RELATIVE_TO_SELF,0.5f);
        scaleAnimation.setDuration(250);
        scaleAnimation.setRepeatCount(1);
        scaleAnimation.setRepeatMode(Animation.REVERSE);

        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fab.startAnimation(scaleAnimation);
                Intent intent = new Intent(getActivity(),AddNewNoticeActivity.class);
                startActivity(intent);
            }
        });

    }

    @SuppressLint("RestrictedApi")
    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        super.onCreateOptionsMenu(menu, inflater);

        inflater.inflate(R.menu.menu_notice, menu);

        //for visibility menu icons
//        if (menu instanceof MenuBuilder) {
//            MenuBuilder m = (MenuBuilder) menu;
//            m.setOptionalIconsVisible(true);
//        }


    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.menu_category_shop:
                startActivity(new Intent(getActivity(), SingleProductInformationShopActivity.class));
        }
        return true;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setHasOptionsMenu(true);
        setupToolbar();
    }


}
