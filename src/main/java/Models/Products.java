package Models;

public class Products {

    static public String nomeP = "";
    static public String descricao = "";
    static public String categoria = "";
    static public double preco = 0;
    static public int quantidade = 0;

    static public String codigoDeBarras = "";

    public Products(){
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
