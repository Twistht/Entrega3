package utilidades;

import org.example.PuntajesCSV;
import org.example.ResultadosCSV;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class LectorCSV {
    public ArrayList<ResultadosCSV> obtenerResPar() {
        final String ruta = "C:\\Users\\Emi\\Desktop\\Entrega3ArProg\\entega3ARPROGconMetodos\\src\\ResultadosPartidos.txt";
        final String sep = ";";
        ArrayList<ResultadosCSV> Resultados = new ArrayList<>();
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
            fileReader = new FileReader(ruta);
            bufferedReader = new BufferedReader(fileReader);
            String linea;
            while ((linea = bufferedReader.readLine()) != null) {
                String[] vec = linea.split(sep);
                Resultados.add(new ResultadosCSV(Integer.valueOf(vec[0]), Integer.valueOf(vec[1]),vec[2],Integer.valueOf(vec[3]),Integer.valueOf(vec[4]),vec[4]));
            }
        } catch (IOException e) {
            System.out.println("Excepción leyendo archivo: " + e.getMessage());
        } finally {
            try {
                if (fileReader != null) {
                    fileReader.close();
                }
                if (bufferedReader != null) {
                    bufferedReader.close();
                }
            } catch (IOException e) {
                System.out.println("Excepción cerrando: " + e.getMessage());
            }
            return Resultados;
        }
    }
    public ArrayList<PuntajesCSV> obtenerPun(){
        final String ruta = "C:\\Users\\Emi\\Desktop\\Entrega3ArProg\\entega3ARPROGconMetodos\\src\\puntaje.csv";
        final String sep = ";";
        ArrayList<PuntajesCSV> puntaje = new ArrayList<>();
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
            fileReader = new FileReader(ruta);
            bufferedReader = new BufferedReader(fileReader);
            String linea;
            while ((linea = bufferedReader.readLine()) != null) {
                String[] vec = linea.split(sep);
                puntaje.add(new PuntajesCSV(Integer.valueOf(vec[0]), Integer.valueOf(vec[1]),vec[2],Integer.valueOf(vec[3]),vec[4],Integer.valueOf(vec[5])));
            }
        } catch (IOException e) {
            System.out.println("Excepción leyendo archivo: " + e.getMessage());
        } finally {
            try {
                if (fileReader != null) {
                    fileReader.close();
                }
                if (bufferedReader != null) {
                    bufferedReader.close();
                }
            } catch (IOException e) {
                System.out.println("Excepción cerrando: " + e.getMessage());
            }
            return puntaje;
        }
    }
}
