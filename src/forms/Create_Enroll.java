/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package forms;

import Model.ModelEnroll;
import Model.ModelStudent;
import Service.ServiceEnroll;
import Service.ServiceStudent;

/**
 *
 * @author luniz
 */
public class Create_Enroll extends javax.swing.JPanel {

    /**
     * Creates new form Create
     */
    public Create_Enroll() {
        initComponents();
    }

    public void loadData(ServiceEnroll service, ModelEnroll data) {

        if (data != null) {
            PK.setText(String.valueOf(data.getEnrollment_no()));
            PK.setEditable(false);
            PK.setEnabled(false);
            txtCC.setText(data.getCourse_code());
            txtCC.setEditable(false);
            txtCC.setEnabled(false);
            txtDT.setText(data.getDesc_title());
            txtDT.setEditable(false);
            txtDT.setEnabled(false);
            txtU.setText(data.getUnits());
            txtU.setEditable(false);
            txtU.setEnabled(false);
            comboSem.setSelectedItem(data.getSemester());
            txtSY.setText(data.getSchoolyear());

        }

    }

    public ModelEnroll getData() {
        int enrollment_no = Integer.parseInt(PK.getText().trim());
        String course_code = txtCC.getText().trim().toUpperCase();
        String desc_title = txtDT.getText().trim().toUpperCase();
        String units = txtU.getText().trim().toUpperCase();
        String semester = comboSem.getSelectedItem().toString();
        String schoolyear = txtSY.getText().trim().toUpperCase();

        return new ModelEnroll(enrollment_no, course_code, desc_title, units, semester, schoolyear);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PK = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtCC = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtDT = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtU = new javax.swing.JTextField();
        Courselb = new javax.swing.JLabel();
        Majorlb = new javax.swing.JLabel();
        txtSY = new javax.swing.JTextField();
        comboSem = new javax.swing.JComboBox<>();

        PK.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel2.setText("Course Code");

        txtCC.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel3.setText("Descriptive Title");

        txtDT.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel4.setText("Units");

        txtU.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N

        Courselb.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        Courselb.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        Courselb.setText("Semester");

        Majorlb.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        Majorlb.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        Majorlb.setText("School Year");

        txtSY.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N

        comboSem.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        comboSem.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1st Semester", "2nd Semester", "Short Term" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(Courselb)
                    .addComponent(Majorlb))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCC)
                    .addComponent(txtDT)
                    .addComponent(txtU)
                    .addComponent(comboSem, 0, 245, Short.MAX_VALUE)
                    .addComponent(txtSY)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(PK, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(22, 22, 22))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(PK, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCC, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDT, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtU, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboSem, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Courselb))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Majorlb)
                    .addComponent(txtSY, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(91, 91, 91))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {PK, comboSem, txtCC, txtDT, txtSY, txtU});

    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Courselb;
    private javax.swing.JLabel Majorlb;
    private javax.swing.JTextField PK;
    private javax.swing.JComboBox<Object> comboSem;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField txtCC;
    private javax.swing.JTextField txtDT;
    private javax.swing.JTextField txtSY;
    private javax.swing.JTextField txtU;
    // End of variables declaration//GEN-END:variables
}
