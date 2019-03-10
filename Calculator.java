import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class Calculator extends Applet implements ActionListener
{
	Label l;
	TextField t;
	Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,add,mul,sub,div,equ,clr;
	int x=0,y=0,z=0,flag=0;

	public void init()
	{
		l=new Label("CALCULATOR");
		t=new TextField();
		b1=new Button("1");
		b2=new Button("2");
		b3=new Button("3");
		b4=new Button("4");
		b5=new Button("5");
		b6=new Button("6");
		b7=new Button("7");
		b8=new Button("8");
		b9=new Button("9");
		b10=new Button("0");
		add=new Button("ADD");
		sub=new Button("SUB");
		mul=new Button("MUL");
		div=new Button("DIV");
		equ=new Button("=");
		clr=new Button("C");

		l.setBounds(50,50,50,20);
		t.setBounds(40,80,120,60);

		b7.setBounds(40,110,40,40);
		b8.setBounds(90,110,40,40);
		b9.setBounds(140,110,40,40);
		clr.setBounds(190,110,40,40);

		b4.setBounds(40,160,40,40);
		b5.setBounds(90,160,40,40);
		b6.setBounds(140,160,40,40);
		div.setBounds(190,160,40,40);

		b1.setBounds(40,210,40,40);
		b2.setBounds(90,210,40,40);
		b3.setBounds(140,210,40,40);
		mul.setBounds(190,210,40,40);

		b10.setBounds(40,260,40,40);
		equ.setBounds(90,260,40,40);
		sub.setBounds(140,260,40,40);
		add.setBounds(190,260,40,40);

		add(l);
		add(t);
		add(b1);
		add(b2);
		add(b3);
		add(b4);
		add(b5);
		add(b6);
		add(b7);
		add(b8);
		add(b9);
		add(b10);
		add(add);
		add(sub);
		add(mul);
		add(div);
		add(equ);
		add(clr);

		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		b7.addActionListener(this);
		b8.addActionListener(this);
		b9.addActionListener(this);
		b10.addActionListener(this);
		add.addActionListener(this);
		sub.addActionListener(this);
		mul.addActionListener(this);
		div.addActionListener(this);
		equ.addActionListener(this);
		clr.addActionListener(this);

	}

	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getActionCommand().equals("7"))
		{
			 if(flag==0)
			 {
				 x=x*10+7;
				 t.setText(Integer.toString(x));
			 }
			 else
			 {
				 y=y*10+7;
				 t.setText(Integer.toString(y));
			 }
		 }

	    if(ae.getActionCommand().equals("8"))
		{
			 if(flag==0)
			 {
				 x=x*10+8;
				 t.setText(Integer.toString(x));
			 }
			 else
			 {
				 y=y*10+8;
				 t.setText(Integer.toString(y));
			 }
		 }

		 if(ae.getActionCommand().equals("9"))
		 {
			 if(flag==0)
			 {
				 x=x*10+9;
				 t.setText(Integer.toString(x));
		 	 }
			 else
			 {
				 y=y*10+7;
 				 t.setText(Integer.toString(y));
 			 }
		 }
		 if(ae.getActionCommand().equals("4"))
		 {
		 	 if(flag==0)
		 	 {
		 		 x=x*10+4;
		 		 t.setText(Integer.toString(x));
		 	 }
		 	 else
		 	 {
		 		 y=y*10+4;
		 		 t.setText(Integer.toString(y));
		 	 }
		 }

		 if(ae.getActionCommand().equals("5"))
		 {
		 	 if(flag==0)
		 	 {
		 		 x=x*10+5;
		 		 t.setText(Integer.toString(x));
		 	 }
		 	 else
		 	 {
		 		 y=y*10+5;
		 		 t.setText(Integer.toString(y));
		 	 }
		 }
		 if(ae.getActionCommand().equals("6"))
		 {
 			 if(flag==0)
 			 {
 				 x=x*10+6;
 				 t.setText(Integer.toString(x));
 			 }
 			 else
 			 {
 				 y=y*10+6;
 				 t.setText(Integer.toString(y));
 			 }
		 }

		 if(ae.getActionCommand().equals("1"))
		 {
		 	 if(flag==0)
		 	 {
		 		 x=x*10+1;
		 		 t.setText(Integer.toString(x));
		 	 }
		 	 else
		 	 {
		 		 y=y*10+1;
		 		 t.setText(Integer.toString(y));
		 	 }
		 }
		 if(ae.getActionCommand().equals("2"))
		 {
		 	 if(flag==0)
		 	 {
		 		 x=x*10+2;
 				 t.setText(Integer.toString(x));
 			 }
 			 else
 			 {
 				 y=y*10+2;
 				 t.setText(Integer.toString(y));
 			 }
		 }
		 if(ae.getActionCommand().equals("3"))
		 {
		 	 if(flag==0)
		 	 {
		 		 x=x*10+3;
		 		 t.setText(Integer.toString(x));
		 	 }
		 	 else
		 	 {
 				 y=y*10+3;
 				 t.setText(Integer.toString(y));
		 	}
		 }

		if(ae.getActionCommand().equals("0"))
		{
			 if(flag==0)
			 {
				 x=x*10;
				 t.setText(Integer.toString(x));
			 }
			 else
			 {
				 y=y*10;
				 t.setText(Integer.toString(y));
			 }
		 }
		if(ae.getActionCommand().equals("ADD"))
		{
			 flag=1;
		}

		if(ae.getActionCommand().equals("SUB"))
		{
			flag=2;
		}

		if(ae.getActionCommand().equals("MUL"))
		{
			flag=3;
		}

		if(ae.getActionCommand().equals("DIV"))
		{
			flag=4;
		}

		if(ae.getActionCommand().equals("C"))
		{
			x=0;
			y=0;
			z=0;
			flag=0;
			t.setText("");
		}

		if(ae.getActionCommand().equals("="))
		{
			if(flag==1)
			{
				z=x+y;
				t.setText(Integer.toString(z));
			}
			if(flag==2)
			{
				z=x-y;
				t.setText(Integer.toString(z));
			}
			if(flag==3)
			{
				z=x*y;
				t.setText(Integer.toString(z));
			}
			if(flag==1)
			{
				z=x/y;
				t.setText(Integer.toString(z));
			}
			z=x;
		}
	}
}
