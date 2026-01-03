package startup.project.lumera.ui.model;

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
import startup.project.lumera.ui.adapter.ProductAdapter;

public class ProductsFragment extends Fragment {

    public ProductsFragment() {}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_products, container, false);

        RecyclerView recyclerView = view.findViewById(R.id.recyclerProducts);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        List<Product> products = new ArrayList<>();
        products.add(new Product("La Roche-Posay", "Effaclar Duo", 4.6, R.drawable.cleanser));
        products.add(new Product("The Ordinary", "Niacinamide 10% + Zinc 1%", 4.5, R.drawable.cream1));
        products.add(new Product("Cetaphil", "Gentle Skin Cleanser", 4.7, R.drawable.cleanser));
        products.add(new Product("Eucerin", "Advanced Repair Cream", 4.6, R.drawable.cream2));
        products.add(new Product("Aveeno", "Daily Moisturizing Lotion", 4.5, R.drawable.cream3));
        products.add(new Product("Paula’s Choice", "Skin Perfecting 2% BHA Liquid", 4.8, R.drawable.cream4));
        products.add(new Product("Clinique", "Moisture Surge 100H", 4.6, R.drawable.cream1));
        products.add(new Product("Kiehl’s", "Ultra Facial Cream", 4.7, R.drawable.cream5));
        products.add(new Product("COSRX", "Advanced Snail 96 Mucin Essence", 4.6, R.drawable.cream6));
        products.add(new Product("Bioderma", "Sensibio H2O", 4.5, R.drawable.cleanser));
        products.add(new Product("Vichy", "Mineral 89 Hyaluronic Booster", 4.6, R.drawable.cream1));
        products.add(new Product("First Aid Beauty", "Ultra Repair Cream", 4.7, R.drawable.cream));
        products.add(new Product("Drunk Elephant", "Protini Polypeptide Cream", 4.5, R.drawable.cream2));
        products.add(new Product("Simple", "Hydrating Light Moisturiser", 4.4, R.drawable.cream1));
        products.add(new Product("Innisfree", "Green Tea Seed Serum", 4.6, R.drawable.cream3));
        products.add(new Product("Laneige", "Water Sleeping Mask", 4.7, R.drawable.cream4));
        products.add(new Product("SK-II", "Facial Treatment Essence", 4.3, R.drawable.cream6));
        products.add(new Product("Glow Recipe", "Watermelon Glow Niacinamide Dew Drops", 4.5, R.drawable.cream5));
        products.add(new Product("Olay", "Regenerist Micro-Sculpting Cream", 4.6, R.drawable.cream1));
        products.add(new Product("Nivea", "Soft Moisturizing Cream", 4.4, R.drawable.cream));


        recyclerView.setAdapter(new ProductAdapter(products));

        return view;
    }
}

