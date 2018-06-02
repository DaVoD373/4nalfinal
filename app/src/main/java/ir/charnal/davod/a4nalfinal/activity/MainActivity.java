package ir.charnal.davod.a4nalfinal.activity;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.util.TypedValue;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import ir.charnal.davod.a4nalfinal.R;
import ir.charnal.davod.a4nalfinal.adapter.ViewPagerAdapterMain;
import me.majiajie.pagerbottomtabstrip.MaterialMode;
import me.majiajie.pagerbottomtabstrip.NavigationController;
import me.majiajie.pagerbottomtabstrip.PageNavigationView;
import me.majiajie.pagerbottomtabstrip.listener.OnTabItemSelectedListener;

public class MainActivity extends AppCompatActivity {

    NavigationController mNavigationController;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);



        PageNavigationView pageBottomTabLayout = findViewById(R.id.tab);


        mNavigationController = pageBottomTabLayout.material()
                .addItem(R.drawable.vc_shop_black_24dp,"فروشگاه")
                .addItem(R.drawable.vc_notice_black_24dp,"آگهی\u200cها")
                .addItem(R.drawable.vc_profile_black_24dp,"پزوفایل")
                .setDefaultColor(0x89FFFFFF)
                .setMode(MaterialMode.CHANGE_BACKGROUND_COLOR | MaterialMode.HIDE_TEXT)
                .build();

        ViewPager viewPager = findViewById(R.id.viewPager);

        viewPager.setAdapter(new ViewPagerAdapterMain(getSupportFragmentManager(),mNavigationController));


        mNavigationController.setupWithViewPager(viewPager);



        mNavigationController.addTabItemSelectedListener(new OnTabItemSelectedListener() {
            @Override
            public void onSelected(int index, int old) {
               Toast.makeText(MainActivity.this, ""+mNavigationController.getSelected(), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onRepeat(int index) {
                Toast.makeText(MainActivity.this, "repeated", Toast.LENGTH_SHORT).show();

            }
        });

    }



// felan haminjuri bashe bi kar

    private static class TestAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder>{

        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            int padding = (int) TypedValue.applyDimension(
                    TypedValue.COMPLEX_UNIT_DIP, 16, parent.getResources().getDisplayMetrics());
            TextView textView = new TextView(parent.getContext());
            textView.setPadding(padding,padding,padding,padding);
            textView.setTextSize(TypedValue.COMPLEX_UNIT_SP,14);

            return new RecyclerView.ViewHolder(textView) {};
        }

        @Override
        public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {

            if(holder.itemView instanceof TextView){
                ((TextView) holder.itemView).setText(String.valueOf(position));
            }
        }

        @Override
        public int getItemCount() {
            return 100;
        }
    }
//this method must called for change title name
//    public void setActionBarTitle(String title) {
//        getSupportActionBar().setTitle(title);
//    }



}
