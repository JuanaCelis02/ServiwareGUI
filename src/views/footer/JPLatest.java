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

public class JPLatest extends JPanel{
	
	private static final long serialVersionUID = 1L;
	
	public JPLatest() {
		setLayout(new FlowLayout());
		setBackground(Color.decode(ConstantGUI.BACKGROUND_FOOTER));
		setPreferredSize(new Dimension(1349,55));
		setBorder(BorderFactory.createEmptyBorder(15,0,0,0));
		initComponents();
	}

	private void initComponents() {
		addJLCopyRight();
		addIconFb();
		addIconTw();
		
	}

	private void addIconTw() {
		
		JButton jbIcon = new JButton();
		jbIcon.setBackground(null);
		jbIcon.setIcon(new ImageIcon(new ImageIcon(getClass().getResource(ConstantGUI.TWITTER_IMG)).getImage().getScaledInstance(20,20,Image.SCALE_SMOOTH)));
		jbIcon.setAlignmentX(Component.CENTER_ALIGNMENT);
		jbIcon.setBorder(null);
		jbIcon.setBorder(BorderFactory.createEmptyBorder(0,15,0,0));
		jbIcon.setCursor(new Cursor(Cursor.HAND_CURSOR));
		add(jbIcon);	
		
	}

	private void addJLCopyRight() {
		
		JLabel jlInfoServiware = new JLabel(ConstantGUI.TEXT_COPY_RIGHT);
		jlInfoServiware.setForeground(Color.WHITE);
		
		try {
			jlInfoServiware.setFont(UploaderFontsResource.uploadFont(ConstantGUI.FONT_NOSOTROS_TEXT, Font.PLAIN, 15));
		} catch (FontFormatException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		jlInfoServiware.setCursor(new Cursor(Cursor.TEXT_CURSOR));
		jlInfoServiware.setBorder(BorderFactory.createEmptyBorder(0,0,0,780));
		add(jlInfoServiware);
		
	}

	private void addIconFb() {
		
		JButton jbIcon = new JButton();
		jbIcon.setBackground(null);
		jbIcon.setIcon(new ImageIcon(new ImageIcon(getClass().getResource(ConstantGUI.FACEBOOK_IMG)).getImage().getScaledInstance(20,20,Image.SCALE_SMOOTH)));
		jbIcon.setAlignmentX(Component.CENTER_ALIGNMENT);
		jbIcon.setBorder(null);
		jbIcon.setCursor(new Cursor(Cursor.HAND_CURSOR));
		add(jbIcon);	
		
	}

}
