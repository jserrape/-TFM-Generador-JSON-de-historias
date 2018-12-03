/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tfm.generador.json.de.historias;

import java.io.FileWriter;
import java.io.IOException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 *
 * @author Juanca
 */
public class Mision extends JSONObject {

    private final String nombre;
    private final String icono;
    private final JSONObject coordenadas;
    private final String tipo;
    private final JSONArray precedentes;
    private final String texto;

    public Mision(String n, String i, String ti, String te, JSONObject coor, JSONArray prec) {
        this.nombre = n;
        this.icono = i;
        this.tipo = ti;
        this.texto = te;
        this.coordenadas = coor;
        this.precedentes = prec;
    }

    public JSONObject crearJson() throws JSONException, IOException {
        JSONObject obj = new JSONObject();
        obj.put("Nombre", nombre);
        obj.put("Icono", icono);
        obj.put("Tipo", tipo);
        obj.put("Texto", texto);
        obj.put("Coordenadas", coordenadas);
        obj.put("Precedentes", precedentes);

        /*
        try {

            FileWriter file = new FileWriter("prueba.json");
            //ObjectMapper mapper = new ObjectMapper();
            //String jsonString = mapper.writeValueAsString(obj);
            file.write(obj.toString());
            file.flush();
            file.close();

        } catch (IOException e) {
            //manejar error
        }

        System.out.print(obj.toString());*/
        return obj;
    }

}
