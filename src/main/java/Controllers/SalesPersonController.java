package Controllers;

import Services.RespondeEndPontis;
import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import org.json.JSONObject;
import java.io.IOException;




public class SalesPersonController {
    public static class SalesPerson implements HttpHandler {
        static RespondeEndPontis res = new RespondeEndPontis();
        @Override
        public void handle(HttpExchange exchange) throws IOException {

            String response = "";

            JSONObject responseJson = new JSONObject();

            responseJson.put("MinhaChave1", "Valor1");
            responseJson.put("chave2", 21984145);

            if("GET".equals(exchange.getRequestMethod())){
               // response = "Essa e a rota de vendedor  - GET "+ " O metodo utilizado foi ! " + exchange.getRequestMethod();
                res.enviarResponseJson(exchange, responseJson);
            } else if ("POST".equals(exchange.getRequestMethod())){
                response = "Essa e a rota de vendedor  - POST "+ " O metodo utilizado foi ! " + exchange.getRequestMethod();
                res.enviarResponse(exchange, response);
            } else if ("PUT".equals(exchange.getRequestMethod())){
                response = "Essa e a rota de vendedor  - PUT "+ " O metodo utilizado foi ! " + exchange.getRequestMethod();
                res.enviarResponse(exchange, response);
            }else if ("DELETE".equals(exchange.getRequestMethod())){
                response = "Essa e a rota de vendedor  - DELETE "+ " O metodo utilizado foi ! " + exchange.getRequestMethod();
                res.enviarResponse(exchange, response);
            }else {
                response = "opção inválida " + " O metodo utilizado foi ! " + exchange.getRequestMethod();
                res.enviarResponse(exchange, response);
            }
        }
    }

}
