package ir.charnal.davod.a4nalfinal.activity;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import ir.charnal.davod.a4nalfinal.R;
import uk.co.chrisjenx.calligraphy.CalligraphyConfig;
import uk.co.chrisjenx.calligraphy.CalligraphyContextWrapper;

public class FinalizeShoppingActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setupFont();
        setContentView(R.layout.activity_finalize_shopping);
        setupToolbar();

//        NestedScrollView nestedScrollView = findViewById(R.id.scroll_view_finalize_shopping);


//        ScrollView scrollView =findViewById(R.id.scroll_view_finalize_shopping);
//        scrollView.fullScroll(ScrollView.FOCUS_FORWARD);
        findViewById(R.id.edit_text_first_name_finalize).requestFocus();

    }

    private void setupToolbar() {
        Toolbar toolbarFinalizeShop = findViewById(R.id.toolbar_finalize_shopping);
        toolbarFinalizeShop.setTitleTextColor(0xFFFFFFFF);
        setSupportActionBar(toolbarFinalizeShop);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setHomeButtonEnabled(true);
        actionBar.setDisplayHomeAsUpEnabled(true);
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
