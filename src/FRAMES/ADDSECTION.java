/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FRAMES;

import FRAMES.CLASSES.RegexChecker;
import FRAMES.PrintFrame.Room_Print;
import FRAMES.PrintFrame.Section_Print;
import cs_system.DB_class.Add_Room;
import cs_system.DB_class.Add_Section;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

/**
 *
 * @author monica hancock
 */
public class ADDSECTION extends javax.swing.JFrame {

    String Start1;
    String Day;
    String End1;
    String Room;

    /**
     * Creates new form ADDSECTION
     */
    public ADDSECTION() {
        initComponents();
        DELETE.setVisible(false);
        UPDATE.setVisible(false);

        new Add_Section().DisplayData(jTable2);
        if (!new Add_Section().Section_Loader(SECTION)) {
            SECTION.removeAllItems();
            SECTION.insertItemAt("--SECTION--", 0);
            SECTION.setSelectedIndex(0);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        SUBJECT_CODE = new javax.swing.JTextField();
        DESCRIPTION = new javax.swing.JTextField();
        DEPARTMENT = new javax.swing.JTextField();
        SUNITS = new javax.swing.JTextField();
        TUNITS = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        NUMBEROFSTUDENT = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        REMARK = new javax.swing.JTextField();
        DELETE = new javax.swing.JButton();
        DAY = new javax.swing.JComboBox<>();
        END = new javax.swing.JComboBox<>();
        ADD = new javax.swing.JButton();
        UPDATE = new javax.swing.JButton();
        RESET = new javax.swing.JButton();
        SECTION = new javax.swing.JComboBox<>();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        search = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 102));
        jPanel1.setForeground(new java.awt.Color(0, 0, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(SUBJECT_CODE, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 80, 270, 30));
        jPanel1.add(DESCRIPTION, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 130, 270, 30));
        jPanel1.add(DEPARTMENT, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 180, 270, 30));
        jPanel1.add(SUNITS, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 230, 270, 30));
        jPanel1.add(TUNITS, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 280, 270, 30));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 0));
        jLabel1.setText("AVAILABLE SCHEDULES");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 360, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 0));
        jLabel2.setText("SECTION");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 10, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 0));
        jLabel3.setText("SUBJECT CODE");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 60, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 0));
        jLabel4.setText("DESCRIPTION");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 110, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 0));
        jLabel5.setText("DEPARTMENT");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 160, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 0));
        jLabel6.setText("S UNITS");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 210, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 0));
        jLabel7.setText("T UNITS");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 260, -1, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 0));
        jLabel10.setText("DAYS");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 310, -1, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 0));
        jLabel11.setText("NUMBER OF STUDENT");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 420, -1, -1));
        jPanel1.add(NUMBEROFSTUDENT, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 440, 270, 30));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 0));
        jLabel12.setText("REMARK");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 470, -1, -1));
        jPanel1.add(REMARK, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 500, 270, 30));

        DELETE.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        DELETE.setText("DELETE");
        DELETE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DELETEActionPerformed(evt);
            }
        });
        jPanel1.add(DELETE, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 610, 140, 30));

        DAY.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "DAY", "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY", "SUNDAY", " " }));
        DAY.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DAYActionPerformed(evt);
            }
        });
        jPanel1.add(DAY, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 330, 270, 30));

        END.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ENDActionPerformed(evt);
            }
        });
        jPanel1.add(END, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 380, 270, 30));

        ADD.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ADD.setText("ADD");
        ADD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ADDActionPerformed(evt);
            }
        });
        jPanel1.add(ADD, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 530, 140, 30));

        UPDATE.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        UPDATE.setText("UPDATE");
        UPDATE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UPDATEActionPerformed(evt);
            }
        });
        jPanel1.add(UPDATE, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 530, 140, 30));

        RESET.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        RESET.setText("RESET");
        RESET.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RESETActionPerformed(evt);
            }
        });
        jPanel1.add(RESET, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 570, 140, 30));

        SECTION.setToolTipText("Section");
        SECTION.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SECTIONActionPerformed(evt);
            }
        });
        jPanel1.add(SECTION, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, 270, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 440, 650));

        jScrollPane4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 153), 3));
        jScrollPane4.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        jScrollPane4.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "SECTION", "SUBJECT CODE", "DESCRIPTION", "DEPARTMENT", "S UNITS", "T UNITS", "DAYS", "START TIME", "END TIME", "ROOM", "NUMBER OF STUDENTS", "REMARKS"
            }
        ));
        jTable2.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(jTable2);

        getContentPane().add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 100, 790, 640));

        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });
        getContentPane().add(search, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 50, 570, 40));

        jButton3.setBackground(new java.awt.Color(0, 0, 153));
        jButton3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("SEARCH");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 50, 150, 40));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGE/exit-2.png"))); // NOI18N
        jButton1.setText("BACK");
        jButton1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 160, 60));

        jButton2.setText("EXPORT DATA");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 10, -1, -1));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGE/BACKFORADDSECTION - Copy.jpg"))); // NOI18N
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 1000));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void DELETEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DELETEActionPerformed
        Add_Section AS = new Add_Section();
        Add_Room AR = new Add_Room();
        int action = JOptionPane.showConfirmDialog(this, "This action cannot be undone.", "Confirm delete", JOptionPane.OK_OPTION);
        if (action == 0) {
            String password = JOptionPane.showInputDialog("Enter your password to proceed this process");
            if (AR.ValidateDelete(password)) {
                if (AS.DeleteData(DAY.getSelectedItem().toString(), Start1, End1, Room) == 1) {
                    if (AS.updateRoom(DAY.getSelectedItem().toString(), Start1, End1, Room) == 1) {
                        JOptionPane.showMessageDialog(this, "Data deleted successfully");
                        AS.DisplayData(jTable2);
                       AS.Section_Loader(SECTION);
                        SUBJECT_CODE.setText("");
                        DESCRIPTION.setText("");
                        DEPARTMENT.setText("");

                        TUNITS.setText("");

                        SUNITS.setText("");

                        DAY.setSelectedIndex(0);

                        NUMBEROFSTUDENT.setText("");
                        END.removeAllItems();
                        REMARK.setText("");
                        ADD.setVisible(true);
                        UPDATE.setVisible(false);
                        DELETE.setVisible(false);
                    } else {
                        JOptionPane.showMessageDialog(this, "Error:Cannot delete data.Please contact support.1");
                    }

                } else {
                    JOptionPane.showMessageDialog(this, "Error:Cannot delete data.Please contact support.2");
                }

            } else {
                JOptionPane.showMessageDialog(this, "Error:Wrong password.Please try again.");
            }
        }

    }//GEN-LAST:event_DELETEActionPerformed

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        Add_Section AS = new Add_Section();
        if (!AS.SearchSection(jTable2, search.getText())) {
            JOptionPane.showMessageDialog(this, "No data associated with " + search.getText());
        } else {

        }

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        new DASHBOARD().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void ENDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ENDActionPerformed
        if (!DAY.getSelectedItem().toString().equals("DAY")) {

            String rem = new Add_Section().Load_Data(END.getSelectedItem().toString(), DAY.getSelectedItem().toString());
            REMARK.setText(rem);
        } else {

        }


    }//GEN-LAST:event_ENDActionPerformed

    private void ADDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ADDActionPerformed
        Add_Section AS = new Add_Section();
        RegexChecker rc = new RegexChecker();

        if (SECTION.getSelectedIndex() == 0
                || SUBJECT_CODE.getText().isEmpty()
                || DESCRIPTION.getText().isEmpty()
                || DEPARTMENT.getText().isEmpty()
                || SUNITS.getText().isEmpty()
                || TUNITS.getText().isEmpty()
                || DAY.getSelectedItem().equals("DAY")
                || END.getItemCount() == 0
                || NUMBEROFSTUDENT.getText().isEmpty()
                || REMARK.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Error:Empty field is not allowed");
        } else if (rc.Checkdata(SUNITS.getText())
                || rc.Checkdata(TUNITS.getText())
                || rc.Checkdata(NUMBEROFSTUDENT.getText())) {

            JOptionPane.showMessageDialog(this, "Non numerical characters are not allowed in S UNITS,T UNITS AND NUMBER OF STUDENTS.");

        } else {
            int action = JOptionPane.showConfirmDialog(this, "Are you sure you want to add this data?", "Confirm Action", JOptionPane.OK_OPTION);
            if (action == 0) {

                AS.Splitter(END.getSelectedItem().toString());
                int result = AS.AddData(
                        SECTION.getSelectedItem().toString(), SUBJECT_CODE.getText(), DESCRIPTION.getText(),
                        DEPARTMENT.getText(),
                        TUNITS.getText(),
                        SUNITS.getText(),
                        DAY.getSelectedItem().toString(),
                        NUMBEROFSTUDENT.getText(),
                        REMARK.getText()
                );
                if (result == 1) {
                    if (AS.UpdateRoom(DAY.getSelectedItem().toString(), "true") == 1) {
                        JOptionPane.showMessageDialog(this, "Section schedule added successfully.");
                        AS.Section_Loader(SECTION);
                        SUBJECT_CODE.setText("");
                        DESCRIPTION.setText("");
                        DEPARTMENT.setText("");
                        TUNITS.setText("");
                        SUNITS.setText("");
                        DAY.setSelectedIndex(0);
                        NUMBEROFSTUDENT.setText("");
                        END.removeAllItems();
                        REMARK.setText("");
                        AS.DisplayData(jTable2);
                    } else {
                        JOptionPane.showMessageDialog(this, "Error:Unknown error occured.Please contact support.\nError:Code200");
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "Error:Unknown error occured.Please contact support.");
                }
            }
        }

    }//GEN-LAST:event_ADDActionPerformed
