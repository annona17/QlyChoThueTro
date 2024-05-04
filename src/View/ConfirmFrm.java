/*
 * Created by JFormDesigner on Sat May 04 15:17:42 ICT 2024
 */

package View;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

import dao.MonthlyBillDAO;
import model.MonthlyBill;
import net.miginfocom.swing.*;

/**
 * @author HP
 */
public class ConfirmFrm extends JFrame implements ActionListener {
    private JLabel txtIDBill;
    private JTextArea txtRevenues;
    private JTextArea txtRoomInfo;
    private JTextArea txtClientInfo;
    private JLabel txtMonth;
    private JLabel txtCreaDate;
    private JButton btnConfirm;
    private JLabel txtTotal;
    private JButton btnCancel;
    private JLabel txtPaymentTerm;
    private final MonthlyBill monthlyBill;
    public ConfirmFrm(MonthlyBill monthlyBill) {
        this.monthlyBill = monthlyBill;
        initComponents();
        // ID Bill
        txtIDBill.setText(monthlyBill.getID() + "");
        // Room Info
        txtRoomInfo.setText(monthlyBill.getRentedRoom().showRentedRoomInfo());
        txtRoomInfo.setFont(new Font("Inter", Font.PLAIN, 16));
        txtRoomInfo.setEditable(false);

        // Client Info
        txtClientInfo.setText(monthlyBill.getClient().showClientInfo());
        txtClientInfo.setFont(new Font("Inter", Font.PLAIN, 16));
        txtClientInfo.setEditable(false);

        // Revenues
        txtRevenues.setText(monthlyBill.getRentedRoom().showRevenues());
        txtRevenues.setFont(new Font("Inter", Font.PLAIN, 16));
        txtRevenues.setEditable(false);

        // Month
        txtMonth.setText(monthlyBill.getForMonth());
        txtMonth.setFont(new Font("Inter", Font.PLAIN, 18));

        // Created Date
        txtCreaDate.setText(monthlyBill.getCreatedDate());
        txtCreaDate.setFont(new Font("Inter", Font.PLAIN, 18));

        // Total Amount
        txtTotal.setText(monthlyBill.getTotalAmount() + " VND" );
        txtTotal.setFont(new Font("Inter", Font.PLAIN, 18));

        // Payment Term
        txtPaymentTerm.setText(monthlyBill.getPaymentTerm());
        txtPaymentTerm.setFont(new Font("Inter", Font.PLAIN, 18));
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        // Generated using JFormDesigner Evaluation license - Luu Ngoc Anh
        JLabel label6 = new JLabel();
        JLabel label1 = new JLabel();
        txtIDBill = new JLabel();
        JLabel label5 = new JLabel();
        JLabel label2 = new JLabel();
        JScrollPane scrollPane3 = new JScrollPane();
        txtRevenues = new JTextArea();
        JScrollPane scrollPane1 = new JScrollPane();
        txtRoomInfo = new JTextArea();
        JLabel label3 = new JLabel();
        JScrollPane scrollPane2 = new JScrollPane();
        txtClientInfo = new JTextArea();
        JLabel label4 = new JLabel();
        txtMonth = new JLabel();
        JLabel label9 = new JLabel();
        txtCreaDate = new JLabel();
        btnConfirm = new JButton();
        JLabel label7 = new JLabel();
        txtTotal = new JLabel();
        btnCancel = new JButton();
        JLabel label8 = new JLabel();
        txtPaymentTerm = new JLabel();

        //======== this ========
        var contentPane = getContentPane();
        contentPane.setLayout(new MigLayout(
            "hidemode 3",
            // columns
            "[73,fill]" +
            "[364,fill]" +
            "[82,fill]" +
            "[610,fill]" +
            "[85,fill]",
            // rows
            "[]" +
            "[23]" +
            "[]0" +
            "[]0" +
            "[]" +
            "[]" +
            "[234]" +
            "[28]" +
            "[222]" +
            "[17]" +
            "[]" +
            "[]" +
            "[50]" +
            "[]0" +
            "[]0" +
            "[]0" +
            "[24]0" +
            "[]0" +
            "[30]0" +
            "[24]" +
            "[]"));

        //---- label6 ----
        label6.setText("Confirm");
        label6.setFont(new Font("Inter", Font.BOLD, 36));
        contentPane.add(label6, "cell 1 1 4 1,alignx center,growx 0");

        //---- label1 ----
        label1.setText("ID Bill: ");
        label1.setFont(new Font("Inter", Font.BOLD, 18));
        contentPane.add(label1, "cell 1 4,alignx right,growx 0");

        //---- txtIDBill ----
        txtIDBill.setText("123");
        txtIDBill.setFont(new Font("Inter", Font.PLAIN, 18));
        contentPane.add(txtIDBill, "cell 1 4");

        //---- label5 ----
        label5.setText("Revenues");
        label5.setFont(new Font("Inter", Font.BOLD, 18));
        contentPane.add(label5, "cell 3 4");

        //---- label2 ----
        label2.setText("Room Information");
        label2.setFont(new Font("Inter", Font.BOLD, 18));
        contentPane.add(label2, "cell 1 5");

        //======== scrollPane3 ========
        {
            scrollPane3.setViewportView(txtRevenues);
        }
        contentPane.add(scrollPane3, "cell 3 5 1 5,grow");

        //======== scrollPane1 ========
        {
            scrollPane1.setViewportView(txtRoomInfo);
        }
        contentPane.add(scrollPane1, "cell 1 6,grow");

        //---- label3 ----
        label3.setText("Client Information");
        label3.setFont(new Font("Inter", Font.BOLD, 18));
        contentPane.add(label3, "cell 1 7");

        //======== scrollPane2 ========
        {
            scrollPane2.setViewportView(txtClientInfo);
        }
        contentPane.add(scrollPane2, "cell 1 8,grow");

        //---- label4 ----
        label4.setText("Month: ");
        label4.setFont(new Font("Inter", Font.BOLD, 18));
        contentPane.add(label4, "cell 1 9,alignx right,growx 0");

        //---- txtMonth ----
        txtMonth.setText("03-2024");
        txtMonth.setFont(new Font("Inter", Font.PLAIN, 18));
        contentPane.add(txtMonth, "cell 1 9");

        //---- label9 ----
        label9.setText("Created Date: ");
        label9.setFont(new Font("Inter", Font.BOLD, 18));
        contentPane.add(label9, "cell 1 10,alignx right,growx 0");

        //---- txtCreaDate ----
        txtCreaDate.setText("text");
        txtCreaDate.setFont(new Font("Inter", Font.PLAIN, 18));
        contentPane.add(txtCreaDate, "cell 1 10");

        //---- btnConfirm ----
        btnConfirm.setText("Confirm");
        btnConfirm.addActionListener(this);
        contentPane.add(btnConfirm, "cell 1 11");

        //---- label7 ----
        label7.setText("Total Amount: ");
        label7.setFont(new Font("Inter", Font.BOLD, 18));
        contentPane.add(label7, "cell 3 11,alignx right,growx 0");

        //---- txtTotal ----
        txtTotal.setText("text");
        txtTotal.setFont(new Font("Inter", Font.PLAIN, 18));
        contentPane.add(txtTotal, "cell 3 11");

        //---- btnCancel ----
        btnCancel.setText("Cancel");
        btnCancel.addActionListener(this);
        contentPane.add(btnCancel, "cell 1 12");

        //---- label8 ----
        label8.setText("Payment Term: ");
        label8.setFont(new Font("Inter", Font.BOLD, 18));
        contentPane.add(label8, "cell 3 12,alignx right,growx 0");

        //---- txtPaymentTerm ----
        txtPaymentTerm.setText("text");
        txtPaymentTerm.setFont(new Font("Inter", Font.PLAIN, 18));
        contentPane.add(txtPaymentTerm, "cell 3 12");
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization
    }

    // JFormDesigner - End of variables declaration
    @Override
    public void actionPerformed(ActionEvent e) {
        MonthlyBillDAO monthlyBillDAO = new MonthlyBillDAO();
        if (e.getSource() == btnConfirm) {
            monthlyBillDAO.addUsedPostpaidService(monthlyBill);
            monthlyBillDAO.addMonthlyBill(monthlyBill);
            monthlyBillDAO.updateRoom(monthlyBill);
            JOptionPane.showMessageDialog(this, "Add monthly bill successfully");
            this.dispose();
        }else if (e.getSource() == btnCancel) {
            this.dispose();
        }
    }
}
