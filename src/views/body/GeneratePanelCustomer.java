package views.body;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontFormatException;
import java.io.IOException;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import utils.UploaderFontsResource;
import views.ConstantGUI;

public class GeneratePanelCustomer {
	
public JPanel generatePanel (String title, String image, String pageEnd, String buttonDownParam) {
		
		JPanel generatePanel = new JPanel();
		generatePanel.setPreferredSize(new Dimension(280,490));
		generatePanel.setLayout(new BoxLayout(generatePanel, BoxLayout.Y_AXIS));
		generatePanel.setBackground(Color.WHITE);
		generatePanel.setBorder(BorderFactory.createMatteBorder(20, 40, 20, 40, Color.decode(ConstantGUI.BACKGROUND_PORTAFOLIO)));
		
		JButton buttonTitleCustomer = new JButton(title);
		//buttonTitleCustomer.setFont(new Font("Arial", Font.PLAIN, 18));
		buttonTitleCustomer.setForeground(Color.decode("#69a8da"));
		buttonTitleCustomer.setCursor(new Cursor(Cursor.HAND_CURSOR));
		buttonTitleCustomer.setBorder(BorderFactory.createEmptyBorder(30,90,20,0));
		buttonTitleCustomer.setOpaque(false);
		buttonTitleCustomer.setContentAreaFilled(false);
		buttonTitleCustomer.setBorderPainted(false);
		
		try {
			buttonTitleCustomer.setFont(UploaderFontsResource.uploadFont(ConstantGUI.FONT_NOSOTROS_TEXT, Font.PLAIN, 18));
		} catch (FontFormatException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		generatePanel.add(buttonTitleCustomer);
		
		JLabel infoImageRight = new JLabel();
		infoImageRight.setIcon(new ImageIcon(getClass().getResource(image)));
		infoImageRight.setBorder(BorderFactory.createEmptyBorder(0,90,20,0));
		generatePanel.add(infoImageRight);
		
		JLabel pageEndCustomer = new JLabel(pageEnd);
		pageEndCustomer.setFont(new Font("Arial", Font.PLAIN, 15));
		pageEndCustomer.setForeground(Color.BLACK);
		pageEndCustomer.setCursor(new Cursor(Cursor.TEXT_CURSOR));
		pageEndCustomer.setBorder(BorderFactory.createEmptyBorder(0,40,20,0));
		generatePanel.add(pageEndCustomer);
		
		JButton buttonDown = new JButton(buttonDownParam);
		buttonDown.setForeground(Color.WHITE);
		buttonDown.setBackground(Color.decode("#1fb6e9"));
		buttonDown.setPreferredSize(new Dimension(127,28));
		//buttonDown.setFont(new Font("Arial", Font.BOLD, 20));
		buttonDown.setBorder(BorderFactory.createMatteBorder(0, 90, 0, 0, Color.WHITE));
		
		try {
			buttonDown.setFont(UploaderFontsResource.uploadFont(ConstantGUI.FONT_BUTTON_PORTA, Font.PLAIN, 20));
		} catch (FontFormatException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		generatePanel.add(buttonDown);
		
		return generatePanel;
	}
}
