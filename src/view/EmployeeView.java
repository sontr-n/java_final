package view;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.util.Vector;

public class EmployeeView extends JFrame {
    private JPanel mainPanel;
    private JTable dataTbl;
    private JLabel titleLbl;

    public EmployeeView() {
        super();
        this.titleLbl.setText("DANH SÁCH NHÂN VIÊN");
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setContentPane(mainPanel);
        this.pack();
    }

    public void updateTable(Vector<String> header, Vector<Vector<Object>> data) {
        DefaultTableModel tableModel = (DefaultTableModel) dataTbl.getModel();
        tableModel.setDataVector(data, header);
    }

}
