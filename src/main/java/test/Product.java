package test;

/**
 * Created by waldemar on 28.06.16.
 */
public class Product {
    private Long id;
    private String title;
    private double amount;

    public Product(Long id, String title, double amount) {
        this.id = id;
        this.title = title;
        this.amount = amount;
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

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
