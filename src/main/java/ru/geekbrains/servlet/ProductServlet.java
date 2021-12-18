package ru.geekbrains.servlet;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "ProductServlet", urlPatterns = "/products")
public class ProductServlet extends HttpServlet {
    private static Logger logger = LoggerFactory.getLogger(ProductServlet.class);

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        logger.info("New Products Request");

        Product[] products = {
                new Product(1, "Meat", 5),
                new Product(2, "Egg", 2),
                new Product(3, "Potato", 1),
                new Product(4, "Lamb", 7),
                new Product(5, "Bread", 9),
                new Product(6, "Salt", 6),
                new Product(7, "Sugar", 8),
                new Product(8, "Oil", 1),
                new Product(9, "Butter", 4),
                new Product(10, "Garlic", 3),

        };

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

        for (Product product : products) {
            resp.getWriter().print(
                    "<tr>\n" +
                            "<td " + tStyle + ">" + product.getId() + "</td>\n" +
                            "<td " + tStyle + ">" + product.getTitle() + "</td>\n" +
                            "<td " + tStyle + ">" + product.getCost() + "</td>\n" +
                            "</tr>"
            );
        }
        resp.getWriter().print("</table>");

    }
}
