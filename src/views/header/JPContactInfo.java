package views.header;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.FontFormatException;
import java.io.IOException;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

import utils.UploaderFontsResource;
import views.ConstantGUI;

public class JPContactInfo extends JPanel{

	private static final long serialVersionUID = 1L;
	
	public JPContactInfo() {
		
		setBackground(Color.decode(ConstantGUI.COLOR_HEADER_BLUE));
		setAlignmentX(LEFT_ALIGNMENT);
		setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
		initComponents();
	}
	
	private void initComponents() {
		addIconCell();
		addJLabelCellText();
		addIconEmail();
		addTextEmail();
		addIconFacebook();
		addIconTwitter();
	}
	
	private void addIconTwitter() {
		JLabel jlIconTwitter = new JLabel();
		jlIconTwitter.setIcon(new ImageIcon(getClass().getResource(ConstantGUI.TWITTER_IMG)));
		jlIconTwitter.setBorder(BorderFactory.createEmptyBorder(10,20,10,0));
		jlIconTwitter.setCursor(new Cursor(Cursor.HAND_CURSOR));
		this.add(jlIconTwitter);
		
	}

	private void addIconFacebook() {
		JLabel jlIconFacebook = new JLabel();
		jlIconFacebook.setIcon(new ImageIcon(getClass().getResource(ConstantGUI.FACEBOOK_IMG)));
		jlIconFacebook.setBorder(BorderFactory.createEmptyBorder(10,20,10,0));
		jlIconFacebook.setCursor(new Cursor(Cursor.HAND_CURSOR));
		this.add(jlIconFacebook);
		
	}
	
	private void addTextEmail() {
		
		JLabel jlTextEmail = new JLabel(ConstantGUI.MAIL_TEXT);
		jlTextEmail.setBorder(BorderFactory.createEmptyBorder(13,10,10,0));
		jlTextEmail.setForeground(Color.decode(ConstantGUI.COLOR_HEADER_WHITE));
		jlTextEmail.setCursor(new Cursor(Cursor.HAND_CURSOR));
		
		try {
			jlTextEmail.setFont(UploaderFontsResource.uploadFont(ConstantGUI.FONT_NOSOTROS_TITLE, Font.BOLD, 15));
		} catch (FontFormatException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		this.add(jlTextEmail);
		
	}

	

	private void addIconEmail() {
		
		JLabel jlMailImg = new JLabel();
		jlMailImg.setIcon(new ImageIcon(getClass().getResource(ConstantGUI.EMAIL_IMG)));
		jlMailImg.setBorder(BorderFactory.createEmptyBorder(10,30,10,0));
		jlMailImg.setCursor(new Cursor(Cursor.HAND_CURSOR));
		this.add(jlMailImg);
		
	}

	private void addJLabelCellText() {
		JLabel jlText = new JLabel(ConstantGUI.CELL_NUMBER);
		jlText.setBorder(BorderFactory.createEmptyBorder(13,10,10,0));
		jlText.setForeground(Color.decode(ConstantGUI.COLOR_HEADER_WHITE));
		setCursor(new Cursor(Cursor.TEXT_CURSOR));
		
		try {
			jlText.setFont(UploaderFontsResource.uploadFont(ConstantGUI.FONT_NOSOTROS_TITLE, Font.BOLD, 15));
		} catch (FontFormatException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.add(jlText);
		
	}

	private void addIconCell() {
		
		JLabel jlIconCell = new JLabel();
		jlIconCell.setIcon(new ImageIcon(getClass().getResource(ConstantGUI.PHONE_CALL_IMG)));
		jlIconCell.setBorder(BorderFactory.createEmptyBorder(10,100,10,0));
		jlIconCell.setCursor(new Cursor(Cursor.HAND_CURSOR));
		this.add(jlIconCell);
	}
}
