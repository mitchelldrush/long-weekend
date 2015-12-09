import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class DisplayPerson extends JFrame
{

	private JTextField FirstNameTF, LastNameTF, BirthDateTF, StreetAddressTF, CityTF, StateTF, PhoneNumberTF, RelationTF;
	
	private JLabel FirstNameL, LastNameL, BirthDateL, StreetAddressL, CityL, StateL, PhoneNumberL, RelationL;
	
	private JButton ExitB;
	
	private ExitButtonHandler ebHandler;
	
	DisplayPerson()
	{
		
		
		FirstNameTF = new JTextField(10);
		LastNameTF = new JTextField(10);
		BirthDateTF = new JTextField(10);
		StreetAddressTF = new JTextField(10);
		CityTF = new JTextField(10);
		StateTF = new JTextField(10);
		PhoneNumberTF = new JTextField(10);
		RelationTF = new JTextField(10);
		
		FirstNameL = new JLabel("First Name:");
		LastNameL = new JLabel("Last Name:");
		BirthDateL = new JLabel("Birth Date:");
		StreetAddressL = new JLabel("Street Address:");
		CityL = new JLabel("City:");
		StateL = new JLabel("State");
		PhoneNumberL = new JLabel("Phone Number:");
		RelationL = new JLabel("Relation");
		
		ExitB = new JButton("Exit");
		ebHandler = new ExitButtonHandler();
		ExitB.addActionListener(ebHandler);
		

		
		Container pane = getContentPane();
		setVisible(true);
		setSize(300, 300);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	    setLocationRelativeTo(null);
	    setBackground(Color.GRAY);
	    setLayout(new GridLayout(10, 17)); //17, 2 is OK.
	    setResizable(false);
	    pane.add(FirstNameL);
	    pane.add(FirstNameTF);
	    pane.add(LastNameL);
	    pane.add(LastNameTF);
	    pane.add(BirthDateL);
	    pane.add(BirthDateTF);
	    pane.add(StreetAddressL);
	    pane.add(StreetAddressTF);
	    pane.add(CityL);
	    pane.add(CityTF);
	    pane.add(StateL);
	    pane.add(StateTF);
	    pane.add(PhoneNumberL);
	    pane.add(PhoneNumberTF);
	    pane.add(RelationL);
	    pane.add(RelationTF);
	    pane.add(ExitB);
	}
	
	
	private class ExitButtonHandler implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			System.exit(0);
		}
	}
	
	
	public static void main(String[] args)
	{
		DisplayPerson Address = new DisplayPerson();
	}
	}
