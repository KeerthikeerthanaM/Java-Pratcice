import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class MyApps extends Frame implements ActionListener {

	Label l0, l1, l2, l3;
	TextField t1, t2, t3,t4;
	Button b;

	public MyApps() {

		Frame f = new Frame();

		l0 = new Label("Add Two Numbers");
		l0.setBounds(200, 40, 100, 20);

		l1 = new Label("Enter 1st value");
		l1.setBounds(100, 100, 100, 20);

		t1 = new TextField();
		t1.setBounds(250, 100, 150, 20);

		l2 = new Label("Enter 2nd value");
		l2.setBounds(100, 200, 100, 20);

		t2 = new TextField();
		t2.setBounds(250, 200, 150, 20);

		l3 = new Label("Result");
		l3.setBounds(100, 300, 100, 20);

		t3 = new TextField();
		t3.setBounds(250, 300, 150, 20);
		
		t4 = new TextField();
		t4.setBounds(250, 350, 250, 30);
		

		b = new Button("Submit");
		b.setBounds(200, 400, 80, 30);
		b.addActionListener(this);
		f.add(l0);

		f.add(l1);
		f.add(t1);
		f.add(l2);
		f.add(t2);

		f.add(l3);
		f.add(t3);
		f.add(t4);

		f.add(b);

		f.setSize(1000, 1000); // width,height
		f.setLayout(null);
		f.setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String x = t1.getText();
		String y = t2.getText();

		if (x.isEmpty() || y.isEmpty()) {
			t4.setText("Please enter a value");
		} else {
			int a = Integer.parseInt(x);
			int b = Integer.parseInt(y);
			int c = a + b;
			String result = String.valueOf(c);
			t3.setText(result);
		}

	}

}

public class awtApplet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyApps app = new MyApps();

	}

}
