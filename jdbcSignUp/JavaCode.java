package googleexample;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.*;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class example implements ActionListener {

public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
	
		example obj = new example();
}
JFrame frame = new JFrame("SignUp");
JLabel label = new JLabel("Username");
JTextField field = new JTextField();
JButton button = new JButton("SignUp");
JLabel passlabel = new JLabel("Password");
JTextField passField = new JTextField();
JLabel succes = new JLabel();
		
			example(){
			
		frame.setSize(350, 300);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.setLayout(null);
			
			label.setBounds(35, 40, 80, 35);
			
			field.setBounds(115, 40, 165, 35);
			
			button.setBounds(35, 160, 80, 30);
			button.addActionListener(this);
			
			passlabel.setBounds(35, 100, 80, 35);
			
			passField.setBounds(115, 100, 165, 35);
			
			succes.setBounds(150, 160, 130,25);
			
			
			
			
			frame.add(label);
			frame.add(field);
			frame.add(button);
			frame.add(passlabel);
			frame.add(passField);
			frame.add(succes);
			
			
			
			
			
			
			
			
			
			frame.setVisible(true);
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			String email = field.getText();
			String pass = passField.getText();
			if(e.getSource() == button ) {
				try {
					Class.forName("com.mysql.jdbc.Driver");
					Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/SignUp","root","password");
					Statement stat=con.createStatement();
					succes.setText("SignUpSuccessful");
					String sql = "insert into Users (Email ,Password) " + "VALUES ('" + email + "' ,'" + pass + "');" ;
					
					stat.execute(sql);
					
					
					
				}catch (Exception e1) {
					System.out.println(e1);
				

			}
			}
			
		}
		
			
			
			
			
	  
		

	}



		

	


