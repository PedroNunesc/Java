/*
 * This source file was generated by the Gradle 'init' task
 */
package com.example.Jogo;

import java.util.Scanner;

public class App{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha o nome do Guerreiro:");
        String nomeGuerreiro = scanner.nextLine();
        Guerreiro guerreiro = new Guerreiro(nomeGuerreiro);
        
        System.out.println("Escolha o nome do Mago:");
        String nomeMago = scanner.nextLine();
        Mago Mago = new Mago(nomeMago);

        System.out.println("Escolha o nome do Arqueiro:");
        String nomeArqueiro = scanner.nextLine();
        Arqueiro Arqueiro = new Arqueiro(nomeArqueiro);

        while (guerreiro.estaVivo() && Mago.estaVivo() && Arqueiro.estaVivo()) {
            System.out.println("\nEscolha o personagem para atacar:");
            System.out.println("1. Guerreiro");
            System.out.println("2. Mago");
            System.out.println("3. Arqueiro");
            int escolha = scanner.nextInt();

            System.out.println("Escolha o oponente (1. Guerreiro, 2. Mago, 3. Arqueiro):");
            int oponenteEscolha = scanner.nextInt();
            int escolhaGuerreiro;
                    
            Personagem atacante = null;
            Personagem oponente = null;

            switch (escolha) {
                case 1:
                atacante = guerreiro;
                System.out.println("1. Usar o ataque normal.");
                System.out.println("2. Usar o especial.");
                escolhaGuerreiro = scanner.nextInt();
                
                switch (escolhaGuerreiro) {
                    case 1:
                        atacante.Atacar();
                        break;
                    case 2:
                        atacante.atingirEspada();
                        break;
                    default:
                        System.out.println("Opção inválida para ataque.");
                        break;
                }
                case 2:
                    atacante = Mago;
                    break;
                case 3:
                    atacante = Arqueiro;
                    break;
            }

            switch (oponenteEscolha) {
                case 1:
                    oponente = guerreiro;
                    break;
                case 2:
                    oponente = Mago;
                    break;
                case 3:
                    oponente = Arqueiro;
                    break;
            }

            if (atacante != null && oponente != null && atacante != oponente) {
                atacante.Atacar(oponente);
                System.out.println("Vida do " + oponente.Nome + ": " + oponente.Vida);
            } else {
                System.out.println("Escolha inválida.");
            }

            if (!oponente.estaVivo()) {
                System.out.println(oponente.Nome + " foi derrotado!");
                break;
            }
        }
        scanner.close();
    }
}