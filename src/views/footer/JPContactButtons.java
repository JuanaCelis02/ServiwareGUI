package views.footer;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.FontFormatException;
import java.io.IOException;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;

import utils.UploaderFontsResource;
import views.ConstantGUI;

public class JPContactButtons extends JPanel{


	private static final long serialVersionUID = 1L;
	private JPModelButtons jmbcellPhone;
	private JPModelButtons jmbTelephone;
	private JPModelButtons jmbEmailServiware;
	private JPModelButtons jmbEmailCustomer;
	private JPModelButtons jmbLocation;
	
	public JPContactButtons() {
		
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		setAlignmentX(LEFT_ALIGNMENT);
		setBackground(Color.decode(ConstantGUI.BACKGROUND_FOOTER));
		initComponents();
	}

	private void initComponents() {
		addTitleContacts();
		addButtonsContacts();
		
	}

	private void addTitleContacts() {
		
		JLabel jlTitleContact = new JLabel("CONTACTOS");
		jlTitleContact.setFont(new Font("Arial", Font.PLAIN,50));
		jlTitleContact.setForeground(Color.WHITE);
		jlTitleContact.setBorder(BorderFactory.createEmptyBorder(0,60,40,0));
		jlTitleContact.setAlignmentX(Component.LEFT_ALIGNMENT);
		
		try {
			jlTitleContact.setFont(UploaderFontsResource.uploadFont(ConstantGUI.FONT_NOSOTROS_TITLE, Font.PLAIN, 50));
		} catch (FontFormatException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		add(jlTitleContact);
		
	}

	private void addButtonsContacts() {
		
		jmbTelephone = new JPModelButtons("Tel: 8 7436764", ConstantGUI.PHONE_CALL_IMG);
		add(jmbTelephone);
		
		jmbcellPhone = new JPModelButtons("Cel.: 3115475000", ConstantGUI.ICON_CELLPHONE);
		add(jmbcellPhone);
		
		jmbEmailServiware = new JPModelButtons("serviware@serviware.com.co", ConstantGUI.EMAIL_IMG);
		add(jmbEmailServiware);
		
		jmbEmailCustomer = new JPModelButtons("clientes@serviware.com.co", ConstantGUI.EMAIL_IMG);
		add(jmbEmailCustomer);
		
		jmbLocation = new JPModelButtons("Calle 12 # 09 – 73 Tunja – Boyacá", ConstantGUI.ICON_UBICATION);
		add(jmbLocation);
		
	}

}
