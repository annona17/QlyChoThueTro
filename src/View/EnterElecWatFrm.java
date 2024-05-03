/*
 * Created by JFormDesigner on Fri Apr 19 10:53:32 ICT 2024
 */

package View;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.*;

import dao.RentedRoomDAO;
import dao.ServiceDAO;
import model.*;
import net.miginfocom.swing.*;

/**
 * @author HP
 */
public class EnterElecWatFrm extends JFrame implements ActionListener {
    private JLabel txtRoomName;
    private JTextField txtNEI;
    private JTextField txtNWI;
    private JButton btnCancel;
    private JButton btnContinue;
    private RentedRoom rentedRoom;
    private String month;
    private Host host;
    public EnterElecWatFrm(RentedRoom rentedRoom, String month, Host host) {
        this.host = host;
       this.rentedRoom = rentedRoom;
       this.month = month;
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        // Generated using JFormDesigner Evaluation license - Luu Ngoc Anh
        JLabel label4 = new JLabel();
        txtRoomName = new JLabel();
        JLabel label1 = new JLabel();
        txtNEI = new JTextField();
        JLabel label2 = new JLabel();
        txtNWI = new JTextField();
        btnCancel = new JButton();
        btnContinue = new JButton();

        //======== this ========
        var contentPane = getContentPane();
        contentPane.setLayout(new MigLayout(
            "hidemode 3",
            // columns
            "[178,fill]" +
            "[117,fill]" +
            "[123,fill]" +
            "[105,fill]" +
            "[152,fill]" +
            "[259,fill]",
            // rows
            "[]" +
            "[124]" +
            "[48]" +
            "[92]" +
            "[46]" +
            "[45]" +
            "[47]" +
            "[263]"));

        //---- label4 ----
        label4.setText("EnterElecWat");
        label4.setFont(new Font("Inter", Font.BOLD, 36));
        contentPane.add(label4, "cell 0 1 6 1,align center center,grow 0 0");

        //---- txtRoomName ----
        txtRoomName.setText("ID rentedRoom: " + rentedRoom.getID());
        txtRoomName.setFont(new Font("Inter", Font.PLAIN, 18));
        contentPane.add(txtRoomName, "cell 4 2,alignx center,growx 0");

        //---- label1 ----
        label1.setText("New electric index");
        label1.setFont(new Font("Inter", Font.PLAIN, 18));
        contentPane.add(label1, "cell 1 4,alignx left,growx 0");

        //---- txtNEI ----
        txtNEI.setFont(new Font("Inter", Font.PLAIN, 18));
        contentPane.add(txtNEI, "cell 2 4 3 1, grow");

        //---- label2 ----
        label2.setText("New water index");
        label2.setFont(new Font("Inter", Font.PLAIN, 18));
        contentPane.add(label2, "cell 1 5");

        //---- txtNWI ----
        txtNWI.setFont(new Font("Inter", Font.PLAIN, 18));
        contentPane.add(txtNWI, "cell 2 5 3 1, grow");

        //---- btnCancel ----
        btnCancel.setText("Cancel");
        btnCancel.addActionListener(this);
        contentPane.add(btnCancel, "cell 2 6");

        //---- btnContinue ----
        btnContinue.setText("Continue");
        btnContinue.addActionListener(this);
        contentPane.add(btnContinue, "cell 4 6");
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Khoi tao 1 hoa don moi
        MonthlyBill monthlyBill = new MonthlyBill();
        monthlyBill.setForMonth(month);

        // get thong tin khach hang
        RentedRoomDAO rentedRoomDAO = new RentedRoomDAO();
        monthlyBill.setClient(rentedRoomDAO.getClientInfo(rentedRoom.getID()));

        // get thong tin host
        monthlyBill.setHost(host);

        ServiceDAO serviceDAO = new ServiceDAO();
        // rentedroom lay thong tin cac dich vu tra truoc
        ArrayList<RegisterPrepaidService> lstRPS = serviceDAO.getRegisterPrepaidServiceInfo(rentedRoom.getID());
        rentedRoom.setLstRPS(lstRPS);
        // set thong tin cac dich vu tra sau dien nuoc thang truoc
        ArrayList<PostpaidService> lstPostS = serviceDAO.getPostPaidServiceInfo();
        ArrayList<UsedPostpaidService> lstUPS = new ArrayList<>();

        if(e.getSource() == btnCancel){
            this.dispose();
        }else if(e.getSource() == btnContinue){
            String elec = txtNEI.getText();
            String wat = txtNWI.getText();
            if(elec.length() == 0 || wat.length() == 0){
                JOptionPane.showMessageDialog(this, "Please enter the new index");
            }else if (Integer.parseInt(elec) < rentedRoom.getRoom().getElecIndex() || Integer.parseInt(wat) < rentedRoom.getRoom().getWaterIndex()){
                JOptionPane.showMessageDialog(this, "The new index must be greater than the old index");
            }else{
                UsedPostpaidService elecBill = new UsedPostpaidService();
                elecBill.setOldIndex(rentedRoom.getRoom().getElecIndex());
                elecBill.setNewIndex(Integer.parseInt(elec));
                elecBill.setForMonth(month);
                elecBill.setQuantity();
                elecBill.setPostpaidService(lstPostS.get(0));
                elecBill.setTotalAmount();
                lstUPS.add(elecBill);

                UsedPostpaidService waterBill = new UsedPostpaidService();
                waterBill.setOldIndex(rentedRoom.getRoom().getWaterIndex());
                waterBill.setNewIndex(Integer.parseInt(wat));
                waterBill.setForMonth(month);
                waterBill.setQuantity();
                waterBill.setPostpaidService(lstPostS.get(1));
                waterBill.setTotalAmount();
                lstUPS.add(waterBill);

                rentedRoom.setLstUPS(lstUPS);
                monthlyBill.setRentedRoom(rentedRoom);
                monthlyBill.setTotalAmount();
                monthlyBill.setCreatedDate();
                monthlyBill.setPaymentTerm();

                // goi den giao dien ConfirmFrm
                this.dispose();
                (new ConfirmFrm(monthlyBill)).setVisible(true);
            }

        }
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    // Generated using JFormDesigner Evaluation license - Luu Ngoc Anh

    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
