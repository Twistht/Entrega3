package org.example.utilidades;

import org.example.modelo.Equipo;
import org.example.modelo.Fase;
import org.example.modelo.Partido;
import org.example.modelo.Ronda;

import java.util.ArrayList;
import java.util.List;

public class LectorCSV {

    List<Fase> fases;
    List<Equipo> equipos;

    public LectorCSV(){
        this.fases = new ArrayList<>();
        this.equipos = new ArrayList<>();
    }

    public void levantarResultados() {
        Equipo argentina = this.obtenerEquipo("Argentina");
        Equipo arabia = this.obtenerEquipo("Arabia Saudita");
        Equipo polonia = this.obtenerEquipo("Polonia");
        Equipo mexico = this.obtenerEquipo("Mexico");

        Partido p1 = new Partido(argentina, arabia, 1, 2);
        Partido p2 = new Partido(polonia, mexico, 0, 0);
        Partido p3 = new Partido(argentina, mexico, 2, 0);
        Partido p4 = new Partido(arabia, polonia, 0, 2);

        Ronda r1 = new Ronda(1);

        r1.agregarPartido(p1);
        r1.agregarPartido(p2);
        r1.agregarPartido(p3);
        r1.agregarPartido(p4);

        Fase f1 = new Fase(1);

        f1.agregarRonda(r1);

        this.agregarFase(f1);
    }

    private void agregarFase(Fase fase) {
		
    	for(Fase f : this.fases) {
    		if(f.getNumeroFase() == fase.getNumeroFase()) {
    			throw new RuntimeException("La fase ya existe");
    			
    		}
    	}
    	
		this.fases.add(fase);
	}
    

	private Equipo obtenerEquipo(String nombreEquipo) {

        Equipo equipo = null;

        for (Equipo e : this.equipos){
            if (e.getNombre().equals(nombreEquipo)){
                equipo = e;
            }
        }

        if (equipo == null){
            equipo = new Equipo(nombreEquipo);
            this.equipos.add(equipo);
        }

        return equipo;
    }

    public Fase obtenerFase(int numeroFase) {
        Fase fase = null;
        for (Fase f : this.fases){
            if (f.getNumeroFase() == numeroFase){
                fase = f;
            }
        }
        
        if (fase == null){
            throw new RuntimeException("La fase no existe"); // Hay que crear y enlazar nuestras excepciones
        }

        return fase;
    }
}
