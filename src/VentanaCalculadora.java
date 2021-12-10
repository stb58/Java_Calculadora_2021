/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author sergi
 */
public class VentanaCalculadora extends javax.swing.JFrame {


    double operando1 = 0; //Guarda el primer número que metamos
    String operacion = ""; //Guarda la operación pulsada
    
    
    public VentanaCalculadora() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pantalla = new javax.swing.JLabel();
        boton07 = new javax.swing.JButton();
        boton08 = new javax.swing.JButton();
        boton09 = new javax.swing.JButton();
        boton04 = new javax.swing.JButton();
        boton05 = new javax.swing.JButton();
        boton06 = new javax.swing.JButton();
        boton01 = new javax.swing.JButton();
        boton02 = new javax.swing.JButton();
        boton03 = new javax.swing.JButton();
        boton00 = new javax.swing.JButton();
        botonDivision = new javax.swing.JButton();
        botonIgual = new javax.swing.JButton();
        botonSuma = new javax.swing.JButton();
        botonResta = new javax.swing.JButton();
        botonMultiplicacion = new javax.swing.JButton();
        botonUnoPartidodeX = new javax.swing.JButton();
        botonXelevadoados = new javax.swing.JButton();
        botonRaizCuadrada = new javax.swing.JButton();
        botonPorcentaje = new javax.swing.JButton();
        botonDecimal = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));

        pantalla.setBackground(new java.awt.Color(0, 0, 0));
        pantalla.setFont(new java.awt.Font("Consolas", 0, 36)); // NOI18N
        pantalla.setForeground(new java.awt.Color(0, 255, 0));
        pantalla.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        pantalla.setText("0");
        pantalla.setOpaque(true);

        boton07.setText("7");
        boton07.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton07ActionPerformed(evt);
            }
        });

        boton08.setText("8");
        boton08.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton08ActionPerformed(evt);
            }
        });

        boton09.setText("9");
        boton09.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton09ActionPerformed(evt);
            }
        });

        boton04.setText("4");
        boton04.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton04ActionPerformed(evt);
            }
        });

        boton05.setText("5");
        boton05.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton05ActionPerformed(evt);
            }
        });

        boton06.setText("6");
        boton06.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton06ActionPerformed(evt);
            }
        });

        boton01.setText("1");
        boton01.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton01ActionPerformed(evt);
            }
        });

        boton02.setText("2");
        boton02.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton02ActionPerformed(evt);
            }
        });

        boton03.setText("3");
        boton03.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton03ActionPerformed(evt);
            }
        });

        boton00.setText("0");
        boton00.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton00ActionPerformed(evt);
            }
        });

        botonDivision.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        botonDivision.setText("/");
        botonDivision.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonDivisionActionPerformed(evt);
            }
        });

        botonIgual.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        botonIgual.setText("=");
        botonIgual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonIgualActionPerformed(evt);
            }
        });

        botonSuma.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        botonSuma.setText("+");
        botonSuma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSumaActionPerformed(evt);
            }
        });

        botonResta.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        botonResta.setText("-");
        botonResta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRestaActionPerformed(evt);
            }
        });

        botonMultiplicacion.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        botonMultiplicacion.setText("*");
        botonMultiplicacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonMultiplicacionActionPerformed(evt);
            }
        });

        botonUnoPartidodeX.setText("1/x");
        botonUnoPartidodeX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonUnoPartidodeXActionPerformed(evt);
            }
        });

        botonXelevadoados.setText("xˆ2");
        botonXelevadoados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonXelevadoadosActionPerformed(evt);
            }
        });

        botonRaizCuadrada.setText("√");
        botonRaizCuadrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRaizCuadradaActionPerformed(evt);
            }
        });

        botonPorcentaje.setText("%");
        botonPorcentaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonPorcentajeActionPerformed(evt);
            }
        });

        botonDecimal.setText(".");
        botonDecimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonDecimalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(pantalla, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(boton04, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(boton05, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(boton06, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(boton01, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(boton02, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(boton03, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(boton00, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(botonIgual, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(botonDecimal))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(botonXelevadoados, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)
                                    .addComponent(boton07, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(6, 6, 6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(boton08, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(6, 6, 6)
                                        .addComponent(boton09, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(botonRaizCuadrada, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(botonPorcentaje, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(botonUnoPartidodeX, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botonMultiplicacion, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botonDivision, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botonSuma, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botonResta, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(175, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(pantalla, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botonXelevadoados, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonRaizCuadrada, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(botonPorcentaje, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(botonUnoPartidodeX, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(boton07, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boton08, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boton09, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonSuma, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(boton04, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boton05, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boton06, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonResta, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(boton01, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boton02, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boton03, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonDivision, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(boton00, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botonIgual, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(botonMultiplicacion, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(botonDecimal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(1, 1, 1))))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void boton07ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton07ActionPerformed
        String auxiliar = pantalla.getText();
        if (auxiliar.equals("0")) {
            pantalla.setText("7");
        } else {
            pantalla.setText(auxiliar + "7");
        }
    }//GEN-LAST:event_boton07ActionPerformed

    private void boton08ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton08ActionPerformed
        String auxiliar = pantalla.getText();
        if (auxiliar.equals("0")) {
            pantalla.setText("8");
        } else {
            pantalla.setText(auxiliar + "8");
        }
    }//GEN-LAST:event_boton08ActionPerformed

    private void boton09ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton09ActionPerformed
        String auxiliar = pantalla.getText();
        if (auxiliar.equals("0")) {
            pantalla.setText("9");
        } else {
            pantalla.setText(auxiliar + "9");
        }
    }//GEN-LAST:event_boton09ActionPerformed

    private void boton04ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton04ActionPerformed
        String auxiliar = pantalla.getText();
        if (auxiliar.equals("0")) {
            pantalla.setText("4");
        } else {
            pantalla.setText(auxiliar + "4");
        }
    }//GEN-LAST:event_boton04ActionPerformed

    private void boton05ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton05ActionPerformed
        String auxiliar = pantalla.getText();
        if (auxiliar.equals("0")) {
            pantalla.setText("5");
        } else {
            pantalla.setText(auxiliar + "5");
        }
    }//GEN-LAST:event_boton05ActionPerformed

    private void boton06ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton06ActionPerformed
        String auxiliar = pantalla.getText();
        if (auxiliar.equals("0")) {
            pantalla.setText("6");
        } else {
            pantalla.setText(auxiliar + "6");
        }
    }//GEN-LAST:event_boton06ActionPerformed

    private void boton01ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton01ActionPerformed
        String auxiliar = pantalla.getText();
        if (auxiliar.equals("0")) {
            pantalla.setText("1");
        } else {
            pantalla.setText(auxiliar + "1");
        }
    }//GEN-LAST:event_boton01ActionPerformed

    private void boton02ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton02ActionPerformed
        String auxiliar = pantalla.getText();
        if (auxiliar.equals("2")) {
            pantalla.setText("7");
        } else {
            pantalla.setText(auxiliar + "2");
        }
    }//GEN-LAST:event_boton02ActionPerformed

    private void boton03ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton03ActionPerformed
        String auxiliar = pantalla.getText();
        if (auxiliar.equals("0")) {
            pantalla.setText("3");
        } else {
            pantalla.setText(auxiliar + "3");
        }
    }//GEN-LAST:event_boton03ActionPerformed

    private void boton00ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton00ActionPerformed
        String auxiliar = pantalla.getText();
        if (auxiliar.equals("0")) {
            pantalla.setText("0");
        } else {
            pantalla.setText(auxiliar + "0");
        }
    }//GEN-LAST:event_boton00ActionPerformed

    private void botonDivisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonDivisionActionPerformed
       operacion = "/";
       //Double.valueOf convierte un string en su equivalente numerico
       operando1 = Double.valueOf(pantalla.getText());
       //Reseteo la pantalla
       pantalla.setText("0");
       
    }//GEN-LAST:event_botonDivisionActionPerformed

    private void botonIgualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonIgualActionPerformed
        double operando2 = Double.valueOf(pantalla.getText());
        if (operacion.equals("+")){
            operando1 = operando1 + operando2;
            
        }
        if (operacion.equals("-")){
            operando1 = operando1 - operando2;
            
        }
        if (operacion.equals("/")){
            operando1 = operando1 / operando2;
            
        }
        if (operacion.equals("*")){
            operando1 = operando1 * operando2;
            
        }
        pantalla.setText("" + operando1);
        
    }//GEN-LAST:event_botonIgualActionPerformed

    private void botonSumaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSumaActionPerformed
       operacion = "+";
       //Double.valueOf convierte un string en su equivalente numerico
       operando1 = Double.valueOf(pantalla.getText());
       //Reseteo la pantalla
       pantalla.setText("0");
    }//GEN-LAST:event_botonSumaActionPerformed

    private void botonRestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRestaActionPerformed
       operacion = "-";
       //Double.valueOf convierte un string en su equivalente numerico
       operando1 = Double.valueOf(pantalla.getText());
       //Reseteo la pantalla
       pantalla.setText("0");
    }//GEN-LAST:event_botonRestaActionPerformed

    private void botonMultiplicacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonMultiplicacionActionPerformed
       operacion = "*";
       //Double.valueOf convierte un string en su equivalente numerico
       operando1 = Double.valueOf(pantalla.getText());
       //Reseteo la pantalla
       pantalla.setText("0");
    }//GEN-LAST:event_botonMultiplicacionActionPerformed

    private void botonUnoPartidodeXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonUnoPartidodeXActionPerformed
       operando1 = Double.valueOf(pantalla.getText());
       pantalla.setText("" + 1/operando1);
    }//GEN-LAST:event_botonUnoPartidodeXActionPerformed

    private void botonXelevadoadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonXelevadoadosActionPerformed
       operando1 = Double.valueOf(pantalla.getText());
       pantalla.setText("" + operando1*operando1);
    }//GEN-LAST:event_botonXelevadoadosActionPerformed

    private void botonPorcentajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonPorcentajeActionPerformed
       operando1 = Double.valueOf(pantalla.getText());
       pantalla.setText("" + operando1/100);
    }//GEN-LAST:event_botonPorcentajeActionPerformed

    private void botonRaizCuadradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRaizCuadradaActionPerformed
       operando1 = Double.valueOf(pantalla.getText());
       pantalla.setText("" + Math.sqrt(operando1));
    }//GEN-LAST:event_botonRaizCuadradaActionPerformed

    private void botonDecimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonDecimalActionPerformed
       operando1 = Double.valueOf(pantalla.getText());
       int operando3 = (int) operando1;
       pantalla.setText(operando3 + ".");
    }//GEN-LAST:event_botonDecimalActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VentanaCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaCalculadora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boton00;
    private javax.swing.JButton boton01;
    private javax.swing.JButton boton02;
    private javax.swing.JButton boton03;
    private javax.swing.JButton boton04;
    private javax.swing.JButton boton05;
    private javax.swing.JButton boton06;
    private javax.swing.JButton boton07;
    private javax.swing.JButton boton08;
    private javax.swing.JButton boton09;
    private javax.swing.JButton botonDecimal;
    private javax.swing.JButton botonDivision;
    private javax.swing.JButton botonIgual;
    private javax.swing.JButton botonMultiplicacion;
    private javax.swing.JButton botonPorcentaje;
    private javax.swing.JButton botonRaizCuadrada;
    private javax.swing.JButton botonResta;
    private javax.swing.JButton botonSuma;
    private javax.swing.JButton botonUnoPartidodeX;
    private javax.swing.JButton botonXelevadoados;
    private javax.swing.JLabel pantalla;
    // End of variables declaration//GEN-END:variables
}
