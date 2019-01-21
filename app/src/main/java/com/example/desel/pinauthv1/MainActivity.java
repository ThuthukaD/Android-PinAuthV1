package com.example.desel.pinauthv1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{
    // VARIABLES

    // Text View
    TextView tvUser;

    // Strings
    String stLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // INSTANCING

        // Text Views
        tvUser = findViewById(R.id.tvUser);

        try
        {
            Text();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    // Calls prefs value from LoginActivity
    public void Text()
    {
        // Passed string for user
        stLogin = getIntent().getExtras().getString("UserLogin", " User");
        tvUser.setText(stLogin);

    }

    // Closes page but not the app. Should return to Login page
    public void Cancel(View view)
    {
        finish();
    }
}
