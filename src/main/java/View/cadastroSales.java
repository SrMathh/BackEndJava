package View;

import Models.SalesMock;
import Models.sales;
import Models.ProductsMock;
import Services.calculo;
import Models.Products;
import Services.CadastroDeProdutosSN;
import Models.CadastroUser;

import java.util.Scanner;

public class  cadastroSales {
    public static void cadastrarVendas(){
        Scanner scanner = new Scanner(System.in);
        SalesMock salesMock = new SalesMock();
        ProductsMock productsMock = new ProductsMock();
        sales sale = new sales();
        calculo Calculo = new calculo();
        Products products = new Products();
        CadastroDeProdutosSN cadastroDeProdutosSN = new CadastroDeProdutosSN();
        String resposta = "";

        System.out.println("Cadastro de vendas");

        System.out.print("Usuario: ");
        sales.user = scanner.nextLine();
        System.out.print("Senha: ");
        sales.password = scanner.nextLine();

        System.out.println("ola! Bem vindo ao sistema de cadastro de produtos");
        System.out.println("digite o nome do seu produto");
        products.nomeP = scanner.nextLine();
        System.out.println("digite a descricao do seu produto");
        products.descricao = scanner.nextLine();
        System.out.println("digite a categoria do seu produto");
        products.categoria = scanner.nextLine();
        System.out.println("digite o preço do produto");
        products.preco = Double.parseDouble(scanner.nextLine());
        System.out.println("digite a quantidade");
        products.quantidade = Integer.parseInt(scanner.nextLine());
        System.out.println("digite o codigo de barras");
        products.codigoDeBarras = scanner.nextLine();



        System.out.println("Venda Registrada: ");
        System.out.println("Usuario: " + sale.user );
        System.out.println("Senha: " + SalesMock.password);
        System.out.println("Produto: " +ProductsMock.nomeP );
        System.out.println("Descrição: " + ProductsMock.descricao);
        System.out.println("Quantidade: " + ProductsMock.quantidade);
        System.out.println("Total: " + Calculo.Calc());

        System.out.println("deseja cadastar um nome produto? caso sim digite sim caso nao digite nao");
        resposta = scanner.nextLine();
        cadastroDeProdutosSN.RespostaProduto(resposta);
    }

    public static void cadastroUser (){
        Scanner scanner = new Scanner(System.in);
        SalesMock salesMock = new SalesMock();
        ProductsMock productsMock = new ProductsMock();
        sales sale = new sales();
        calculo Calculo = new calculo();
        Products products = new Products();
        CadastroDeProdutosSN cadastroDeProdutosSN = new CadastroDeProdutosSN();
        String resposta = "";
        CadastroUser cadastroUser = new CadastroUser();

        System.out.println("Cadastro de Usuarios");

        System.out.print("Usuario Adm: ");
        CadastroUser.usuarioAdm = scanner.nextLine();
        System.out.print("Senha Adm: ");
        CadastroUser.senhaAdm = scanner.nextLine();

        System.out.println("ola! Bem vindo ao sistema de cadastro de usuarios");
        System.out.print("Será um usuario Adm?: ");
        CadastroUser.simNao= scanner.nextLine();
        System.out.print("Nome: ");
        CadastroUser.usuario = scanner.nextLine();
        System.out.print("Sobre nome : ");
        CadastroUser.sobreNome = scanner.nextLine();
        System.out.print("Senha : ");
        CadastroUser.senha = (scanner.nextLine());
        System.out.print("cpf: ");
        CadastroUser.cpf = scanner.nextLine();
        System.out.print("Email: ");
        CadastroUser.email = scanner.nextLine();



        System.out.println("Usuario Registrado: ");
        System.out.println("Liberado por : " + CadastroUser.usuarioAdm );
        System.out.println("Senha: " + SalesMock.password);
        System.out.println("Usuario: " + CadastroUser.usuario );
        System.out.println("Senha: " + CadastroUser.senha);
        System.out.println("Email: " + CadastroUser.email);
        System.out.println("Cpf: " + CadastroUser.cpf);

        System.out.println("Deseja colocar mais um usuario ?");
        resposta = scanner.nextLine();
        cadastroDeProdutosSN.RespostaUser(resposta);
    }


    public static void cadastraProdutos(){

    }
}


