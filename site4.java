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
		tf=new JTextField(10);//10 karakterlik arama butonu alan� a��yor istedi�in kadar karakter girebilirsin
		btn=new JButton("click");
		lbl=new JLabel(" ");
		
		add(lbl);
		add(tf);
		add(btn);
		btn.addActionListener(this); //butona actionlistener ekleyince komutlar� yap�yor
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		if(e.getActionCommand().equals("click"))
		{
			lbl.setText(lbl.getText()+" "+tf.getText()); //textfielde yazd�klar�m�z� ekrana bas�yor
			tf.setText(""); //ekrana bast�ktan sonra textfield�n i�ini temizleyip yeni bi�ey yazmam�z� sa�l�yor
			tf.requestFocus(); // imle�in hep textfieldde kalmas�n� sa�l�yor, s�rekli t�klay�p yazmay� �nlemek i�in
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new site4();
	}

	
}
