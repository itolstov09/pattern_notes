package com.company.creational.factory_method.button;

import javax.swing.*;
import java.awt.*;

public class WindowsButton implements Button{
    JPanel jPanel = new JPanel();
    JFrame jFrame = new JFrame();
    JButton jButton;


    @Override
    public void render() {
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel label = new JLabel("Hello World!");
        label.setOpaque(true);
        label.setBackground(new Color(10, 87, 130));
        label.setFont(new Font("Dialog", Font.BOLD, 44));
        label.setHorizontalAlignment(SwingConstants.CENTER);
        jPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
        jFrame.getContentPane().add(jPanel);
        jPanel.add(label);
        onClick();
        jPanel.add(jButton);

        jFrame.setSize(320, 200);
        jFrame.setVisible(true);
        onClick();

    }

    @Override
    public void onClick() {
        jButton = new JButton("Exit");
        jButton.addActionListener(e -> {
            jFrame.setVisible(false);
            System.exit(0);
        });
    }
}
