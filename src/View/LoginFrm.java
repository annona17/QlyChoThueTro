/*
 * Created by JFormDesigner on Thu Apr 18 12:12:16 ICT 2024
 */

package View;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

import dao.HostDAO;
import model.Host;
import net.miginfocom.swing.*;

/**
 * @author HP
 */
public class LoginFrm extends JFrame implements ActionListener {
    private JTextField txtUsername;
    private JPasswordField txtPassword;
    private JButton btnLogin;
    public LoginFrm() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        // Generated using JFormDesigner Evaluation license - Luu Ngoc Anh
        JLabel label3 = new JLabel();
        JLabel lblUsername = new JLabel();
        txtUsername = new JTextField();
        JLabel lblPassword = new JLabel();
        txtPassword = new JPasswordField();
        btnLogin = new JButton();

        //======== this ========
        var contentPane = getContentPane();
        contentPane.setLayout(new MigLayout(
            "hidemode 3",
            // columns
            "[54,fill]" +
            "[131,fill]" +
            "[200,fill]" +
            "[263,fill]" +
            "[146,fill]" +
            "[281,fill]",
            // rows
            "[]" +
            "[127]" +
            "[102]" +
            "[46]" +
            "[48]" +
            "[43]" +
            "[42]" +
            "[285]" +
            "[0]"));

        //---- label3 ----
        label3.setText("Login");
        label3.setFont(new Font("Inter", Font.BOLD, 36));
        contentPane.add(label3, "cell 0 1 6 1,align center center,grow 0 0");

        //---- lblUsername ----
        lblUsername.setText("Username");
        lblUsername.setFont(new Font("Inter", Font.PLAIN, 20));
        txtUsername.setFont(new Font("Inter", Font.PLAIN, 20));
        contentPane.add(lblUsername, "cell 2 3,alignx center,growx 0");
        contentPane.add(txtUsername, "cell 3 3 2 1, grow");

        //---- lblPassword ----
        lblPassword.setText("Password");
        lblPassword.setFont(new Font("Inter", Font.PLAIN, 20));
        txtPassword.setFont(new Font("Inter", Font.PLAIN, 20));
        contentPane.add(lblPassword, "cell 2 4,alignx center,growx 0");
        contentPane.add(txtPassword, "cell 3 4 2 1, grow");

        //---- btnLogin ----
        btnLogin.setText("Login");
        btnLogin.setFont(new Font("Inter", Font.PLAIN, 20));
        btnLogin.addActionListener(this);
        contentPane.add(btnLogin, "cell 4 6,grow");
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
        if (e.getSource().equals(btnLogin)) {
            HostDAO hostDAO = new HostDAO();
            Host host = new Host();
            host.setUsername(txtUsername.getText());
            host.setPassword(new String(txtPassword.getPassword()));
            if (hostDAO.checkLogin(host)) {
                // call the HomeFrm
                HomeFrm homeFrm = new HomeFrm(host);
                homeFrm.setVisible(true);
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(this, "Incorrect username or password!");
            }
        }
    }
    public static void main(String[] args) {
        LoginFrm loginFrm = new LoginFrm();
        loginFrm.setVisible(true);
    }
}
