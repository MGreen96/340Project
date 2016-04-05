import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.SwingConstants;

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
	private JButton Product1 = new JButton("Product 1");
	private JButton Product2 = new JButton("Product 2");
	private JButton Product3 = new JButton("Product 3");
	private JButton Product4 = new JButton("Product 4");
	private JButton Product5 = new JButton("Product 5");
	private JButton Product6 = new JButton("Product 6");
	private JButton Product7 = new JButton("Product 7");
	private JButton Product8 = new JButton("Product 8");
	private JPanel leftPanel = new JPanel();
	private JLabel transaction = new JLabel("Transaction");
	private JPanel rightButtons = new JPanel();

	public SalesPage() {
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
		for(int i = 9; i < 26; i++){
			char k = (char) i;
			productPanel.add(new JButton("Product"));
		}
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
				//saves the transaction to the completed transactions file.
			}
		});
		Product1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TransactionIP.addItem(PJ);
				transactionList.addElement(PJ.toString());
				//transactionList.addElement("Subtotal: " + TransactionIP.viewSubTotal());
				//transactionList.addElement("Tax: " + TransactionIP.viewTax());
				//transactionList.addElement("Total: " + TransactionIP.viewTotal());
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
			}
		});
		backTransactions.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
	}
}
