package Controllers;

import Services.RespondeEndPontis;
import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;

import java.io.IOException;



public class UserController {
    static RespondeEndPontis res = new RespondeEndPontis();
     public static class UserHandler implements HttpHandler {
        @Override //sobre escrever o metodo anterior
        public void handle (HttpExchange exchange) throws IOException {

            String response = "";

            if("GET".equals(exchange.getRequestMethod())){
                response = "Essa e a rota de USUARIO  - GET "+ " O metodo utilizado foi ! " + exchange.getRequestMethod();
                res.enviarResponse(exchange, response);
            } else if ("POST".equals(exchange.getRequestMethod())){
                response = "Essa e a rota de USUARIO  - POST "+ " O metodo utilizado foi ! " + exchange.getRequestMethod();
                res.enviarResponse(exchange, response);
            } else if ("PUT".equals(exchange.getRequestMethod())){
                response = "Essa e a rota de USUARIO  - PUT "+ " O metodo utilizado foi ! " + exchange.getRequestMethod();
                res.enviarResponse(exchange, response);
            }else if ("DELETE".equals(exchange.getRequestMethod())){
                response = "Essa e a rota de USUARIO  - DELETE "+ " O metodo utilizado foi ! " + exchange.getRequestMethod();
                res.enviarResponse(exchange, response);
            } else {
                response = "opção inválida "+ " O metodo utilizado foi ! " + exchange.getRequestMethod();
                res.enviarResponse(exchange, response);
            }
        }
     }
}