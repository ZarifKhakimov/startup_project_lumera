package startup.project.lumera.ui.model;

import android.widget.ImageView;

public class Product {
    public String name;
    public String brand;
    public double rating;
    public int image;
    public Product(String brand, String name, double rating, int image) {
        this.brand = brand;
        this.name = name;
        this.rating = rating;
        this.image = image;
    }
}

