import View.telainicial;
import Services.Servidor;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        Servidor servidor = new Servidor();

        servidor.server1();
        telainicial.telaInicial();
        telainicial.telaDeOpcoes();
    }
}