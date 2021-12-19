package ru.geekbrains.servlet;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


@WebServlet(name = "ProductRepository", urlPatterns = "/products")
public class ProductRepository extends HttpServlet {
    private static Logger logger = LoggerFactory.getLogger(ProductRepository.class);
    private transient ServletConfig config;

    private List<Product> productList;

    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        logger.info("New Products Request");

        productList = new ArrayList<>();
        productList.add(new Product(1, "Meat", 5));
        productList.add(new Product(2, "Egg", 2));
        productList.add(new Product(3, "Potato", 1));
        productList.add(new Product(4, "Lamb", 7));
        productList.add(new Product(5, "Bread", 9));
        productList.add(new Product(6, "Salt", 6));
        productList.add(new Product(7, "Sugar", 8));
        productList.add(new Product(8, "Oil", 1));
        productList.add(new Product(9, "Butter", 4));
        productList.add(new Product(10, "Garlic", 3));


        String tableStyle = "style=\"border: 1px solid #02ab55; " +
                "border-collapse: collapse; " +
                "width: 90%; font-family: Arial; " +
                "margin: 30px;\"";

        String tStyle = "style=\"border: 1px solid #02ab55; border-collapse: collapse; padding: 5px;\"";

        resp.getWriter().print(
                "<table " + tableStyle + ">\n" +
                        "  <tr" + tStyle + ">\n" +
                        "    <th>ID</th>\n" +
                        "    <th>Title</th>\n" +
                        "    <th>Cost</th>\n" +
                        "  </tr>"
        );

        for (Product product : productList) {
            resp.getWriter().print(
                    "<tr>\n" +
                            "<td " + tStyle + ">" + product.getId() + "</td>\n" +
                            "<td " + tStyle + ">" + product.getTitle() + "</td>\n" +
                            "<td " + tStyle + ">" + product.getCost() + "</td>\n" +
                            "</tr>"
            );
        }
        resp.getWriter().

                print("</table>");

    }

    public List<Product> getProductList() {
        return productList;
    }

    public Product findProductById(int id) {
        if (id < productList.size()) {
            return productList.stream()
                    .filter(p -> p.getId() == id)
                    .findFirst().orElseThrow(() ->
                            new RuntimeException());
        }
        return null;
    }

    @Override
    public void init(ServletConfig config) throws ServletException {
        this.config = config;
    }

    @Override
    public ServletConfig getServletConfig() {
        return config;
    }

}