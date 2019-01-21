package com.example.desel.pinauthv1;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SplashActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        SharedPreferences prefs = getSharedPreferences("login", MODE_PRIVATE);
        final Boolean isLogged = prefs.getBoolean("isLogged", false);
        Thread timer = new Thread()
        {
            public void run()
            {
                try
                {
                    sleep(2000);
                }
                catch (InterruptedException e)
                {
                    e.printStackTrace();
                }
                finally
                {
                    if (isLogged)
                    {
                        Intent intent = new Intent(SplashActivity.this,
                                LoginActivity.class);
                        startActivity(intent);
                        finish();
                    }
                    else
                    {
                        Intent intent = new Intent
                                (SplashActivity.this, RegisterActivity.class);
                        startActivity(intent);
                        finish();
                    }
                }
            }
        };
        timer.start();
    }
}
