package org.example;

public class Partido {
    private Equipo eq1;
    private Equipo eq2;

    private int golEq1;
    private int golEq2;
    Partido(){
        eq1= new Equipo();
        eq2= new Equipo();
        golEq1=0;
        golEq2=0;
    }
    Partido(Equipo eq1, Equipo eq2, int golEq1, int golEq2){
        this.eq1=eq1;
        this.eq2=eq2;
        this.golEq1=golEq1;
        this.golEq2=golEq2;
    }

    public ResultadoEnum Resultado(Equipo x){
        ResultadoEnum a= new ResultadoEnum();

        return a;
    }
    public boolean igual(Partido p){
        boolean part=false;

        return (this.eq1.getNombre().equals(p.eq1.getNombre())&&this.eq2.getNombre().equals(p.eq2.getNombre()))
                ||this.eq1.getNombre().equals(p.eq2.getNombre())&&this.eq2.getNombre().equals(p.eq1.getNombre());

    }
    public Equipo getEq1() {
        return eq1;
    }

    public void setEq1(Equipo eq1) {
        this.eq1 = eq1;
    }

    public Equipo getEq2() {
        return eq2;
    }

    public void setEq2(Equipo eq2) {
        this.eq2 = eq2;
    }

    public int getGolEq1() {
        return golEq1;
    }

    public void setGolEq1(int golEq1) {
        this.golEq1 = golEq1;
    }

    public int getGolEq2() {
        return golEq2;
    }

    public void setGolEq2(int golEq2) {
        this.golEq2 = golEq2;
    }
}
