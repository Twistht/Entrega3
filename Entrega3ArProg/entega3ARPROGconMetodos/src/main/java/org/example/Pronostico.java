package org.example;

public class Pronostico {
    private Partido partido;
    private Equipo equipo;
    private ResultadoEnum resultadoEnum;

    Pronostico(){
        partido = new Partido();
        equipo = new Equipo();
        resultadoEnum = new ResultadoEnum();
    }
    Pronostico(Partido partido, Equipo equipo, ResultadoEnum resultadoEnum){
        this.partido=partido;
        this.equipo=equipo;
        this.resultadoEnum=resultadoEnum;
    }

    public Partido getPartido() {
        return partido;
    }

    public int puntos(){
        int puntos=0;

        return puntos;
    }

    public void setPartido(Partido partido) {
        this.partido = partido;
    }

    public Equipo getEquipo() {
        return equipo;
    }

    public void setEquipo(Equipo equipo) {
        this.equipo = equipo;
    }

    public ResultadoEnum getResultadoEnum() {
        return resultadoEnum;
    }

    public void setResultadoEnum(ResultadoEnum resultadoEnum) {
        this.resultadoEnum = resultadoEnum;
    }
}
