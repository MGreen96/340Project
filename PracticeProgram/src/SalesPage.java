import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.util.ArrayList;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;

public class SalesPage extends JFrame {

	private final String TRANSACTIONS = "Transaction";
	private JPanel productPanel = new JPanel();
	private JPanel rightPanel = new JPanel();
	private JButton backTransactions = new JButton("Back");
	DefaultListModel<String> transactionList = new DefaultListModel<String>();
	private JList<String> messageList = new JList<String>(transactionList);
	private JScrollPane scrollPane = new JScrollPane();
	private JButton finalize = new JButton("Finalize Order");
	private JButton checkout = new JButton("Check Out");
	private JButton Product1 = new JButton("WonderFILE");
	private JButton Product2 = new JButton("MagicMesh");
	private JButton Product3 = new JButton("LazerBond");
	private JButton Product4 = new JButton("MiracleGrillMat");
	private JButton Product5 = new JButton("CarCane");
	private JButton Product6 = new JButton("SnuggleUp");
	private JButton Product7 = new JButton("KnotOut");
	private JButton Product8 = new JButton("RotoClipper");
        private JButton Product9 = new JButton("TouCan");
        private JButton Product10 = new JButton("WonderWallet");
        private JButton Product11 = new JButton("FlexSeal");
        private JButton Product12 = new JButton("MiracleBambooPillow");
        private JButton Product13 = new JButton("PressurePro");
        private JButton Product14 = new JButton("TableMate");
        private JButton Product15 = new JButton("CopperFit");
        private JButton Product16 = new JButton("DutchGlow");
        private JButton Product17 = new JButton("Colorama");
        private JButton Product18 = new JButton("BeActiveBrace");
        private JButton Product19 = new JButton("GaZoos");
        private JButton Product20 = new JButton("Vidalia");
        private JButton Product21 = new JButton("FurnitureFeet");
        private JButton Product22 = new JButton("DuraWallet");
        private JButton Product23 = new JButton("KittyShack");
        private JButton Product24 = new JButton("ZipSox");
        private JButton Product25 = new JButton("FootAngel");
        
        
        
	private JPanel leftPanel = new JPanel();
	private JLabel transaction = new JLabel("Transaction");
	private JPanel rightButtons = new JPanel();

