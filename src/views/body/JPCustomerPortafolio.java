package views.body;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JPanel;

import views.ConstantGUI;

public class JPCustomerPortafolio extends JPanel{
	
	private static final long serialVersionUID = 1L;
	private GeneratePanelCustomer panelGenerate;

	public JPCustomerPortafolio() {
		
		panelGenerate = new GeneratePanelCustomer();
		setBackground(Color.decode(ConstantGUI.BACKGROUND_PORTAFOLIO));
		this.setLayout(new GridLayout(3,3,35,35));
		initComponents();
	}

	private void initComponents() {
		
		addCustomerRight();		
	}

	private void addCustomerRight() {
		this.add(panelGenerate.generatePanel("MTB DINOSAURIOS", ConstantGUI.MTB_DINO_IMAGE, "Rediseño Página"," VER SITIO "));
		this.add(panelGenerate.generatePanel("Club los Chasquis", ConstantGUI.MTB_DINO_IMAGE, ""," VER SITIO "));
		this.add(panelGenerate.generatePanel("EBSA", ConstantGUI.MTB_DINO_IMAGE, ConstantGUI.TEXT_EBSA," VER SITIO "));
		this.add(panelGenerate.generatePanel("TERMALES COLOMBIA", ConstantGUI.MTB_DINO_IMAGE, ""," VER SITIO "));
		this.add(panelGenerate.generatePanel("PALMARES", ConstantGUI.MTB_DINO_IMAGE, ""," VER SITIO "));
		this.add(panelGenerate.generatePanel("DIMYM", ConstantGUI.MTB_DINO_IMAGE, ""," VER SITIO "));
		this.add(panelGenerate.generatePanel("AMBIENTAR S.A", ConstantGUI.MTB_DINO_IMAGE, ""," VER SITIO "));
		
	}
}
