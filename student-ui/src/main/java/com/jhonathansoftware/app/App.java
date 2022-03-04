package com.jhonathansoftware.app;

import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import com.jhonathansoftware.ui.MainFrame;

public class App {

	public static void main(String[] args) {
		
		// application will inherit the OS related look and feel
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
				| UnsupportedLookAndFeelException e) {
			e.printStackTrace();
		}
		
		// run the application on a distinct thread (most object methods of Swing are not thread safe)
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				new MainFrame();
			}
		});

	}

}
