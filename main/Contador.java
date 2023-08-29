package main;

import exception.ParametrosInvalidosException;

import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // entrada dos dados
        System.out.println("Insira o primeiro paramêtro: ");
        int parametroUm = sc.nextInt();
        System.out.println("Insira o segundo paramêtro: ");
        int parametroDois = sc.nextInt();


        // tratativa das excecoes
        try {
            contar(parametroUm, parametroDois);
        } catch (ParametrosInvalidosException e) {
            System.out.println(e.getMessage());
        }


        sc.close();

    }
    // metodo que irá verificar se o primeiro parametro é maior que o segundo
    static void contar ( int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
        if (parametroUm > parametroDois) {
            throw new ParametrosInvalidosException("O segundo paramêtro deverá ser maior que o primeiro!!");
        }

        int contagem = parametroDois - parametroUm;
        for(int i = 1; i <= contagem; i++){
            System.out.println("Imprimindo o número " + i);
        }
    }

}
