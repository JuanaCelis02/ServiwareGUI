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

public class JPReview extends JPanel{

	private static final long serialVersionUID = 1L;
	
	public JPReview() {
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		setPreferredSize(new Dimension(1349,390));
		setAlignmentX(LEFT_ALIGNMENT);
		setBackground(Color.decode(ConstantGUI.BLUE_BACKGROUND_MANDV));
		initComponents();
	}

	private void initComponents() {
		addLogoAndTitle();
		addText();
		
	}
	
	private void addLogoAndTitle() {
		JPanel jpReview = new JPanel();
		jpReview.setLayout(new BoxLayout(jpReview, BoxLayout.X_AXIS));
		jpReview.setBackground(Color.decode(ConstantGUI.COLOR_BLUE_FONDO_MISION));
		jpReview.setAlignmentX(LEFT_ALIGNMENT);
		jpReview.setBorder(BorderFactory.createMatteBorder(40,80,0,80, Color.decode(ConstantGUI.BLUE_BACKGROUND_MANDV)));
		
		JLabel jlIcon = new JLabel(new ImageIcon(getClass().getResource(ConstantGUI.JLABEL_REVIEW_LOGO)));
		jlIcon.setBorder(BorderFactory.createEmptyBorder(40,100,10,0));
		jpReview.add(jlIcon);
		this.add(jpReview);
		
		JLabel jlReview = new JLabel("RESE?A");
		jlReview.setForeground(Color.WHITE);
		jlReview.setBorder(BorderFactory.createEmptyBorder(40,30,10,1000));
		jpReview.add(jlReview);
		
		try {
			jlReview.setFont(UploaderFontsResource.uploadFont(ConstantGUI.FONT_NOSOTROS_TITLE, Font.PLAIN, 30));
		} catch (FontFormatException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		this.add(jpReview);
	}

	private void addText() {
		
		JPanel jpReview = new JPanel();
		jpReview.setBorder(BorderFactory.createMatteBorder(0,80,10,80, Color.decode(ConstantGUI.BLUE_BACKGROUND_MANDV)));
		
		jpReview.setLayout(new BoxLayout(jpReview, BoxLayout.Y_AXIS));
		jpReview.setBackground(Color.decode(ConstantGUI.COLOR_BLUE_FONDO_MISION));
		jpReview.setAlignmentX(LEFT_ALIGNMENT);
		
		JLabel jlReviewTextOne = new JLabel(ConstantGUI.REVIEW_TEXT_ONE);
		jlReviewTextOne.setForeground(Color.WHITE);
		jlReviewTextOne.setBorder(BorderFactory.createEmptyBorder(10,20,10,0));
		jpReview.add(jlReviewTextOne);
		
		JLabel jlReviewTextTwo = new JLabel(ConstantGUI.REVIEW_TEXT_TWO);
		jlReviewTextTwo.setForeground(Color.WHITE);
		jlReviewTextTwo.setBorder(BorderFactory.createEmptyBorder(10,20,10,0));
		jpReview.add(jlReviewTextTwo);
		
		try {
			jlReviewTextOne.setFont(UploaderFontsResource.uploadFont(ConstantGUI.FONT_NOSOTROS_TITLE, Font.PLAIN, 18));
			jlReviewTextTwo.setFont(UploaderFontsResource.uploadFont(ConstantGUI.FONT_NOSOTROS_TITLE, Font.PLAIN, 18));
			
		} catch (FontFormatException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		this.add(jpReview);
		
	}
	

	
	
	
}
