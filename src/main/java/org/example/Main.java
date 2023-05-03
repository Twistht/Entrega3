package org.example;

import org.example.modelo.Persona;
import org.example.modelo.Pronostico;
import org.example.utilidades.LectorCSV;
import org.example.utilidades.LectorDB;

public class Main {
    public static void main(String[] args) {

    	Integer puntajePorPartido = 2;
    	Integer puntajeExtraRonda = 10;
    	Integer puntajeExtraFase = 20;
    	
        LectorCSV lectorCSV = new LectorCSV();
        lectorCSV.levantarResultados();

        LectorDB lectorDB = new LectorDB(lectorCSV);
        lectorDB.levantarPronosticos();

        calcularPuntos(lectorDB, puntajePorPartido, puntajeExtraRonda, puntajeExtraFase);


    }

	private static void calcularPuntos(LectorDB lectorDB,Integer puntajePorPartido, Integer puntajeExtraRonda,Integer puntajeExtraFase) {
		
		for(Pronostico p : lectorDB.getPronosticos()) {
			if(p.fueAcertado()) {
				p.getPersona().sumarPuntos(puntajePorPartido);
				p.getPersona().agregarAcierto();
			}
		}
		
		for(Persona p : lectorDB.getPersonas()) {
			//for(cada ronda : todas las rondas existente)){
			//if(lectorDB.acertoTodosLosPronosticosRonda(p, ronda)) {
			//p.sumarPuntos(puntajeExtraRonda);
	
//         }
			
//		  }	
			//for(cada fase : todas las fases existente)){
			//if(lectorDB.acertoTodosLosPronosticosFase(p, fase)) {
			//p.sumarPuntos(puntajeExtraFase);
	
//         }
			
//		  }	
			
	    }
		
		for(Persona p : lectorDB.getPersonas()) {
			System.out.println("Nombre: " + p.getNombre());
			System.out.println("Aciertos: " + p.getCantAciertos());
			System.out.println("Puntaje: " + p.getPuntaje());
			System.out.println("----------------------------------------------: ");
		}
	}
}