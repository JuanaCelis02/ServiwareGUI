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

public class JPMissionAndVision extends JPanel{

	private static final long serialVersionUID = 1L;
	
	public JPMissionAndVision() {
		setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
		setPreferredSize(new Dimension(1349,337));//
		setAlignmentX(LEFT_ALIGNMENT);
		initComponents();
	}

	private void initComponents() {
		addMission();
		addVision();
		
	}

	
	private void addMission() {
		JPanel jpMission = new JPanel();
		jpMission.setLayout(new BoxLayout(jpMission, BoxLayout.Y_AXIS));
		jpMission.setBackground(Color.decode(ConstantGUI.COLOR_BLUE_FONDO_MISION));
		jpMission.setBorder(BorderFactory.createMatteBorder(80,80,0,40, Color.decode(ConstantGUI.BLUE_BACKGROUND_MANDV)));
		
		JLabel jlIcon = new JLabel(new ImageIcon(getClass().getResource(ConstantGUI.JLABEL_LOGO_MISSION)));
		jlIcon.setBorder(BorderFactory.createEmptyBorder(10,270,10,0));
		jpMission.add(jlIcon);
		this.add(jpMission);
		
		JLabel jlMission = new JLabel("MISIÓN");
		jlMission.setForeground(Color.WHITE);
		jlMission.setBorder(BorderFactory.createEmptyBorder(10,230,10,0));
		jlMission.setFont(new Font(ConstantGUI.FONT_ARIAL, Font.PLAIN, 30));
		jpMission.add(jlMission);
		this.add(jpMission);
		
		JLabel jlMissionText = new JLabel(ConstantGUI.MISSION_TEXT);
		jlMissionText.setForeground(Color.WHITE);
		jlMissionText.setBorder(BorderFactory.createEmptyBorder(10,20,20,0));
		jlMissionText.setFont(new Font(ConstantGUI.FONT_ARIAL, Font.PLAIN, 20));
		jpMission.add(jlMissionText);
		
		try {
			jlMission.setFont(UploaderFontsResource.uploadFont(ConstantGUI.FONT_NOSOTROS_TITLE, Font.PLAIN, 30));
			jlMissionText.setFont(UploaderFontsResource.uploadFont(ConstantGUI.FONT_NOSOTROS_TEXT, Font.PLAIN, 18));
		} catch (FontFormatException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.add(jpMission);
		
	}
	
	private void addVision() {
		JPanel jpMission = new JPanel();
		jpMission.setLayout(new BoxLayout(jpMission, BoxLayout.Y_AXIS));
		jpMission.setBackground(Color.decode(ConstantGUI.COLOR_BLUE_FONDO_MISION));
		jpMission.setBorder(BorderFactory.createMatteBorder(80,40,0,80, Color.decode(ConstantGUI.BLUE_BACKGROUND_MANDV)));
		//jpMission.setBorder(BorderFactory.createMatteBorder(10, 160, 60, 1200, Color.decode(ConstantGUI.COLOR_DARK_BLUE)));
		
		JLabel jlIcon = new JLabel(new ImageIcon(getClass().getResource(ConstantGUI.JLABEL_VISION_LOGO)));
		jlIcon.setBorder(BorderFactory.createEmptyBorder(10,270,10,0));
		jpMission.add(jlIcon);
		this.add(jpMission);
		
		JLabel jlMission = new JLabel("VISIÓN");
		jlMission.setForeground(Color.WHITE);
		jlMission.setBorder(BorderFactory.createEmptyBorder(10,230,10,0));
		jpMission.add(jlMission);
		this.add(jpMission);
		
		JLabel jlMissionText = new JLabel(ConstantGUI.VISION_TEXT);
		jlMissionText.setForeground(Color.WHITE);
		jlMissionText.setBorder(BorderFactory.createEmptyBorder(10,20,20,0));
		jpMission.add(jlMissionText);
		
		try {
			jlMission.setFont(UploaderFontsResource.uploadFont(ConstantGUI.FONT_NOSOTROS_TEXT, Font.PLAIN, 30));
			jlMissionText.setFont(UploaderFontsResource.uploadFont(ConstantGUI.FONT_NOSOTROS_TEXT, Font.PLAIN, 18));
		} catch (FontFormatException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		this.add(jpMission);
		
	}

	
}
