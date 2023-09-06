package com.example;

public class Jogo {
    Monte monte = new Monte();
    Jogador jogador = new Jogador();
    Computador computador = new Computador();

    public Jogo(){
        monte.embaralhar();
    }
    public Monte getMonte() {
        return monte;
    }
    public Jogador getJogador() {
        return jogador;
    }
    public Computador getComputador() {
        return computador;
    }
    public Carta distribuiCartaParaJogador(){
        if(!jogador.parou()){
            return monte.virar();
        }
        return null;
    }
    public boolean acabou(){
        if(jogador.getPontos() > 21 || computador.getPontos() > 21 ||jogador.parou() || computador.parou()){
             return true;
        }
        return false;
    }
    public String resultado(){
        if(jogador.getPontos() > computador.getPontos() && jogador.getPontos() <= 21){
            return "Venceu";
        }
        else if (computador.getPontos() > jogador.getPontos() && computador.getPontos() <= 21){
            return "Perdeu";
        }
        else if (jogador.getPontos() > 21){
            return "Perdeu";
        }
        else if(jogador.getPontos()==computador.getPontos()){
            return "Empatou";
        }
        else{
            return "Ganhou";
        }
    }
}
