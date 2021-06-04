package views.footer;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.Image;
import java.io.IOException;

import javax.swing.ImageIcon;
import javax.swing.JButton;

import utils.UploaderFontsResource;
import views.ConstantGUI;


public class JPModelButtons extends JButton{

	private static final long serialVersionUID = 1L;
	
	public JPModelButtons(String text, String Icon) {
		setText(text);
		setForeground(Color.WHITE);
		setMaximumSize(new Dimension(380,30));
		setBackground(null);
		setIcon(new ImageIcon(new ImageIcon(getClass().getResource(Icon)).getImage().getScaledInstance(20,20,Image.SCALE_SMOOTH)));
		setAlignmentX(Component.LEFT_ALIGNMENT);
		setBorder(null);
		
		try {
			setFont(UploaderFontsResource.uploadFont(ConstantGUI.FONT_NOSOTROS_TEXT, Font.PLAIN, 18));
		} catch (FontFormatException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public JPModelButtons() {
	
	}
}
