package intro_to_array_lists;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class GuestBook implements ActionListener{
	// Create a GUI with two buttons. One button reads "Add Name" and the other button reads "View Names". 
	
	JFrame jframe = new JFrame();
	JPanel jpanel = new JPanel();
	JButton button1 = new JButton();
	JButton button2 = new JButton();
	ArrayList<String> Allnames = new ArrayList<String>();
	
	GuestBook (){
		
		button1.setText("Add Name");
		button2.setText("View Names");
		button1.addActionListener(null);
		button2.addActionListener(null);
		jpanel.add(button1);
		jpanel.add(button2);
		jframe.add(jpanel);
		jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	 public static void main(String[] args) {
		GuestBook guestbook = new GuestBook();
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		JButton buttonPressed = (JButton) e.getSource();
		
		if (buttonPressed == button1) {
			
		String name = JOptionPane.showInputDialog("Enter A Name");	
		
		Allnames.add(name);
		
		}
		if (buttonPressed == button2) {
			
			for (int i = 0; i < Allnames.size(); i++) {
				
				System.out.println("Guest #" + Allnames.get(i) + Allnames );
				
			}
			
			
			
		}
		
	}
	
	// When the add name button is clicked, display an input dialog that asks the user to enter a name. Add
	// that name to an ArrayList. When the "View Names" button is clicked, display a message dialog that displays
	// all the names added to the list. Format the list as follows:
	// Guest #1: Bob Banders
	// Guest #2: Sandy Summers
	// Guest #3: Greg Ganders
	// Guest #4: Donny Doners
}
