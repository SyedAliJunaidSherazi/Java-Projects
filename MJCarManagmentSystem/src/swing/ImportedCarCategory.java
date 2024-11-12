package swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ImportedCarCategory extends JFrame {
    JPanel newoldPanel;
    JButton newImportedCar, oldImportedCar, back;


    public ImportedCarCategory() throws HeadlessException {

        setExtendedState(java.awt.Frame.MAXIMIZED_BOTH);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);




        System.out.println();

        newoldPanel = new JPanel(); // like container you have to treat it like Frame set its everything
        newoldPanel.setVisible(true);
        add(newoldPanel);
        newoldPanel.setBackground(Color.RED);
        setVisible(true);
        newoldPanel.setLayout(new BoxLayout(newoldPanel, BoxLayout.Y_AXIS)); // layout line linear layout with orientation vertical

        newoldPanel.add(Box.createRigidArea(new Dimension(0, 200))); // like padding or margin // chashmish isko khtm krdena phr jidr space chora hain waha icon lgadena apna


        newImportedCar = new JButton("NEW IMPORTED CAR");

        newImportedCar.setAlignmentX(Component.CENTER_ALIGNMENT);
        newImportedCar.setMaximumSize(new Dimension(180, 40));
        newImportedCar.setBackground(Color.BLACK); // meri adhi biwi isko phr change krlena
        newImportedCar.setFont(new Font("Monotype Sort", Font.BOLD, 12));
        newImportedCar.setBorder(BorderFactory.createLineBorder(Color.WHITE));
        newImportedCar.setForeground(Color.WHITE);

        newoldPanel.add(newImportedCar);
        newImportedCar.setFocusable(false);
        newoldPanel.add(Box.createRigidArea(new Dimension(0, 12))); // margin 12 smja kr russi brwe ki kasm
        newImportedCar.setVisible(true);

        oldImportedCar = new JButton("OLD IMPORTED CAR");


        oldImportedCar.setAlignmentX(Component.CENTER_ALIGNMENT);
        oldImportedCar.setMaximumSize(new Dimension(180, 40));
        oldImportedCar.setBackground(Color.BLACK);
        oldImportedCar.setFont(new Font("Monotype Sort", Font.BOLD, 12));
        newoldPanel.add(oldImportedCar);
        oldImportedCar.setFocusable(false);
        oldImportedCar.setBorder(BorderFactory.createLineBorder(Color.WHITE));
        newoldPanel.add(Box.createRigidArea(new Dimension(0, 12)));
        oldImportedCar.setVisible(true);
        oldImportedCar.setForeground(Color.WHITE);



        back = new JButton("BACK");
        back.setAlignmentX(Component.CENTER_ALIGNMENT);
        back.setMaximumSize(new Dimension(180, 40));
        back.setBackground(Color.BLACK);
        back.setFont(new Font("Monotype Sort", Font.BOLD, 12));

        back.setFocusable(false);
        back.add(Box.createRigidArea(new Dimension(0, 12)));
        back.setVisible(true);
        back.setBorder(BorderFactory.createLineBorder(Color.WHITE));
        back.setForeground(Color.WHITE);
        newoldPanel.add(back);

        newImportedCar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                newoldPanel.setVisible(false);
                new ImportedNewCarFunctions();


                // perform actions here bro e,g agr manager pr click kya toh is panel ko disable krde or jo dusra panel hain usko visible krde

            }
        });

        oldImportedCar.addActionListener(new ActionListener() {
                                             @Override
                                             public void actionPerformed(ActionEvent e) {
                                                 new ImportedOldCarFunctions();


                                             }
                                         } // lambda expression bitch harami mukhtar doesnt know

        );
        back.addActionListener(new ActionListener() {
                                   @Override
                                   public void actionPerformed(ActionEvent e) {
                                       newoldPanel.setVisible(false);
                                       new ManagerCarsCategory();

                                   }
                               } // lambda expression bitch harami mukhtar doesnt know

        );
    }


}
