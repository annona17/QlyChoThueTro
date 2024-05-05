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
    private JButton btnInvoiceMonthly;
    private JButton btnLogout;
    private final Host host;
    public HomeFrm(Host host) {
        this.host = host;
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        // Generated using JFormDesigner Evaluation license - Luu Ngoc Anh
        JLabel label1 = new JLabel();
        btnLogout = new JButton();
        JButton btnBoardHouseManage = new JButton();
        JButton btnRoomManage = new JButton();
        JButton btnClientManage = new JButton();
        JButton btnService = new JButton();
        btnInvoiceMonthly = new JButton();
        JButton btnPay = new JButton();
        JButton btnStatistic = new JButton();

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
            "[]" +
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

        //---- btnLogout ----
        btnLogout.setText("Log out");
        btnLogout.addActionListener(this);
        contentPane.add(btnLogout, "cell 6 2");

        //---- btnBoardHouseManage ----
        btnBoardHouseManage.setText("BoardHouse Manage");
        btnBoardHouseManage.setFont(new Font("Inter", Font.PLAIN, 24));
        contentPane.add(btnBoardHouseManage, "cell 1 4,grow");

        //---- btnRoomManage ----
        btnRoomManage.setText("Room Manage");
        btnRoomManage.setFont(new Font("Inter", Font.PLAIN, 24));
        contentPane.add(btnRoomManage, "cell 3 4,grow");

        //---- btnClientManage ----
        btnClientManage.setText("Client Mangage");
        btnClientManage.setFont(new Font("Inter", Font.PLAIN, 24));
        contentPane.add(btnClientManage, "cell 5 4,grow");

        //---- btnService ----
        btnService.setText("Service");
        btnService.setFont(new Font("Inter", Font.PLAIN, 24));
        contentPane.add(btnService, "cell 1 5,grow");

        //---- btnInvoiceMonthly ----
        btnInvoiceMonthly.setText("Invoice Monthly");
        btnInvoiceMonthly.setFont(new Font("Inter", Font.PLAIN, 24));
        btnInvoiceMonthly.addActionListener(this);
        contentPane.add(btnInvoiceMonthly, "cell 3 5,grow");

        //---- btnPay ----
        btnPay.setText("Pay");
        btnPay.setFont(new Font("Inter", Font.PLAIN, 24));
        contentPane.add(btnPay, "cell 5 5,grow");

        //---- btnStatistic ----
        btnStatistic.setText("Statistic");
        btnStatistic.setFont(new Font("Inter", Font.PLAIN, 24));
        contentPane.add(btnStatistic, "cell 3 7,grow");
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization
        this.setSize(1000, 750);
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
    // Generated using JFormDesigner Evaluation license - Luu Ngoc Anh

    // JFormDesigner - End of variables declaration
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnLogout) {
            this.dispose();
            new LoginFrm().setVisible(true);
        }else if (e.getSource() == btnInvoiceMonthly) {
            this.dispose();
            new InvoiceMonthlyFrm(host).setVisible(true);
        }
    }
}
