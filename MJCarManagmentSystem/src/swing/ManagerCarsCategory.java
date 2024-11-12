package swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ManagerCarsCategory extends JFrame {
    static JPanel showRoomPanel;
    JButton  localCar , importedCar , back;
    JLabel label;

    public ManagerCarsCategory() throws HeadlessException {

        setExtendedState(java.awt.Frame.MAXIMIZED_BOTH);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);






        showRoomPanel = new JPanel(); // like container you have to treat it like Frame set its everything
        showRoomPanel.setVisible(true);
        add(showRoomPanel);
        showRoomPanel.setBackground(Color.RED);
        setVisible(true);
        showRoomPanel.setLayout(new BoxLayout(showRoomPanel,BoxLayout.Y_AXIS)); // layout line linear layout with orientation vertical

        showRoomPanel.add(Box.createRigidArea(new Dimension(0,200))); // like padding or margin // chashmish isko khtm krdena phr jidr space chora hain waha icon lgadena apna
//        label.setText("WELCOME MANAGER");
//        label.setFont(new Font("Monotype Sort" , Font.BOLD  , 12));
//        label.setBackground(Color.white);
//        panel.add(label);

        localCar = new JButton("LOCAL CAR");
        localCar.setVisible(true);
        localCar.setAlignmentX(Component.CENTER_ALIGNMENT);
        localCar.setMaximumSize(new Dimension(180,40));
        localCar.setBackground(Color.BLACK); // meri adhi biwi isko phr change krlena
        localCar.setFont(new Font("Monotype Sort",Font.BOLD,12));
        localCar.setBorder(BorderFactory.createLineBorder(Color.WHITE));
        showRoomPanel.add(localCar);
        localCar.setFocusable(false);
        localCar.setForeground(Color.WHITE);
        showRoomPanel.add(Box.createRigidArea(new Dimension(0,12))); // margin 12 smja kr russi brwe ki kasm

        importedCar = new JButton("IMPORTED CAR");
        importedCar.setVisible(true);
        showRoomPanel.add(importedCar);
        importedCar.setAlignmentX(Component.CENTER_ALIGNMENT);
        importedCar.setMaximumSize(new Dimension(180,40));
        importedCar.setBackground(Color.BLACK);
        importedCar.setFont(new Font("Monotype Sort",Font.BOLD,12));
        importedCar.setBorder(BorderFactory.createLineBorder(Color.WHITE));
        importedCar.setFocusable(false);
        importedCar.setForeground(Color.WHITE);
        showRoomPanel.add(Box.createRigidArea(new Dimension(0,12)));


        back = new JButton("BACK");
        back.setAlignmentX(Component.CENTER_ALIGNMENT);
        back.setMaximumSize(new Dimension(180,40));
        back.setBackground(Color.BLACK);
        back.setFont(new Font("Monotype Sort",Font.BOLD,12));
        back.setBorder(BorderFactory.createLineBorder(Color.WHITE));
        back.setFocusable(false);
        back.add(Box.createRigidArea(new Dimension(0,12)));
        back.setVisible(true);
        back.setForeground(Color.WHITE);
        showRoomPanel.add(back);


        localCar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                showRoomPanel.setVisible(false);
                new LocalCarCatagory();




                // perform actions here bro e,g agr manager pr click kya toh is panel ko disable krde or jo dusra panel hain usko visible krde

            }
        });

        importedCar.addActionListener(new ActionListener() {
                                          @Override
                                          public void actionPerformed(ActionEvent e) {
                                              showRoomPanel.setVisible(false);
                                              new ImportedCarCategory();


                                          }
                                      } // lambda expression bitch harami mukhtar doesnt know

        );
        back.addActionListener(new ActionListener() {
                                   @Override
                                   public void actionPerformed(ActionEvent e) {
                                       showRoomPanel.setVisible(false);
//                                       new MainFrame.MainFrame();

                                   }
                               } // lambda expression bitch harami mukhtar doesnt know

        );
    }





}
