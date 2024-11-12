package swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CustomerImportedCarsPurchase extends JFrame {
    static JPanel panel;
    JButton newCarsPurchase, oldCarsPurchase, back;

    public CustomerImportedCarsPurchase() throws HeadlessException {

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

        newCarsPurchase = new JButton("NEW CAR PURCHASE");
        newCarsPurchase.setVisible(true);
        newCarsPurchase.setAlignmentX(Component.CENTER_ALIGNMENT);
        newCarsPurchase.setMaximumSize(new Dimension(180,40));
        newCarsPurchase.setBackground(Color.BLACK); // meri adhi biwi isko phr change krlena
        newCarsPurchase.setFont(new Font("Monotype Sort",Font.BOLD,12));
        newCarsPurchase.setBorder(BorderFactory.createLineBorder(Color.WHITE));
        panel.add(newCarsPurchase);
        newCarsPurchase.setFocusable(false);
        newCarsPurchase.setForeground(Color.WHITE);
        panel.add(Box.createRigidArea(new Dimension(0,12))); // margin 12 smja kr russi brwe ki kasm

        oldCarsPurchase = new JButton("OLD CAR PURCHASE");
        oldCarsPurchase.setVisible(true);
        panel.add(oldCarsPurchase);
        oldCarsPurchase.setAlignmentX(Component.CENTER_ALIGNMENT);
        oldCarsPurchase.setMaximumSize(new Dimension(180,40));
        oldCarsPurchase.setBackground(Color.BLACK);
        oldCarsPurchase.setFont(new Font("Monotype Sort",Font.BOLD,12));
        oldCarsPurchase.setBorder(BorderFactory.createLineBorder(Color.WHITE));
        oldCarsPurchase.setFocusable(false);
        oldCarsPurchase.setForeground(Color.WHITE);
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


        newCarsPurchase.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {







                // perform actions here bro e,g agr manager pr click kya toh is panel ko disable krde or jo dusra panel hain usko visible krde

            }
        });

        oldCarsPurchase.addActionListener(new ActionListener() {
                                                 @Override
                                                 public void actionPerformed(ActionEvent e) {




                                                 }
                                             } // lambda expression bitch harami mukhtar doesnt know

        );
        back.addActionListener(new ActionListener() {
                                   @Override
                                   public void actionPerformed(ActionEvent e) {
                                       panel.setVisible(false);
                                       new CustomerImportedSection();

                                   }
                               } // lambda expression bitch harami mukhtar doesnt know

        );
    }





}
