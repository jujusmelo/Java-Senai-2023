// Tipos de váriaveis em Java.
/* 
 * String -> Armazena texto (nome, endereço, CEP...)
 * char -> Armazena única letra
 * int -> números inteiros
 * float -> números decimais. 
 * double -> números decimais (mais preciso que o float).
 */
/*
 * Toda variável DEVE começar com letra minúscula.
 * Não pode haver espaço no nome da variável;
 * nomeAluno, enderecoCliente, produtoAdquirido.
 */

 
 public class Exemplo01{
    public static void main(String[] args) {


        String nome = "Júlia Melo";
        int idade = 16;
        boolean chuva = true; // Em variáveis booleanas eu uso true ou false.
        char letra = 'J'; // Todo char DEVE estar com aspas simples ''.
        double salario = 600;
        float altura = (float) 1.62; //Estou convertendo um double para float


        System.out.println("Meu nome é:" +nome);
        System.out.println("Minha idade é: " +idade);
        System.out.println("Está chovendo?: " +chuva);
        System.out.println("A inicial do meu nome é: " +letra);
        System.out.println("Meu salário é: " +salario);
        System.out.println("Eu tenho: " +altura+ " metros");
        
    }


 }