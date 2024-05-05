/*
 * Created by JFormDesigner on Thu Apr 18 17:40:47 ICT 2024
 */

package View;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import dao.RentedRoomDAO;
import model.Host;
import model.RentedRoom;
import net.miginfocom.swing.*;

/**
 * @author HP
 */
public class InvoiceMonthlyFrm extends JFrame implements ActionListener {
    private JTextField txtForMonth;
    private JButton btnLoad;
    private JTable tblUnBillRoom;
    private JButton btnBack;
    private ArrayList<RentedRoom> lstUnBillRoom;
    private String month;
    private final Host host;
    public InvoiceMonthlyFrm(Host host) {
        this.host = host;
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
        // Generated using JFormDesigner Evaluation license - Luu Ngoc Anh
        JLabel lblInvoiceMonthly = new JLabel();
        JLabel lblForMonth = new JLabel();
        txtForMonth = new JTextField();
        btnLoad = new JButton();
        JScrollPane scrollPane1 = new JScrollPane();
        tblUnBillRoom = new JTable();
        btnBack = new JButton();

        //======== this ========
        var contentPane = getContentPane();
        contentPane.setLayout(new MigLayout(
            "hidemode 3",
            // columns
            "[fill]" +
            "[97,fill]" +
            "[137,fill]" +
            "[438,fill]" +
            "[28,fill]" +
            "[95,fill]" +
            "[113,fill]",
            // rows
            "[]" +
            "[]" +
            "[32]" +
            "[11]" +
            "[0]" +
            "[489]" +
            "[92]"));

        //---- lblInvoiceMonthly ----
        lblInvoiceMonthly.setText("Invoice Monthly");
        lblInvoiceMonthly.setFont(new Font("Inter", Font.BOLD, 36));
        contentPane.add(lblInvoiceMonthly, "cell 0 1 7 1,align center center,grow 0 0");

        //---- lblForMonth ----
        lblForMonth.setText("For Month");
        lblForMonth.setFont(new Font("Inter", Font.PLAIN, 16));
        txtForMonth.setFont(new Font("Inter", Font.PLAIN, 16));
        contentPane.add(lblForMonth, "cell 2 3,alignx right,growx 0");
        contentPane.add(txtForMonth, "cell 3 3, grow");

        //---- btnLoad ----
        btnLoad.setText("Load");
        btnLoad.setFont(new Font("Inter", Font.PLAIN, 16));
        btnLoad.addActionListener(this);
        contentPane.add(btnLoad, "cell 4 3");

        //======== scrollPane1 ========
        {
            //---- tblUnBillRoom ----
            tblUnBillRoom.setModel(new DefaultTableModel(
                new Object[][] {
                    {null, null, null, null, "", null, null},
                },
                new String[] {
                    "STT", "ID room", "Name", "Type", "Description", "Price", "Status"
                }
            ));
            scrollPane1.setViewportView(tblUnBillRoom);
            tblUnBillRoom.addMouseListener(new MouseAdapter(){
                public void mouseClicked(MouseEvent e) {
                    int row = tblUnBillRoom.rowAtPoint(e.getPoint());
                    //System.out.println(row);
                    if (row >= 0 && row < lstUnBillRoom.size()) {
                        RentedRoom selectedRoom = lstUnBillRoom.get(row);
                        if (selectedRoom == null) {
                            System.out.println("Room is null");
                        } else {
                            System.out.println("Room is not null");
                            (new EnterElecWatFrm(selectedRoom, month, host)).setVisible(true);
                        }
                    }
                }
            });
        }
        contentPane.add(scrollPane1, "cell 2 5 4 1");

        //---- btnBack ----
        btnBack.setText("Back to home");
        btnBack.addActionListener(this);
        contentPane.add(btnBack, "cell 2 6");
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
        if (e.getSource().equals(btnLoad)) {
            RentedRoomDAO rd = new RentedRoomDAO();
            month = txtForMonth.getText();
            String[] columnNames = {"STT", "ID RentedRoom", "Price", "StartDate Rent", "EndDate Rent", "Deposit", "Debt" };
            String[][] value = new String[rd.loadUnBillRoom(month).size()][8];
            lstUnBillRoom = rd.loadUnBillRoom(month);
            if (month.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Please enter month");
            }else if (lstUnBillRoom.isEmpty()) {
                // clear bang cu
                DefaultTableModel tableModel = new DefaultTableModel(value, columnNames) {
                    @Override
                    public boolean isCellEditable(int row, int column) {
                        //unable to edit cells
                        return false;
                    }
                };
                tblUnBillRoom.setModel(tableModel);
                JOptionPane.showMessageDialog(null, "No room to bill");
            }else{
                for (int i = 0; i < lstUnBillRoom.size(); i++) {
                    value[i][0] = i + 1 + "";
                    value[i][1] = lstUnBillRoom.get(i).getID() + "";
                    value[i][2] = lstUnBillRoom.get(i).getPrice() + "";
                    value[i][3] = lstUnBillRoom.get(i).getStartDateRent() + "";
                    value[i][4] = lstUnBillRoom.get(i).getEndDateRent() + "";
                    value[i][5] = lstUnBillRoom.get(i).getDeposit() + "";
                    value[i][6] = lstUnBillRoom.get(i).getDebt() + "";
                }
                DefaultTableModel tableModel = new DefaultTableModel(value, columnNames) {
                    @Override
                    public boolean isCellEditable(int row, int column) {
                        //unable to edit cells
                        return false;
                    }
                };
                tblUnBillRoom.setModel(tableModel);
            }
        } else if (e.getSource().equals(btnBack)) {
            this.dispose();
            new HomeFrm(host).setVisible(true);
        }
    }
}
