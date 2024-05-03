/*
 * Created by JFormDesigner on Sun Apr 21 18:01:38 ICT 2024
 */

package View;

import java.awt.*;
import javax.swing.*;
import javax.swing.table.*;

import model.MonthlyBill;
import net.miginfocom.swing.*;

/**
 * @author HP
 */
public class ConfirmFrm extends JFrame {
    private MonthlyBill monthlyBill;
    public ConfirmFrm(MonthlyBill monthlyBill) {
        this.monthlyBill = monthlyBill;
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        // Generated using JFormDesigner Evaluation license - Luu Ngoc Anh
        lblConfirm = new JLabel();
        lblIDBill = new JLabel();
        txtIDBill = new JLabel();
        label1 = new JLabel();
        label3 = new JLabel();
        RoomInfo = new JPanel();
        label2 = new JLabel();
        label16 = new JLabel();
        txtIDRoom = new JLabel();
        label17 = new JLabel();
        txtNameRoom = new JLabel();
        label24 = new JLabel();
        txtBoardHouse = new JLabel();
        label5 = new JLabel();
        label6 = new JLabel();
        label7 = new JLabel();
        label9 = new JLabel();
        label8 = new JLabel();
        label10 = new JLabel();
        label11 = new JLabel();
        label19 = new JLabel();
        txtPriceRoom = new JLabel();
        label20 = new JLabel();
        txtTypeRoom = new JLabel();
        label21 = new JLabel();
        txtStatus = new JLabel();
        label22 = new JLabel();
        txtDes = new JLabel();
        Revenues = new JPanel();
        label46 = new JLabel();
        label47 = new JLabel();
        label56 = new JLabel();
        label48 = new JLabel();
        label57 = new JLabel();
        label59 = new JLabel();
        scrollPane1 = new JScrollPane();
        table1 = new JTable();
        label49 = new JLabel();
        label58 = new JLabel();
        label60 = new JLabel();
        scrollPane2 = new JScrollPane();
        table2 = new JTable();
        label50 = new JLabel();
        txtCleanFee = new JLabel();
        label51 = new JLabel();
        txtParkBike = new JLabel();
        label52 = new JLabel();
        txtParkMoto = new JLabel();
        label53 = new JLabel();
        txtDebt = new JLabel();
        label54 = new JLabel();
        label65 = new JLabel();
        label55 = new JLabel();
        txtPayTerm = new JLabel();
        ClientInfo = new JPanel();
        label12 = new JLabel();
        label28 = new JLabel();
        label34 = new JLabel();
        txtNameClient = new JLabel();
        label29 = new JLabel();
        label35 = new JLabel();
        txtDob = new JLabel();
        label30 = new JLabel();
        label36 = new JLabel();
        txtCCCD = new JLabel();
        label31 = new JLabel();
        label37 = new JLabel();
        txtTel = new JLabel();
        label32 = new JLabel();
        label38 = new JLabel();
        txtHometown = new JLabel();
        btnBack = new JButton();
        btnCancel = new JButton();
        btnConfirm = new JButton();

        //======== this ========
        var contentPane = getContentPane();
        contentPane.setLayout(new MigLayout(
            "hidemode 3,alignx center",
            // columns
            "[105,fill]" +
            "[277,fill]" +
            "[25,fill]" +
            "[4,fill]0" +
            "[fill]0" +
            "[0,fill]" +
            "[40,fill]",
            // rows
            "[]" +
            "[69]" +
            "[]0" +
            "[]0" +
            "[71]" +
            "[165]" +
            "[20]rel" +
            "[191:n]rel" +
            "[36:n]rel" +
            "[51]rel" +
            "[41]rel" +
            "[]rel" +
            "[33]rel" +
            "[]0" +
            "[]0" +
            "[0]0" +
            "[69]0" +
            "[]0" +
            "[202]"));

        //---- lblConfirm ----
        lblConfirm.setText("Confirm ");
        lblConfirm.setFont(new Font("Inter", Font.BOLD, 36));
        contentPane.add(lblConfirm, "cell 0 1 7 1,alignx center,growx 0");

        //---- lblIDBill ----
        lblIDBill.setText(" ID Bill: ");
        lblIDBill.setFont(new Font("Inter", Font.BOLD, 20));
        contentPane.add(lblIDBill, "cell 1 4,alignx right,growx 0");

        //---- txtIDBill ----
        txtIDBill.setText("123");
        txtIDBill.setFont(new Font("Inter", Font.PLAIN, 20));
        contentPane.add(txtIDBill, "cell 1 4");

        //---- label1 ----
        label1.setText(" Month: ");
        label1.setFont(new Font("Inter", Font.BOLD, 20));
        contentPane.add(label1, "cell 4 4,alignx right,growx 0");

        //---- label3 ----
        label3.setText("03-2024");
        label3.setFont(new Font("Inter", Font.PLAIN, 18));
        contentPane.add(label3, "cell 4 4");

        //======== RoomInfo ========
        {
            RoomInfo.setFont(new Font("Inter", Font.PLAIN, 16));
            RoomInfo.setBorder(new javax.swing.border.CompoundBorder(new javax.swing.border.TitledBorder(new
            javax.swing.border.EmptyBorder(0,0,0,0), "JF\u006frm\u0044es\u0069gn\u0065r \u0045va\u006cua\u0074io\u006e",javax
            .swing.border.TitledBorder.CENTER,javax.swing.border.TitledBorder.BOTTOM,new java
            .awt.Font("D\u0069al\u006fg",java.awt.Font.BOLD,12),java.awt
            .Color.red),RoomInfo. getBorder()));RoomInfo. addPropertyChangeListener(new java.beans.
            PropertyChangeListener(){@Override public void propertyChange(java.beans.PropertyChangeEvent e){if("\u0062or\u0064er".
            equals(e.getPropertyName()))throw new RuntimeException();}});
            RoomInfo.setLayout(new MigLayout(
                "hidemode 3",
                // columns
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]" +
                "[fill]",
                // rows
                "[]" +
                "[]" +
                "[]" +
                "[]" +
                "[]" +
                "[]" +
                "[]" +
                "[]"));

            //---- label2 ----
            label2.setText("Room Information");
            label2.setFont(new Font("Inter", Font.BOLD, 20));
            RoomInfo.add(label2, "cell 0 0 2 1");

            //---- label16 ----
            label16.setText(":");
            RoomInfo.add(label16, "cell 1 1");

            //---- txtIDRoom ----
            txtIDRoom.setText("1");
            txtIDRoom.setFont(new Font("Inter", Font.PLAIN, 16));
            RoomInfo.add(txtIDRoom, "cell 1 1");

            //---- label17 ----
            label17.setText(":");
            RoomInfo.add(label17, "cell 1 2");

            //---- txtNameRoom ----
            txtNameRoom.setText("101");
            txtNameRoom.setFont(new Font("Inter", Font.PLAIN, 16));
            RoomInfo.add(txtNameRoom, "cell 1 2");

            //---- label24 ----
            label24.setText(":");
            RoomInfo.add(label24, "cell 1 3");

            //---- txtBoardHouse ----
            txtBoardHouse.setText("CT1");
            txtBoardHouse.setFont(new Font("Inter", Font.PLAIN, 16));
            RoomInfo.add(txtBoardHouse, "cell 1 3");

            //---- label5 ----
            label5.setText("ID room");
            label5.setFont(new Font("Inter", Font.ITALIC, 16));
            RoomInfo.add(label5, "cell 0 1,alignx left,growx 0");

            //---- label6 ----
            label6.setText("Name");
            label6.setFont(new Font("Inter", Font.ITALIC, 16));
            RoomInfo.add(label6, "cell 0 2,alignx left,growx 0");

            //---- label7 ----
            label7.setText("Boarding House");
            label7.setFont(new Font("Inter", Font.ITALIC, 16));
            RoomInfo.add(label7, "cell 0 3");

            //---- label9 ----
            label9.setText("Price");
            label9.setFont(new Font("Inter", Font.ITALIC, 16));
            RoomInfo.add(label9, "cell 0 4");

            //---- label8 ----
            label8.setText("Type");
            label8.setFont(new Font("Inter", Font.ITALIC, 16));
            RoomInfo.add(label8, "cell 0 5");

            //---- label10 ----
            label10.setText("Status");
            label10.setFont(new Font("Inter", Font.ITALIC, 16));
            RoomInfo.add(label10, "cell 0 6");

            //---- label11 ----
            label11.setText("Description");
            label11.setFont(new Font("Inter", Font.ITALIC, 16));
            RoomInfo.add(label11, "cell 0 7");

            //---- label19 ----
            label19.setText(":");
            RoomInfo.add(label19, "cell 1 4");

            //---- txtPriceRoom ----
            txtPriceRoom.setText("2.000.000 VND");
            txtPriceRoom.setFont(new Font("Inter", Font.PLAIN, 16));
            RoomInfo.add(txtPriceRoom, "cell 1 4");

            //---- label20 ----
            label20.setText(":");
            RoomInfo.add(label20, "cell 1 5");

            //---- txtTypeRoom ----
            txtTypeRoom.setText("Single room");
            txtTypeRoom.setFont(new Font("Inter", Font.PLAIN, 16));
            RoomInfo.add(txtTypeRoom, "cell 1 5");

            //---- label21 ----
            label21.setText(":");
            RoomInfo.add(label21, "cell 1 6");

            //---- txtStatus ----
            txtStatus.setText("Rented");
            txtStatus.setFont(new Font("Inter", Font.PLAIN, 16));
            RoomInfo.add(txtStatus, "cell 1 6");

            //---- label22 ----
            label22.setText(":");
            RoomInfo.add(label22, "cell 1 7");

            //---- txtDes ----
            txtDes.setText("Null");
            txtDes.setFont(new Font("Inter", Font.PLAIN, 16));
            RoomInfo.add(txtDes, "cell 1 7");
        }
        contentPane.add(RoomInfo, "cell 1 5");

