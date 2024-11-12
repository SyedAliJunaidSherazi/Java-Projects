package guiOne;

import swing.ImportedCarCategory;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static guiOne.MainFrame.*;

public class ManagerCarsSection extends JPanel {
    JButton jButtonLocalCars, jButtonImportedCars, jButtonBack;

    public ManagerCarsSection() {
        setVisible(true);
        setBackground(Color.RED);
        setLayout(new BoxLayout(this,BoxLayout.Y_AXIS));
        setSize(600,600);

        add(Box.createRigidArea(new Dimension(0,200)));
        jButtonLocalCars = new JButton("Local Cars");
        add(jButtonLocalCars);
        jButtonLocalCars.setVisible(true);
        jButtonLocalCars.setForeground(Color.WHITE);
        jButtonLocalCars.setBackground(Color.BLACK);
        jButtonLocalCars.setVisible(true);
        jButtonLocalCars.setMinimumSize(new Dimension(180,40));
        jButtonLocalCars.setMaximumSize(new Dimension(180,40));
        jButtonLocalCars.setAlignmentX(Component.CENTER_ALIGNMENT);

        add(Box.createRigidArea(new Dimension(0,10)));

        jButtonImportedCars = new JButton("Imported Cars");
        add(jButtonImportedCars);
        jButtonImportedCars.setVisible(true);
        jButtonImportedCars.setForeground(Color.WHITE);
        jButtonImportedCars.setBackground(Color.BLACK);
        jButtonImportedCars.setVisible(true);
        jButtonImportedCars.setMinimumSize(new Dimension(180,40));
        jButtonImportedCars.setMaximumSize(new Dimension(180,40));
        jButtonImportedCars.setAlignmentX(Component.CENTER_ALIGNMENT);

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
            mainJPanel.setVisible(true);
        });

        jButtonLocalCars.addActionListener(e-> {
            setVisible(false);
            managerNewLocalCarsJPanel.setVisible(true);
        });

        jButtonImportedCars.addActionListener(e-> {
            setVisible(false);
            managerNewImportedCarsJPanel.setVisible(true);
        });


    }
}
