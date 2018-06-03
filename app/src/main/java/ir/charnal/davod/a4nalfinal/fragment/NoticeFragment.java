package ir.charnal.davod.a4nalfinal.fragment;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.view.menu.MenuBuilder;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import ir.charnal.davod.a4nalfinal.DataFakeGenerator.DataFakeGenerator;
import ir.charnal.davod.a4nalfinal.R;
import ir.charnal.davod.a4nalfinal.adapter.RecyclerViewNoticeAdapter;

public class NoticeFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        //this line is for change title name. probably necessary.
//        ((MainActivity) getActivity()).setActionBarTitle("notice");
        return inflater.inflate(R.layout.layout_advertising, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        RecyclerView recyclerViewNoticeList = view.findViewById(R.id.recycler_view_newest_notices);
        recyclerViewNoticeList.setAdapter(new RecyclerViewNoticeAdapter(getActivity(), DataFakeGenerator.getFakeData(getActivity())));
        recyclerViewNoticeList.addItemDecoration(new DividerItemDecoration(view.getContext(), DividerItemDecoration.VERTICAL));

        //for notice category and show or hide the category buttons.
        setupCategoryButton();



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

    @SuppressLint("RestrictedApi")
    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        super.onCreateOptionsMenu(menu, inflater);

        inflater.inflate(R.menu.menu_advertising, menu);

        //for visibility menu icons
//        if (menu instanceof MenuBuilder) {
//            MenuBuilder m = (MenuBuilder) menu;
//            m.setOptionalIconsVisible(true);
//        }


    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setHasOptionsMenu(true);
    }


}
