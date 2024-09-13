package actividad6;

import java.awt.Color;
import static actividad6.Agregar.AgregarContacto;
import static actividad6.Mostrar.MostrarContactos;
import static actividad6.Actualizar.ActualizarContacto;
import static actividad6.Eliminar.EliminarContacto;

public class VentanaPrincipal extends javax.swing.JFrame {
    private String[] datos;
    
    public VentanaPrincipal() {
        datos = new String[2];
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dialogContactos = new javax.swing.JDialog();
        panelDialog = new javax.swing.JPanel();
        etqTitulo = new javax.swing.JLabel();
        botonOK = new javax.swing.JButton();
        spDialog = new javax.swing.JScrollPane();
        resultado = new javax.swing.JTextArea();
        panelJFrame = new javax.swing.JPanel();
        etqNombre = new javax.swing.JLabel();
        campoNombre = new javax.swing.JTextField();
        etqNumero = new javax.swing.JLabel();
        campoNumero = new javax.swing.JTextField();
        panelBotones = new javax.swing.JPanel();
        botonMostrar = new javax.swing.JButton();
        botonEliminar = new javax.swing.JButton();
        botonLimpiar = new javax.swing.JButton();
        botonAgregar = new javax.swing.JButton();
        botonActualizar = new javax.swing.JButton();

        dialogContactos.setResizable(false);
        dialogContactos.setSize(new java.awt.Dimension(260, 195));

        panelDialog.setPreferredSize(new java.awt.Dimension(260, 195));
        panelDialog.setSize(new java.awt.Dimension(260, 195));

        etqTitulo.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        etqTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        botonOK.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        botonOK.setText("OK");
        botonOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonOKActionPerformed(evt);
            }
        });

        resultado.setEditable(false);
        resultado.setBackground(new java.awt.Color(255, 255, 255));
        resultado.setColumns(20);
        resultado.setFont(new java.awt.Font("Times New Roman", 2, 14)); // NOI18N
        resultado.setLineWrap(true);
        resultado.setRows(5);
        resultado.setWrapStyleWord(true);
        resultado.setSize(new java.awt.Dimension(230, 80));
        spDialog.setViewportView(resultado);

        javax.swing.GroupLayout panelDialogLayout = new javax.swing.GroupLayout(panelDialog);
        panelDialog.setLayout(panelDialogLayout);
        panelDialogLayout.setHorizontalGroup(
            panelDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDialogLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(panelDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(etqTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonOK)
                    .addComponent(spDialog, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15))
        );
        panelDialogLayout.setVerticalGroup(
            panelDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDialogLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(etqTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(spDialog, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(botonOK)
                .addGap(10, 10, 10))
        );

        javax.swing.GroupLayout dialogContactosLayout = new javax.swing.GroupLayout(dialogContactos.getContentPane());
        dialogContactos.getContentPane().setLayout(dialogContactosLayout);
        dialogContactosLayout.setHorizontalGroup(
            dialogContactosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dialogContactosLayout.createSequentialGroup()
                .addComponent(panelDialog, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        dialogContactosLayout.setVerticalGroup(
            dialogContactosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelDialog, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Contactos");

        etqNombre.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        etqNombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etqNombre.setText("Nombre del contacto");

        campoNombre.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        campoNombre.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        campoNombre.setSize(new java.awt.Dimension(78, 25));

        etqNumero.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        etqNumero.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etqNumero.setText("Número del contacto");

        campoNumero.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        campoNumero.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        campoNumero.setSize(new java.awt.Dimension(78, 25));

        botonMostrar.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        botonMostrar.setForeground(new java.awt.Color(0, 51, 153));
        botonMostrar.setText("Mostrar");
        botonMostrar.setToolTipText("<html><b>Mostrar todos los contactos</b></html>");
        botonMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonMostrarActionPerformed(evt);
            }
        });

        botonEliminar.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        botonEliminar.setForeground(new java.awt.Color(153, 0, 0));
        botonEliminar.setText("Eliminar");
        botonEliminar.setToolTipText("<html><b>Eliminar contacto</b>\n<br>Ingresar el nombre del contacto a eliminar.<br></html>");
        botonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEliminarActionPerformed(evt);
            }
        });

        botonLimpiar.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        botonLimpiar.setForeground(new java.awt.Color(153, 0, 153));
        botonLimpiar.setText("Limpiar");
        botonLimpiar.setToolTipText("<html><b>Limpiar todos los campos</b></html>");
        botonLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonLimpiarActionPerformed(evt);
            }
        });

        botonAgregar.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        botonAgregar.setForeground(new java.awt.Color(0, 102, 102));
        botonAgregar.setText("Agregar");
        botonAgregar.setToolTipText("<html><b>Agregar contacto</b>\n<br>Ingresar nombre y número del nuevo contacto.<br></html>");
        botonAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAgregarActionPerformed(evt);
            }
        });

        botonActualizar.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        botonActualizar.setForeground(new java.awt.Color(0, 102, 0));
        botonActualizar.setText("Actualizar");
        botonActualizar.setToolTipText("<html><b>Actualizar contacto</b>\n<br>Ingresar el nombre y el nuevo número del contacto.<br></html>");
        botonActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonActualizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelBotonesLayout = new javax.swing.GroupLayout(panelBotones);
        panelBotones.setLayout(panelBotonesLayout);
        panelBotonesLayout.setHorizontalGroup(
            panelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBotonesLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(panelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botonActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonMostrar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0))
        );

        panelBotonesLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {botonActualizar, botonAgregar, botonEliminar, botonLimpiar, botonMostrar});

        panelBotonesLayout.setVerticalGroup(
            panelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBotonesLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(botonAgregar)
                .addGap(5, 5, 5)
                .addComponent(botonMostrar)
                .addGap(5, 5, 5)
                .addComponent(botonActualizar)
                .addGap(5, 5, 5)
                .addComponent(botonEliminar)
                .addGap(5, 5, 5)
                .addComponent(botonLimpiar)
                .addGap(5, 5, 5))
        );

        panelBotonesLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {botonActualizar, botonAgregar, botonEliminar, botonLimpiar, botonMostrar});

        javax.swing.GroupLayout panelJFrameLayout = new javax.swing.GroupLayout(panelJFrame);
        panelJFrame.setLayout(panelJFrameLayout);
        panelJFrameLayout.setHorizontalGroup(
            panelJFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelJFrameLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(panelJFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(etqNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etqNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addComponent(panelBotones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );
        panelJFrameLayout.setVerticalGroup(
            panelJFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelJFrameLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(panelJFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(panelBotones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panelJFrameLayout.createSequentialGroup()
                        .addComponent(etqNombre)
                        .addGap(5, 5, 5)
                        .addComponent(campoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25)
                        .addComponent(etqNumero)
                        .addGap(5, 5, 5)
                        .addComponent(campoNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(15, 15, 15))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelJFrame, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelJFrame, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAgregarActionPerformed
        datos[0] = campoNombre.getText();
        datos[1] = campoNumero.getText();
        AgregarContacto(datos);
        etqTitulo.setForeground(new Color (0,102,102));
        resultado.setForeground(new Color (0,102,102));
        etqTitulo.setText("Agregar contacto");
        resultado.setText(Agregar.mensaje);
        dialogContactos.setVisible(true);
    }//GEN-LAST:event_botonAgregarActionPerformed

    private void botonMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonMostrarActionPerformed
        MostrarContactos();
        etqTitulo.setForeground(new Color (0,51,153));
        resultado.setForeground(new Color (0,51,153));
        etqTitulo.setText("Mostrar contactos");
        resultado.setText(Mostrar.mensaje);
        dialogContactos.setVisible(true);
    }//GEN-LAST:event_botonMostrarActionPerformed

    private void botonActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonActualizarActionPerformed
        datos[0] = campoNombre.getText();
        datos[1] = campoNumero.getText();
        ActualizarContacto(datos);
        etqTitulo.setForeground(new Color (0,102,0));
        resultado.setForeground(new Color (0,102,0));
        etqTitulo.setText("Actualizar contacto");
        resultado.setText(Actualizar.mensaje);
        dialogContactos.setVisible(true);
    }//GEN-LAST:event_botonActualizarActionPerformed

    private void botonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEliminarActionPerformed
        datos[0] = campoNombre.getText();
        EliminarContacto(datos[0]);
        etqTitulo.setForeground(new Color (153,0,0));
        resultado.setForeground(new Color (153,0,0));
        etqTitulo.setText("Eliminar contacto");
        resultado.setText(Eliminar.mensaje);
        dialogContactos.setVisible(true);
    }//GEN-LAST:event_botonEliminarActionPerformed

    private void botonLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonLimpiarActionPerformed
        campoNombre.setText("");
        campoNumero.setText("");
    }//GEN-LAST:event_botonLimpiarActionPerformed

    private void botonOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonOKActionPerformed
        dialogContactos.setVisible(false);
    }//GEN-LAST:event_botonOKActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonActualizar;
    private javax.swing.JButton botonAgregar;
    private javax.swing.JButton botonEliminar;
    private javax.swing.JButton botonLimpiar;
    private javax.swing.JButton botonMostrar;
    private javax.swing.JButton botonOK;
    private javax.swing.JTextField campoNombre;
    private javax.swing.JTextField campoNumero;
    private javax.swing.JDialog dialogContactos;
    private javax.swing.JLabel etqNombre;
    private javax.swing.JLabel etqNumero;
    private javax.swing.JLabel etqTitulo;
    private javax.swing.JPanel panelBotones;
    private javax.swing.JPanel panelDialog;
    private javax.swing.JPanel panelJFrame;
    private javax.swing.JTextArea resultado;
    private javax.swing.JScrollPane spDialog;
    // End of variables declaration//GEN-END:variables
}
