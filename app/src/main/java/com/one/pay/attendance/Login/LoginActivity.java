package com.one.pay.attendance.Login;

import android.databinding.BindingAdapter;
import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.one.pay.attendance.databinding.ActivityLoginBinding;

import com.one.pay.attendance.R;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_login);
        ActivityLoginBinding activityLoginBinding = DataBindingUtil.setContentView(this,R.layout.activity_login);
        activityLoginBinding.setLoginViewModel(new LoginViewModel(getApplication()));
//        activityLoginBinding.executePendingBindings();
    }


    @BindingAdapter({"toasMsg"})
    public static void runMe(View view, String toastMsg){
        if (toastMsg!=null){
            Toast.makeText(view.getContext(),toastMsg,Toast.LENGTH_LONG).show();
        }
    }
}
