package edu.cascadia.mobile.apps.passwordcheck;
// Adapted from https://www.bignerdranch.com/blog/two-way-data-binding-on-android-observing-your-view-with-xml/
import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;
import android.databinding.BaseObservable;
import android.databinding.Bindable;

public class PasswordViewModel extends ViewModel {
    private MutableLiveData<String> password;
    private MutableLiveData<String> passwordQuality;

    public PasswordViewModel(){
        this.password = new MutableLiveData<>();
        this.passwordQuality = new MutableLiveData<>();
    }
    public String getPassword() {
        return password.getValue();
    }

    public String getPasswordQuality() {
        if (password == null || password.getValue().isEmpty()) {
            return "Enter a password";
        } else if (password.getValue().equals("password")) {
            return "Very bad";
        } else if (password.getValue().length() < 6) {
            return "Short";
        } else {
            return "Okay";
        }
    }

    public void setPassword(String pass) {
        if(this.password.getValue() != pass) {
            this.password.setValue(pass);
          //  notifyPropertyChanged(BR.passwordQuality);
          //  notifyPropertyChanged(BR.password);
        }

    }


    public void onPasswordTextChanged(CharSequence cs){
        setPassword(cs.toString());
        getPasswordQuality();
    }
}
