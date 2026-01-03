package startup.project.lumera.ui.activity;

import static java.security.AccessController.getContext;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;
import java.util.List;

import startup.project.lumera.R;
import startup.project.lumera.ui.adapter.ProdMainAdapter;
import startup.project.lumera.ui.model.AccountFragment;
import startup.project.lumera.ui.model.HomeFragment;
import startup.project.lumera.ui.model.ProdMain;
import startup.project.lumera.ui.model.ProductsFragment;
import startup.project.lumera.ui.model.ScanFragment;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        BottomNavigationView nav = findViewById(R.id.bottom_navigation);

        loadFragment(new HomeFragment());

        nav.setOnItemSelectedListener(item -> {
            if (item.getItemId() == R.id.nav_home) {
                loadFragment(new HomeFragment());
                return true;
            } else if (item.getItemId() == R.id.nav_products) {
                loadFragment(new ProductsFragment());
                return true;
            } else if (item.getItemId() == R.id.nav_account) {
                loadFragment(new AccountFragment());
                return true;
            } else if (item.getItemId() == R.id.nav_scan) {
                loadFragment(new ScanFragment());

                return true;
            }
            return false;
        });
    }

    private void loadFragment(Fragment fragment) {
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.fragment_container, fragment)
                .commit();
    }
}

