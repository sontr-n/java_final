package view;

import controller.EmployeeController;
import controller.ServiceController;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Menu extends JFrame {
    private JButton employeeBtn;
    private JButton serviceBtn;
    private JPanel mainPanel;

    public Menu() {
        super();

        config();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(mainPanel);
        this.pack();
    }

    private void config() {
        employeeBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                EmployeeController.getInstance().display();
            }
        });

        serviceBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ServiceController.getInstance().display();
            }
        });
    }

}
