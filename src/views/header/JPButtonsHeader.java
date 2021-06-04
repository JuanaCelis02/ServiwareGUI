package views.header;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Image;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import utils.MyUtils;
import views.ConstantGUI;

public class JPButtonsHeader extends JPanel{

	
	private static final long serialVersionUID = 1L;
	
	public JPButtonsHeader() {
		setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
		setAlignmentX(LEFT_ALIGNMENT);
		setBackground(Color.decode(ConstantGUI.COLOR_BANNER_MIDDLE));
		initComponents();
	}
	
	
	private void initComponents() {
		addIconServiware();
		addButtons();
		addButtonSearch();
	}


	private void addButtonSearch() {
		
		JButton buttonLupa = new JButton();
		buttonLupa.setMaximumSize(new Dimension(200,30));
		buttonLupa.setBackground(null);
		buttonLupa.setBorder(null);
		buttonLupa.setIcon(new ImageIcon(new ImageIcon(getClass().getResource(ConstantGUI.JLABEL_LUPA)).getImage().getScaledInstance(22,22,Image.SCALE_SMOOTH)));
		buttonLupa.setCursor(new Cursor(Cursor.HAND_CURSOR));
		add(buttonLupa);
		
	}

	private void addIconServiware() {
		
		JLabel jlIcon = new JLabel();
		jlIcon.setIcon(new ImageIcon(getClass().getResource(ConstantGUI.ICON_SERVIWARE)));
		jlIcon.setBorder(BorderFactory.createEmptyBorder(0,100,0,300));
		jlIcon.setCursor(new Cursor(Cursor.HAND_CURSOR));
		this.add(jlIcon);

	}


	private void addButtons() {
		
		JButton jbApps = new JButton(ConstantGUI.TEXT_BUTTON_APPS);
		MyUtils.setFooterButtonsValues(jbApps);
		this.add(jbApps);
		
		JButton jbNosotros = new JButton(ConstantGUI.TEXT_BUTTON_NOSOTROS);
		MyUtils.setFooterButtonsValues(jbNosotros);
		add(jbNosotros);
		
		JButton jbServicios = new JButton(ConstantGUI.TEXT_BUTTON_SERVICIOS);
		MyUtils.setFooterButtonsValues(jbServicios);
		add(jbServicios);
		
		JButton jbPortafolio = new JButton(ConstantGUI.TEXT_BUTTON_PORTAFOLIO);
		MyUtils.setFooterButtonsValues(jbPortafolio);
		add(jbPortafolio);
		
		JButton jbContacto = new JButton(ConstantGUI.TEXT_BUTTON_CONTACTO);
		MyUtils.setFooterButtonsValues(jbContacto);
		add(jbContacto);
	}


}
