/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.Jogo1;

/**
 *
 * @author Usuario
 */
public class AtiradorAssalto implements Personagem{
    @Override
    public int Dano(){
         int dano = Dados.numeroAleatorio();
        return dano;
    }

    @Override
    public int Vida() {
         int vida = Dados.numeroAleatorio() + Dados.numeroAleatorio() + Dados.numeroAleatorio();
        return vida;
    }

    @Override
    public int Mana() {
         int mana = Dados.numeroAleatorio() + Dados.numeroAleatorio() + Dados.numeroAleatorio() + Dados.numeroAleatorio();
        return mana;
    }

    @Override
    public int Agilidade() {
         int agilidade = Dados.numeroAleatorio() + Dados.numeroAleatorio();
        return agilidade;
    }
}
