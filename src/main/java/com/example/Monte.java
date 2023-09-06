package com.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Monte {
    private List<Carta> cartas = new ArrayList<>();
    private Naipe[] naipes = {Naipe.Hearts,Naipe.Spades,Naipe.Clubs,Naipe.Diamonds};
    
    public Monte(){
        for (Naipe naipe : naipes){
            for (int i = 1; i <= 13; i++){
                cartas.add(new Carta(i,naipe));
            }
        }
    }
    public void embaralhar(){
        Collections.shuffle(cartas);
    } 

    public Carta virar(){
        var carta = cartas.get(0); 
        cartas.remove(0);
        return carta; 
    }
}
