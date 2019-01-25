package com.one.pay.attendance.Login;

import android.support.annotation.NonNull;
import android.text.TextUtils;
import android.util.Patterns;

import java.util.regex.Pattern;

public class LoginModel {

    @NonNull
    private String EmpNo, password, mobileNo;


    public LoginModel(@NonNull String empNo, @NonNull String password) {
        EmpNo = empNo;
        this.password = password;
    }

    public LoginModel(@NonNull String empNo, @NonNull String mobileNo, @NonNull String password) {
        EmpNo = empNo;
        this.mobileNo = mobileNo;
        this.password = password;
    }

    @NonNull
    public String getEmpNo() {
        return EmpNo;
    }

    public void setEmpNo(@NonNull String empNo) {
        EmpNo = empNo;
    }

    @NonNull
    public String getPassword() {
        return password;
    }

    public void setPassword(@NonNull String password) {
        this.password = password;
    }

    @NonNull
    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(@NonNull String mobileNo) {
        this.mobileNo = mobileNo;
    }

    public boolean isValidInput(){
        return !(TextUtils.isEmpty(getEmpNo()) || TextUtils.isEmpty(getPassword())) ;
    }

    public boolean isValidRegInput(){
        return !(TextUtils.isEmpty(getEmpNo()) || TextUtils.isEmpty(getPassword()) || TextUtils.isEmpty(getMobileNo())) ;
    }

}
