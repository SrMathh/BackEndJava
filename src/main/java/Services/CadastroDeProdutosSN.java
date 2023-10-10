package Services;
import View.cadastroSales;

import java.util.Objects;

public class CadastroDeProdutosSN {
    public static void RespostaProduto(String resposta){
        cadastroSales cadastroSales = new cadastroSales();

    if(Objects.equals(resposta, "s")){
        cadastroSales.cadastrarVendas();
    } else if (Objects.equals(resposta, "n")) {
        System.out.println("Tchau !");
    }
    }
    public static void RespostaUser(String resposta){
        cadastroSales cadastroSales = new cadastroSales();

        if(Objects.equals(resposta, "s")){
            cadastroSales.cadastroUser();

        } else if (Objects.equals(resposta, "n")) {
            System.out.println("Tchau !");
        }
    }
}

