package utils;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontFormatException;
import java.io.IOException;

import javax.swing.JButton;

import views.ConstantGUI;

public class MyUtils {
	public static void setFooterButtonsValues(JButton buttonToChange) {
		buttonToChange.setMaximumSize(new Dimension(230,130));
		try {
			buttonToChange.setFont(UploaderFontsResource.uploadFont(ConstantGUI.FONT_NOSOTROS_TEXT, Font.BOLD, 16));
		} catch (FontFormatException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		buttonToChange.setForeground(Color.decode(ConstantGUI.COLOR_BUTTON_BLUE_HEADER));
		buttonToChange.setBackground(null);
		buttonToChange.setBorder(null);
		buttonToChange.setCursor(new Cursor(Cursor.HAND_CURSOR));
		
	}
}
