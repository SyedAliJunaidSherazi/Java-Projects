package guiOne;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static guiOne.MainFrame.customerCarsSection;
import static guiOne.MainFrame.managerCarsSection;


public class MainJPanel extends JPanel {
    JButton jButtonManager, jButtonCustomer;

    public MainJPanel() {
        setVisible(true);
        setBackground(Color.RED);
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        add(Box.createRigidArea(new Dimension(0, 200)));


        jButtonManager = new JButton("MANAGER");
        jButtonManager.setVisible(true);
        jButtonManager.setAlignmentX(Component.CENTER_ALIGNMENT);
        jButtonManager.setMaximumSize(new Dimension(180, 40));
        jButtonManager.setBackground(Color.BLACK);
        jButtonManager.setFont(new Font("Ariel", Font.ITALIC, 12));
        jButtonManager.setForeground(Color.white);
        //        jButtonManager.setBorderPainted(false);
        add(jButtonManager);
        jButtonManager.setFocusable(false);
        jButtonManager.setBorder(BorderFactory.createLineBorder(Color.WHITE));
        add(Box.createRigidArea(new Dimension(0, 12))); // margin 12 smja kr russi brwe ki kasm

        jButtonCustomer = new JButton("CUSTOMER");
        jButtonCustomer.setVisible(true);
        add(jButtonCustomer);
        jButtonCustomer.setAlignmentX(Component.CENTER_ALIGNMENT);
        jButtonCustomer.setMaximumSize(new Dimension(180, 40));
        jButtonCustomer.setBackground(Color.BLACK);
        jButtonCustomer.setFont(new Font("Monotype Sort", Font.ITALIC, 12));
        jButtonCustomer.setFocusable(false);
        jButtonCustomer.setBorder(BorderFactory.createLineBorder(Color.WHITE));
        jButtonCustomer.setForeground(Color.white);
        add(Box.createRigidArea(new Dimension(0, 12)));


        jButtonManager.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);


            }
        });

        jButtonCustomer.addActionListener(new ActionListener() {
                                              @Override
                                              public void actionPerformed(ActionEvent e) {
                                                  setVisible(false);
                                                  customerCarsSection.setVisible(true);

                                              }
                                          }

        );

        jButtonManager.addActionListener(e-> {
            setVisible(false);
            managerCarsSection.setVisible(true);
        });
    }
}
