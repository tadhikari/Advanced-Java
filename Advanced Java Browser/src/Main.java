import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;


public class Main {
	
	
	public static void main(String[] args) {
		
		JFrame frame = new JFrame("Tribikram's Browser");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton go,back,newTab;
		go = new JButton("Search");
		back = new JButton("Back");
		newTab = new JButton("New");
		
		JPanel panel = new JPanel(new BorderLayout());
		JPanel panel2 = new JPanel(new FlowLayout());
		JPanel panel3 = new JPanel();
		
		panel.setBorder(BorderFactory.createLineBorder(Color.green));
		panel2.setBorder(BorderFactory.createLineBorder(Color.blue));
		panel3.setBorder(BorderFactory.createLineBorder(Color.yellow));
		
		JTextField search = new JTextField("http://graceland.brightspace.com",80);
		
		JEditorPane browserPane = new JEditorPane();
		browserPane.setEditable(false);
		browserPane.setPreferredSize(new Dimension(1180,850));
		
		
		try {
			
			  browserPane.setPage(search.getText());
			  
			}catch (IOException e) {
				
				System.out.println("error loading page");
				
			} 
		
		
		
			go.addActionListener(new ActionListener() {

			
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				try {
					  
					  browserPane.setPage(search.getText());

					  
					}catch (IOException e1) {
						System.out.println("error loading page");
					} 
				
			}});
			
			back.addActionListener(new ActionListener() {

				
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					try {
						  browserPane.setPage("");
						  
						}catch (IOException e1) {
							System.out.println("error loading page");
						} 
				}
				
			});
			
			
			newTab.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent arg0) {
					// TODO Auto-generated method stub
					main(args);
				}
			});
		
		
		panel2.add(back);
		panel2.add(search);
		panel2.add(go);
		panel2.add(newTab);
		panel3.add(browserPane);
		
		panel.add(panel2, BorderLayout.NORTH);
		panel.add(panel3, BorderLayout.CENTER);
		frame.add(panel);
		frame.setSize(1200,900);
		frame.setVisible(true);
		
	}

	
}
