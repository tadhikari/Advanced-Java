import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

/*trib*/



public class Main {
	
	
	static String previous1;
	static String previous2;
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		JFrame browser = new JFrame("Tribikram's Browser");
		browser.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		browser.setSize(1200,750);
		JPanel topSection = new JPanel(new BorderLayout());
		topSection.setBorder(BorderFactory.createLineBorder(Color.black));
		
		JTabbedPane tabs = new JTabbedPane();
		
		JPanel window1 = new JPanel(new BorderLayout());
		JPanel window2 = new JPanel(new BorderLayout());
		
		JPanel window1_top = new JPanel(new FlowLayout());
		JPanel window2_top = new JPanel(new FlowLayout());
		
		JTextField search_bar1 = new JTextField("http://graceland.brightspace.com",80);
		JTextField search_bar2 = new JTextField("http://graceland.brightspace.com",80);
		
		JButton back_button1 = new JButton("Back");
		JButton search_button1 = new JButton("Search");
		
		JButton back_button2 = new JButton("Back");
		JButton search_button2 = new JButton("Search");
		
		
		
		
		
		JPanel body1 = new JPanel(new BorderLayout());
		JPanel body2 = new JPanel(new BorderLayout());
		
		JEditorPane browserPane1 = new JEditorPane();
		JEditorPane browserPane2 = new JEditorPane();
		browserPane1.setEditable(false);
		browserPane2.setEditable(false);
		browserPane1.setBorder(BorderFactory.createLineBorder(Color.black));
		
		
		try {
			  browserPane1.setPage("http://graceland.brightspace.com");
			  browserPane2.setPage("http://graceland.brightspace.com");
			}catch (IOException e) {
				System.out.println("error loading page");
			} 
		
		
		
		
		
		search_button1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				
				previous1 = browserPane1.getPage().toString(); 
				pageSearch(browserPane1, search_bar1.getText());
				
			}
			
		});
		
		
		search_button2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				
				previous2 = browserPane2.getPage().toString();
				pageSearch(browserPane2, search_bar2.getText());
				
			}
			
		});
		
		back_button1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				pageSearch(browserPane1, previous1);
				search_bar1.setText(previous1);
				previous1 = browserPane1.getPage().toString(); 
				
			}
			
		});
		
		
		back_button2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				
				pageSearch(browserPane2, previous2);
				search_bar2.setText(previous2);
				previous2 = browserPane2.getPage().toString();
				
			}
			
		});
		

		
		body1.add(browserPane1,BorderLayout.CENTER);
		body2.add(browserPane2,BorderLayout.CENTER);
		
		window1_top.add(back_button1, FlowLayout.LEFT);
		window1_top.add(search_bar1, FlowLayout.CENTER);
		window1_top.add(search_button1, FlowLayout.RIGHT);
		window1_top.setBorder(BorderFactory.createLineBorder(Color.black));
		window1.add(window1_top, BorderLayout.NORTH);
		window1.add(body1, BorderLayout.CENTER);
		
		
		
		window2_top.add(back_button2, FlowLayout.LEFT);
		window2_top.add(search_bar2,FlowLayout.CENTER);
		window2_top.add(search_button2, FlowLayout.RIGHT);
		window2_top.setBorder(BorderFactory.createLineBorder(Color.black));
		window2.add(window2_top, BorderLayout.NORTH);
		window2.add(body2, BorderLayout.CENTER);
		
		
		
		tabs.addTab("Tab 1", null, window1,"");
		tabs.addTab("Tab 2", null, window2,"");
		
		topSection.add(tabs, BorderLayout.NORTH);
		browser.add(topSection);
		
		browser.setVisible(true);
		
	}
	
	
	public static void pageSearch(JEditorPane p,String url) {
			try {
			 p.setPage(url);
			}catch (IOException e) {
				System.out.println("error loading page");
			} 
	}
	
	
	

}