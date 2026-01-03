package startup.project.lumera.ui.activity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        SharedPreferences prefs =
                getSharedPreferences("lumera_prefs", MODE_PRIVATE);

        boolean onboardingDone = prefs.getBoolean("onboarding_done", false);

        if (onboardingDone) {
            startActivity(new Intent(this, OnboardingActivity.class));
        } else {
            startActivity(new Intent(this, OnboardingActivity.class));
        }

        finish();
    }
}