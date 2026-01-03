package startup.project.lumera.ui.model;

import static java.security.AccessController.getContext;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import startup.project.lumera.R;
import startup.project.lumera.ui.adapter.ProdMainAdapter;

public class HomeFragment extends Fragment {

    public HomeFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_home, container, false);

        RecyclerView recyclerView = view.findViewById(R.id.rvFeaturedProducts);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext(),
                LinearLayoutManager.HORIZONTAL, false));

        List<ProdMain> products = new ArrayList<>();
        products.add(new ProdMain("CeraVe", "Hydrating Serum", R.drawable.cream1));
        products.add(new ProdMain("Cetaphil", "Gentle Cleanser", R.drawable.cream2));
        products.add(new ProdMain("Neutrogena", "Daily Moisturizer", R.drawable.cream3));
        products.add(new ProdMain("Tatcha", "Dewy Skin Cream", R.drawable.cream4));
        products.add(new ProdMain("Aveeno", "Radiant Moisturizer", R.drawable.cream5));
        products.add(new ProdMain("Olay", "Micro-Sculpting Cream", R.drawable.cream6));

        ProdMainAdapter adapter = new ProdMainAdapter(products);
        recyclerView.setAdapter(adapter);

        return view;
    }
}


