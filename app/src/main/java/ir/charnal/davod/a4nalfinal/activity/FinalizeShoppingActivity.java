package ir.charnal.davod.a4nalfinal.activity;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import ir.charnal.davod.a4nalfinal.R;
import uk.co.chrisjenx.calligraphy.CalligraphyContextWrapper;

public class FinalizeShoppingActivity extends AppCompatActivity {
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
        setContentView(R.layout.activity_finalize_shopping);
        setupToolbar();
        findViewById(R.id.edit_text_first_name_finalize).requestFocus();
        listeners();


    }

    private void listeners() {
        Button btnSubmitFinalizeShopping = findViewById(R.id.btn_submit_finalize_shopping);
        EditText editTextFirstNameFinalize = findViewById(R.id.edit_text_first_name_finalize);
        EditText editTextLastNameFinalize = findViewById(R.id.edit_text_last_name_finalize);
        EditText editTextCompanyNameFinalize = findViewById(R.id.edit_text_company_name_finalize);
        EditText editTextProvinceFinalize = findViewById(R.id.edit_text_province_finalize);
        EditText editTextCityFinalize = findViewById(R.id.edit_text_city_finalize);
        EditText editTextPostalAddressFinalize = findViewById(R.id.edit_text_postal_address_finalize);
        EditText editTextPostalCodeFinalize = findViewById(R.id.edit_text_postal_code_finalize);
        EditText editTextPhoneNumberFinalize = findViewById(R.id.edit_text_phone_number_finalize);
        EditText editTextEmailFinalize = findViewById(R.id.edit_text_email_finalize);
        btnSubmitFinalizeShopping.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(FinalizeShoppingActivity.this, BankCardInformationActivity.class));
            }
        });
    }

    private void setupToolbar() {
        Toolbar toolbarFinalizeShop = findViewById(R.id.toolbar_finalize_shopping);
        toolbarFinalizeShop.setTitleTextColor(0xFFFFFFFF);
        setSupportActionBar(toolbarFinalizeShop);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setHomeButtonEnabled(true);
        actionBar.setDisplayHomeAsUpEnabled(true);
    }
}
