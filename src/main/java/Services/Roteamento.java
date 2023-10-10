package Services;

import static View.telainicial.telaInicial;
import static java.lang.System.exit;
import View.telainicial;
import View.cadastroSales;

public class Roteamento {

    public static void rotas(int escolha){
        telainicial telainicial = new telainicial();

        switch (escolha){
            case 1:
               cadastroSales.cadastroUser();
                break;
            case 2:
                cadastroSales.cadastrarVendas();
                break;
            case 3:
                cadastroSales.cadastraProdutos();
                break;
            case 4:
                System.out.println("Até logo!");
                exit(0);
                break;
            default:
                System.out.println("Opção inválida. Tente novamente");
                telaInicial();
                break;
        }
    }
}
