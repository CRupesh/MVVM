package com.one.pay.attendance.Login.Registration;

import android.app.Application;
import android.arch.lifecycle.AndroidViewModel;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.widget.Toast;

import com.one.pay.attendance.Login.LoginActivity;
import com.one.pay.attendance.Login.LoginModel;

public class RegViewModel extends AndroidViewModel {

    LoginModel regUser;

    public RegViewModel(@NonNull Application application) {
        super(application);
        regUser = new LoginModel("","","");
    }

    public void afterEmpNoTextChange(CharSequence s){
        regUser.setEmpNo(s.toString());
    }

    public void afterMobileTextChange(CharSequence s){
        regUser.setMobileNo(s.toString());
    }

    public void afterPwdTextChange(CharSequence s){
        regUser.setPassword(s.toString());
    }

    public void onRegisterClick(){
        Toast.makeText(getApplication(),"Registered succefully",Toast.LENGTH_LONG).show();
        Intent intent = new Intent(getApplication(), LoginActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);
        getApplication().startActivity(intent);

    }

}