//update action for update is don .Do the testing tommorrow
    private void UPDATEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UPDATEActionPerformed
        Add_Section AS = new Add_Section();
        AS.Splitter(END.getSelectedItem().toString());
        int result = AS.UpdateData(
                SECTION.getSelectedItem().toString(), SUBJECT_CODE.getText(), DESCRIPTION.getText(),
                DEPARTMENT.getText(),
                TUNITS.getText(),
                SUNITS.getText(),
                DAY.getSelectedItem().toString(),
                NUMBEROFSTUDENT.getText(),
                REMARK.getText(), Day, Start1, End1, Room
        );
        if (result == 1) {
            if (DAY.getSelectedItem().toString().equals(Day) && AS.getStart().equals(Start1) && AS.getEnd().equals(End1) && AS.getRoom().equals(Room)) {
                JOptionPane.showMessageDialog(this, "Successfully updated data");
                AS.Section_Loader(SECTION);
                SUBJECT_CODE.setText("");
                DESCRIPTION.setText("");
                DEPARTMENT.setText("");
                TUNITS.setText("");
                SUNITS.setText("");
                DAY.setSelectedIndex(0);
                NUMBEROFSTUDENT.setText("");
                END.removeAllItems();
                REMARK.setText("");
                AS.DisplayData(jTable2);
                ADD.setVisible(true);
                UPDATE.setVisible(false);
                DELETE.setVisible(false);
            } else if (AS.updateRoom(Day, Start1, End1, Room) == 1) {

                if (AS.UpdateRoom(DAY.getSelectedItem().toString(), "true") == 1) {
                    JOptionPane.showMessageDialog(this, "Successfully updated data");
                    SECTION.setSelectedIndex(0);
                    SUBJECT_CODE.setText("");
                    DESCRIPTION.setText("");
                    DEPARTMENT.setText("");
                    TUNITS.setText("");
                    SUNITS.setText("");
                    DAY.setSelectedIndex(0);
                    NUMBEROFSTUDENT.setText("");
                    END.removeAllItems();
                    REMARK.setText("");
                    AS.DisplayData(jTable2);
                    ADD.setVisible(true);
                    UPDATE.setVisible(false);
                    DELETE.setVisible(false);
                }

            } else {
                JOptionPane.showMessageDialog(this, "Error:Cant update record.Please contact support.");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Error:Cant update record.Please contact support.1");

        }
    }//GEN-LAST:event_UPDATEActionPerformed

    private void RESETActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RESETActionPerformed
       
        new Add_Section().Section_Loader(SECTION);
        SUBJECT_CODE.setText("");
        DESCRIPTION.setText("");
        DEPARTMENT.setText("");

        TUNITS.setText("");

        SUNITS.setText("");

        DAY.setSelectedIndex(0);

        NUMBEROFSTUDENT.setText("");
        END.removeAllItems();
        REMARK.setText("");
        ADD.setVisible(true);
        UPDATE.setVisible(false);
        DELETE.setVisible(false);

    }//GEN-LAST:event_RESETActionPerformed

    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked

        String Section = jTable2.getValueAt(jTable2.getSelectedRow(), 1).toString();
        String Subject_Code = jTable2.getValueAt(jTable2.getSelectedRow(), 2).toString();
        String Description = jTable2.getValueAt(jTable2.getSelectedRow(), 3).toString();
        String Department = jTable2.getValueAt(jTable2.getSelectedRow(), 4).toString();
        String SUnits = jTable2.getValueAt(jTable2.getSelectedRow(), 5).toString();
        String TUnits = jTable2.getValueAt(jTable2.getSelectedRow(), 6).toString();
        Day = jTable2.getValueAt(jTable2.getSelectedRow(), 7).toString();
        String End = jTable2.getValueAt(jTable2.getSelectedRow(), 8).toString() + "-" + jTable2.getValueAt(jTable2.getSelectedRow(), 9).toString() + "-" + jTable2.getValueAt(jTable2.getSelectedRow(), 10).toString();
        String Number_Student = jTable2.getValueAt(jTable2.getSelectedRow(), 11).toString();
        String Remarks = jTable2.getValueAt(jTable2.getSelectedRow(), 12).toString();
        SECTION.addItem(Section);
        SECTION.setSelectedItem(Section);
        SUBJECT_CODE.setText(Subject_Code);
        DESCRIPTION.setText(Description);
        DEPARTMENT.setText(Department);
        SUNITS.setText(SUnits);
        TUNITS.setText(TUnits);
        DAY.setSelectedItem(Day);
        END.insertItemAt(End, 0);
        NUMBEROFSTUDENT.setText(Number_Student);
        REMARK.setText(Remarks);
        END.setSelectedIndex(0);
        Add_Section AS = new Add_Section();
        String[] split2 = End.split("-", 3);

        Start1 = split2[0];
        End1 = split2[1];
        Room = split2[2];

