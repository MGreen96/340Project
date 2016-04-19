import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Component;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JMenuBar;
import javax.swing.JPanel;

public class HomePage extends JFrame {

	private JPanel Cards = new JPanel(new CardLayout());

	// HomePage UI Elements
	private final String HOMEPAGE = "HomePage";
	private JButton Exit = new JButton("Exit");
	private JButton Return = new JButton("Return to Login Menu");
	private JPanel homePanel = new JPanel();
	private JPanel managerPanel = new JPanel();
	private JButton Manager = new JButton("Manager's Section");
	private int xWidth = 200;
	private int yHeight = 60;
	private JButton Transaction = new JButton("New Transaction");

	// Manager Panel UI Elements
	private final String MANAGER = "ManagerPanel";
	private JPanel inventoryPanel = new JPanel();
	private JButton Inventory = new JButton("Inventory");
	private JButton Sales = new JButton("Sales");
	private JButton Users = new JButton("User Manager");
	private JButton backManager = new JButton("Back");
	private JButton transactions = new JButton("Transactions");

	// Inventory Panel UI Elements
	private final String INVENTORY = "Inventory";
	private JLabel Product1 = new JLabel("WonderFILE: 0/25");
	private JLabel Product2 = new JLabel("MagicMesh: 0/25");
	private JLabel Product3 = new JLabel("LazerBond: 0/25");
	private JLabel Product4 = new JLabel("MiracleGrillMat: 0/25");
	private JLabel Product5 = new JLabel("CarCane: 0/25");
	private JLabel Product6 = new JLabel("SnuggleUp: 0/25");
	private JLabel Product7 = new JLabel("KnotOut: 0/25");
	private JLabel Product8 = new JLabel("RotoClipper: 0/25");
    private JLabel Product9 = new JLabel("TouCan: 0/25");
    private JLabel Product10 = new JLabel("WonderWallet: 0/25");
    private JLabel Product11 = new JLabel("FlexSeal: 0/25");
    private JLabel Product12 = new JLabel("MiracleBambooPillow: 0/25");
    private JLabel Product13 = new JLabel("PressurePro: 0/25");
    private JLabel Product14 = new JLabel("TableMate: 0/25");
    private JLabel Product15 = new JLabel("CopperFit: 0/25");
    private JLabel Product16 = new JLabel("DutchGlow: 0/25");
    private JLabel Product17 = new JLabel("Colorama: 0/25");
    private JLabel Product18 = new JLabel("BeActiveBrace: 0/25");
    private JLabel Product19 = new JLabel("GaZoos: 0/25");
    private JLabel Product20 = new JLabel("Vidalia: 0/25");
    private JLabel Product21 = new JLabel("FurnitureFeet: 0/25");
    private JLabel Product22 = new JLabel("DuraWallet: 0/25");
    private JLabel Product23 = new JLabel("KittyShack: 0/25");
    private JLabel Product24 = new JLabel("ZipSox: 0/25");
    private JLabel Product25 = new JLabel("FootAngel: 0/25");
        
        
	private JButton updateStock = new JButton("Update Stock");
	private JButton backInventory = new JButton("Back");
	private JPanel BottomInventoryPanel = new JPanel(new GridLayout(1,2));

	// Transaction Panel UI Elements
	private final String TRANSACTIONS = "Transaction";
	private JPanel productPanel = new JPanel();
	private JButton backTransactions = new JButton("Back");
	DefaultListModel transactionList = new DefaultListModel();
	private JList messageList = new JList(transactionList);

	// User Manager Panel UI Elements
	private final String USERMANAGER = "UserManager";
	private JPanel userManagerPanel = new JPanel();
	private JButton backUserManager = new JButton("Back");
	private JButton newUser = new JButton("New User");
	private JLabel userLabel = new JLabel("Users:");
	private JLabel userHours = new JLabel("Hours:");
	private JLabel userManager = new JLabel("Manager?:");
	private JLabel lastName = new JLabel("Last:");
	private JLabel firstName = new JLabel("First:");
	private JPanel topPanel = new JPanel();
	private JPanel bottomPanel = new JPanel();
	
