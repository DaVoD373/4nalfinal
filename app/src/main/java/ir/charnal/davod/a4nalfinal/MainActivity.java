package ir.charnal.davod.a4nalfinal;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import me.majiajie.pagerbottomtabstrip.NavigationController;
import me.majiajie.pagerbottomtabstrip.PageNavigationView;

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
                .addItem(R.drawable.vc_profile_black_24dp,"profile")
                .addItem(R.drawable.vc_notice_black_24dp,"notice")
                .addItem(R.drawable.vc_shop_black_24dp,"shop")
                .build();

        ViewPager viewPager = findViewById(R.id.viewPager);
        viewPager.setAdapter(new TestViewPagerAdapter(getSupportFragmentManager()));

        mNavigationController.setupWithViewPager(viewPager);
    }

    private class TestViewPagerAdapter extends FragmentPagerAdapter {

        public TestViewPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            return new TestFragment();
        }

        @Override
        public int getCount() {
            return mNavigationController.getItemCount();
        }
    }

    public static class TestFragment extends Fragment{

        @Nullable
        @Override
        public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
            return inflater.inflate(R.layout.recyclerview_main,container,false);
        }

        @Override
        public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
            RecyclerView recyclerView = view.findViewById(R.id.recyclerView);
            recyclerView.setAdapter(new TestAdapter());
            recyclerView.addItemDecoration(new DividerItemDecoration(view.getContext(),DividerItemDecoration.VERTICAL));
        }
    }

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
}
