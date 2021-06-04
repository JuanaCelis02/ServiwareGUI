package views.footer;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontFormatException;
import java.io.IOException;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JPanel;

import utils.UploaderFontsResource;
import views.ConstantGUI;

public class JPSendMessage extends JPanel{

	private static final long serialVersionUID = 1L;
	private JPModelTextField jtModelMessage;
	private JPModelTextField jtModelEmail;
	
	public JPSendMessage() {
		
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		setBackground(Color.decode(ConstantGUI.BACKGROUND_FOOTER));
		
		setBorder(BorderFactory.createEmptyBorder(0,320,0,0));
		initComponents();
	}

	private void initComponents() {
		addJTextFNameAndEmail();
		addTextFieldMessage();
		addButtonMessage();
		
	}

	private void addButtonMessage() {
		
		JPanel panelButton = new JPanel();
		panelButton.setLayout(new BoxLayout(panelButton, BoxLayout.X_AXIS));
		panelButton.setBackground(Color.decode(ConstantGUI.BACKGROUND_FOOTER));
		panelButton.setBorder(BorderFactory.createEmptyBorder(10,380,0,0));
		
		JButton jbPackages = new JButton("E N V I A R");
		jbPackages.setPreferredSize(new Dimension(146,54));
		jbPackages.setForeground(Color.decode("#48b8f2"));
		jbPackages.setBackground(Color.WHITE);
		
		try {
			jbPackages.setFont(UploaderFontsResource.uploadFont(ConstantGUI.FONT_NOSOTROS_TITLE, Font.BOLD, 20));
		} catch (FontFormatException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		panelButton.add(jbPackages);
		this.add(panelButton);
		
	}

	private void addTextFieldMessage() {
		
		add(Box.createRigidArea(new Dimension(511,17)));
		
		jtModelMessage = new JPModelTextField("  Mensaje", ConstantGUI.BACKGROUND_TEXT_FIELD_FOOTER, 520,148);
		add(jtModelMessage);
	}

	private void addJTextFNameAndEmail() {
		
		JPanel panelNameAndEmail = new JPanel();
		panelNameAndEmail.setLayout(new BoxLayout(panelNameAndEmail, BoxLayout.X_AXIS));
		panelNameAndEmail.setBackground(Color.decode(ConstantGUI.BACKGROUND_FOOTER));
		
		jtModelMessage = new JPModelTextField("  Nombre", ConstantGUI.BACKGROUND_TEXT_FIELD_FOOTER, 254,65);
		panelNameAndEmail.add(jtModelMessage);
		
		panelNameAndEmail.add(Box.createRigidArea(new Dimension(15,0)));
		
		jtModelEmail = new JPModelTextField("  Correo Electronico", ConstantGUI.BACKGROUND_TEXT_FIELD_FOOTER,254,65);
		panelNameAndEmail.add(jtModelEmail);
		this.add(panelNameAndEmail);
		
	}

}
