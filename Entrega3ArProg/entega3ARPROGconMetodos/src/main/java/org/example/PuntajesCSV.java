package org.example;

public class PuntajesCSV {
    private int ID;
    private int ronda;
    private String part1;
    private int punt1;
    private String part2;
    private int punt2;

    PuntajesCSV(){
        ID=0;
        ronda=0;
        part1="";
        punt1=0;
        part2="";
        punt2=0;
    }
    public PuntajesCSV(int ID, int ronda, String part1, int punt1, String part2, int punt2){
        this.ID=ID;
        this.ronda=ronda;
        this.part1=part1;
        this.punt1=punt1;
        this.part2=part2;
        this.punt2=punt2;
    }

    @Override
    public String toString() {
        return "ID "+ID+" ronda "+ronda+" part1 "+part1+" puntos1 "+punt1+" part2 "+part2+" puntos2 "+punt2;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getRonda() {
        return ronda;
    }

    public void setRonda(int ronda) {
        this.ronda = ronda;
    }

    public String getPart1() {
        return part1;
    }

    public void setPart1(String part1) {
        this.part1 = part1;
    }

    public int getPunt1() {
        return punt1;
    }

    public void setPunt1(int punt1) {
        this.punt1 = punt1;
    }

    public String getPart2() {
        return part2;
    }

    public void setPart2(String part2) {
        this.part2 = part2;
    }

    public int getPunt2() {
        return punt2;
    }

    public void setPunt2(int punt2) {
        this.punt2 = punt2;
    }
}
