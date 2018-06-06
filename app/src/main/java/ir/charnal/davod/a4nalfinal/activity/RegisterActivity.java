package ir.charnal.davod.a4nalfinal.activity;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

import ir.charnal.davod.a4nalfinal.R;

public class RegisterActivity extends AppCompatActivity {

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
        setContentView(R.layout.activity_register);

        setupRegisterToolbar();


    }

    private void setupRegisterToolbar() {
        Toolbar toolbarRegister = findViewById(R.id.toolbar_register);
        toolbarRegister.setTitleTextColor(0xFFFFFFFF);
        setSupportActionBar(toolbarRegister);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setHomeButtonEnabled(true);
        actionBar.setDisplayHomeAsUpEnabled(true);
    }
}
