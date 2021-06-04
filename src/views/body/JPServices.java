package views.body;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontFormatException;
import java.io.IOException;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;

import utils.UploaderFontsResource;
import views.ConstantGUI;

public class JPServices extends JPanel{

	private static final long serialVersionUID = 1L;
	
	public JPServices() {
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		setPreferredSize(new Dimension(1349,320));
		setAlignmentX(LEFT_ALIGNMENT);
		setBackground(Color.decode(ConstantGUI.BACKGROUNG_SERVICE));
		initComponents();
	}

	private void initComponents() {
		addServiceTitle();
		addServiceText();
		
	}

	private void addServiceText() {
		
		JLabel jlServiceText = new JLabel(ConstantGUI.SERVICE_TEXT);
		jlServiceText.setForeground(Color.WHITE);
		jlServiceText.setBorder(BorderFactory.createEmptyBorder(30,400,10,200));
		jlServiceText.setAlignmentX(CENTER_ALIGNMENT);
		
		try {
			jlServiceText.setFont(UploaderFontsResource.uploadFont(ConstantGUI.FONT_MISION_TITLE_TEXT, Font.PLAIN, 18));
		} catch (FontFormatException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		this.add(jlServiceText);
		
	}

	private void addServiceTitle() {
		
		JLabel jlServiceTitle = new JLabel("SERVICIOS");
		jlServiceTitle.setForeground(Color.WHITE);
		jlServiceTitle.setBorder(BorderFactory.createEmptyBorder(80,250,10,200));
		jlServiceTitle.setFont(new Font(ConstantGUI.FONT_ARIAL, Font.PLAIN, 60));
		jlServiceTitle.setAlignmentX(CENTER_ALIGNMENT);
		
		try {
			jlServiceTitle.setFont(UploaderFontsResource.uploadFont(ConstantGUI.FONT_NOSOTROS_TITLE, Font.PLAIN, 58));
		} catch (FontFormatException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		this.add(jlServiceTitle);
		
	}

}
