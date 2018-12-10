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
public class Mision extends JSONObject {

    private final String codigo;
    private final String nombre;
    private final String icono;
    private final JSONObject coordenadas;
    private final JSONObject tipo;
    private final JSONArray precedentes;
    private final String texto;

    private final boolean qr;

    public Mision(String cod, String n, String i, JSONObject ti, String te, JSONObject coor, JSONArray prec, boolean qr) {
        this.codigo = cod;
        this.nombre = n;
        this.icono = i;
        this.tipo = ti;
        this.texto = te;
        this.coordenadas = coor;
        this.precedentes = prec;
        this.qr = qr;
    }

    public JSONObject crearJson() throws JSONException, IOException {
        JSONObject obj = new JSONObject();
        obj.put("Codigo", codigo);
        obj.put("Nombre", nombre);
        obj.put("Icono", icono);
        obj.put("Tipo", tipo);
        obj.put("Texto", texto);
        obj.put("Coordenadas", coordenadas);
        obj.put("Precedentes", precedentes);

        if (qr) {
            QR q = new QR();
            q.generarQR(codigo, codigo + "_" + nombre);
        }
        
        return obj;
    }

}
