package views.body;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontFormatException;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JPanel;

import utils.UploaderFontsResource;
import views.ConstantGUI;

public class JPButtonService extends JPanel{
	
	private static final long serialVersionUID = 1L;

	public JPButtonService() {
		setBackground(Color.decode(ConstantGUI.BACKGROUNG_SERVICE));
		setPreferredSize(new Dimension(1349, 109));
		setAlignmentX(LEFT_ALIGNMENT);
		initComponents();
	}

	private void initComponents() {
		JButton jbPackages = new JButton(ConstantGUI.BUTTON_PACKAGES);
		jbPackages.setPreferredSize(new Dimension(156,59));
		jbPackages.setForeground(Color.WHITE);
		jbPackages.setBackground(Color.decode("#1fb6e9"));
		jbPackages.setAlignmentX(Component.CENTER_ALIGNMENT);
		
		try {
			jbPackages.setFont(UploaderFontsResource.uploadFont(ConstantGUI.FONT_BUTTON_PORTA, Font.BOLD, 20));
		} catch (FontFormatException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		this.add(jbPackages);
		
	}
}