        //======== Revenues ========
        {
            Revenues.setLayout(new MigLayout(
                "hidemode 3",
                // columns
                "[534,fill]" +
                "[fill]",
                // rows
                "[]" +
                "[]" +
                "[]" +
                "[]" +
                "[]" +
                "[]" +
                "[]" +
                "[]" +
                "[]" +
                "[]" +
                "[]" +
                "[]" +
                "[]" +
                "[]" +
                "[]" +
                "[]"));

            //---- label46 ----
            label46.setText("Revenues");
            label46.setFont(new Font("Inter", Font.BOLD, 20));
            Revenues.add(label46, "cell 0 0");

            //---- label47 ----
            label47.setText("1. Room price: ");
            label47.setFont(new Font("Inter", Font.ITALIC, 16));
            Revenues.add(label47, "cell 0 1,alignx right,growx 0");

            //---- label56 ----
            label56.setText("2.000.000");
            label56.setFont(new Font("Inter", Font.PLAIN, 16));
            Revenues.add(label56, "cell 0 1");

            //---- label48 ----
            label48.setText("2. Electric bill");
            label48.setFont(new Font("Inter", Font.ITALIC, 16));
            Revenues.add(label48, "cell 0 2");

            //---- label57 ----
            label57.setText("Electric Number: ");
            label57.setFont(new Font("Inter", Font.PLAIN, 16));
            Revenues.add(label57, "cell 0 3,alignx right,growx 0");

            //---- label59 ----
            label59.setText("99");
            label59.setFont(new Font("Inter", Font.PLAIN, 16));
            Revenues.add(label59, "cell 0 3");

            //======== scrollPane1 ========
            {

                //---- table1 ----
                table1.setModel(new DefaultTableModel(
                    new Object[][] {
                        {"1", "0 - 50 kWh", "2.500 VND/kWh ", null, null},
                        {"2", "51 - 100 kWh", "3.000 VND/kWh", null, null},
                        {"3", "101 - 200 kWh", "3.500 VND/kWh", null, null},
                        {"4", "> 200 kWh", "4.000 VND/kWh", null, null},
                    },
                    new String[] {
                        "Step", "About", "Price", "Quantity", "Amount"
                    }
                ) {
                    Class<?>[] columnTypes = new Class<?>[] {
                        String.class, String.class, String.class, Object.class, Object.class
                    };
                    @Override
                    public Class<?> getColumnClass(int columnIndex) {
                        return columnTypes[columnIndex];
                    }
                });
                {
                    TableColumnModel cm = table1.getColumnModel();
                    cm.getColumn(0).setCellEditor(new DefaultCellEditor(
                        new JComboBox(new DefaultComboBoxModel(new String[] {
                            "1",
                            "2",
                            "3",
                            "4"
                        }))));
                    cm.getColumn(1).setCellEditor(new DefaultCellEditor(
                        new JComboBox(new DefaultComboBoxModel(new String[] {
                            "0 - 50 kWh",
                            "51 - 100 kWh",
                            "101 - 200 kWh",
                            "> 200 kWh"
                        }))));
                    cm.getColumn(2).setCellEditor(new DefaultCellEditor(
                        new JComboBox(new DefaultComboBoxModel(new String[] {
                            "2.500 VND/kWh ",
                            "3.000 VND/kWh",
                            "3.500 VND/kWh",
                            "4.000 VND/kWh"
                        }))));
                }
                table1.setFont(new Font("Inter", Font.PLAIN, 13));
                scrollPane1.setViewportView(table1);
            }
            Revenues.add(scrollPane1, "cell 0 4");

            //---- label49 ----
            label49.setText("3. Water bill");
            label49.setFont(new Font("Inter", Font.ITALIC, 16));
            Revenues.add(label49, "cell 0 5");

            //---- label58 ----
            label58.setText("Water Number: ");
            label58.setFont(new Font("Inter", Font.PLAIN, 16));
            Revenues.add(label58, "cell 0 6,alignx right,growx 0");

            //---- label60 ----
            label60.setText("3");
            Revenues.add(label60, "cell 0 6");

            //======== scrollPane2 ========
            {

                //---- table2 ----
                table2.setModel(new DefaultTableModel(
                    new Object[][] {
                        {"1", "0-5 m3", "15.000 VND/m3", null, ""},
                        {"2", "5-10 m3", "20.000 VND/m3", null, null},
                        {"3", "10-20 m3", "25.000 VND/m3", null, null},
                        {"4", ">20 m3", "30.000 VND/m3", null, null},
                    },
                    new String[] {
                        "Step", "About", "Price", "Quantity", "Amount"
                    }
                ) {
                    Class<?>[] columnTypes = new Class<?>[] {
                        String.class, String.class, String.class, Object.class, Object.class
                    };
                    @Override
                    public Class<?> getColumnClass(int columnIndex) {
                        return columnTypes[columnIndex];
                    }
                });
                {
                    TableColumnModel cm = table2.getColumnModel();
                    cm.getColumn(0).setCellEditor(new DefaultCellEditor(
                        new JComboBox(new DefaultComboBoxModel(new String[] {
                            "1",
                            "2",
                            "3",
                            "4"
                        }))));
                    cm.getColumn(1).setCellEditor(new DefaultCellEditor(
                        new JComboBox(new DefaultComboBoxModel(new String[] {
                            "0-5 m3",
                            "5-10 m3",
                            "10-20 m3",
                            ">20 m3"
                        }))));
                    cm.getColumn(2).setResizable(false);
                    cm.getColumn(2).setCellEditor(new DefaultCellEditor(
                        new JComboBox(new DefaultComboBoxModel(new String[] {
                            "15.000 VND/m3",
                            "20.000 VND/m3",
                            "25.000 VND/m3",
                            "30.000 VND/m3"
                        }))));
                }
                table2.setFont(new Font("Inter", Font.PLAIN, 13));
                scrollPane2.setViewportView(table2);
            }
            Revenues.add(scrollPane2, "cell 0 7");

            //---- label50 ----
            label50.setText("4. Clean fee: ");
            label50.setFont(new Font("Inter", Font.ITALIC, 16));
            Revenues.add(label50, "cell 0 8,alignx right,growx 0");

            //---- txtCleanFee ----
            txtCleanFee.setText("abc");
            txtCleanFee.setFont(new Font("Inter", Font.PLAIN, 16));
            Revenues.add(txtCleanFee, "cell 0 8");

            //---- label51 ----
            label51.setText("5. Parking fee for bicycle: ");
            label51.setFont(new Font("Inter", Font.ITALIC, 16));
            Revenues.add(label51, "cell 0 9,alignx right,growx 0");

            //---- txtParkBike ----
            txtParkBike.setText("abc");
            txtParkBike.setFont(new Font("Inter", Font.PLAIN, 16));
            Revenues.add(txtParkBike, "cell 0 9");

            //---- label52 ----
            label52.setText("6. Paking fee for motobycle: ");
            label52.setFont(new Font("Inter", Font.ITALIC, 16));
            Revenues.add(label52, "cell 0 10,alignx right,growx 0");

            //---- txtParkMoto ----
            txtParkMoto.setText("abc");
            txtParkMoto.setFont(new Font("Inter", Font.PLAIN, 16));
            Revenues.add(txtParkMoto, "cell 0 10");

            //---- label53 ----
            label53.setText("7.  Debt: ");
            label53.setFont(new Font("Inter", Font.ITALIC, 16));
            Revenues.add(label53, "cell 0 11,alignx right,growx 0");

            //---- txtDebt ----
            txtDebt.setText("0");
            txtDebt.setFont(new Font("Inter", Font.PLAIN, 16));
            Revenues.add(txtDebt, "cell 0 11");

            //---- label54 ----
            label54.setText("Total Amount: ");
            label54.setFont(new Font("Inter", Font.BOLD, 18));
            Revenues.add(label54, "cell 0 12,alignx right,growx 0");

            //---- label65 ----
            label65.setText("text");
            label65.setFont(new Font("Inter", Font.PLAIN, 16));
            Revenues.add(label65, "cell 0 12");

            //---- label55 ----
            label55.setText("Payment Term: ");
            label55.setFont(new Font("Inter", Font.BOLD, 18));
            Revenues.add(label55, "cell 0 13,alignx right,growx 0");

            //---- txtPayTerm ----
            txtPayTerm.setText("text");
            txtPayTerm.setFont(new Font("Inter", Font.PLAIN, 16));
            Revenues.add(txtPayTerm, "cell 0 13");
        }
        contentPane.add(Revenues, "cell 4 5 1 14");