//        STARTHH.setSelectedItem(Split1[0]);
//        STARTMM.setSelectedItem(Split2[0]);
//        STARTPERIOD.setSelectedItem(Split2[1]);
//
//        String[] Split11 = End1.split(":", 2);
//        String[] Split22 = Split11[1].split(" ", 2);
//        ENDHH.setSelectedItem(Split11[0]);
//        ENDMM.setSelectedItem(Split22[0]);
//        ENDPERIOD.setSelectedItem(Split22[1]);
//        ROOM.setText(Room);
        ADD.setVisible(false);
        UPDATE.setVisible(true);
        DELETE.setVisible(true);


    }//GEN-LAST:event_jTable2MouseClicked

    private void DAYActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DAYActionPerformed
        if (DAY.getSelectedItem().toString().equals("DAY")) {

        } else if (SECTION.getSelectedItem().toString().equals("--SECTION--")) {
            JOptionPane.showMessageDialog(this, "Select the section first before selecting day");
        } else {
            Add_Section AS = new Add_Section();
            if (AS.ChoiceLoad(DAY.getSelectedItem().toString(), END, SECTION.getSelectedItem().toString())) {

            } else {
                JOptionPane.showMessageDialog(rootPane, "Error:No schedule can be retrieved from " + DAY.getSelectedItem() + ".\n Please add schedules in Room Tab in order to select in AVAILABLE SCHEDULE menu");
            }
        }
    }//GEN-LAST:event_DAYActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        new Section_Print().setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void SECTIONActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SECTIONActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SECTIONActionPerformed

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
            java.util.logging.Logger.getLogger(ADDSECTION.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ADDSECTION.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ADDSECTION.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ADDSECTION.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ADDSECTION().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ADD;
    private javax.swing.JComboBox<String> DAY;
    private javax.swing.JButton DELETE;
    private javax.swing.JTextField DEPARTMENT;
    private javax.swing.JTextField DESCRIPTION;
    private javax.swing.JComboBox<String> END;
    private javax.swing.JTextField NUMBEROFSTUDENT;
    private javax.swing.JTextField REMARK;
    private javax.swing.JButton RESET;
    private javax.swing.JComboBox<String> SECTION;
    private javax.swing.JTextField SUBJECT_CODE;
    private javax.swing.JTextField SUNITS;
    private javax.swing.JTextField TUNITS;
    private javax.swing.JButton UPDATE;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField search;
    // End of variables declaration//GEN-END:variables
}
