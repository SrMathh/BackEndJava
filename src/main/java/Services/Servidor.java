package Services;

import Controllers.ProductController;
import Controllers.SalesPersonController;
import Controllers.UserController;
import Models.CadastroUser;
import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpServer;


import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;


public class Servidor {
    static HttpExchange exchange;

    static CadastroUser cadastroUser = new CadastroUser();

    public static void metodo(HttpExchange httpExchange) throws IOException {
        System.out.println("cheguei");
        if ("GET".equals(exchange.getRequestMethod())) {
            String response = CadastroUser.usuario + " " + cadastroUser.sobreNome;
            exchange.sendResponseHeaders(200, response.length());
            OutputStream os = exchange.getResponseBody();// criar na memoria um lugar resposta
            os.write(response.getBytes());
            os.close();
        } else {
            String response = "metodos não implementados";
            exchange.sendResponseHeaders(405, response.length());

            OutputStream os = exchange.getResponseBody();
            os.write(response.getBytes());
            os.close();
        }
    }

    public void server1() throws IOException {

        HttpServer server = HttpServer.create(new InetSocketAddress(3000), 0);


        server.createContext("/api/usuario", new UserController.UserHandler());
        server.createContext("/api/vendedor", new  SalesPersonController.SalesPerson());
        server.createContext("/api/produtos", new ProductController.ProductsHandler());

        server.setExecutor(null);
        server.start();

    }
}

//