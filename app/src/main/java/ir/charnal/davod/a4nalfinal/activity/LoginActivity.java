package ir.charnal.davod.a4nalfinal.activity;

import android.content.Intent;
import android.os.Build;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.TextView;

import ir.charnal.davod.a4nalfinal.R;

public class LoginActivity extends AppCompatActivity {
    private TextView textViewGoToRegister;
    private EditText editTextUserNameLogin;
    private EditText editTextUserNameRegister;
    private EditText editTextPasswordLogin;
    private EditText editTextPasswordRegister;
    private CheckBox checkBoxPassword;
    private Button btnSubmitLogin;
    private Button btnSubmitRegister;
    private TextView textViewUserName;
    private TextView textViewPassword;
    private TextView textViewForgotPassword;
    private Button btnSubmitForgot;
    private EditText editTextUserNameForgot;
    private TextView textViewForBtnForgot;
    private Toolbar toolbarLogin;

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
        setContentView(R.layout.activity_login);
        toolbarLogin = findViewById(R.id.toolbar_login);
        toolbarLogin.setTitleTextColor(0xFFFFFFFF);
        setSupportActionBar(toolbarLogin);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setHomeButtonEnabled(true);
        actionBar.setDisplayHomeAsUpEnabled(true);
        passwordToggle();
//        Listeners();
        VisibleGone();
    }



    private void VisibleGone() {
        toolbarLogin = findViewById(R.id.toolbar_login);
        editTextUserNameLogin = findViewById(R.id.edit_text_user_name_login);
        editTextUserNameRegister = findViewById(R.id.edit_text_user_name_register);
        editTextPasswordLogin = findViewById(R.id.edit_text_password_login);
        editTextPasswordRegister = findViewById(R.id.edit_text_password_register);
        checkBoxPassword = findViewById(R.id.check_box_show_password_login);
        btnSubmitLogin = findViewById(R.id.btn_sign_in_login);
        btnSubmitRegister = findViewById(R.id.btn_register);
        textViewUserName = findViewById(R.id.text_view_user_name_login);
        textViewPassword = findViewById(R.id.text_view_password_login);
        textViewForgotPassword = findViewById(R.id.text_view_forgot_password);
        textViewGoToRegister = findViewById(R.id.text_view_go_to_register_login);
        btnSubmitForgot = findViewById(R.id.btn_submit_forgot);
        editTextUserNameForgot = findViewById(R.id.edit_text_user_name_forgot);
        textViewForBtnForgot = findViewById(R.id.text_view_for_btn_forgot);

        editTextUserNameRegister.setVisibility(View.GONE);
        editTextPasswordRegister.setVisibility(View.GONE);
        btnSubmitRegister.setVisibility(View.GONE);
        editTextUserNameForgot.setVisibility(View.GONE);
//        btnSubmitForgot.setVisibility(View.GONE);

        textViewGoToRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editTextPasswordLogin.setVisibility(View.GONE);
                editTextUserNameLogin.setVisibility(View.GONE);
                textViewForgotPassword.setVisibility(View.GONE);
                textViewGoToRegister.setVisibility(View.GONE);
                btnSubmitLogin.setVisibility(View.GONE);
                btnSubmitRegister.setVisibility(View.VISIBLE);
                editTextPasswordRegister.setVisibility(View.VISIBLE);
                editTextUserNameRegister.setVisibility(View.VISIBLE);
                checkBoxPassword.setVisibility(View.GONE);
                editTextUserNameForgot.setVisibility(View.GONE);
//                btnSubmitForgot.setVisibility(View.GONE);
                editTextUserNameRegister.requestFocus();
                editTextUserNameRegister.hasFocus();
                editTextUserNameRegister.hasWindowFocus();
                editTextUserNameRegister.findFocus();
                textViewPassword.setVisibility(View.VISIBLE);
                textViewForBtnForgot.setVisibility(View.VISIBLE);
                btnSubmitForgot.setVisibility(View.GONE);


                toolbarLogin.setTitle("ثبت نام");

            }
        });
        textViewForgotPassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editTextPasswordLogin.setVisibility(View.GONE);
                editTextUserNameLogin.setVisibility(View.GONE);
                editTextUserNameRegister.setVisibility(View.GONE);
                editTextUserNameForgot.setVisibility(View.VISIBLE);
                editTextPasswordRegister.setVisibility(View.GONE);
                textViewForgotPassword.setVisibility(View.GONE);
                textViewGoToRegister.setVisibility(View.GONE);
                btnSubmitLogin.setVisibility(View.GONE);
                btnSubmitRegister.setVisibility(View.GONE);
