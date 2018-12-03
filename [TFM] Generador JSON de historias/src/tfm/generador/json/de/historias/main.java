/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tfm.generador.json.de.historias;

import java.io.IOException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 *
 * @author Juanca
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws JSONException, IOException {
        //DialogoCancion dia = new DialogoCancion();
        Interfaz interf = new Interfaz();
        interf.setVisible(true);

        JSONObject coordenadas = new JSONObject();
        coordenadas.put("Longitud", "5.265225");
        coordenadas.put("Latitud", "-5.2541848");
        
        JSONArray precedentes = new JSONArray();
        precedentes.put("16");
        precedentes.put("5");
        precedentes.put("1");
        
        Mision m = new Mision("nom", "ic", "tip", "text",coordenadas,precedentes);
        m.crearJson();
    }

}
