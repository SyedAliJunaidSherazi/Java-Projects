package guiOne;

import org.djbros.ShowRoomCars;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

import static guiOne.MainFrame.managerNewImportedCarFunction;

public class ManagerImportedNewUpdateCar extends JPanel {

    JTextField jTextFieldAddCar, jTextFieldCarPrice, jTextFieldPreviousCarName;
    JSpinner jSpinnerCarType, jSpinnerAuction, jSpinnerCarModel, jSpinnerCarCondition, jSpinnerImportYear,
            jSpinnerGrade, jSpinnerPreviousCarType;
    JButton jButtonBack, jButtonAdd, jButtonSearch;

    int index = 0;

    public ManagerImportedNewUpdateCar() {
        setVisible(true);
        setBackground(Color.RED);
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        setSize(600, 600);

        add(Box.createRigidArea(new Dimension(0, 100)));

        JPanel panel = new JPanel();
        add(panel);
        panel.setVisible(true);
        panel.setBackground(Color.RED);
        panel.setLayout(new BoxLayout(panel, BoxLayout.X_AXIS));
        jTextFieldPreviousCarName = new JTextField("Enter Car Name");
        panel.add(jTextFieldPreviousCarName);
        jTextFieldPreviousCarName.setVisible(true);
        jTextFieldPreviousCarName.setMinimumSize(new Dimension(250, 40));
        jTextFieldPreviousCarName.setMaximumSize(new Dimension(250, 40));
        panel.add(Box.createRigidArea(new Dimension(10, 0)));

        String[] carType = {"Select Car Type", "Hatchback", "Sedan", "Crossover", "SUV", "Sports"};

        jSpinnerPreviousCarType = new JSpinner(new SpinnerListModel(carType));
        jSpinnerPreviousCarType.setVisible(true);
        jSpinnerPreviousCarType.setMinimumSize(new Dimension(250, 40));
        jSpinnerPreviousCarType.setMaximumSize(new Dimension(250, 40));
        panel.add(jSpinnerPreviousCarType);
        add(Box.createRigidArea(new Dimension(0, 10)));


        JPanel panel5 = new JPanel();
        add(panel5);
        panel5.setVisible(true);
        panel5.setBackground(Color.RED);
        panel5.setLayout(new BoxLayout(panel5, BoxLayout.X_AXIS));

        jButtonBack = new JButton("Back");
        panel5.add(jButtonBack);
        jButtonBack.setVisible(true);
        jButtonBack.setForeground(Color.WHITE);
        jButtonBack.setBackground(Color.BLACK);
        jButtonBack.setVisible(true);
        jButtonBack.setMinimumSize(new Dimension(180, 40));
        jButtonBack.setMaximumSize(new Dimension(180, 40));
        jButtonBack.setAlignmentX(Component.CENTER_ALIGNMENT);

        panel5.add(Box.createRigidArea(new Dimension(10, 0)));

        jButtonSearch = new JButton("Search");
        panel5.add(jButtonSearch);
        jButtonSearch.setVisible(true);
        jButtonSearch.setForeground(Color.WHITE);
        jButtonSearch.setBackground(Color.BLACK);
        jButtonSearch.setVisible(true);
        jButtonSearch.setMinimumSize(new Dimension(180, 40));
        jButtonSearch.setMaximumSize(new Dimension(180, 40));
        jButtonSearch.setAlignmentX(Component.CENTER_ALIGNMENT);
        add(Box.createRigidArea(new Dimension(0, 10)));

        JPanel panel1 = new JPanel();
        add(panel1);
        panel1.setVisible(false);
        panel1.setBackground(Color.RED);
        panel1.setLayout(new BoxLayout(panel1, BoxLayout.X_AXIS));
        jTextFieldAddCar = new JTextField("Enter Car Name");
        panel1.add(jTextFieldAddCar);
        jTextFieldAddCar.setVisible(true);
        jTextFieldAddCar.setMinimumSize(new Dimension(250, 40));
        jTextFieldAddCar.setMaximumSize(new Dimension(250, 40));
        panel1.add(Box.createRigidArea(new Dimension(10, 0)));

        jTextFieldCarPrice = new JTextField("Enter Car Price");
        panel1.add(jTextFieldCarPrice);
        jTextFieldCarPrice.setVisible(true);
        jTextFieldCarPrice.setMinimumSize(new Dimension(250, 40));
        jTextFieldCarPrice.setMaximumSize(new Dimension(250, 40));

        jTextFieldAddCar.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                jTextFieldAddCar.setText("");
            }
        });

        add(Box.createRigidArea(new Dimension(0, 10)));


        jSpinnerCarType = new JSpinner(new SpinnerListModel(carType));

        JPanel panel2 = new JPanel();
        add(panel2);
        panel2.setVisible(false);
        panel2.setBackground(Color.RED);
        panel2.setLayout(new BoxLayout(panel2, BoxLayout.X_AXIS));

        jSpinnerCarType.setVisible(true);
        jSpinnerCarType.setMinimumSize(new Dimension(250, 40));
        jSpinnerCarType.setMaximumSize(new Dimension(250, 40));
        panel2.add(jSpinnerCarType);

        panel2.add(Box.createRigidArea(new Dimension(10, 0)));

        String[] carAuction = {"Is Car Auction Sheet Available?", "Yes", "No"};
        jSpinnerAuction = new JSpinner(new SpinnerListModel(carAuction));
        jSpinnerAuction.setVisible(true);
        jSpinnerAuction.setMinimumSize(new Dimension(250, 40));
        jSpinnerAuction.setMaximumSize(new Dimension(250, 40));
        panel2.add(jSpinnerAuction);

        add(Box.createRigidArea(new Dimension(0, 10)));

        String[] carModel = {"Select Car Model", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018"};
        jSpinnerCarModel = new JSpinner(new SpinnerListModel(carModel));

        JPanel panel3 = new JPanel();
        add(panel3);
        panel3.setVisible(false);
        panel3.setBackground(Color.RED);
        panel3.setLayout(new BoxLayout(panel3, BoxLayout.X_AXIS));

        jSpinnerCarModel.setVisible(true);
        jSpinnerCarModel.setMinimumSize(new Dimension(250, 40));
        jSpinnerCarModel.setMaximumSize(new Dimension(250, 40));
        panel3.add(jSpinnerCarModel);

        panel3.add(Box.createRigidArea(new Dimension(10, 0)));


        String[] carGrade = {"Select Car Grade", "1.0", "1.5", "2.0", "2.5", "3.0", "3.5", "4.0", "4.5", "5.0"};
        jSpinnerGrade = new JSpinner(new SpinnerListModel(carGrade));
        jSpinnerGrade.setVisible(true);
        jSpinnerGrade.setMinimumSize(new Dimension(250, 40));
        jSpinnerGrade.setMaximumSize(new Dimension(250, 40));
        panel3.add(jSpinnerGrade);

        add(Box.createRigidArea(new Dimension(0, 10)));

        JPanel panel4 = new JPanel();
        add(panel4);
        panel4.setVisible(false);
        panel4.setBackground(Color.RED);
        panel4.setLayout(new BoxLayout(panel4, BoxLayout.X_AXIS));

        String[] carCondition = {"Select Car Condition", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
        jSpinnerCarCondition = new JSpinner(new SpinnerListModel(carCondition));
        jSpinnerCarCondition.setVisible(true);
        jSpinnerCarCondition.setMinimumSize(new Dimension(250, 40));
        jSpinnerCarCondition.setMaximumSize(new Dimension(250, 40));
        panel4.add(jSpinnerCarCondition);

        panel4.add(Box.createRigidArea(new Dimension(10, 0)));

        String[] carImportYear = {"Select Car Import Year", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019", "2020", "2021"};

        jSpinnerImportYear = new JSpinner(new SpinnerListModel(carImportYear));
        jSpinnerImportYear.setVisible(true);
        jSpinnerImportYear.setMinimumSize(new Dimension(250, 40));
        jSpinnerImportYear.setMaximumSize(new Dimension(250, 40));
        panel4.add(jSpinnerImportYear);

        add(Box.createRigidArea(new Dimension(0, 10)));




        jButtonAdd = new JButton("Add");
        add(jButtonAdd);
        jButtonAdd.setForeground(Color.WHITE);
        jButtonAdd.setBackground(Color.BLACK);
        jButtonAdd.setVisible(false);
        jButtonAdd.setMinimumSize(new Dimension(180, 40));
        jButtonAdd.setMaximumSize(new Dimension(180, 40));
        jButtonAdd.setAlignmentX(Component.CENTER_ALIGNMENT);


        jButtonBack.addActionListener(e -> {
            setVisible(false);
            managerNewImportedCarFunction.setVisible(true);
            panel1.setVisible(false);
            panel2.setVisible(false);
            panel3.setVisible(false);
            panel4.setVisible(false);
            jButtonAdd.setVisible(false);
        });

        jButtonSearch.addActionListener(e -> {
            String prevCarType = String.valueOf(jSpinnerPreviousCarType.getValue());
            String prevCarName = jTextFieldPreviousCarName.getText();

            if (searchCar(prevCarName, prevCarType)) {
                JOptionPane.showMessageDialog(this, "Car found. Update Now!");
                panel1.setVisible(true);
                panel2.setVisible(true);
                panel3.setVisible(true);
                panel4.setVisible(true);
                jButtonAdd.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(this, "Car Not Found.");
            }
        });

    }

    private boolean searchCar(String carName, String carType) {
        FileInputStream fileOutputStream = null;
        ArrayList importedNewCars = null;
        try {
            fileOutputStream = new FileInputStream("y.txt");
            ObjectInputStream ois = new ObjectInputStream(fileOutputStream);
            importedNewCars = (ArrayList<ShowRoomCars>) ois.readObject();
            if (!importedNewCars.isEmpty()) {

                for (int i = 0; i < importedNewCars.size(); i++) {
                    ShowRoomCars s = (ShowRoomCars) importedNewCars.get(i);
                    if (s.carName.equalsIgnoreCase(carName) && s.carType.equalsIgnoreCase(carType)) {

                        return true;
                    }
                }
            }
            ois.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;

    }
}
