package views.body;

import java.awt.Color;
import java.awt.Font;
import java.awt.FontFormatException;
import java.io.IOException;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;

import utils.UploaderFontsResource;
import views.ConstantGUI;

public class JPPortafolioTitle extends JPanel{

	private static final long serialVersionUID = 1L;
	
	public JPPortafolioTitle() {
		setBackground(Color.decode(ConstantGUI.BACKGROUND_PORTAFOLIO));
		initComponents();
	}

	private void initComponents() {
		addTitle();
	}

	private void addTitle() {
		JLabel jlTitlePortafolio = new JLabel("PORTAFOLIO");
		jlTitlePortafolio.setForeground(Color.WHITE);
		jlTitlePortafolio.setBorder(BorderFactory.createEmptyBorder(40,0,30,0));
		jlTitlePortafolio.setAlignmentX(CENTER_ALIGNMENT);
		
		try {
			jlTitlePortafolio.setFont(UploaderFontsResource.uploadFont(ConstantGUI.FONT_NOSOTROS_TITLE, Font.PLAIN, 60));
		} catch (FontFormatException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		this.add(jlTitlePortafolio);
		
	}

}
