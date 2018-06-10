package ir.charnal.davod.a4nalfinal.activity;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.jaredrummler.materialspinner.MaterialSpinner;

import ir.charnal.davod.a4nalfinal.R;
import ir.charnal.davod.cityholderofiran.CityOfIranHolder;
import uk.co.chrisjenx.calligraphy.CalligraphyConfig;
import uk.co.chrisjenx.calligraphy.CalligraphyContextWrapper;

public class AddNewNoticeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setupFont();
        setContentView(R.layout.activity_add_new_notice);

        setupViews();


    }
    public void setupViews(){
        setupToolbar();
        setupSpinners();
    }

    public void setupToolbar(){
        Toolbar toolbar = findViewById(R.id.toolbar_add_notice);


        setSupportActionBar(toolbar);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setHomeButtonEnabled(true);
        actionBar.setDisplayHomeAsUpEnabled(true);

        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });


    }

    public void setupSpinners(){
        MaterialSpinner province_spinner = findViewById(R.id.spin_province);
        final MaterialSpinner city_spinner = findViewById(R.id.spin_city);
        MaterialSpinner strips_spinner = findViewById(R.id.spin_strips);
        MaterialSpinner ability_spinner = findViewById(R.id.spin_ability);
        String[] strips = {"نژاد 1","نژاد 2","نژاد 3","نژاد 4","نژاد 5","نژاد 6","نژاد 7"};
        String[] ability = {"حرفه 1","حرفه 2","حرفه 3","حرفه 4","حرفه 5","حرفه 6","حرفه 7"};

        strips_spinner.setItems(strips);
        ability_spinner.setItems(ability);

        province_spinner.setItems(CityOfIranHolder.getProvince());
        province_spinner.setOnItemSelectedListener(new MaterialSpinner.OnItemSelectedListener<String>() {

            @Override
            public void onItemSelected(MaterialSpinner view, int position, long id, String item) {
                city_spinner.setItems(CityOfIranHolder.getCity(item));
            }
        });


    }

    private void setupFont() {
        CalligraphyConfig.initDefault(new CalligraphyConfig.Builder()
                .setDefaultFontPath("fonts/iran_sans.ttf")
                .setFontAttrId(R.attr.fontPath)
                .build());
    }
    @Override
    protected void attachBaseContext(Context newBase) {
        super.attachBaseContext(CalligraphyContextWrapper.wrap(newBase));
    }

}

