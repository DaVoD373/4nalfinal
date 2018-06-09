package ir.charnal.davod.a4nalfinal.activity;

import android.support.v4.widget.NestedScrollView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ScrollView;

import ir.charnal.davod.a4nalfinal.R;

public class FinalizeShoppingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_finalize_shopping);

//        NestedScrollView nestedScrollView = findViewById(R.id.scroll_view_finalize_shopping);


//        ScrollView scrollView =findViewById(R.id.scroll_view_finalize_shopping);
//        scrollView.fullScroll(ScrollView.FOCUS_FORWARD);
        findViewById(R.id.edit_text_first_name_finalize).requestFocus();

    }
}