	// Sales Manager Panel UI Elements
	private final String SALESMANAGER = "SalesManager";
	private JPanel salesManagerPanel = new JPanel();
	private JButton backSalesManager = new JButton("Back");
	private JLabel sales = new JLabel("Sales:");
	private JPanel topSalePanel = new JPanel(new GridLayout(1,2));
	private JPanel bottomSalePanel = new JPanel(new GridLayout(1,2));
	private JPanel leftSalePanel = new JPanel(new GridLayout(26,1,5,5));
	private JPanel rightSalePanel = new JPanel(new GridLayout(8,1,5,5));

	public HomePage() {

		super("Home Page");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);
		setBounds(70, 70, 800, 600);
		setVisible(true);
                
                //Define products
                
                ArrayList<Item> ItemArray = new ArrayList();
                Item Product_1 = new Item("WonderFILE", 19.99, 25, 25, null, 375.00);
                Item Product_2 = new Item("MagicMesh", 14.99, 25, 25, null, 300.00);
                Item Product_3 = new Item("LazerBond", 19.99, 25, 25, null, 375.00);
                Item Product_4 = new Item("MiracleGrillMat", 9.95, 25, 25, null, 175.00);
                Item Product_5 = new Item("CarCane", 19.95, 25, 25, null, 375.00);
                Item Product_6 = new Item("SnuggleUp", 19.95, 25, 25, null, 375.00);
                Item Product_7 = new Item("KnotOut", 14.95, 25, 25, null, 300.00);
                Item Product_8 = new Item("RotoClipper", 19.95, 25, 25, null, 375.00);
                Item Product_9 = new Item("TouCan", 19.99, 25, 25, null, 375.00);
                Item Product_10 = new Item("WonderWallet", 19.95, 25, 25, null, 375.00);
                Item Product_11 = new Item("FlexSeal", 14.95, 25, 25, null, 300.00);
                Item Product_12 = new Item("MiracleBambooPillow", 29.95, 25, 25, null, 650.00);
                Item Product_13 = new Item("PressurePro", 99.95, 25, 25, null, 1750.00);
                Item Product_14 = new Item("TableMate", 29.95, 25, 25, null, 650.00);
                Item Product_15 = new Item("CopperFit", 19.95, 25, 25, null, 375.00);
                Item Product_16 = new Item("DutchGlow", 9.95, 25, 25, null, 150.00);
                Item Product_17 = new Item("Colorama", 12.99, 25, 25, null, 215.00);
                Item Product_18 = new Item("BeActiveBrace", 14.95, 25, 25, null, 300.00);
                Item Product_19 = new Item("GaZoos", 14.95, 25, 25, null, 300.00);
                Item Product_20 = new Item("Vidalia", 19.95, 25, 25, null, 375.00);
                Item Product_21 = new Item("FurnitureFeet", 9.95, 25, 25, null, 150.00);
                Item Product_22 = new Item("DuraWallet", 14.99, 25, 25, null, 250.00);
                Item Product_23 = new Item("KittyShack", 19.95, 25, 25, null, 375.00);
                Item Product_24 = new Item("ZipSox", 12.95, 25, 25, null, 375.00);
                Item Product_25 = new Item("FootAngel", 12.95, 25, 25, null, 215.00);
                
                ItemArray.add(Product_1);
                ItemArray.add(Product_2);
                ItemArray.add(Product_3);
                ItemArray.add(Product_4);
                ItemArray.add(Product_5);
                ItemArray.add(Product_6);
                ItemArray.add(Product_7);
                ItemArray.add(Product_8);
                ItemArray.add(Product_9);
                ItemArray.add(Product_10);
                ItemArray.add(Product_11);
                ItemArray.add(Product_12);
                ItemArray.add(Product_13);
                ItemArray.add(Product_14);
                ItemArray.add(Product_15);
                ItemArray.add(Product_16);
                ItemArray.add(Product_17);
                ItemArray.add(Product_18);
                ItemArray.add(Product_19);
                ItemArray.add(Product_20);
                ItemArray.add(Product_21);
                ItemArray.add(Product_22);
                ItemArray.add(Product_23);
                ItemArray.add(Product_24);
                ItemArray.add(Product_25);
                
