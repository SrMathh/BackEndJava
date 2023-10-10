package Models;

public class CadastroUser {
    static public String usuarioAdm= "";
    static public String usuario = "";
    static public String senhaAdm = "";
    static public String senha = "";
    static public String cpf = "";
    static public String email = "";
    static public String simNao = "";
    static public String sobreNome = "";

    public CadastroUser(){
    }

    public CadastroUser(String usuario, String usuarioAdm, String senha, String senhaAdm, String cpf , String email, String simNao, String sobreNome){
        this.cpf = cpf ;
        this.email = email ;
        this.senha = senha ;
        this
    }

    public String getUsuariosuario(){
        return usuario;
    }

    public void setUsuariosuario(String usuario){
        this.usuario = usuario;
    }

    public String getusuarioAdm(){
        return usuarioAdm;
    }
    public String getsenhaAdm(){
        return senhaAdm;
    }
    public String getsenha(){
        return senha;
    }
    public String getCpf(){
        return cpf;
    }
    public String getEmail(){
        return email;
    }
    public String getsimNao(){
        return simNao;
    }
    public String getsobreNome(){
        return sobreNome;
    }
}
