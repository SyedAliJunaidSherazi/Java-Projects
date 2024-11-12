package swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CustomerImportedCarsSale extends JFrame {
    static JPanel panel;
    JButton saleToUs, placeForSale, back;

    public CustomerImportedCarsSale() throws HeadlessException {

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

        saleToUs = new JButton("SALE TO US");
        saleToUs.setVisible(true);
        saleToUs.setAlignmentX(Component.CENTER_ALIGNMENT);
        saleToUs.setMaximumSize(new Dimension(180,40));
        saleToUs.setBackground(Color.BLACK); // meri adhi biwi isko phr change krlena
        saleToUs.setFont(new Font("Monotype Sort",Font.BOLD,12));
        saleToUs.setBorder(BorderFactory.createLineBorder(Color.WHITE));
        panel.add(saleToUs);
        saleToUs.setFocusable(false);
        saleToUs.setForeground(Color.WHITE);
        panel.add(Box.createRigidArea(new Dimension(0,12))); // margin 12 smja kr russi brwe ki kasm

        placeForSale = new JButton("PLACE SALE");
        placeForSale.setVisible(true);
        panel.add(placeForSale);
        placeForSale.setAlignmentX(Component.CENTER_ALIGNMENT);
        placeForSale.setMaximumSize(new Dimension(180,40));
        placeForSale.setBackground(Color.BLACK);
        placeForSale.setFont(new Font("Monotype Sort",Font.BOLD,12));
        placeForSale.setBorder(BorderFactory.createLineBorder(Color.WHITE));
        placeForSale.setFocusable(false);
        placeForSale.setForeground(Color.WHITE);
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


        saleToUs.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {







                // perform actions here bro e,g agr manager pr click kya toh is panel ko disable krde or jo dusra panel hain usko visible krde

            }
        });

        placeForSale.addActionListener(new ActionListener() {
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