//                btnSubmitForgot.setVisibility(View.VISIBLE);
                checkBoxPassword.setVisibility(View.GONE);
                textViewPassword.setVisibility(View.GONE);
                textViewForBtnForgot.setVisibility(View.GONE);


                toolbarLogin.setTitle("فراموشی رمز عبور");
            }
        });




    }

    @Override
    public void onBackPressed() {
        if (editTextUserNameRegister.getVisibility()==View.VISIBLE){
            toolbarLogin.setTitle("ورود یا ثبت نام");
            editTextPasswordLogin.setVisibility(View.VISIBLE);
            editTextUserNameLogin.setVisibility(View.VISIBLE);
            textViewForgotPassword.setVisibility(View.VISIBLE);
            textViewGoToRegister.setVisibility(View.VISIBLE);
            btnSubmitLogin.setVisibility(View.VISIBLE);
            btnSubmitRegister.setVisibility(View.GONE);
            editTextPasswordRegister.setVisibility(View.GONE);
            editTextUserNameRegister.setVisibility(View.GONE);
            checkBoxPassword.setVisibility(View.VISIBLE);
            editTextUserNameForgot.setVisibility(View.GONE);
//            btnSubmitForgot.setVisibility(View.GONE);
            textViewPassword.setVisibility(View.VISIBLE);
            textViewForBtnForgot.setVisibility(View.VISIBLE);
            btnSubmitForgot.setVisibility(View.VISIBLE);

        }
        else if (editTextUserNameForgot.getVisibility()==View.VISIBLE){
            toolbarLogin.setTitle("ورود یا ثبت نام");
            editTextPasswordLogin.setVisibility(View.VISIBLE);
            editTextUserNameLogin.setVisibility(View.VISIBLE);
            textViewForgotPassword.setVisibility(View.VISIBLE);
            textViewGoToRegister.setVisibility(View.VISIBLE);
            btnSubmitLogin.setVisibility(View.VISIBLE);
            btnSubmitRegister.setVisibility(View.GONE);
            editTextPasswordRegister.setVisibility(View.GONE);
            editTextUserNameRegister.setVisibility(View.GONE);
            checkBoxPassword.setVisibility(View.VISIBLE);
            editTextUserNameForgot.setVisibility(View.GONE);
            textViewPassword.setVisibility(View.VISIBLE);
            textViewForBtnForgot.setVisibility(View.VISIBLE);
        }
        else finish();
    }


//    private void Listeners() {
//        textViewGoToRegister = findViewById(R.id.text_view_go_to_register_login);
//        textViewGoToRegister.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                startActivity(new Intent(LoginActivity.this,RegisterActivity.class));
//            }
//        });
//    }

    private void passwordToggle() {

        final CheckBox showPasswordCheckBox = findViewById(R.id.check_box_show_password_login);
        final EditText passwordEditText = findViewById(R.id.edit_text_password_login);
        showPasswordCheckBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (!showPasswordCheckBox.isChecked()){
                    passwordEditText.setTransformationMethod(PasswordTransformationMethod.getInstance());
//                    passwordEditText.setInputType(InputType.TYPE_TEXT_VARIATION_PASSWORD);
                }
                if (showPasswordCheckBox.isChecked()){
                    passwordEditText.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
//                    passwordEditText.setInputType(InputType.TYPE_TEXT_VARIATION_VISIBLE_PASSWORD);
                }
            }
        });
    }


}
