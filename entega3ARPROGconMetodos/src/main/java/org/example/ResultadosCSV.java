package org.example;

public class ResultadosCSV {
    private int IDres;
    private int rondaN;
    private int eq1CantG;
    private int eq2CantG;
    private String eq2Nom;
    private String eq1Nom;

    ResultadosCSV(){
        IDres=0;
        rondaN=0;
        eq1CantG=0;
        eq2CantG=0;
        eq1Nom="";
        eq2Nom="";
    }
    public ResultadosCSV(int IDres, int rondaN, String eq1Nom, int eq1CantG, int eq2CantG, String eq2Nom){
        this.IDres=IDres;
        this.rondaN=rondaN;
        this.eq1Nom=eq1Nom;
        this.eq1CantG=eq1CantG;
        this.eq2CantG=eq2CantG;
        this.eq2Nom=eq2Nom;
    }

    @Override
    public String toString() {
        return "ID: "+this.IDres+" ID ronda: "+this.rondaN+" equipo1: "+this.eq1Nom+"goles "+this.eq1CantG+" | "+this.eq2CantG+" goles "+this.eq2Nom+" :equipo2";
    }

    public int getIDres() {
        return IDres;
    }

    public void setIDres(int IDres) {
        this.IDres = IDres;
    }

    public int getRondaN() {
        return rondaN;
    }

    public void setRondaN(int rondaN) {
        this.rondaN = rondaN;
    }

    public int getEq1CantG() {
        return eq1CantG;
    }

    public void setEq1CantG(int eq1CantG) {
        this.eq1CantG = eq1CantG;
    }

    public int getEq2CantG() {
        return eq2CantG;
    }

    public void setEq2CantG(int eq2CantG) {
        this.eq2CantG = eq2CantG;
    }

    public String getEq2Nom() {
        return eq2Nom;
    }

    public void setEq2Nom(String eq2Nom) {
        this.eq2Nom = eq2Nom;
    }

    public String getEq1Nom() {
        return eq1Nom;
    }

    public void setEq1Nom(String eq1Nom) {
        this.eq1Nom = eq1Nom;
    }
}
