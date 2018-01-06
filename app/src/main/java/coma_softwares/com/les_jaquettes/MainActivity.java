package coma_softwares.com.les_jaquettes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.parse.Parse;
import com.parse.ParseUser;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Parse.enableLocalDatastore(this);

        Parse.initialize(new Parse.Configuration(this)
                .applicationId("VsgIsfvBYTOOB9MLW8oefn4IaNMTAmSQ9soCARxd")
                .clientKey(null)
                .server("https://parseapi.back4app.com/parse/")
                .build()
        );

        ParseUser.enableRevocableSessionInBackground();
    }
}