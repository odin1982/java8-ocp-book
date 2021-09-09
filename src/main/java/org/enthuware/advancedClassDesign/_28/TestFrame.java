package org.enthuware.advancedClassDesign._28;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TestFrame extends Frame{
	String s="Message";
	public static void main(String[] args) {
		TestFrame t = new TestFrame();
		Button b = new Button("press me");
		b.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Message is " + s);
			}});
		
		t.add(b);
	}

}
