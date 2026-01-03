package startup.project.lumera.ui.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import startup.project.lumera.R;
import startup.project.lumera.ui.model.ProdMain;

public class ProdMainAdapter
        extends RecyclerView.Adapter<ProdMainAdapter.ViewHolder> {

    private final List<ProdMain> productList;

    public ProdMainAdapter(List<ProdMain> productList) {
        this.productList = productList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_prod_main, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        ProdMain product = productList.get(position);
        holder.type.setText(product.type);
        holder.name.setText(product.name);
        holder.image.setImageResource(product.image);
    }

    @Override
    public int getItemCount() {
        return productList.size();
    }

    static class ViewHolder extends RecyclerView.ViewHolder {
        ImageView image;
        TextView name, type;

        ViewHolder(View itemView) {
            super(itemView);
            type = itemView.findViewById(R.id.tvProductType);
            image = itemView.findViewById(R.id.imgProduct);
            name = itemView.findViewById(R.id.tvProductName);
        }
    }
}
