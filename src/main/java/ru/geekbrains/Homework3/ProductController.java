package ru.geekbrains.Homework3;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import ru.geekbrains.Homework3.service.ProductService;
import ru.geekbrains.Homework3.service.ProductServiceImpl;

import java.util.List;

@Controller
public class ProductController {
    private ProductService productService = new ProductServiceImpl();

    @RequestMapping(value = "/product", method = RequestMethod.GET)
    public String productPage(Model model) {
        List<Product> productList = productService.allProducts();
        model.addAttribute("productList", productList);
        return "productList";
    }

    @RequestMapping(value = "/searchproduct", method = RequestMethod.POST)
    public String searchProduct(@RequestParam(value = "id") Integer id) {
        Product product = new Product();
        product.setId(id);
        return "redirect:/";
    }
}
