package views.footer;

import java.awt.Color;
import java.awt.Component;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.Image;
import java.io.IOException;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import utils.UploaderFontsResource;
import views.ConstantGUI;
public class JPpenultimate extends JPanel{

	private static final long serialVersionUID = 1L;
	
	public JPpenultimate() {
		setLayout(new FlowLayout());
		setBackground(Color.decode("#222222"));
		setPreferredSize(new Dimension(1349,290));
		setBorder(BorderFactory.createEmptyBorder(45,0,0,0));
		initComponents();
	}

	private void initComponents() {
		addInfoServiware();
		addButtonIcon();
	}

	private void addInfoServiware() {
		JLabel jlInfoServiware = new JLabel(ConstantGUI.TEXT_INFO_SERVIWARE);
		jlInfoServiware.setForeground(Color.WHITE);
		jlInfoServiware.setCursor(new Cursor(Cursor.TEXT_CURSOR));
		jlInfoServiware.setBorder(BorderFactory.createEmptyBorder(0,0,0,150));
		
		try {
			jlInfoServiware.setFont(UploaderFontsResource.uploadFont(ConstantGUI.FONT_NOSOTROS_TEXT, Font.PLAIN, 16));
		} catch (FontFormatException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		add(jlInfoServiware);
		
	}

	private void addButtonIcon() {
		
		JButton jbIcon = new JButton();
		jbIcon.setBackground(null);
		jbIcon.setIcon(new ImageIcon(new ImageIcon(getClass().getResource(ConstantGUI.ICON_SERVIWARE)).getImage().getScaledInstance(160,160,Image.SCALE_SMOOTH)));
		jbIcon.setAlignmentX(Component.CENTER_ALIGNMENT);
		jbIcon.setBorder(null);
		jbIcon.setBorder(BorderFactory.createEmptyBorder(0,40,0,280));
		jbIcon.setCursor(new Cursor(Cursor.HAND_CURSOR));
		jbIcon.setBorder(BorderFactory.createEmptyBorder(0,0,0,450));
		add(jbIcon);	
		
	}

}
