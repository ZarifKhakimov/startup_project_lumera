package startup.project.lumera.ui.activity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import java.util.ArrayList;
import java.util.List;

import startup.project.lumera.R;
import startup.project.lumera.ui.adapter.OnboardingAdapter;
import startup.project.lumera.ui.model.OnboardingItem;

public class OnboardingActivity extends AppCompatActivity {

    private ViewPager2 viewPager;
    private Button actionBtn;
    private List<OnboardingItem> items;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_onboarding);

        viewPager = findViewById(R.id.viewPager);
        actionBtn = findViewById(R.id.actionBtn);

        items = new ArrayList<>();
        items.add(new OnboardingItem(
                "AI Skin Scan",
                "Scan your face and get personalized skincare insights.",
                R.drawable.scan
        ));
        items.add(new OnboardingItem(
                "Ingredient Analyzer",
                "Understand ingredients and avoid harmful products.",
                R.drawable.product
        ));
        items.add(new OnboardingItem(
                "Price Comparison",
                "Find the best skincare deals instantly.",
                R.drawable.shop
        ));

        viewPager.setAdapter(new OnboardingAdapter(items));

        actionBtn.setOnClickListener(v -> {
            if (viewPager.getCurrentItem() < items.size() - 1) {
                viewPager.setCurrentItem(viewPager.getCurrentItem() + 1);
            } else {
                SharedPreferences prefs =
                        getSharedPreferences("lumera_prefs", MODE_PRIVATE);
                prefs.edit().putBoolean("onboarding_done", true).apply();

                startActivity(new Intent(this, HomeActivity.class));
                finish();
            }
        });

        viewPager.registerOnPageChangeCallback(
                new ViewPager2.OnPageChangeCallback() {
                    @Override
                    public void onPageSelected(int position) {
                        if (position == items.size() - 1) {
                            actionBtn.setText("Get Started");
                        } else {
                            actionBtn.setText("Continue");
                        }
                    }
                }
        );
    }
}
