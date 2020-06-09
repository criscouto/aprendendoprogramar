/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.

 */
import java.util.Scanner;

/**
 *
 * @author Cristina do Couto
 */
public class MinhaPrimeiraClasse {
     public static void main(String[] args) {
        executar();
    }

     
        public static void executar() {
        //Declaração de constantes
        String MENSAGEM_MAIOR = "Você é maior de idade";
        String MENSAGEM_MENOR = "Você é menor de idade";
        int IDADE_LEGAL = 18;
        int ANO_ATUAL = 2020;
        String SEXO_FEMININO = "Pulseira rosa";
        String SEXO_MASCULINO = "Pulseira azul";

        //Declaração de variaveis
        int idade = 0;
        String nomeCompleto = "";
        String sexo = "";
        int anoNascimento = 0;
       
        System.out.printf("Olá mundo!!!\n\n");
        //Preenchendo o cadastro, atribuições de valores para as varáveis
        Scanner ler = new Scanner(System.in);

        System.out.printf("Informe o nome completo:\n");
        nomeCompleto = ler.nextLine();

        System.out.printf("Informe o sexo:\n");
        sexo = ler.next();

        System.out.printf("Informe o ano de nascimento:\n");
        anoNascimento = ler.nextInt();
       
       
        idade = calcularIdade(anoNascimento);    

        if (idade >= IDADE_LEGAL) {
            System.out.println("Olá " + nomeCompleto + ". " + MENSAGEM_MAIOR);
        } else {
            System.out.println("Olá " + nomeCompleto + ". " + MENSAGEM_MENOR);
        }
       
        if (sexo.equals("M")) {
            System.out.println(SEXO_MASCULINO);
        } else {
            System.out.println(SEXO_FEMININO);
        }
            System.out.println("Você tem " + idade + " anos de idade.");
    }

    public static int calcularIdade (int anoNascimentoParametro) {
            int result = 0;

            result = 2020 - anoNascimentoParametro;

            return result;
        }
}
