package edu.cascadia.mobile.apps.passwordcheck;

import android.arch.lifecycle.ViewModel;
import android.arch.lifecycle.ViewModelProvider;
import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import edu.cascadia.mobile.apps.passwordcheck.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    //TODO: create a private ViewModel instance variable

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Comment out the setContentView - we'll use a binding instead
      //  setContentView(R.layout.activity_main);

        //TODO: Create a new binding using DataBindingUtil
        ActivityMainBinding binding = DataBindingUtil.setContentView(this,R.layout.activity_main);


        //TODO: Create a new PasswordViewModel object
        PasswordViewModel thingy = new PasswordViewModel();

        //TODO: Set the binding's ViewModel to your new PasswordViewModel
        binding.setViewModel(thingy);

    }
}
