package startup.project.lumera.ui.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import startup.project.lumera.R;
import startup.project.lumera.ui.model.Product;

public class ProductAdapter extends RecyclerView.Adapter<ProductAdapter.ViewHolder> {

    List<Product> list;

    public ProductAdapter(List<Product> list) {
        this.list = list;
    }

    static class ViewHolder extends RecyclerView.ViewHolder {
        TextView name, rating;
        ImageView image;


        ViewHolder(View v) {
            super(v);
            image = v.findViewById(R.id.imgProduct);
            name = v.findViewById(R.id.txtName);
            rating = v.findViewById(R.id.txtRating);
        }
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_product, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ViewHolder h, int i) {
        Product p = list.get(i);
        h.image.setImageResource(p.image);
        h.name.setText(p.brand + " - " + p.name);
        h.rating.setText("⭐ " + p.rating);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }
}

