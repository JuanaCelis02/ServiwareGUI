package views.body;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JPanel;

import views.ConstantGUI;

public class JPanelPortafolio extends JPanel{

	private static final long serialVersionUID = 1L;
	private JPPortafolioTitle jpCportafolioTitle;
	private JPCustomerPortafolio jpCportafolioCustomer;
	private JPAnuncios jpCportafolioPublicidad;
	
	public JPanelPortafolio() {
		setLayout(new BorderLayout());
		setBackground(Color.decode(ConstantGUI.BACKGROUND_PORTAFOLIO));
		setAlignmentX(LEFT_ALIGNMENT);
		initComponents();
	}

	private void initComponents() {
		
		jpCportafolioTitle = new JPPortafolioTitle();
		add(jpCportafolioTitle, BorderLayout.PAGE_START);
		
		jpCportafolioCustomer = new JPCustomerPortafolio();
		add(jpCportafolioCustomer, BorderLayout.CENTER);
		
		jpCportafolioPublicidad = new JPAnuncios();
		add(jpCportafolioPublicidad, BorderLayout.PAGE_END);
		
	}

}
