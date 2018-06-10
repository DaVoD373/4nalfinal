package ir.charnal.davod.a4nalfinal.activity;

import android.content.Context;
import android.graphics.Color;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Gravity;
import android.view.MenuItem;

import ir.charnal.davod.a4nalfinal.R;
import uk.co.chrisjenx.calligraphy.CalligraphyConfig;
import uk.co.chrisjenx.calligraphy.CalligraphyContextWrapper;

public class SingleNoticeInformationActivity extends AppCompatActivity {

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                finish();

        }
        return true;

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setupFont();
        setContentView(R.layout.activity_single_notice_information);

        final Toolbar toolbarSingleNoticeInformation = findViewById(R.id.toolbar_single_notice_information);
        toolbarSingleNoticeInformation.setTitleTextColor(0xFFFFFFFF);
        setSupportActionBar(toolbarSingleNoticeInformation);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setHomeButtonEnabled(true);
        actionBar.setDisplayHomeAsUpEnabled(true);


        CollapsingToolbarLayout collapsingToolbarSingleNotice;

        collapsingToolbarSingleNotice = findViewById(R.id.collapsing_toolbar_single_notice_information);
        collapsingToolbarSingleNotice.setTitle("عنوان آگهی");
        collapsingToolbarSingleNotice.setCollapsedTitleTextColor(Color.WHITE);
        collapsingToolbarSingleNotice.setExpandedTitleColor(Color.TRANSPARENT);
        collapsingToolbarSingleNotice.setExpandedTitleGravity(Gravity.LEFT);
        collapsingToolbarSingleNotice.setCollapsedTitleGravity(Gravity.RIGHT);
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