	public SalesPage(ArrayList ItemArray) {
		Transaction TransactionIP = new Transaction();
		Item PJ = new Item("WonderFILE", 10, 10, 10, null, 0);
		
		// Parameters of Class Set
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setBounds(0, 32, 1366, 720);
		setVisible(true);
		setLayout(new GridLayout(1, 2, 5, 5));

		// SetParameters of Panels Used
		productPanel.setLayout(new GridLayout(5, 5, 5, 5));
		rightPanel.setLayout(new BorderLayout());
		leftPanel.setLayout(new BorderLayout());

		Color steelBlue = new Color(112, 128, 144);
		messageList.setBackground(steelBlue);

		// Add Panels to Frame
		add(leftPanel);
		add(rightPanel);

		// Add Secondary Panels to Primary Panels
		leftPanel.add(productPanel, BorderLayout.CENTER);

		// Add Components to productPanel
		productPanel.add(Product1);
		productPanel.add(Product2);
		productPanel.add(Product3);
		productPanel.add(Product4);
		productPanel.add(Product5);
		productPanel.add(Product6);
		productPanel.add(Product7);
		productPanel.add(Product8);
                productPanel.add(Product9);
                productPanel.add(Product10);
                productPanel.add(Product11);
                productPanel.add(Product12);
                productPanel.add(Product13);
                productPanel.add(Product14);
                productPanel.add(Product15);
                productPanel.add(Product16);
                productPanel.add(Product17);
                productPanel.add(Product18);
                productPanel.add(Product19);
                productPanel.add(Product20);
                productPanel.add(Product21);
                productPanel.add(Product22);
                productPanel.add(Product23);
                productPanel.add(Product24);
                productPanel.add(Product25);
                
		
		// Add Components to transaction Panel
		rightPanel.add(rightButtons, BorderLayout.SOUTH);
		rightPanel.add(scrollPane, BorderLayout.CENTER);
		scrollPane.setViewportView(messageList);
		rightPanel.add(transaction, BorderLayout.NORTH);
		rightButtons.setLayout(new GridLayout(1,2,5,5));
		rightButtons.add(finalize);
		rightButtons.add(checkout);

		// Set alignment of label
		transaction.setText(transaction.getText() + " ID: " + TransactionIP.getTransactionID());
		transaction.setHorizontalAlignment(SwingConstants.CENTER);

		// Add Components to the Buttons Panel
		leftPanel.add(backTransactions, BorderLayout.SOUTH);

		checkout.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				TransactionIP.decInventory();
			}
		});
                
                ///////////////////ProductButtons/////////////////////
                //////////////////////////////////////////////////////
                //////////////////////////////////////////////////////
                
		Product1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TransactionIP.addItem((Item) ItemArray.get(0));
				transactionList.addElement(ItemArray.get(0).toString());
				
			}
		});
                Product2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TransactionIP.addItem((Item) ItemArray.get(1));
				transactionList.addElement(ItemArray.get(1).toString());
				
			}
		});
                Product3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TransactionIP.addItem((Item) ItemArray.get(2));
				transactionList.addElement(ItemArray.get(2).toString());
				
			}
		});
                Product4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TransactionIP.addItem((Item) ItemArray.get(3));
				transactionList.addElement(ItemArray.get(3).toString());
				
			}
		});
                Product5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TransactionIP.addItem((Item) ItemArray.get(4));
				transactionList.addElement(ItemArray.get(4).toString());
				
			}
		});
                Product6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TransactionIP.addItem((Item) ItemArray.get(5));
				transactionList.addElement(ItemArray.get(5).toString());
				
			}
		});
                Product7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TransactionIP.addItem((Item) ItemArray.get(6));
				transactionList.addElement(ItemArray.get(6).toString());
				
			}
		});
                Product8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TransactionIP.addItem((Item) ItemArray.get(7));
				transactionList.addElement(ItemArray.get(7).toString());
				
			}
		});
                Product9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TransactionIP.addItem((Item) ItemArray.get(8));
				transactionList.addElement(ItemArray.get(8).toString());
				
			}
		});
                Product10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TransactionIP.addItem((Item) ItemArray.get(9));
				transactionList.addElement(ItemArray.get(9).toString());
				
			}
		});
                Product11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TransactionIP.addItem((Item) ItemArray.get(10));
				transactionList.addElement(ItemArray.get(10).toString());
				
			}
		});
                Product12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TransactionIP.addItem((Item) ItemArray.get(11));
				transactionList.addElement(ItemArray.get(11).toString());
				
			}
		});
                Product13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TransactionIP.addItem((Item) ItemArray.get(12));
				transactionList.addElement(ItemArray.get(12).toString());
				
			}
		});
                Product14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TransactionIP.addItem((Item) ItemArray.get(13));
				transactionList.addElement(ItemArray.get(13).toString());
				
			}
		});
                Product15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TransactionIP.addItem((Item) ItemArray.get(14));
				transactionList.addElement(ItemArray.get(14).toString());
				
			}
		});
                Product16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TransactionIP.addItem((Item) ItemArray.get(15));
				transactionList.addElement(ItemArray.get(15).toString());
				
			}
		});
                Product17.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TransactionIP.addItem((Item) ItemArray.get(16));
				transactionList.addElement(ItemArray.get(16).toString());
				
			}
		});
                Product18.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TransactionIP.addItem((Item) ItemArray.get(17));
				transactionList.addElement(ItemArray.get(17).toString());
				
			}
		});
                Product19.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TransactionIP.addItem((Item) ItemArray.get(18));
				transactionList.addElement(ItemArray.get(18).toString());
				
			}
		});
                Product20.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TransactionIP.addItem((Item) ItemArray.get(19));
				transactionList.addElement(ItemArray.get(19).toString());
				
			}
		});
                Product21.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TransactionIP.addItem((Item) ItemArray.get(20));
				transactionList.addElement(ItemArray.get(20).toString());
				
			}
		});
                Product22.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TransactionIP.addItem((Item) ItemArray.get(21));
				transactionList.addElement(ItemArray.get(21).toString());
				
			}
		});
                Product23.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TransactionIP.addItem((Item) ItemArray.get(22));
				transactionList.addElement(ItemArray.get(22).toString());
				
			}
		});
                Product24.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TransactionIP.addItem((Item) ItemArray.get(23));
				transactionList.addElement(ItemArray.get(23).toString());
				
			}
		});
                Product25.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TransactionIP.addItem((Item) ItemArray.get(24));
				transactionList.addElement(ItemArray.get(24).toString());
				
			}
		});
                
		finalize.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
				transactionList.addElement("Subtotal: " + TransactionIP.viewSubTotal());
				transactionList.addElement("Tax: " + TransactionIP.viewTax());
				transactionList.addElement("Total: " + TransactionIP.viewTotal());
				Product1.setEnabled(false);
				Product2.setEnabled(false);
				Product3.setEnabled(false);
				Product4.setEnabled(false);
				Product5.setEnabled(false);
				Product6.setEnabled(false);
				Product7.setEnabled(false);
				Product8.setEnabled(false);
                                Product9.setEnabled(false);
				Product10.setEnabled(false);
				Product11.setEnabled(false);
				Product12.setEnabled(false);
				Product13.setEnabled(false);
				Product14.setEnabled(false);
				Product15.setEnabled(false);
				Product16.setEnabled(false);
                                Product17.setEnabled(false);
				Product18.setEnabled(false);
				Product19.setEnabled(false);
				Product20.setEnabled(false);
				Product21.setEnabled(false);
				Product22.setEnabled(false);
				Product23.setEnabled(false);
				Product24.setEnabled(false);
                                Product25.setEnabled(false);

			}
		});
		backTransactions.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
	}
}
