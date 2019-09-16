package com.mvvmloginsample.view;

import android.app.Activity;
import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import com.mvvmloginsample.R;
import com.mvvmloginsample.databinding.ActivityMainBinding;
import com.mvvmloginsample.viewmodel.LoginViewModel;

public class MainActivity extends AppCompatActivity {

    private Activity activity;
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        activity = this;
        LoginViewModel loginViewModel = new LoginViewModel(activity);
        binding.setLoginData(loginViewModel);
    }
}
