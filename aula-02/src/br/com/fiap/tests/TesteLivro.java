package br.com.fiap.tests;

import br.com.fiap.enums.TipoCapaEnum;
import br.com.fiap.models.Editora;
import br.com.fiap.models.Livro;

import java.util.Scanner;

public class  TesteLivro {
    public static void main(String[] args) {
        //Criar um objeto -> Instanciar um objeto
        // Tipo nomeObjeto = new Tipo(); (linha 15)
        Scanner entrada = new Scanner(System.in);
        Scanner leitorNumerico = new Scanner(System.in);

        Editora novatec = new Editora();
        novatec.nome = "Nova Tec";
        novatec.site = "www.novatec.com";
        novatec.telefone = "1157292232";

        Livro meuLivro = new Livro();    //Esse br.com.fiap.models.Livro() é um construtor! Construtor: é o momento em que vou criar um
                                         // objeto e digo como é criado. Todo construtor tem o mesmo nome da classe.
                                         // existe um construtor padrão (vazio), porém ele só existe se "eu" não criar
                                         // outro. a partir do momento em que cio 1 construtor, o padrão deixa de existir.
                                         // construtor não tem retorno.
        meuLivro.titulo = "UML 2";
        meuLivro.autor = "Gilleanes Guedes";
        meuLivro.preco = 50;
        meuLivro.editora = novatec;
        meuLivro.paginas = 484;
        meuLivro.resumo = "UML abordagem prática";
        //meuLivro.tipoCapa = br.com.fiap.enums.TipoCapaEnum.DURA;




        meuLivro.exibirLivro();
        //--------------------------
        Livro livro = new Livro();
        System.out.println("Digite o nome do livro: ");
        livro.titulo = entrada.nextLine();

        System.out.println("Tipo de capa: \n" +
                "1- Comum \n" +
                "2- Dura \n" +
                "3- Personalizada \n\n" +
                "Escolha o tipo de capa desejada: ");
        int opcao = leitorNumerico.nextInt();

        if(opcao == 1)
            livro.tipoCapa = TipoCapaEnum.COMUM;
        else if(opcao == 2)
            livro.tipoCapa = TipoCapaEnum.DURA;
        else
            livro.tipoCapa = TipoCapaEnum.PERSONALIZADA;

        System.out.println("Capa: "+livro.tipoCapa);
    }
}