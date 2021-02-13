package website;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class site4 extends JFrame implements ActionListener{
	private JTextField tf;
	private JButton btn;
	private JLabel lbl;
	
	public site4(){
		init();
	}
	
	public void init()
	{
		this.setTitle("textfield");
		this.setVisible(true);
		this.setSize(640, 450);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setLayout(new FlowLayout());
		addComponent();
	}
	
	public void addComponent()
	{
		tf=new JTextField(10);//10 karakterlik arama butonu alaný açýyor istediðin kadar karakter girebilirsin
		btn=new JButton("click");
		lbl=new JLabel(" ");
		
		add(lbl);
		add(tf);
		add(btn);
		btn.addActionListener(this); //butona actionlistener ekleyince komutlarý yapýyor
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		if(e.getActionCommand().equals("click"))
		{
			lbl.setText(lbl.getText()+" "+tf.getText()); //textfielde yazdýklarýmýzý ekrana basýyor
			tf.setText(""); //ekrana bastýktan sonra textfieldýn içini temizleyip yeni biþey yazmamýzý saðlýyor
			tf.requestFocus(); // imleçin hep textfieldde kalmasýný saðlýyor, sürekli týklayýp yazmayý önlemek için
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new site4();
	}

	
}
