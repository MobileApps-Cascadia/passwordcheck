package edu.cascadia.mobile.apps.passwordcheck;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.databinding.DataBindingUtil;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;

import edu.cascadia.mobile.apps.passwordcheck.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    //TODO: create a private ViewModel instance variable
    PasswordViewModel mViewModel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Comment out the setContentView - we'll use a binding instead
        //setContentView(R.layout.activity_main);
        ActivityMainBinding binding = DataBindingUtil.setContentView(this,R.layout.activity_main);
        mViewModel = new PasswordViewModel();
        binding.setViewModel(mViewModel);

        //TODO: Create a new binding using DataBindingUtil

        //TODO: Create a new PasswordViewModel object

        //TODO: Set the binding's ViewModel to your new PasswordViewModel


    }
}
