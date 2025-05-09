package br.com.fiap.models;

public class Anotações {
    // Aprendendo Interface -> 09/05/2025
    // Quando precisamos implementar métodos em duas classes que não tem nada a ver uma com a outra,
    // criamos uma interface
    // ex: funcionario, produto e seus impostos
    // qualquer classe que implementar essa interface será obrigada  ausar o método da interface. ex: calcular IM e
    // calcularIE
    // CRUD (create, vedate, delete, read) -> veremos isso melhor em banco de dados
    // quero obrigar que todos tenham essas operações. são classes totalmente diferentes, então como obrigamos elas a
    // implementar isso? CRIAMOS UMA INTERFACE. fazemos as classes implementarem o CRUD.
    // dentro de uma INTERFACE só temos métodos abstratos. ela não fala COMO vai ser feito mas sim O QUÊ.
    // a interface pode definir uma série de métodos, mas nunca conter implementação deles. TODOS os atributos e métodos
    // de uma interface devem ser públicos.
    // VER ISSO NO PDF INTERFACE!!
    // dentro da interface só temos constantes estáticas e final.
    // não precisamos escrever public abstract pq elas já são.
    // é criada da mesma forma que uma classe, mas utilizando interface no lugar de class.
    // ex: interface NomeInteface{
    // //campo static e final
    //   static final int nomeCampo = 10;
    // //método abstrato
    //   void nomeMetodo();
    // a gente nunca vai instanciar (new interface) a interface!
    // public class NomeClasse implements NomeInterface {
    // interface é como se fosse um contrato!! -> obriga quem assina o contrato a implementar, respeitar e obedecer
    // as cláusulas.

}