        //======== ClientInfo ========
        {
            ClientInfo.setLayout(new MigLayout(
                "hidemode 3",
                // columns
                "[fill]" +
                "[fill]" +
                "[fill]",
                // rows
                "[]" +
                "[]" +
                "[]" +
                "[]" +
                "[]" +
                "[]"));

            //---- label12 ----
            label12.setText("Client Information");
            label12.setFont(new Font("Inter", Font.BOLD, 20));
            ClientInfo.add(label12, "cell 0 0 2 1");

            //---- label28 ----
            label28.setText("Name");
            label28.setFont(new Font("Inter", Font.ITALIC, 16));
            ClientInfo.add(label28, "cell 0 1");

            //---- label34 ----
            label34.setText(":");
            ClientInfo.add(label34, "cell 1 1");

            //---- txtNameClient ----
            txtNameClient.setText("Luu Ngoc Anh");
            txtNameClient.setFont(new Font("Inter", Font.PLAIN, 16));
            ClientInfo.add(txtNameClient, "cell 1 1");

            //---- label29 ----
            label29.setText("Dob");
            label29.setFont(new Font("Inter", Font.ITALIC, 16));
            ClientInfo.add(label29, "cell 0 2");

            //---- label35 ----
            label35.setText(":");
            ClientInfo.add(label35, "cell 1 2");

            //---- txtDob ----
            txtDob.setText("15/06/2003");
            txtDob.setFont(new Font("Inter", Font.PLAIN, 16));
            ClientInfo.add(txtDob, "cell 1 2");

            //---- label30 ----
            label30.setText("CCCD");
            label30.setFont(new Font("Inter", Font.ITALIC, 16));
            ClientInfo.add(label30, "cell 0 3");

            //---- label36 ----
            label36.setText(":");
            ClientInfo.add(label36, "cell 1 3");

            //---- txtCCCD ----
            txtCCCD.setText("034303013224");
            txtCCCD.setFont(new Font("Inter", Font.PLAIN, 16));
            ClientInfo.add(txtCCCD, "cell 1 3");

            //---- label31 ----
            label31.setText("Tel");
            label31.setFont(new Font("Inter", Font.ITALIC, 16));
            ClientInfo.add(label31, "cell 0 4");

            //---- label37 ----
            label37.setText(":");
            ClientInfo.add(label37, "cell 1 4");

            //---- txtTel ----
            txtTel.setText("0345580198");
            txtTel.setFont(new Font("Inter", Font.PLAIN, 16));
            ClientInfo.add(txtTel, "cell 1 4");

            //---- label32 ----
            label32.setText("Hometown");
            label32.setFont(new Font("Inter", Font.ITALIC, 16));
            ClientInfo.add(label32, "cell 0 5");

            //---- label38 ----
            label38.setText(":");
            ClientInfo.add(label38, "cell 1 5");

            //---- txtHometown ----
            txtHometown.setText("Thai Thuy, Thai Binh");
            txtHometown.setFont(new Font("Inter", Font.PLAIN, 16));
            ClientInfo.add(txtHometown, "cell 1 5");
        }
        contentPane.add(ClientInfo, "cell 1 7");

