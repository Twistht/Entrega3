package org.example;

import java.util.ArrayList;

public class Ronda {
    private int nro;
    private ArrayList<Partido> partido;
    Ronda(){
        nro=0;
        partido = new ArrayList<Partido>();
    }
    Ronda(ArrayList<Partido> partido, int nro){
        this.nro=nro;
        this.setPartido(partido);
    }
    public void AgregarP(Partido partido){
        for( Partido p: getPartido()){
            if(p.igual(partido)){
                throw new RuntimeException("partido ya existe..");
            }
        }
        this.getPartido().add(partido);
    }
    public int puntos(){
        int puntos=0;

        return puntos;
    }

    public int getNro() {
        return nro;
    }

    public void setNro(int nro) {
        this.nro = nro;
    }


    public ArrayList<Partido> getPartido() {
        return partido;
    }

    public void setPartido(ArrayList<Partido> partido) {
        this.partido = partido;
    }
}
