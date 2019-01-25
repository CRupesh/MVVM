package com.one.pay.attendance.Login;

import android.app.Application;
import android.arch.lifecycle.AndroidViewModel;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.widget.Toast;

import com.one.pay.attendance.Login.Registration.RegistrationActivity;

public class LoginViewModel extends AndroidViewModel {

    private LoginModel user;

    private String loginSuccessMsg = "Login successful";
    private String loginErrorMsg = "Login unsuccessful";

//    @Bindable
//    public String toastMsg = null;

//    public String gettoastmsg() {
//        return toastmsg;
//    }

   /* public void setToastMsg(String toastMsg) {
        this.toastMsg = toastMsg;
        notifyPropertyChanged(BR.toastMsg);
    }*/

    public LoginViewModel(@NonNull Application application){
        super(application);
        user = new LoginModel("","");
    }

    public void afterEmpNoInput(CharSequence s){
        user.setEmpNo(s.toString());
    }

    public void afterPasswordInput(CharSequence s){
        user.setPassword(s.toString());
    }

    public void onLoginClick(){
        if (user.isValidInput()){
//            setToastMsg(loginSuccessMsg);
            Toast.makeText(getApplication(),loginSuccessMsg,Toast.LENGTH_LONG).show();
        }
        else {
//            setToastMsg(loginErrorMsg);
            Toast.makeText(getApplication(),loginErrorMsg,Toast.LENGTH_LONG).show();
        }
    }

    public void onRegisterClick(){
        Intent intent = new Intent(getApplication(), RegistrationActivity.class);
        getApplication().startActivity(intent);
    }

}
