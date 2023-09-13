package com.module3;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

class inventory implements ActionListener
{
	JFrame frame;
	JButton b1,b2,b3,b4,b5;
	JLabel l1,l2,l3,l4,l5,msg;
	JTextField t1,t2,t3,t4,t5;
	
	public inventory()
	{
		frame=new JFrame("Inventory Management System");
		frame.setLayout(new GridLayout(8,2));
		frame.setSize(500,500);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		l1=new JLabel("Product ID :");
		t1=new JTextField(15);
		frame.add(l1);
		frame.add(t1);
		
		l2=new JLabel("Product Name : ");
		t2=new JTextField(15);
		frame.add(l2);
		frame.add(t2);
		
		l3=new JLabel("Product Price : ");
		t3=new JTextField(15);
		frame.add(l3);
		frame.add(t3);
		
		l4=new JLabel("Product Quantity : ");
		t4=new JTextField(15);
		frame.add(l4);
		frame.add(t4);
		
		l5=new JLabel("Product Company : ");
		t5=new JTextField(15);
		frame.add(l5);
		frame.add(t5);
		
		msg=new JLabel("");
		
		
		b1=new JButton("Add Stock");
		frame.add(b1);
		b2=new JButton("View Stock");
		frame.add(b2);
		b3=new JButton("Search Stock");
		frame.add(b3);
		b4=new JButton("Edit Stock");
		frame.add(b4);
		b5=new JButton("Delete Stock");
		frame.add(b5);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		
		frame.add(msg);
	}
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		if(e.getSource()==b1)
		{
			try 
			{
				Class.forName("com.mysql.jdbc.Driver");
				Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/dilip", "root", "");
				System.out.println("Connection Established");
				Statement st=cn.createStatement();
				String qry="insert into inventory(id,name,price,qty,comp) values("+t1.getText()+",'"+t2.getText()+"',"+t3.getText()+","+t4.getText()+",'"+t5.getText()+"')";
				int x=st.executeUpdate(qry);
				if(x>0) 
				{
					msg.setText("Record inserted");
				}
				else
				{
					msg.setText("Record  not inserted");
				}
				cn.close();
			} catch (Exception e1) 
			{
				e1.printStackTrace();
			}
			
		}
		else if(e.getSource()==b2)
		{
			try 
			{
				Class.forName("com.mysql.jdbc.Driver");
				Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/dilip", "root", "");
				System.out.println("Connection Established");
				Statement st=cn.createStatement();
				String qry="select * from inventory";
				ResultSet rs=st.executeQuery(qry);
				while(rs.next())
				{
					System.out.println("Product id is :"+rs.getInt(1));
					System.out.println("Product name is :"+rs.getString(2));
					System.out.println("Product Price is :"+rs.getInt(3));
					System.out.println("Product Quantity is :"+rs.getInt(4));
					System.out.println("Product Company is :"+rs.getString(5));
					System.out.println();
				}
				cn.close();
			} catch (Exception e1) 
			{
				e1.printStackTrace();
			}
			
		}
		else if(e.getSource()==b3)
		{
			try 
			{
				Class.forName("com.mysql.jdbc.Driver");
				Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/dilip", "root", "");
				System.out.println("Connection Established");
				Statement st=cn.createStatement();
				String qry="select * from inventory where id="+t1.getText()+"";
				ResultSet rs=st.executeQuery(qry);
				while(rs.next())
				{
					System.out.println("Product id is :"+rs.getInt(1));
					System.out.println("Product name is :"+rs.getString(2));
					System.out.println("Product Price is :"+rs.getInt(3));
					System.out.println("Product Quantity is :"+rs.getInt(4));
					System.out.println("Product Company is :"+rs.getString(5));
					System.out.println();
				}
				cn.close();
			} catch (Exception e1) 
			{
				e1.printStackTrace();
			}
		}
		else if(e.getSource()==b4)
		{
			try 
			{
				Class.forName("com.mysql.jdbc.Driver");
				Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/dilip", "root", "");
				System.out.println("Connection Established");
				Statement st=cn.createStatement();
				String qry="update inventory set name='"+t2.getText()+"',price="+t3.getText()+",qty="+t4.getText()+",comp='"+t5.getText()+"' where id="+t1.getText()+"";
				int x=st.executeUpdate(qry);
				if(x>0) 
				{
					msg.setText("Record Edited");
				}
				else
				{
					msg.setText("Record  not Edited");
				}
				cn.close();
			} catch (Exception e1) 
			{
				e1.printStackTrace();
			}
		}
		else if(e.getSource()==b5) 
		{
			try 
			{
				Class.forName("com.mysql.jdbc.Driver");
				Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/dilip", "root", "");
				System.out.println("Connection Established");
				Statement st=cn.createStatement();
				String qry="delete from inventory where id="+t1.getText()+"";
				int x=st.executeUpdate(qry);
				if(x>0) 
				{
					msg.setText("Record Deleted");
				}
				else
				{
					msg.setText("Record  not Deleted");
				}
				cn.close();
			} catch (Exception e1) 
			{
				e1.printStackTrace();
			}
		}
	}
}

public class InventoryManagementSystem 
{
	public static void main(String[] args) 
	{
		new inventory();
	}
}
