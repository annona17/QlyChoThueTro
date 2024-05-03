/*
 * Created by JFormDesigner on Thu Apr 18 17:33:45 ICT 2024
 */

package View;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

import model.Host;
import net.miginfocom.swing.*;

/**
 * @author HP
 */
public class HomeFrm extends JFrame implements ActionListener {
    private JLabel label1;
    private JButton btnBoardHouseManage;
    private JButton btnRoomManage;
    private JButton btnClientManage;
    private JButton btnService;
    private JButton btnInvoiceMonthly;
    private JButton btnPay;
    private JButton btnStatistic;
    private Host host;
    public HomeFrm(Host host) {
        this.host = host;
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        // Generated using JFormDesigner Evaluation license - Luu Ngoc Anh
        label1 = new JLabel();
        btnBoardHouseManage = new JButton();
        btnRoomManage = new JButton();
        btnClientManage = new JButton();
        btnService = new JButton();
        btnInvoiceMonthly = new JButton();
        btnPay = new JButton();
        btnStatistic = new JButton();

        //======== this ========
        var contentPane = getContentPane();
        contentPane.setLayout(new MigLayout(
            "hidemode 3",
            // columns
            "[106,fill]" +
            "[256,fill]" +
            "[32,fill]" +
            "[308,fill]" +
            "[33,fill]" +
            "[230,fill]" +
            "[128,fill]",
            // rows
            "[]" +
            "[61]" +
            "[88]" +
            "[115]" +
            "[108]" +
            "[11]" +
            "[99]" +
            "[178]"));

        //---- label1 ----
        label1.setText("Home");
        label1.setFont(new Font("Inter", Font.BOLD, 36));
        contentPane.add(label1, "cell 3 1,align center center,grow 0 0");

        //---- btnBoardHouseManage ----
        btnBoardHouseManage.setText("BoardHouse Manage");
        btnBoardHouseManage.setFont(new Font("Inter", Font.PLAIN, 24));
        contentPane.add(btnBoardHouseManage, "cell 1 3, grow");

        //---- btnRoomManage ----
        btnRoomManage.setText("Room Manage");
        btnRoomManage.setFont(new Font("Inter", Font.PLAIN, 24));
        contentPane.add(btnRoomManage, "cell 3 3, grow");

        //---- btnClientManage ----
        btnClientManage.setText("Client Mangage");
        btnClientManage.setFont(new Font("Inter", Font.PLAIN, 24));
        contentPane.add(btnClientManage, "cell 5 3,grow");

        //---- btnService ----
        btnService.setText("Service");
        btnService.setFont(new Font("Inter", Font.PLAIN, 24));
        contentPane.add(btnService, "cell 1 4, grow");

        //---- btnInvoiceMonthly ----
        btnInvoiceMonthly.setText("Invoice Monthly");
        btnInvoiceMonthly.setFont(new Font("Inter", Font.PLAIN, 24));
        btnInvoiceMonthly.addActionListener(this::actionPerformed);
        contentPane.add(btnInvoiceMonthly, "cell 3 4, grow");

        //---- btnPay ----
        btnPay.setText("Pay");
        btnPay.setFont(new Font("Inter", Font.PLAIN, 24));
        contentPane.add(btnPay, "cell 5 4,grow");

        //---- btnStatistic ----
        btnStatistic.setText("Statistic");
        btnStatistic.setFont(new Font("Inter", Font.PLAIN, 24));
        contentPane.add(btnStatistic, "cell 3 6, grow");
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    // Generated using JFormDesigner Evaluation license - Luu Ngoc Anh
    ;@Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        if(e.getSource().equals(btnInvoiceMonthly)){
            InvoiceMonthlyFrm frm = new InvoiceMonthlyFrm(host);
            frm.setVisible(true);
            this.dispose();
        }
    }
    // JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
