package com.example.ecommerce.models;

import javax.persistence.*;
import java.util.List;

@Entity
public class Products {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id ;
    private String title;
    private String price;
    private String description;
    private String image;
    private String rating;
    @ManyToMany(fetch=FetchType.EAGER)
    @JoinTable(name="PRODUCT_CATEGORY",  joinColumns= {@JoinColumn(name="PRODUCT_ID")},   inverseJoinColumns= {@JoinColumn(name="CATEGORE_ID")})
    private List<Category> categorys;

    public Products() {
    }

    @Override
    public String toString() {
        return "Products{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", price='" + price + '\'' +
                ", description='" + description + '\'' +
                ", image='" + image + '\'' +
                ", rating='" + rating + '\'' +
                ", categorys=" + categorys +
                '}';
    }

    public Products(Long id, String title, String price, String description, String image, String rating, List<Category> categorys) {
        this.id = id;
        this.title = title;
        this.price = price;
        this.description = description;
        this.image = image;
        this.rating = rating;
        this.categorys = categorys;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public List<Category> getCategorys() {
        return categorys;
    }

    public void setCategorys(List<Category> categorys) {
        this.categorys = categorys;
    }
}
