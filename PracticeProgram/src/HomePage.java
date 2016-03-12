import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JPanel;

public class HomePage extends JFrame {

	private JPanel Cards = new JPanel(new CardLayout());
	
	//HomePage UI Elements
	private final String HOMEPAGE =	"HomePage";
	private JButton Exit = new JButton("Exit"); 
	private JButton Return = new JButton("Return to Login Menu");
	private JPanel Panel = new JPanel();
	private JPanel Panel2 = new JPanel();
	private JButton Manager = new JButton("Manager's Section");
	private int xWidth = 200;
	private int yHeight = 60;
	private JButton Transaction = new JButton("Transactions");
	
	
	// Manager Panel UI Elements
	private final String MANAGER = "ManagerPanel";
	private JButton Inventory = new JButton("Inventory");
	private JButton Sales = new JButton("Sales");
	private JButton Users = new JButton("User Manager");
	private JButton Back = new JButton("Back");
	
	//Inventory Panel UI Elements
	private final String INVENTORY = "Inventory";
	


	
	

	
	public HomePage(){
		
		super("Home Page");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);
		setBounds(70, 70, 800, 600);
		setVisible(true);
		
		
		
		
		
		Panel.setLayout(null);
		Panel2.setLayout(null);
		
		//Cards.add(Panel2, TRANSACTION);
		Cards.add(Panel,  HOMEPAGE);
		Cards.add(Panel2, MANAGER);
		add(Cards);
		//Set 
		Manager.setBounds(5, 5, xWidth, yHeight);
		Transaction.setBounds(5, Manager.getY() + yHeight + 5, xWidth, yHeight);
		Return.setBounds(5, Transaction.getY() + yHeight + 5, xWidth, yHeight);
		Exit.setBounds(5, Return.getY() + yHeight + 5, xWidth, yHeight);
		
		
		//Add items to panel
		Panel.add(Manager);
		Panel.add(Transaction);
		Panel.add(Exit);
		Panel.add(Return);
		
		//Format items for Panel2
		Inventory.setBounds(5, 5, xWidth, yHeight);
		Sales.setBounds(5, Inventory.getY() + yHeight + 5, xWidth, yHeight);
		Users.setBounds(5, Sales.getY() + yHeight + 5, xWidth, yHeight);
		Back.setBounds(5, Users.getY() + yHeight + 5, xWidth, yHeight);
		
		//Add items to Panel2
		Panel2.add(Inventory);
		Panel2.add(Sales);
		Panel2.add(Users);
		Panel2.add(Back);
		
		
		Back.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
				CardLayout c1 = (CardLayout)(Cards.getLayout());
				c1.previous(Cards);
			}
		});
		Manager.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CardLayout c1  = (CardLayout)(Cards.getLayout());
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
		
		
	}
}
