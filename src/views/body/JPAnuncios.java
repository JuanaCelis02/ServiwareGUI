package views.body;

import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

import views.ConstantGUI;

public class JPAnuncios extends JPanel{
	
	private static final long serialVersionUID = 1L;

	public JPAnuncios() {
		setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
		setBackground(Color.decode(ConstantGUI.BACKGROUND_PORTAFOLIO));
		initComponents();
	}

	private void initComponents() {
		addFirstLogo();
		addTwoLogo();
		addThreeLogo();
		addFouthLogo();
		
	}

	private void addFouthLogo() {
		JLabel jlImage = new JLabel();
		jlImage.setIcon(new ImageIcon(getClass().getResource(ConstantGUI.LOGO_ULT_IMAGE)));
		jlImage.setBorder(BorderFactory.createEmptyBorder(40,98,40,0));
		this.add(jlImage);
		
	}

	private void addThreeLogo() {
		JLabel jlImage = new JLabel();
		jlImage.setIcon(new ImageIcon(getClass().getResource(ConstantGUI.PALMARES_IMAGE)));
		jlImage.setBorder(BorderFactory.createEmptyBorder(40,98,40,0));
		this.add(jlImage);
		
	}

	private void addTwoLogo() {
		JLabel jlImage = new JLabel();
		jlImage.setIcon(new ImageIcon(getClass().getResource(ConstantGUI.EBSA_IMAGE)));
		jlImage.setBorder(BorderFactory.createEmptyBorder(40,98,40,0));
		this.add(jlImage);
		
	}

	private void addFirstLogo() {
		JLabel jlImage = new JLabel();
		jlImage.setIcon(new ImageIcon(getClass().getResource(ConstantGUI.DIMYM_SAS_IMAGE)));
		jlImage.setBorder(BorderFactory.createEmptyBorder(40,98,40,0));
		this.add(jlImage);	
	}

}
