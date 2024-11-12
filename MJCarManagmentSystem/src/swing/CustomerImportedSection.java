package swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CustomerImportedSection extends JFrame {
    JPanel panel;
    JButton importedCarPurchase, importedCarSale, importedCarsDetails, back;


    public CustomerImportedSection() throws HeadlessException {

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


        importedCarPurchase = new JButton("PURCHASE SECTION");

        importedCarPurchase.setAlignmentX(Component.CENTER_ALIGNMENT);
        importedCarPurchase.setMaximumSize(new Dimension(180 , 40));
        importedCarPurchase.setBackground(Color.BLACK); // meri adhi biwi isko phr change krlena
        importedCarPurchase.setFont(new Font("Monotype Sort",Font.BOLD,12));
        panel.add(importedCarPurchase);
        importedCarPurchase.setFocusable(false);
        panel.add(Box.createRigidArea(new Dimension(0,12))); // margin 12 smja kr russi brwe ki kasm
        importedCarPurchase.setVisible(true);
        importedCarPurchase.setForeground(Color.WHITE);
        importedCarPurchase.setBorder(BorderFactory.createLineBorder(Color.WHITE));


        importedCarSale = new JButton("SALE SECTION");
        importedCarSale.setAlignmentX(Component.CENTER_ALIGNMENT);
        importedCarSale.setMaximumSize(new Dimension(180,40));
        importedCarSale.setBackground(Color.BLACK);
        importedCarSale.setFont(new Font("Monotype Sort",Font.BOLD,12));
        importedCarSale.setForeground(Color.WHITE);
        importedCarSale.setBorder(BorderFactory.createLineBorder(Color.WHITE));

        panel.add(importedCarSale);
        importedCarSale.setFocusable(false);
        panel.add(Box.createRigidArea(new Dimension(0,12)));
        importedCarSale.setVisible(true);

        importedCarsDetails = new JButton("CAR DETAILS");
        importedCarsDetails.setAlignmentX(Component.CENTER_ALIGNMENT);
        importedCarsDetails.setMaximumSize(new Dimension(180,40));
        importedCarsDetails.setBackground(Color.BLACK);
        importedCarsDetails.setFont(new Font("Monotype Sort",Font.BOLD,12));

        panel.add(importedCarsDetails);
        importedCarsDetails.setFocusable(false);
        panel.add(Box.createRigidArea(new Dimension(0,12)));
        importedCarsDetails.setVisible(true);
        importedCarsDetails.setForeground(Color.WHITE);
        importedCarsDetails.setBorder(BorderFactory.createLineBorder(Color.WHITE));




        back = new JButton("BACK");
        back.setAlignmentX(Component.CENTER_ALIGNMENT);
        back.setMaximumSize(new Dimension(180,40));
        back.setBackground(Color.BLACK);
        back.setFont(new Font("Monotype Sort",Font.BOLD,12));
        back.setBorder(BorderFactory.createLineBorder(Color.WHITE));
        back.setFocusable(false);
        back.add(Box.createRigidArea(new Dimension(0,12)));
        back.setVisible(true);
        back.setBorder(BorderFactory.createLineBorder(Color.WHITE));
        back.setForeground(Color.WHITE);
        panel.add(back);

        importedCarPurchase.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panel.setVisible(false);
                new CustomerImportedCarsPurchase();






                // perform actions here bro e,g agr manager pr click kya toh is panel ko disable krde or jo dusra panel hain usko visible krde

            }
        });

        importedCarSale.addActionListener(new ActionListener() {
                                        @Override
                                        public void actionPerformed(ActionEvent e) {
                                            panel.setVisible(false);
                                            new CustomerImportedCarsSale();


                                        }
                                    } // lambda expression bitch harami mukhtar doesnt know

        );
        importedCarsDetails.addActionListener(new ActionListener() {
                                        @Override
                                        public void actionPerformed(ActionEvent e) {


                                        }
                                    } // lambda expression bitch harami mukhtar doesnt know

        );
        back.addActionListener(new ActionListener() {
                                   @Override
                                   public void actionPerformed(ActionEvent e) {
                                       panel.setVisible(false);
                                       new CustomerCarsSection();

                                   }
                               } // lambda expression bitch harami mukhtar doesnt know

        );
    }




}
