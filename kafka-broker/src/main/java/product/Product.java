package product;

import category.Category;

import java.util.List;

public class Product {
  private String name;
  private Integer price;
  private List<Category> categories;

  public Product() {}

  public Product(String name, Integer price, List<Category> categories) {
    this.name = name;
    this.price = price;
    this.categories = categories;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Integer getPrice() {
    return price;
  }

  public void setPrice(Integer price) {
    this.price = price;
  }

  public List<Category> getCategories() {
    return categories;
  }

  public void setCategories(List<Category> categories) {
    this.categories = categories;
  }
}