                ArrayList <JLabel> LabelArray = new ArrayList();
                LabelArray.add(Product1);
                LabelArray.add(Product2);
                LabelArray.add(Product3);
                LabelArray.add(Product4);
                LabelArray.add(Product5);
                LabelArray.add(Product6);
                LabelArray.add(Product7);
                LabelArray.add(Product8);
                LabelArray.add(Product9);
                LabelArray.add(Product10);
                LabelArray.add(Product11);
                LabelArray.add(Product12);
                LabelArray.add(Product13);
                LabelArray.add(Product14);
                LabelArray.add(Product15);
                LabelArray.add(Product16);
                LabelArray.add(Product17);
                LabelArray.add(Product18);
                LabelArray.add(Product19);
                LabelArray.add(Product20);
                LabelArray.add(Product21);
                LabelArray.add(Product22);
                LabelArray.add(Product23);
                LabelArray.add(Product24);
                LabelArray.add(Product25);
                
                
                

		// Panel Layout Manager:
		homePanel.setLayout(null);
		managerPanel.setLayout(null);
		inventoryPanel.setLayout(new GridLayout(26, 2));
		productPanel.setLayout(new BorderLayout());
		userManagerPanel.setLayout(new BorderLayout());

		// Cards.add(Panel2, TRANSACTION);
		Cards.add(homePanel, HOMEPAGE);
		Cards.add(managerPanel, MANAGER);
		Cards.add(inventoryPanel, INVENTORY);
		Cards.add(productPanel, TRANSACTIONS);
		Cards.add(userManagerPanel, USERMANAGER);
		Cards.add(salesManagerPanel, SALESMANAGER);
		add(Cards);

		// Set Bounds and Location of elements
		Manager.setBounds(300, 150, xWidth, yHeight);
		Transaction.setBounds(300, Manager.getY() + yHeight + 5, xWidth, yHeight);
		Return.setBounds(300, Transaction.getY() + yHeight + 5, xWidth, yHeight);
		Exit.setBounds(300, Return.getY() + yHeight + 5, xWidth, yHeight);

		// Add items to panel
		homePanel.add(Manager);
		homePanel.add(Transaction);
		homePanel.add(Exit);
		homePanel.add(Return);

		// Format items for Panel2
		Inventory.setBounds(5, 5, xWidth, yHeight);
		Sales.setBounds(5, Inventory.getY() + yHeight + 5, xWidth, yHeight);
		Users.setBounds(5, Sales.getY() + yHeight + 5, xWidth, yHeight);
		backManager.setBounds(5, Users.getY() + yHeight + 5, xWidth, yHeight);

		// Add items to Panel2
		managerPanel.add(Inventory);
		managerPanel.add(Sales);
		managerPanel.add(Users);
		managerPanel.add(backManager);

		// Panel3 Inventory Add items
		inventoryPanel.add(Product1);
		inventoryPanel.add(Product2);
		inventoryPanel.add(Product3);
		inventoryPanel.add(Product4);
		inventoryPanel.add(Product5);
		inventoryPanel.add(Product6);
		inventoryPanel.add(Product7);
		inventoryPanel.add(Product8);
                inventoryPanel.add(Product9);
                inventoryPanel.add(Product10);
                inventoryPanel.add(Product11);
                inventoryPanel.add(Product12);
                inventoryPanel.add(Product13);
                inventoryPanel.add(Product14);
                inventoryPanel.add(Product15);
                inventoryPanel.add(Product16);
                inventoryPanel.add(Product17);
                inventoryPanel.add(Product18);
                inventoryPanel.add(Product19);
                inventoryPanel.add(Product20);
                inventoryPanel.add(Product21);
                inventoryPanel.add(Product22);
                inventoryPanel.add(Product23);
                inventoryPanel.add(Product24);
                inventoryPanel.add(Product25);
                
                
		
		inventoryPanel.add(BottomInventoryPanel);
		BottomInventoryPanel.add(backInventory);
		BottomInventoryPanel.add(updateStock);
		

