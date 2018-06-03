package ir.charnal.davod.a4nalfinal.activity;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

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




        PageNavigationView pageBottomTabLayout = findViewById(R.id.tab);


        mNavigationController = pageBottomTabLayout.material()
                .addItem(R.drawable.vc_shop_black_24dp,"فروشگاه")
                .addItem(R.drawable.vc_notice_black_24dp,"آگهی ها")
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
              // Toast.makeText(MainActivity.this, ""+mNavigationController.getSelected(), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onRepeat(int index) {
               // Toast.makeText(MainActivity.this, "repeated", Toast.LENGTH_SHORT).show();

            }
        });

    }



}
