package br.senai.sp.roletarussa;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * Roleta Russa
 * Data: 17/08/2023
 * Autor : Vinicius Selhorst
 *
 *
 * */

public class RoletaRussa {

    public static void main(String[] args) {

        /** Declarar variaveis */
        String name;
        int numberUser, numberRandom;
        boolean continuar = true;

        /** Instanciar Scanner */

        Scanner teclado = new Scanner(System.in);

        /** Instanciar Random */

        Random random = new Random();

        while (continuar) {
            /** Coletar Dados */

            System.out.println("======================= Bem Vindo ========================");
            System.out.println("                       ROLETA RUSSA                       ");
            System.out.print("Qual seu nome? ");
            name = teclado.next();
            System.out.println("Olá " + name + ", Digite seu numero da sorte [ 1-10 ]: ");
            numberUser = teclado.nextInt();
            System.out.println("========================================================");


            /** Logica dp Jogo */

            numberRandom = random.nextInt(10) + 1;

            if (numberUser == numberRandom) {

                continuar = false;
                System.out.println("Game Over!");

            }else {
                System.out.println("Parabéns, continue!!");
            }
        }


    }
}