		// Add items to the Transaction Panel
		productPanel.add(messageList, BorderLayout.CENTER);
		productPanel.add(backTransactions, BorderLayout.SOUTH);

		// Add Items to the UserMangePanel
		userManagerPanel.add(topPanel, BorderLayout.NORTH);
		userManagerPanel.add(bottomPanel, BorderLayout.SOUTH);
		bottomPanel.setLayout(new GridLayout(1,2));
		topPanel.setLayout(new GridLayout(1, 5));
		topPanel.add(userLabel);
		topPanel.add(firstName);
		topPanel.add(lastName);
		topPanel.add(userHours);
		topPanel.add(userManager);
		bottomPanel.add(backUserManager);
		bottomPanel.add(newUser);
		
		
		
                //Patrick's part
                
                // Add Items to the SalesManagerPanael
                
                
		salesManagerPanel.setLayout(new BorderLayout());
		salesManagerPanel.add(topSalePanel, BorderLayout.NORTH);
		salesManagerPanel.add(bottomSalePanel, BorderLayout.SOUTH);
		bottomSalePanel.add(backSalesManager);
		leftSalePanel.add(sales);
		for(int i = 0; i <25; i++){
			leftSalePanel.add(new JLabel("Product " + Integer.toString(i + 1) + ": "
                            + ItemArray.get(i).toString())); 
		}
		topSalePanel.add(leftSalePanel);
		topSalePanel.add(rightSalePanel);
		rightSalePanel.add(new JLabel("Transactions Completed:"));
		rightSalePanel.add(new JLabel("Gross Revenue:"));
		rightSalePanel.add(new JLabel("Revenue dedicated to Employees:"));
		rightSalePanel.add(new JLabel("Revenue dedicated to Property Costs:"));
		rightSalePanel.add(new JLabel("Revenue dedicated to taxes:"));
		rightSalePanel.add(new JLabel("Net Revenue:"));
		rightSalePanel.add(new JLabel("Revenue in Account:"));
                
                //

		// Button Functionality
		updateStock.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				for(int i = 0; i < ItemArray.size(); i++){
                	LabelArray.get(i).setText(ItemArray.get(i).getName() + ": " + ItemArray.get(i).getInStock() +"/" + ItemArray.get(i).getMaxStock());
                }
			}
		});
		Sales.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				CardLayout c1 = (CardLayout) Cards.getLayout();
				c1.show(Cards, SALESMANAGER);
			}
		});
		backSalesManager.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				CardLayout c1 = (CardLayout) Cards.getLayout();
				c1.show(Cards, MANAGER);
			}
		});
		Users.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout c1 = (CardLayout) (Cards.getLayout());
				c1.show(Cards, USERMANAGER);
			}
		});
		backUserManager.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout c1 = (CardLayout) (Cards.getLayout());
				c1.show(Cards, MANAGER);
			}
		});
		backManager.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout c1 = (CardLayout) (Cards.getLayout());
				c1.show(Cards, HOMEPAGE);
			}
		});
		Manager.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout c1 = (CardLayout) (Cards.getLayout());
				c1.show(Cards, MANAGER);
			}
		});
		Return.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				new LoginPage();
			}
		});
		Exit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		Inventory.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout c1 = (CardLayout) (Cards.getLayout());
				c1.show(Cards, INVENTORY);
				for(int i = 0; i < ItemArray.size(); i++){
                	LabelArray.get(i).setText(ItemArray.get(i).getName() + ": " + ItemArray.get(i).getInStock() +"/" + ItemArray.get(i).getMaxStock());
                }
			}
		});
		backInventory.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout c1 = (CardLayout) (Cards.getLayout());
				c1.show(Cards, MANAGER);
			}
		});
		Transaction.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// CardLayout c1 = (CardLayout) (Cards.getLayout());
				// c1.show(Cards, TRANSACTIONS);
				new SalesPage(ItemArray);
			}
		});
		backTransactions.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout c1 = (CardLayout) (Cards.getLayout());
				c1.show(Cards, HOMEPAGE);
			}
		});

	}
}
