package br.com.fiap.models;

import br.com.fiap.enums.TipoCapaEnum;

public class Livro {
    //Atributo tipo nomeAtributo;
    public String titulo;
    public String autor;
    public double preco;
    public Editora editora;
    public int paginas;
    public String resumo;
    public TipoCapaEnum tipoCapa; //COMUM, DURA

    //Construtor
    public Livro(){
     tipoCapa = TipoCapaEnum.COMUM;
    }

    //Construtor livro que recebe uma editora
    public Livro(Editora editora){
        this.editora = editora;
        tipoCapa = TipoCapaEnum.COMUM;
    }

    //Método para exibir o livro
    public void exibirLivro()
    {
        System.out.println("br.com.fiap.models.Livro: "+ titulo);
        System.out.println("Autor: "+ autor);
        System.out.println("br.com.fiap.models.Editora: "+ editora.nome);
        System.out.println("Preço: "+ preco);
        System.out.println("Tipo de capa: "+tipoCapa);
        System.out.println("----------------------------\n");
    }
}