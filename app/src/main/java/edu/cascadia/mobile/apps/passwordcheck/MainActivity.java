package edu.cascadia.mobile.apps.passwordcheck;

import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.databinding.DataBindingUtil;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

import edu.cascadia.mobile.apps.passwordcheck.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    //TODO: create a private ViewModel instance variable
    private ViewModel mViewModel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Comment out the setContentView - we'll use a binding instead
        //setContentView(R.layout.activity_main);
        //TODO: Create a new binding using DataBindingUtil
        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        //TODO: Create a new PasswordViewModel object
        PasswordViewModel mPVW = new PasswordViewModel();

        //TODO: Set the binding's ViewModel to your new PasswordViewModel
        binding.setViewModel(mPVW);


    }
}
