package views.body;

import java.awt.Color;
import java.awt.Dimension;
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

public class JPAboutUs extends  JPanel{

	private static final long serialVersionUID = 1L;
	
	public JPAboutUs() {
		setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
		setPreferredSize(new Dimension(1349, 656));
		setBackground(Color.decode(ConstantGUI.COLOR_BODY_WHITE));
		setAlignmentX(LEFT_ALIGNMENT);
		initComponents();
	}

	private void initComponents() {
		JLabel jlImgAboutUs = new JLabel(new ImageIcon(getClass().getResource(ConstantGUI.IMG_NOSOTROS)));
		
		JPanel jpAboutUsRight = new JPanel();
		jpAboutUsRight.setLayout(new BoxLayout(jpAboutUsRight, BoxLayout.Y_AXIS));
		jpAboutUsRight.setBackground(Color.decode(ConstantGUI.COLOR_BODY_WHITE));
		
		JLabel jlNosotrosTitle = new JLabel(ConstantGUI.NOSOTROS_TITLE_BODY);
		jlNosotrosTitle.setBorder(BorderFactory.createEmptyBorder(0,0,30,0));
		jlNosotrosTitle.setAlignmentX(CENTER_ALIGNMENT);
		jpAboutUsRight.add(jlNosotrosTitle);
		
		
		JLabel jlNosotrosText = new JLabel(ConstantGUI.ABOUT_US_TEXT);	
		jlNosotrosText.setBorder(BorderFactory.createEmptyBorder(20,0,10,0));
		jlNosotrosText.setAlignmentX(CENTER_ALIGNMENT);
		jlNosotrosText.setHorizontalAlignment(JLabel.CENTER);
		jpAboutUsRight.add(jlNosotrosText);
		
		try {
			jlNosotrosTitle.setFont(UploaderFontsResource.uploadFont(ConstantGUI.FONT_NOSOTROS_TITLE, Font.PLAIN, 60));
			jlNosotrosText.setFont(UploaderFontsResource.uploadFont(ConstantGUI.FONT_NOSOTROS_TEXT, Font.PLAIN, 22));
		} catch (FontFormatException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		this.add(jlImgAboutUs);
		this.add(jpAboutUsRight);
		this.add(jpAboutUsRight);
		
	}

}
