package views.footer;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontFormatException;
import java.io.IOException;

import javax.swing.JTextField;

import utils.UploaderFontsResource;
import views.ConstantGUI;

public class JPModelTextField extends JTextField{

	private static final long serialVersionUID = 1L;
	
	public JPModelTextField(String text, String backGround, int width, int high) {
		setText(text);
		setBackground(Color.decode(backGround));
		setForeground(Color.WHITE);
		setMaximumSize(new Dimension(width,high));
		setBorder(null);
		
		try {
			setFont(UploaderFontsResource.uploadFont(ConstantGUI.FONT_NOSOTROS_TITLE, Font.BOLD, 18));
		} catch (FontFormatException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
