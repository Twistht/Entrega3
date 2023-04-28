package org.example;

import utilidades.LectorCSV;
import utilidades.MySQL;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;


public class MySQLConnector {
	
    public static void main(String[] args) throws ClassNotFoundException {
        LectorCSV lec= new LectorCSV();
        MySQL sql= new MySQL();
        ArrayList<ResultadosCSV> resultados = lec.obtenerResPar();
        for (int x = 0; x < resultados.size(); x++) {
            ResultadosCSV resultado = resultados.get(x);
            System.out.println("ID: "+resultado.getIDres()+" ID ronda: "+resultado.getRondaN()+" equipo1: "+resultado.getEq1Nom()+"goles "+resultado.getEq1CantG()+" | "+resultado.getEq2CantG()+" goles "+resultado.getEq2Nom()+" :equipo2");
        }
        ArrayList<PuntajesCSV> puntaje = lec.obtenerPun();
        for (int x = 0; x < puntaje.size(); x++) {
            PuntajesCSV puntajes = puntaje.get(x);
            System.out.println("id "+puntajes.getID()+" ronda "+puntajes.getRonda()+" part1 "+puntajes.getPart1()+" puntaje "+puntajes.getPunt1()+" part2 "+puntajes.getPart2()+" puntaje: "+puntajes.getPunt2());
        }

        //AgregarDatos("INSERT INTO `entrega3`.`resultados` (`ronda`, `equipo1`, `cant_goles1`, `cant_goles2`, `equipo2`) VALUES ('2', 'Polonia', '1', '2', 'Australia');");
        sql.MostrarDatos("SELECT * FROM entrega3.participantes_puntaje;");
        sql.MostrarDatos("SELECT id_pronosticos, ronda, participante, equipo1, COALESCE(gana1, '') AS gana1, COALESCE(empata, '') AS empata, COALESCE(gana2, '') AS gana2, equipo2 FROM pronosticos;");
        
        //"SELECT id_pronosticos, ronda, participante, equipo1, COALESCE(gana1, '') AS gana1, COALESCE(empata, '') AS empata, COALESCE(gana2, '') AS gana2, equipo2 FROM pronosticos; "
       
    }
    private static void ConectarSql(){

    }
  }