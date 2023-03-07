package br.com.ada.pizzara;

import br.com.ada.pizzara.model.Produto;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet(name = "Cardapio", value = "/cardapio")
public class CardapioServelet extends HttpServlet {

    private List<Produto> produtos;

    public void init(){

        Produto pizzaCalabra = new Produto("Pizza Calabresa", "https://images.pexels.com/photos/825661/pexels-photo-825661.jpeg?auto=compress&cs=tinysrgb&w=250&h=250&dpr=1", "R$ 45,99");
        Produto pizzaPortuguesa = new Produto("Pizza Portuguesa", "https://images.pexels.com/photos/2147491/pexels-photo-2147491.jpeg?auto=compress&cs=tinysrgb&w=250&h=250&dpr=1", "R$ 51,99");

        produtos = List.of(pizzaCalabra, pizzaPortuguesa);
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("Text/html");

        // Hello
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>Pizzaria do Seu José</h1>");
        out.println("<ul>");
        produtos.forEach(produto -> {
            out.println("<li>");
            out.println("<h3>" +produto.getNome() + "</h3>");
            out.println("<h5>" +produto.getPreco() + "</h5>");
            out.println("<img src=" + produto.getUrlImagem() + "/>");
            out.println("</li>");
        });
        out.println("</ul>");
        out.println("</body></html>");
    }
}
