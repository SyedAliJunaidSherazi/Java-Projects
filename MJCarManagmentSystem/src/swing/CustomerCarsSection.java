package swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CustomerCarsSection  extends JFrame {
    static JPanel panel;
    JButton localCarSection, importedCarSection, back;
    JLabel label;

    public CustomerCarsSection() throws HeadlessException {

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
//        label.setText("WELCOME MANAGER");
//        label.setFont(new Font("Monotype Sort" , Font.BOLD  , 12));
//        label.setBackground(Color.white);
//        panel.add(label);

        localCarSection = new JButton("LOCAL CAR SECTION");
        localCarSection.setVisible(true);
        localCarSection.setAlignmentX(Component.CENTER_ALIGNMENT);
        localCarSection.setMaximumSize(new Dimension(180,40));
        localCarSection.setBackground(Color.BLACK); // meri adhi biwi isko phr change krlena
        localCarSection.setFont(new Font("Monotype Sort",Font.BOLD,12));
        localCarSection.setBorder(BorderFactory.createLineBorder(Color.WHITE));
        panel.add(localCarSection);
        localCarSection.setFocusable(false);
        localCarSection.setForeground(Color.WHITE);
        panel.add(Box.createRigidArea(new Dimension(0,12))); // margin 12 smja kr russi brwe ki kasm

        importedCarSection = new JButton("IMPORTED CAR SECTION");
        importedCarSection.setVisible(true);
        panel.add(importedCarSection);
        importedCarSection.setAlignmentX(Component.CENTER_ALIGNMENT);
        importedCarSection.setMaximumSize(new Dimension(180,40));
        importedCarSection.setBackground(Color.BLACK);
        importedCarSection.setFont(new Font("Monotype Sort",Font.BOLD,12));
        importedCarSection.setBorder(BorderFactory.createLineBorder(Color.WHITE));
        importedCarSection.setFocusable(false);
        importedCarSection.setForeground(Color.WHITE);
        panel.add(Box.createRigidArea(new Dimension(0,12)));


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
        panel.add(back);


        localCarSection.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panel.setVisible(false);
                new CustomerLocalSection();





                // perform actions here bro e,g agr manager pr click kya toh is panel ko disable krde or jo dusra panel hain usko visible krde

            }
        });

        importedCarSection.addActionListener(new ActionListener() {
                                          @Override
                                          public void actionPerformed(ActionEvent e) {
                                              panel.setVisible(false);
                                              new CustomerImportedSection();



                                          }
                                      } // lambda expression bitch harami mukhtar doesnt know

        );
        back.addActionListener(new ActionListener() {
                                   @Override
                                   public void actionPerformed(ActionEvent e) {
                                       panel.setVisible(false);
//                                       new MainFrame.MainFrame();

                                   }
                               } // lambda expression bitch harami mukhtar doesnt know

        );
    }





}
