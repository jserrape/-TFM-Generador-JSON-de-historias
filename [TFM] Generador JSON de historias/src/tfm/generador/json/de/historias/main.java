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
        Interfaz interf = new Interfaz();
        interf.setVisible(true);

//        JSONArray historias= new JSONArray();
//        
//        JSONObject coordenadas = new JSONObject();
//        coordenadas.put("Longitud", "5.265225");
//        coordenadas.put("Latitud", "-5.2541848");
//        JSONArray precedentes = new JSONArray();
//        precedentes.put("16");
//        precedentes.put("5");
//        precedentes.put("1");
//        Mision m1 = new Mision("nom", "ic", "tip", "text",coordenadas,precedentes);  
//        Mision m2 = new Mision("nom", "ic", "tip", "text",coordenadas,precedentes);
//        
//        historias.put(m1.crearJson());
//        historias.put(m2.crearJson());
//        System.out.println(historias.toString());
//        
//        QR q = new QR();
//        q.generarQR("Soy una url", "imagenqr");
    }

}
