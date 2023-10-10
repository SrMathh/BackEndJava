package Models;

public class ProductsMock {
    static public String nomeP = "strogonoff";
    static public String descricao = "arroz batata e strogonoff";
    static public String categoria = "comida";
    static public double preco = 20;
    static public int quantidade = 10;

    static public String codigoDeBarras = "";

    public ProductsMock(){
    }

    public String getNomeP(){
        return nomeP;
    }
    public String getDescricao(){
        return descricao;
    }
    public String getCategoria(){
        return categoria;
    }
    public String getCodigoDeBarras(){
        return codigoDeBarras;
    }
    public double getpreco(){
        return preco;
    }
    public int getQuantidade(){
        return quantidade;
    }

}
