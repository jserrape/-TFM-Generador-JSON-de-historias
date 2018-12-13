/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tfm.generador.json.de.historias;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;
import org.json.JSONArray;

/**
 *
 * @author Juanca
 */
public class MisionPanel extends JPanel {

    private final javax.swing.JComboBox<String> comboTipo;
    private final javax.swing.JLabel jLabel2;
    private final javax.swing.JLabel jLabel3;
    private final javax.swing.JLabel jLabel4;
    private final javax.swing.JLabel jLabel5;
    private final javax.swing.JLabel jLabel6;
    private final javax.swing.JLabel jLabel7;
    private final javax.swing.JLabel jLabel9;
    private final javax.swing.JScrollPane jScrollPane1;
    private final javax.swing.JTextArea texto;
    private final javax.swing.JTextField precedentes;
    private final javax.swing.JTextField icono;
    private final javax.swing.JTextField latitud;
    private final javax.swing.JTextField longitud;
    private final javax.swing.JTextField codigoTipo;
    private final javax.swing.JTextField nombre;
    private final javax.swing.JTextField pistaAudio;

    private final String codigo;

    public MisionPanel(String cod) {
        super();

        this.codigo = cod;
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        nombre = new javax.swing.JTextField();
        icono = new javax.swing.JTextField();
        latitud = new javax.swing.JTextField();
        longitud = new javax.swing.JTextField();
        comboTipo = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        precedentes = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        texto = new javax.swing.JTextArea();
        codigoTipo = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        pistaAudio = new javax.swing.JTextField();

        comboTipo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if ("QR".equals(comboTipo.getSelectedItem().toString())) {
                    codigoTipo.setEnabled(false);
                } else {
                    codigoTipo.setEnabled(true);
                }
            }
        });

        jLabel2.setText("Nombre");
        jLabel3.setText("Icono");
        jLabel4.setText("Coordenadas");
        jLabel5.setText("Tipo");
        nombre.setText("1");
        icono.setText("2");
        latitud.setText("3");
        longitud.setText("4");
        comboTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"QR", "Beacon"}));
        jLabel6.setText("Precedentes");
        precedentes.setText("5");
        jLabel7.setText("Texto");
        texto.setColumns(20);
        texto.setRows(5);
        jScrollPane1.setViewportView(texto);
        codigoTipo.setText(codigo);
        codigoTipo.setEnabled(false);
        jLabel9.setText("Pista de audio:");
        pistaAudio.setText("7");

        javax.swing.GroupLayout thisLayout = new javax.swing.GroupLayout(this);
        this.setLayout(thisLayout);
        thisLayout.setHorizontalGroup(thisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(thisLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(thisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jScrollPane1)
                                        .addGroup(thisLayout.createSequentialGroup()
                                                .addGroup(thisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(thisLayout.createSequentialGroup()
                                                                .addGroup(thisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jLabel2)
                                                                        .addComponent(jLabel3)
                                                                        .addComponent(jLabel4)
                                                                        .addComponent(jLabel5)
                                                                        .addComponent(jLabel6))
                                                                .addGap(26, 26, 26)
                                                                .addGroup(thisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                        .addComponent(precedentes)
                                                                        .addComponent(icono, javax.swing.GroupLayout.DEFAULT_SIZE, 284, Short.MAX_VALUE)
                                                                        .addComponent(nombre)
                                                                        .addGroup(thisLayout.createSequentialGroup()
                                                                                .addGroup(thisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                                                        .addComponent(comboTipo, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                                        .addComponent(latitud, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE))
                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                                .addGroup(thisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                        .addComponent(longitud, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                        .addComponent(codigoTipo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                                                .addGap(89, 89, 89)
                                                                .addComponent(jLabel9)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(pistaAudio))
                                                        .addComponent(jLabel7))
                                                .addGap(53, 53, 53))))
        );
        thisLayout.setVerticalGroup(thisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(thisLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(thisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel2)
                                        .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel9)
                                        .addComponent(pistaAudio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(thisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel3)
                                        .addComponent(icono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(thisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel4)
                                        .addComponent(latitud, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(longitud, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(thisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel5)
                                        .addComponent(comboTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(codigoTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(thisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel6)
                                        .addComponent(precedentes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE))
        );
    }

    /**
     * @return the comboTipo
     */
    public String getComboTipo() {
        return comboTipo.getSelectedItem().toString();
    }

    /**
     * @return the texto
     */
    public String getTexto() {
        return texto.getText();
    }

    /**
     * @return the precedentes
     */
    public JSONArray getPrecedentes() {
        String aux = precedentes.getText().replaceAll(" ", "");
        String[] parts = aux.split(",");
        JSONArray pre = new JSONArray();
        for (String part : parts) {
            pre.put(part);
        }
        return pre;
    }

    /**
     * @return the icono
     */
    public String getIcono() {
        return icono.getText();
    }

    /**
     * @return the latitud
     */
    public String getLatitud() {
        return latitud.getText();
    }

    /**
     * @return the longitud
     */
    public String getLongitud() {
        return longitud.getText();
    }

    /**
     * @return the codigoTipo
     */
    public String getCodigoTipo() {
        return codigoTipo.getText();
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre.getText();
    }

    /**
     * @return the codigo
     */
    public String getCodigo() {
        return codigo;
    }
    
    
    /**
     * @return the pistaAudio
     */
    public String getPistaAudio() {
        return pistaAudio.getText();
    }
}
