package test.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import test.Product;

import java.util.ArrayList;
import java.util.List;

@Controller
public class HomeController {

    static List<Product> products = new ArrayList<>();

    static {
        products.add(new Product(1L, "Sausage", 12.5));
        products.add(new Product(2L, "Egg", 0.50));
        products.add(new Product(3L, "Milk", 10.0));
        products.add(new Product(4L, "Chicken", 80.75));
        products.add(new Product(5L, "Bread", 1.20));
    };

    @RequestMapping("/")
    public String index(Model model) {

        model.addAttribute("products", products);
        return "index";
    }

    @RequestMapping("/products/{id}")
    public String index(@PathVariable Long id, Model model) {
        Product product = products.stream().filter(o -> o.getId().equals(id)).findFirst().get();
        model.addAttribute("product", product);
        return "show";
    }
}
