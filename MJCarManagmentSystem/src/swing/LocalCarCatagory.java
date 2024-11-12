package swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class LocalCarCatagory extends JFrame {
    JPanel newoldPanel;
    JButton newLocalCar, oldLocalCar, back;



    public LocalCarCatagory() throws HeadlessException {

        setExtendedState(java.awt.Frame.MAXIMIZED_BOTH);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);






        newoldPanel = new JPanel(); // like container you have to treat it like Frame set its everything
        newoldPanel.setVisible(true);
        add(newoldPanel);
        newoldPanel.setBackground(Color.RED);
        setVisible(true);
        newoldPanel.setLayout(new BoxLayout(newoldPanel,BoxLayout.Y_AXIS)); // layout line linear layout with orientation vertical

        newoldPanel.add(Box.createRigidArea(new Dimension(0,200))); // like padding or margin // chashmish isko khtm krdena phr jidr space chora hain waha icon lgadena apna


        newLocalCar = new JButton("NEW LOCAL CAR");

        newLocalCar.setAlignmentX(Component.CENTER_ALIGNMENT);
        newLocalCar.setMaximumSize(new Dimension(180 , 40));
        newLocalCar.setBackground(Color.BLACK); // meri adhi biwi isko phr change krlena
        newLocalCar.setFont(new Font("Monotype Sort",Font.BOLD,12));
        newoldPanel.add(newLocalCar);
        newLocalCar.setFocusable(false);
        newLocalCar.setBorder(BorderFactory.createLineBorder(Color.WHITE));
        newoldPanel.add(Box.createRigidArea(new Dimension(0,12))); // margin 12 smja kr russi brwe ki kasm
        newLocalCar.setVisible(true);
        newLocalCar.setForeground(Color.WHITE);
        newLocalCar.setBorder(BorderFactory.createLineBorder(Color.WHITE));

        oldLocalCar = new JButton("OLD LOCAL CAR");


        oldLocalCar.setAlignmentX(Component.CENTER_ALIGNMENT);
        oldLocalCar.setMaximumSize(new Dimension(180,40));
        oldLocalCar.setBackground(Color.BLACK);
        oldLocalCar.setFont(new Font("Monotype Sort",Font.BOLD,12));
        oldLocalCar.setForeground(Color.WHITE);
        oldLocalCar.setBorder(BorderFactory.createLineBorder(Color.WHITE));

        newoldPanel.add(oldLocalCar);
        oldLocalCar.setFocusable(false);
        newoldPanel.add(Box.createRigidArea(new Dimension(0,12)));
        oldLocalCar.setVisible(true);



        back = new JButton("BACK");
        back.setAlignmentX(Component.CENTER_ALIGNMENT);
        back.setMaximumSize(new Dimension(180,40));
        back.setBackground(Color.BLACK);
        back.setFont(new Font("Monotype Sort",Font.BOLD,12));
        back.setFocusable(false);
        back.add(Box.createRigidArea(new Dimension(0,12)));
        back.setVisible(true);
        back.setForeground(Color.WHITE);
        back.setBorder(BorderFactory.createLineBorder(Color.WHITE));
        newoldPanel.add(back);

        newLocalCar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                newoldPanel.setVisible(false);
                new LocalNewCarFunctions();





                // perform actions here bro e,g agr manager pr click kya toh is panel ko disable krde or jo dusra panel hain usko visible krde

            }
        });

        oldLocalCar.addActionListener(new ActionListener() {
                                          @Override
                                          public void actionPerformed(ActionEvent e) {
                                              newoldPanel.setVisible(false);
                                              new LocalOldCarFunctions();


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
