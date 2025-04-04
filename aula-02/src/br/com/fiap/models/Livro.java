package br.com.fiap.models;

import br.com.fiap.enums.TipoCapaEnum;

public class Livro {
    //Atributo tipo nomeAtributo;
    private String titulo;
    private String autor;
    private double preco;
    private Editora editora;
    private int paginas;
    private String resumo;
    private TipoCapaEnum tipoCapa; //COMUM, DURA

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
        System.out.println("Editora: "+ editora.getNome());
        System.out.println("Preço: "+ preco);
        System.out.println("Tipo de capa: "+tipoCapa);
        System.out.println("----------------------------\n");
    }

    public String getTitulo(){
        return titulo;

}
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor){
        this.autor = autor;
    }
    public double getPreco() {
        return preco;
    }
    public void setPreco(double preco){
        this.preco = preco;
    }
    public int getPaginas(){
        return paginas;
        }
    public void setPaginas(int paginas){
        this.paginas = paginas;
    }
    public String getResumo(){
        return resumo;
    }
    public void setResumo(String resumo){
        this.resumo = resumo;
    }

    public Editora getEditora() {
        return editora;
    }

    public void setEditora(Editora editora) {
        this.editora = editora;
    }

    public TipoCapaEnum getTipoCapa() {
        return tipoCapa;
    }

    public void setTipoCapa(TipoCapaEnum tipoCapa) {
        this.tipoCapa = tipoCapa;
    }
}





// encapsulamento: o conteúdo tá protegido --> privado. quem sabe como manipular esse objeto é a classe. |
// encapsulamento significa proteger esse código, nenhum lugar externo vai conseguir acessar. há 2 **métodos de acesso**
// dele: o método get e o método set. esconde a complexidade do código.
// método privado exemplo: cpf. métodos que não serão utilizados na main. exemplo: exibirClasificacao do CP1.