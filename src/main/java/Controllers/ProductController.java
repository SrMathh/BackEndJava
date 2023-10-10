package Controllers;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import Services.RespondeEndPontis;

import java.io.IOException;


public class ProductController {
    static RespondeEndPontis res = new RespondeEndPontis();
    public static class ProductsHandler implements HttpHandler {
        @Override
        public void handle(HttpExchange exchange) throws IOException {

            String response = "";

            if("GET".equals(exchange.getRequestMethod())){
                response = "Essa e a rota de PRODUTO  - GET "+ " O metodo utilizado foi ! " + exchange.getRequestMethod();
                res.enviarResponse(exchange, response);
            } else if ("POST".equals(exchange.getRequestMethod())){
                response = "Essa e a rota de PRODUTO  - POST "+ " O metodo utilizado foi ! " + exchange.getRequestMethod();
                res.enviarResponse(exchange, response);
            } else if ("PUT".equals(exchange.getRequestMethod())){
                response = "Essa e a rota de PRODUTO  - PUT "+ " O metodo utilizado foi ! " + exchange.getRequestMethod();
                res.enviarResponse(exchange, response);
            }else if ("DELETE".equals(exchange.getRequestMethod())){
                response = "Essa e a rota de PRODUTO  - DELETE "+ " O metodo utilizado foi ! " + exchange.getRequestMethod();
                res.enviarResponse(exchange, response);
            }else {
                response = "opção inválida "+ " O metodo utilizado foi ! " + exchange.getRequestMethod();
                res.enviarResponse(exchange, response);
            }

        }
    }
}