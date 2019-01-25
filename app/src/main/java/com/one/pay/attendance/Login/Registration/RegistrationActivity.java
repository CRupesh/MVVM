package com.one.pay.attendance.Login.Registration;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.one.pay.attendance.R;
import com.one.pay.attendance.databinding.ActivityRegistrationBinding;
public class RegistrationActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);
        ActivityRegistrationBinding activityRegistrationBinding = DataBindingUtil.setContentView(this,R.layout.activity_registration);
        activityRegistrationBinding.setRegModel(new RegViewModel(getApplication()));
    }
}
