package guiOne;

import javax.swing.*;


public class MainFrame extends JFrame {

//    JPanel mainPagePanel;
    JButton jButtonManager, jButtonCustomer;
    public static MainJPanel mainJPanel = new MainJPanel();
    public static CustomerCarsSection customerCarsSection = new CustomerCarsSection();
    public static ManagerCarsSection managerCarsSection = new ManagerCarsSection();
    public static ManagerNewLocalCarsJPanel managerNewLocalCarsJPanel = new ManagerNewLocalCarsJPanel();
    public static ManagerNewImportedCarsJPanel managerNewImportedCarsJPanel = new ManagerNewImportedCarsJPanel();
    public static ManagerNewImportedCarFunction managerNewImportedCarFunction = new ManagerNewImportedCarFunction();
    public static ManagerOldImportedCarFunction managerOldImportedCarFunction = new ManagerOldImportedCarFunction();
    public static ManagerNewLocalCarFunction managerNewLocalCarFunction = new ManagerNewLocalCarFunction();
    public static ManagerOldLocalCarFunction managerOldLocalCarFunction = new ManagerOldLocalCarFunction();
    public static CustomerLocalCarFunctions customerLocalCarFunction = new CustomerLocalCarFunctions();
    public  static CustomerImportedCarFunctions customerImportedCarFunctions = new CustomerImportedCarFunctions();
    public static ManagerImportedNewAddCar managerImportedNewAddCar = new ManagerImportedNewAddCar();
    public static ManagerImportedNewUpdateCar managerImportedNewUpdateCar = new ManagerImportedNewUpdateCar();
    public static ManagerImportedNewRemoveCar managerImportedNewRemoveCar = new ManagerImportedNewRemoveCar();
    ImageIcon imageIcon;

    public MainFrame() {

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setSize(600,600);
        setTitle("MJ SHOW ROOM MANAGEMENT SYSTEM");
        setVisible(true);


        add(mainJPanel);
        imageIcon = new ImageIcon("carPic.png");
        add(customerCarsSection);
        customerCarsSection.setVisible(false);

        add(managerCarsSection);
        managerCarsSection.setVisible(false);

        add(managerNewLocalCarsJPanel);
        managerNewLocalCarsJPanel.setVisible(false);

        add(managerNewImportedCarsJPanel);
        managerNewImportedCarsJPanel.setVisible(false);

        add(managerNewImportedCarFunction);
        managerNewImportedCarFunction.setVisible(false);

        add(managerOldImportedCarFunction);
        managerOldImportedCarFunction.setVisible(false);

        add(managerNewLocalCarFunction);
        managerNewLocalCarFunction.setVisible(false);

        add(managerOldLocalCarFunction);
        managerOldLocalCarFunction.setVisible(false);

        add(customerLocalCarFunction);
        customerLocalCarFunction.setVisible(false);

        add(customerImportedCarFunctions);
        customerImportedCarFunctions.setVisible(false);

        add(managerImportedNewAddCar);
        managerImportedNewAddCar.setVisible(false);

        add(managerImportedNewUpdateCar);
        managerImportedNewUpdateCar.setVisible(false);

        add(managerImportedNewRemoveCar);
        managerImportedNewRemoveCar.setVisible(false);



//        setExtendedState(Frame.MAXIMIZED_BOTH);
        this.setIconImage(imageIcon.getImage());




//        mainPagePanel = new JPanel();



    }


    public static void main(String[] args) {

        new MainFrame();

    }

}
