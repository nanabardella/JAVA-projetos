package br.com.fiap.models;

public class Editora {
    private String nome;
    private String site;
    private String telefone;

// criar um método de acesso pro método private.
    // MÉTODOS GETTERS E SETTERS
    // SET é sempre void!!!!!! guarda na memória o atributo.
    // ex: alguem me pede uma roupa emprestada, eu tiro do armario e empresto. --> GET
    // a pessoa me devolve e eu guardo de volta. --> SET
    // dá pra fazer os getters e setters com o botão direito, generate getters e setters e seleciona tudo que quiser.
    public Editora (String nome){
        this.nome = nome;
    }

    public Editora(){}

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getSite(){
        return site;
    }
    public void setSite(String site){
        this.site = site;
    }
    public String getTelefone(){
        return telefone;
    }
    public void setTelefone(String telefone){
        this.telefone = telefone;
    }


}


