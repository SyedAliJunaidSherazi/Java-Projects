package swing;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ImportedOldCarFunctions extends JFrame {
    JPanel panel;
    JButton addCar, updateCar,  removeCar , back;


    public ImportedOldCarFunctions() throws HeadlessException {

        setExtendedState(java.awt.Frame.MAXIMIZED_BOTH);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);




        panel = new JPanel(); // like container you have to treat it like Frame set its everything
        panel.setVisible(true);
        add(panel);
        panel.setBackground(Color.RED);
        setVisible(true);
        panel.setLayout(new BoxLayout(panel,BoxLayout.Y_AXIS)); // layout line linear layout with orientation vertical

        panel.add(Box.createRigidArea(new Dimension(0,200))); // like padding or margin // chashmish isko khtm krdena phr jidr space chora hain waha icon lgadena apna


        addCar = new JButton("ADD OLD CAR");

        addCar.setAlignmentX(Component.CENTER_ALIGNMENT);
        addCar.setMaximumSize(new Dimension(180 , 40));
        addCar.setBackground(Color.BLACK); // meri adhi biwi isko phr change krlena
        addCar.setFont(new Font("Monotype Sort",Font.BOLD,12));
        addCar.setFocusable(false);
        panel.add(Box.createRigidArea(new Dimension(0,12))); // margin 12 smja kr russi brwe ki kasm
        addCar.setVisible(true);
        addCar.setBorder(BorderFactory.createLineBorder(Color.WHITE));
        addCar.setForeground(Color.WHITE);
        panel.add(addCar);

        updateCar = new JButton("UPDATE OLD CAR");
        updateCar.setAlignmentX(Component.CENTER_ALIGNMENT);
        updateCar.setMaximumSize(new Dimension(180,40));
        updateCar.setBackground(Color.BLACK);
        updateCar.setFont(new Font("Monotype Sort",Font.BOLD,12));
        updateCar.setFocusable(false);
        panel.add(Box.createRigidArea(new Dimension(0,12)));
        updateCar.setVisible(true);
        updateCar.setBorder(BorderFactory.createLineBorder(Color.WHITE));
        updateCar.setForeground(Color.WHITE);
        panel.add(updateCar);
        panel.add(Box.createRigidArea(new Dimension(0,12)));

        removeCar = new JButton("REMOVE OLD CAR");
        removeCar.setAlignmentX(Component.CENTER_ALIGNMENT);
        removeCar.setMaximumSize(new Dimension(180,40));
        removeCar.setBackground(Color.BLACK);
        removeCar.setFont(new Font("Monotype Sort",Font.BOLD,12));
        panel.add(removeCar);
        removeCar.setFocusable(false);
        panel.add(Box.createRigidArea(new Dimension(0,12)));
        removeCar.setVisible(true);
        removeCar.setBorder(BorderFactory.createLineBorder(Color.WHITE));
        removeCar.setForeground(Color.WHITE);



        back = new JButton("BACK");
        back.setAlignmentX(Component.CENTER_ALIGNMENT);
        back.setMaximumSize(new Dimension(180,40));
        back.setBackground(Color.BLACK);
        back.setFont(new Font("Monotype Sort",Font.BOLD,12));
        back.setFocusable(false);
        back.add(Box.createRigidArea(new Dimension(0,12)));
        back.setVisible(true);
        back.setBorder(BorderFactory.createLineBorder(Color.WHITE));
        back.setForeground(Color.WHITE);
        panel.add(back);

        addCar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {





                // perform actions here bro e,g agr manager pr click kya toh is panel ko disable krde or jo dusra panel hain usko visible krde

            }
        });

        updateCar.addActionListener(new ActionListener() {
                                        @Override
                                        public void actionPerformed(ActionEvent e) {


                                        }
                                    } // lambda expression bitch harami mukhtar doesnt know

        );
        removeCar.addActionListener(new ActionListener() {
                                        @Override
                                        public void actionPerformed(ActionEvent e) {


                                        }
                                    } // lambda expression bitch harami mukhtar doesnt know

        );
        back.addActionListener(new ActionListener() {
                                   @Override
                                   public void actionPerformed(ActionEvent e) {
                                       panel.setVisible(false);
                                       new ImportedCarCategory();

                                   }
                               } // lambda expression bitch harami mukhtar doesnt know

        );
    }


}
