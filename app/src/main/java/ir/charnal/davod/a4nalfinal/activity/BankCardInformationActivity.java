package ir.charnal.davod.a4nalfinal.activity;

import android.content.Context;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

import ir.charnal.davod.a4nalfinal.R;
import uk.co.chrisjenx.calligraphy.CalligraphyContextWrapper;

public class BankCardInformationActivity extends AppCompatActivity {
    @Override
    protected void attachBaseContext(Context newBase) {
        super.attachBaseContext(CalligraphyContextWrapper.wrap(newBase));
    }

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
        setContentView(R.layout.activity_bank_card_information);
        setupViews();
    }

    private void setupViews() {
        setupToolbar();
    }

    private void setupToolbar() {
        Toolbar toolbarFinalizeShop = findViewById(R.id.toolbar_bank_card_information);
        toolbarFinalizeShop.setTitleTextColor(0xFFFFFFFF);
        setSupportActionBar(toolbarFinalizeShop);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setHomeButtonEnabled(true);
        actionBar.setDisplayHomeAsUpEnabled(true);
    }
}
