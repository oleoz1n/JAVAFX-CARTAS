package com.example;

import java.util.ArrayList;
import java.util.List;

public class Jogador {
    private int pontos = 0;
    private boolean parou = false;
    private List<Carta> cartas = new ArrayList<>();
    
    public boolean parou(){
        return this.parou;
    }

    public void receberCarta(Carta carta){
        cartas.add(carta);
        if(carta.getNumero() > 10){
            pontos += 10;
        }
        else{
            pontos += carta.getNumero();
        }
    }
    public void parar(){
        parou = true;
    }

    public int getPontos(){
        return pontos;
    }

    public List<Carta> getCartas() {
        return cartas;
    }
}
