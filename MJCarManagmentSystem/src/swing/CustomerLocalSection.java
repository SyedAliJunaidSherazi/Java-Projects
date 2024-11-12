package swing;

import org.djbros.LocalCar;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CustomerLocalSection extends JFrame {
    JPanel panel;
    JButton localCarPurchase, localCarSale, localCarsDetails, back;


    public CustomerLocalSection() throws HeadlessException {

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


        localCarPurchase = new JButton("PURCHASE SECTION");

        localCarPurchase.setAlignmentX(Component.CENTER_ALIGNMENT);
        localCarPurchase.setMaximumSize(new Dimension(180 , 40));
        localCarPurchase.setBackground(Color.BLACK); // meri adhi biwi isko phr change krlena
        localCarPurchase.setFont(new Font("Monotype Sort",Font.BOLD,12));
        panel.add(localCarPurchase);
        localCarPurchase.setFocusable(false);
        panel.add(Box.createRigidArea(new Dimension(0,12))); // margin 12 smja kr russi brwe ki kasm
        localCarPurchase.setVisible(true);
        localCarPurchase.setForeground(Color.WHITE);
        localCarPurchase.setBorder(BorderFactory.createLineBorder(Color.WHITE));


        localCarSale = new JButton("SALE SECTION");
        localCarSale.setAlignmentX(Component.CENTER_ALIGNMENT);
        localCarSale.setMaximumSize(new Dimension(180,40));
        localCarSale.setBackground(Color.BLACK);
        localCarSale.setFont(new Font("Monotype Sort",Font.BOLD,12));
        localCarSale.setForeground(Color.WHITE);
        localCarSale.setBorder(BorderFactory.createLineBorder(Color.WHITE));

        panel.add(localCarSale);
        localCarSale.setFocusable(false);
        panel.add(Box.createRigidArea(new Dimension(0,12)));
        localCarSale.setVisible(true);

        localCarsDetails = new JButton("CAR DETAILS");
        localCarsDetails.setAlignmentX(Component.CENTER_ALIGNMENT);
        localCarsDetails.setMaximumSize(new Dimension(180,40));
        localCarsDetails.setBackground(Color.BLACK);
        localCarsDetails.setFont(new Font("Monotype Sort",Font.BOLD,12));

        panel.add(localCarsDetails);
        localCarsDetails.setFocusable(false);
        panel.add(Box.createRigidArea(new Dimension(0,12)));
        localCarsDetails.setVisible(true);
        localCarsDetails.setForeground(Color.WHITE);
        localCarsDetails.setBorder(BorderFactory.createLineBorder(Color.WHITE));




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

        localCarPurchase.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panel.setVisible(false);
                new CustomerLocalCarsPurchase();






                // perform actions here bro e,g agr manager pr click kya toh is panel ko disable krde or jo dusra panel hain usko visible krde

            }
        });

        localCarSale.addActionListener(new ActionListener() {
                                        @Override
                                        public void actionPerformed(ActionEvent e) {
                                            panel.setVisible(false);
                                            new CustomerLocalCarsSale();


                                        }
                                    }

        );
        localCarsDetails.addActionListener(new ActionListener() {
                                        @Override
                                        public void actionPerformed(ActionEvent e) {


                                        }
                                    }

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
