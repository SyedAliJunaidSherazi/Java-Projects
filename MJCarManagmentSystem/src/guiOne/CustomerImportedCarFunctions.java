package guiOne;

import javax.swing.*;
import java.awt.*;

import static guiOne.MainFrame.customerCarsSection;
import static guiOne.MainFrame.customerImportedCarFunctions;

public class CustomerImportedCarFunctions extends JPanel {

    JButton jButtonPurchase, jButtonSell, jButtonDisplayCars, jButtonBack;

    public CustomerImportedCarFunctions() {

        setVisible(true);
        setBackground(Color.RED);
        setLayout(new BoxLayout(this,BoxLayout.Y_AXIS));
        setSize(600,600);
        add(Box.createRigidArea(new Dimension(0,200)));

        jButtonPurchase = new JButton("Purchase Car");
        add(jButtonPurchase);
        jButtonPurchase.setVisible(true);
        jButtonPurchase.setForeground(Color.WHITE);
        jButtonPurchase.setBackground(Color.BLACK);
        jButtonPurchase.setVisible(true);
        jButtonPurchase.setMinimumSize(new Dimension(180,40));
        jButtonPurchase.setMaximumSize(new Dimension(180,40));
        jButtonPurchase.setAlignmentX(Component.CENTER_ALIGNMENT);

        add(Box.createRigidArea(new Dimension(0,10)));

        jButtonSell = new JButton("Sell Car");
        add(jButtonSell);
        jButtonSell.setVisible(true);
        jButtonSell.setForeground(Color.WHITE);
        jButtonSell.setBackground(Color.BLACK);
        jButtonSell.setVisible(true);
        jButtonSell.setMinimumSize(new Dimension(180,40));
        jButtonSell.setMaximumSize(new Dimension(180,40));
        jButtonSell.setAlignmentX(Component.CENTER_ALIGNMENT);

        add(Box.createRigidArea(new Dimension(0,10)));

        jButtonDisplayCars = new JButton("Display Car Detail");
        add(jButtonDisplayCars);
        jButtonDisplayCars.setVisible(true);
        jButtonDisplayCars.setForeground(Color.WHITE);
        jButtonDisplayCars.setBackground(Color.BLACK);
        jButtonDisplayCars.setVisible(true);
        jButtonDisplayCars.setMinimumSize(new Dimension(180,40));
        jButtonDisplayCars.setMaximumSize(new Dimension(180,40));
        jButtonDisplayCars.setAlignmentX(Component.CENTER_ALIGNMENT);

        add(Box.createRigidArea(new Dimension(0,10)));

        jButtonBack = new JButton("Back");
        add(jButtonBack);
        jButtonBack.setVisible(true);
        jButtonBack.setForeground(Color.WHITE);
        jButtonBack.setBackground(Color.BLACK);
        jButtonBack.setVisible(true);
        jButtonBack.setMinimumSize(new Dimension(180,40));
        jButtonBack.setMaximumSize(new Dimension(180,40));
        jButtonBack.setAlignmentX(Component.CENTER_ALIGNMENT);


        jButtonBack.addActionListener(e-> {
            setVisible(false);
            customerCarsSection.setVisible(true);
        });






    }
}
