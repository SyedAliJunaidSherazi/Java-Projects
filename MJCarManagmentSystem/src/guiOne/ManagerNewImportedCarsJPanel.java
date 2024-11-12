package guiOne;

import javax.swing.*;
import java.awt.*;

import static guiOne.MainFrame.*;

public class ManagerNewImportedCarsJPanel extends JPanel {
    JButton jButtonImportedNewCar, jButtonImportedLocalCar, jButtonBack;

    public ManagerNewImportedCarsJPanel() {

        setVisible(true);
        setSize(600, 600);
        setBackground(Color.RED);
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

        add(Box.createRigidArea(new Dimension(0, 200)));

        jButtonImportedNewCar = new JButton("New Imported Cars");
        jButtonImportedNewCar.setVisible(true);
        jButtonImportedNewCar.setAlignmentX(Component.CENTER_ALIGNMENT);
        jButtonImportedNewCar.setMaximumSize(new Dimension(180, 40));
        jButtonImportedNewCar.setMinimumSize(new Dimension(180, 40));
        jButtonImportedNewCar.setBackground(Color.BLACK);
        jButtonImportedNewCar.setFont(new Font("Ariel", Font.BOLD, 12));
        jButtonImportedNewCar.setBorder(BorderFactory.createLineBorder(Color.WHITE));
        add(jButtonImportedNewCar);
        jButtonImportedNewCar.setFocusable(false);
        jButtonImportedNewCar.setForeground(Color.WHITE);
        add(Box.createRigidArea(new Dimension(0, 12)));

        jButtonImportedLocalCar = new JButton("Old Imported Cars");
        jButtonImportedLocalCar.setVisible(true);
        jButtonImportedLocalCar.setAlignmentX(Component.CENTER_ALIGNMENT);
        jButtonImportedLocalCar.setMaximumSize(new Dimension(180, 40));
        jButtonImportedLocalCar.setMinimumSize(new Dimension(180, 40));
        jButtonImportedLocalCar.setBackground(Color.BLACK);
        jButtonImportedLocalCar.setFont(new Font("Ariel", Font.BOLD, 12));
        jButtonImportedLocalCar.setBorder(BorderFactory.createLineBorder(Color.WHITE));
        add(jButtonImportedLocalCar);
        jButtonImportedLocalCar.setFocusable(false);
        jButtonImportedLocalCar.setForeground(Color.WHITE);
        add(Box.createRigidArea(new Dimension(0, 12)));

        jButtonBack = new JButton("Back");
        jButtonBack.setVisible(true);
        jButtonBack.setAlignmentX(Component.CENTER_ALIGNMENT);
        jButtonBack.setMaximumSize(new Dimension(180, 40));
        jButtonBack.setMinimumSize(new Dimension(180, 40));
        jButtonBack.setBackground(Color.BLACK);
        jButtonBack.setFont(new Font("Ariel", Font.BOLD, 12));
        jButtonBack.setBorder(BorderFactory.createLineBorder(Color.WHITE));
        add(jButtonBack);
        jButtonBack.setFocusable(false);
        jButtonBack.setForeground(Color.WHITE);


        jButtonBack.addActionListener(e -> {
            setVisible(false);
            managerCarsSection.setVisible(true);
        });

        jButtonImportedNewCar.addActionListener(e->{
            setVisible(false);
            managerNewImportedCarFunction.setVisible(true);
        });

        jButtonImportedLocalCar.addActionListener(e-> {
            setVisible(false);
            managerOldImportedCarFunction.setVisible(true);

        });
    }
}
