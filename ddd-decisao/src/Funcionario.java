public class Funcionario {
    String nome;
    String cargo;
    double salario;

    public double calcularBonus() {
        if (salario > 5000) {
            return salario * 0.05;
            //obs: toda vez que eu crio um metodo que retorna alguma coisa, (o double (bonus) nesse caso), somos obrigados
            // a tratar a outra parte tb (o falso):
        }
        return 0;
    }
   public double calcularGratificacao(){
        if(cargo.equalsIgnoreCase("Vendedor")){
            return salario * 0.05;
        }
        else{
            return 500;
        }
   }
    public double calcularIRPF(){
        double salarioFinal = salario + calcularBonus() + calcularGratificacao();
        if(salarioFinal <= 2259){
                return 0;
        }else if(salarioFinal > 2259 && salarioFinal < 5000){          //Olhar as notas ali embaixo para entender.
            return salarioFinal * 0.075;
        }else if(salarioFinal < 10000){
            return salarioFinal * 0.125;
        }else{
            return salarioFinal * 0.275;

        }

        }




}

//Funcionario
// + nome: String
// + cargo: String
// + salario: double
// + calcularBonus():double
// -> calcular bonus: funcionario terá um bonus de 5% se o salario for maior que 5000
// + calcular gratificação: calcularGratificacao():double
// -> calcular gratificação: se o cargo do funcionario for vendedor, a gratificação será de 5% do salario;
// para os demais será de 500,00.
// + calcularIRPF():double
// -> imposto de renda: um desconto de x% dependendo do valor do salário.
// -> cada if consegue tratar verdadeiro e falso (duas situações), então não consegue tratar desse caso.
//  if(condicao){ (verdadeira) -> 5%
// -------;
// }
//  else{ -> 500,00.
// -------;
// }

//IF SIMPLES
// condição: uma comparação de duas coisas. qual a minha condição? preciso ver se o salario é > que 5000.
// duas possibilidades numa condição: ou verdadeiro ou falso. nesse caso, só trataremos da parte verdadeira.
// comando de decisao: if. (if(condição){
                      //    -------;
                      //    }
                      // isso ^^ é um bloco, pra executar varios ifs ao mesmo tempo.
// quando criamos uma classe, criamos atributos e metodos tb

//IF COMPOSTO (olhar o codigo ali em cima)

//IF ENCADEADO
//if(sal <= 2259){     (abrir chaves no if sempre, fechar antes do else. o ultimo else voce fecha, abre e fecha no fim)
//des = 0;
//}else if(sal < 5000){
//des = sal * 0.075;
//}else if(sal < 10000){
//des = sal * 0.125;
//}else{
//des = sal * 0.275;
//}


// criar um metodo: calculo do bonus.

// Operadores aritmeticos
// + - * / %

// Operadores relacionais (double/int)
// == (igual); != (diferente); <; >; <=; >=
// comparar textos (e nao numeros) -> nome.equals (equals = exatamente igual)

// Operadores lógicos
// (não) ! (ordem: calcula esse primeiro)
// (e) &&  (ordem: calcula esse depois)
// (ou) || (ordem: calcula esse por ultimo)
// 2 condições que se relacionam
// if(media >=6 && freq >=75){