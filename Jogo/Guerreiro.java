/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.Jogo;

/**
 *
 * @author Usuario
 */
class Guerreiro extends Personagem {
    public Guerreiro(String nome) {
        super(Nome, 100, 15);
    }

     public void atacar(Personagem oponente) {
        oponente.Vida -= this.Ataque;
        System.out.println(this.Nome + " atacou " + oponente.Nome + " e causou " + (this.Ataque) + " de dano.");
    }
}