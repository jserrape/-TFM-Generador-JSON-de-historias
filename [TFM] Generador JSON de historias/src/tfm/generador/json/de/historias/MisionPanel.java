/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tfm.generador.json.de.historias;

import javax.swing.JPanel;

/**
 *
 * @author Juanca
 */
public class MisionPanel extends JPanel {

    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextFieldI1;
    private javax.swing.JTextField jTextFieldLat1;
    private javax.swing.JTextField jTextFieldLon1;
    private javax.swing.JTextField jTextFieldN1;

    public MisionPanel() {
        super();

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldN1 = new javax.swing.JTextField();
        jTextFieldI1 = new javax.swing.JTextField();
        jTextFieldLat1 = new javax.swing.JTextField();
        jTextFieldLon1 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        jLabel2.setText("Nombre");

        jLabel3.setText("Icono");

        jLabel4.setText("Coordenadas");

        jLabel5.setText("Tipo");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[]{"Item 1", "Item 2", "Item 3", "Item 4"}));

        jLabel6.setText("Precedentes");

        jLabel7.setText("Texto");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout ThisLayout = new javax.swing.GroupLayout(this);
        this.setLayout(ThisLayout);
        ThisLayout.setHorizontalGroup(ThisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(ThisLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(ThisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jScrollPane1)
                                        .addGroup(ThisLayout.createSequentialGroup()
                                                .addGroup(ThisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(ThisLayout.createSequentialGroup()
                                                                .addGroup(ThisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jLabel2)
                                                                        .addComponent(jLabel3)
                                                                        .addComponent(jLabel4)
                                                                        .addComponent(jLabel5)
                                                                        .addComponent(jLabel6))
                                                                .addGap(26, 26, 26)
                                                                .addGroup(ThisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                        .addComponent(jTextField6)
                                                                        .addComponent(jTextFieldI1, javax.swing.GroupLayout.DEFAULT_SIZE, 284, Short.MAX_VALUE)
                                                                        .addComponent(jTextFieldN1)
                                                                        .addGroup(ThisLayout.createSequentialGroup()
                                                                                .addComponent(jTextFieldLat1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                                .addComponent(jTextFieldLon1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                        .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                                        .addComponent(jLabel7))
                                                .addContainerGap(516, Short.MAX_VALUE))))
        );
        
        ThisLayout.setVerticalGroup(ThisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ThisLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ThisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextFieldN1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ThisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextFieldI1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ThisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextFieldLat1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldLon1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ThisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ThisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE))
        );

    }
}
