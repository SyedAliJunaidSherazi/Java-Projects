package guiOne;

import javax.swing.*;
import java.awt.*;

import static guiOne.MainFrame.*;

public class ManagerNewLocalCarsJPanel extends JPanel {

    JButton jButtonLocalCar, jButtonImportCar, jButtonBack;

    public ManagerNewLocalCarsJPanel() {
        setVisible(true);
        setSize(600,600);
        setBackground(Color.RED);
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

        add(Box.createRigidArea(new Dimension(0,200)));

        jButtonLocalCar = new JButton("New Local Cars");
        jButtonLocalCar.setVisible(true);
        jButtonLocalCar.setAlignmentX(Component.CENTER_ALIGNMENT);
        jButtonLocalCar.setMaximumSize(new Dimension(180,40));
        jButtonLocalCar.setMinimumSize(new Dimension(180,40));
        jButtonLocalCar.setBackground(Color.BLACK);
        jButtonLocalCar.setFont(new Font("Ariel",Font.BOLD,12));
        jButtonLocalCar.setBorder(BorderFactory.createLineBorder(Color.WHITE));
        add(jButtonLocalCar);
        jButtonLocalCar.setFocusable(false);
        jButtonLocalCar.setForeground(Color.WHITE);
        add(Box.createRigidArea(new Dimension(0,12)));

        jButtonImportCar = new JButton("Old Local Cars");
        jButtonImportCar.setVisible(true);
        jButtonImportCar.setAlignmentX(Component.CENTER_ALIGNMENT);
        jButtonImportCar.setMaximumSize(new Dimension(180,40));
        jButtonImportCar.setMinimumSize(new Dimension(180,40));
        jButtonImportCar.setBackground(Color.BLACK);
        jButtonImportCar.setFont(new Font("Ariel",Font.BOLD,12));
        jButtonImportCar.setBorder(BorderFactory.createLineBorder(Color.WHITE));
        add(jButtonImportCar);
        jButtonImportCar.setFocusable(false);
        jButtonImportCar.setForeground(Color.WHITE);
        add(Box.createRigidArea(new Dimension(0,12)));

        jButtonBack = new JButton("Back");
        jButtonBack.setVisible(true);
        jButtonBack.setAlignmentX(Component.CENTER_ALIGNMENT);
        jButtonBack.setMaximumSize(new Dimension(180,40));
        jButtonBack.setMinimumSize(new Dimension(180,40));
        jButtonBack.setBackground(Color.BLACK);
        jButtonBack.setFont(new Font("Ariel",Font.BOLD,12));
        jButtonBack.setBorder(BorderFactory.createLineBorder(Color.WHITE));
        add(jButtonBack);
        jButtonBack.setFocusable(false);
        jButtonBack.setForeground(Color.WHITE);


        jButtonBack.addActionListener(e-> {
            setVisible(false);
            managerCarsSection.setVisible(true);
        });

        jButtonImportCar.addActionListener(e-> {
            setVisible(false);
            managerNewLocalCarFunction.setVisible(true);
        });

        jButtonLocalCar.addActionListener(e-> {
            setVisible(false);
            managerOldLocalCarFunction.setVisible(true);
        });


    }
}
