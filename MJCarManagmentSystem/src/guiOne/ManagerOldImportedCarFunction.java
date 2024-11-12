package guiOne;

import javax.swing.*;
import java.awt.*;

import static guiOne.MainFrame.managerNewImportedCarsJPanel;

public class ManagerOldImportedCarFunction extends JPanel {

    JButton jButtonUpdate, jButtonRemove, jButtonAdd, jButtonBack;

    public ManagerOldImportedCarFunction() {
        setVisible(true);
        setBackground(Color.RED);
        setLayout(new BoxLayout(this,BoxLayout.Y_AXIS));
        setSize(600,600);

        add(Box.createRigidArea(new Dimension(0,100)));
        jButtonAdd = new JButton("ADD CAR");
        add(jButtonAdd);
        jButtonAdd.setVisible(true);
        jButtonAdd.setForeground(Color.WHITE);
        jButtonAdd.setBackground(Color.BLACK);
        jButtonAdd.setVisible(true);
        jButtonAdd.setMinimumSize(new Dimension(180,40));
        jButtonAdd.setMaximumSize(new Dimension(180,40));
        jButtonAdd.setAlignmentX(Component.CENTER_ALIGNMENT);

        add(Box.createRigidArea(new Dimension(0,10)));

        jButtonUpdate = new JButton("UPDATE CAR");
        add(jButtonUpdate);
        jButtonUpdate.setVisible(true);
        jButtonUpdate.setForeground(Color.WHITE);
        jButtonUpdate.setBackground(Color.BLACK);
        jButtonUpdate.setVisible(true);
        jButtonUpdate.setMinimumSize(new Dimension(180,40));
        jButtonUpdate.setMaximumSize(new Dimension(180,40));
        jButtonUpdate.setAlignmentX(Component.CENTER_ALIGNMENT);

        add(Box.createRigidArea(new Dimension(0,10)));

        jButtonRemove = new JButton("REMOVE CAR");
        add(jButtonRemove);
        jButtonRemove.setVisible(true);
        jButtonRemove.setForeground(Color.WHITE);
        jButtonRemove.setBackground(Color.BLACK);
        jButtonRemove.setVisible(true);
        jButtonRemove.setMinimumSize(new Dimension(180,40));
        jButtonRemove.setMaximumSize(new Dimension(180,40));
        jButtonRemove.setAlignmentX(Component.CENTER_ALIGNMENT);

        add(Box.createRigidArea(new Dimension(0,10)));

        jButtonBack = new JButton("BACK");
        add(jButtonBack);
        jButtonBack.setVisible(true);
        jButtonBack.setForeground(Color.WHITE);
        jButtonBack.setBackground(Color.BLACK);
        jButtonBack.setVisible(true);
        jButtonBack.setMinimumSize(new Dimension(180,40));
        jButtonBack.setMaximumSize(new Dimension(180,40));
        jButtonBack.setAlignmentX(Component.CENTER_ALIGNMENT);

        add(Box.createRigidArea(new Dimension(0,10)));


        jButtonBack.addActionListener(e-> {
            setVisible(false);
            managerNewImportedCarsJPanel.setVisible(true);
        });




    }
}