        //---- btnBack ----
        btnBack.setText("Back");
        contentPane.add(btnBack, "cell 1 12");

        //---- btnCancel ----
        btnCancel.setText("Cancel");
        contentPane.add(btnCancel, "cell 1 12");

        //---- btnConfirm ----
        btnConfirm.setText("Confirm ");
        contentPane.add(btnConfirm, "cell 1 17 1 2");
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    // Generated using JFormDesigner Evaluation license - Luu Ngoc Anh
    private JLabel lblConfirm;
    private JLabel lblIDBill;
    private JLabel txtIDBill;
    private JLabel label1;
    private JLabel label3;
    private JPanel RoomInfo;
    private JLabel label2;
    private JLabel label16;
    private JLabel txtIDRoom;
    private JLabel label17;
    private JLabel txtNameRoom;
    private JLabel label24;
    private JLabel txtBoardHouse;
    private JLabel label5;
    private JLabel label6;
    private JLabel label7;
    private JLabel label9;
    private JLabel label8;
    private JLabel label10;
    private JLabel label11;
    private JLabel label19;
    private JLabel txtPriceRoom;
    private JLabel label20;
    private JLabel txtTypeRoom;
    private JLabel label21;
    private JLabel txtStatus;
    private JLabel label22;
    private JLabel txtDes;
    private JPanel Revenues;
    private JLabel label46;
    private JLabel label47;
    private JLabel label56;
    private JLabel label48;
    private JLabel label57;
    private JLabel label59;
    private JScrollPane scrollPane1;
    private JTable table1;
    private JLabel label49;
    private JLabel label58;
    private JLabel label60;
    private JScrollPane scrollPane2;
    private JTable table2;
    private JLabel label50;
    private JLabel txtCleanFee;
    private JLabel label51;
    private JLabel txtParkBike;
    private JLabel label52;
    private JLabel txtParkMoto;
    private JLabel label53;
    private JLabel txtDebt;
    private JLabel label54;
    private JLabel label65;
    private JLabel label55;
    private JLabel txtPayTerm;
    private JPanel ClientInfo;
    private JLabel label12;
    private JLabel label28;
    private JLabel label34;
    private JLabel txtNameClient;
    private JLabel label29;
    private JLabel label35;
    private JLabel txtDob;
    private JLabel label30;
    private JLabel label36;
    private JLabel txtCCCD;
    private JLabel label31;
    private JLabel label37;
    private JLabel txtTel;
    private JLabel label32;
    private JLabel label38;
    private JLabel txtHometown;
    private JButton btnBack;
    private JButton btnCancel;
    private JButton btnConfirm;
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
