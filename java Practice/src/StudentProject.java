import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


class  studentpro extends Frame implements ActionListener {
	
		Label l1,l2,l3,l4;
		TextField t1,t2,t3,t4;
		Button b1,b2,b3,b4;
		studentpro()
		{
			Frame f=new Frame();
			l1=new Label("Enter id ");
			l1.setBounds(20,50,100,20);
			f.add(l1);
			
			t1=new TextField();
			t1.setBounds(160,50,100,20);
			f.add(t1);
			
			l2=new Label("Enter first name");
			l2.setBounds(20,80,100,20);
			f.add(l2);
			
			t2=new TextField();
			t2.setBounds(160,80,100,20);
			f.add(t2);
			
			l3=new Label("Enter last name");
			l3.setBounds(20,110, 100, 20);
			f.add(l3);
			
			t3=new TextField();
			t3.setBounds(160,110,100,20);
			f.add(t3);
			
			l4=new Label("Enter Age");
			l4.setBounds(20,140, 100, 20);
			f.add(l4);
			
			t4=new TextField();
			t4.setBounds(160,140,100,20);
			f.add(t4);
			
			b1 = new Button("Add");
			b1.setBounds(20,200,100,30);
			b1.addActionListener(this);
			f.add(b1);
			
			b2 = new Button("Delete");
			b2.setBounds(150,200,100,30);
			b2.addActionListener(this);
			f.add(b2);
			
			b3 = new Button("Update age");
			b3.setBounds(20,250,100,30);
			b3.addActionListener(this);
			f.add(b3);
			
			b4 = new Button("Clear");
			b4.setBounds(150,250,100,30);
			b4.addActionListener(this);
			f.add(b4);
			
			f.setSize(500,500); // width,height
			f.setLayout(null);
			f.setVisible(true);
			}
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			studentClass sc=new studentClass();
			System.out.println(e.getActionCommand());
			if(e.getActionCommand().equals("Add"))
					{
				      sc.insertstudentDetails(Integer.parseInt(t1.getText()),t2.getText() ,t3.getText(),Integer.parseInt(t4.getText()));
				      
					}
			if(e.getActionCommand().equals("Update age"))
			{
				sc.updateStudentDetails(Integer.parseInt(t1.getText()), Integer.parseInt(t4.getText()));
			}
			if(e.getActionCommand().equals("Delete"))
			{
				sc.deleteStudentDetails(Integer.parseInt(t1.getText()));
			}
			if(e.getActionCommand().equals("Clear"))
			{
				t1.setText(" ");
				t2.setText(" ");
				t3.setText(" ");
				t4.setText(" ");
				
			}
			
		}
}
	
	
public class StudentProject{
	
public static void main(String[] args) {
		// TODO Auto-generated method stub
		studentpro sp=new studentpro();
		

	}
}

















