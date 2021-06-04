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

public class JPServiceLow extends JPanel{

	private static final long serialVersionUID = 1L;
	
	public JPServiceLow() {
		
		setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
		setPreferredSize(new Dimension(1349, 320));
		setBackground(Color.decode(ConstantGUI.BACKGROUNG_SERVICE));
		setAlignmentX(LEFT_ALIGNMENT);
		initComponents();
	}

	private void initComponents() {
		
		addJPanelApps();
		addJPanelPageWeb();
		addJPanelSoftware();
	}

	private void addJPanelApps() {
		
		JPanel jpApps = new JPanel();
		jpApps.setLayout(new BoxLayout(jpApps, BoxLayout.Y_AXIS));
		jpApps.setBackground(Color.decode(ConstantGUI.BACKGROUNG_SERVICE));
		
		JLabel jlIcon = new JLabel(new ImageIcon(getClass().getResource(ConstantGUI.LOGO_APPS_SERVICE)));
		jlIcon.setBorder(BorderFactory.createEmptyBorder(5,220,20,0));
		jpApps.add(jlIcon);
		
		JLabel jlAppsTitle = new JLabel("APLICACIONES");
		jlAppsTitle.setForeground(Color.WHITE);
		jlAppsTitle.setBorder(BorderFactory.createEmptyBorder(10,195,10,0));
		
		try {
			jlAppsTitle.setFont(UploaderFontsResource.uploadFont(ConstantGUI.FONT_NOSOTROS_TITLE, Font.BOLD, 19));
		} catch (FontFormatException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		jpApps.add(jlAppsTitle);
		
		JLabel jlAppsText = new JLabel(ConstantGUI.APPS_TEXT_SERVICE);
		jlAppsText.setForeground(Color.WHITE);
		jlAppsText.setBorder(BorderFactory.createEmptyBorder(20,80,0,0));
		
		try {
			jlAppsText.setFont(UploaderFontsResource.uploadFont(ConstantGUI.FONT_NOSOTROS_TEXT, Font.PLAIN, 15));
		} catch (FontFormatException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		jpApps.add(jlAppsText);
		this.add(jpApps);
		
	}

	private void addJPanelPageWeb() {
		JPanel jpPageWeb = new JPanel();
		jpPageWeb.setLayout(new BoxLayout(jpPageWeb, BoxLayout.Y_AXIS));
		jpPageWeb.setBackground(Color.decode(ConstantGUI.BACKGROUNG_SERVICE));
		
		JLabel jlIcon = new JLabel(new ImageIcon(getClass().getResource(ConstantGUI.LOGO_WEB_SERVICE)));
		jlIcon.setBorder(BorderFactory.createEmptyBorder(5,220,20,0));
		jpPageWeb.add(jlIcon);
		
		JLabel jlPageWebTitle = new JLabel("PÁGINAS WEB");
		jlPageWebTitle.setForeground(Color.WHITE);
		jlPageWebTitle.setBorder(BorderFactory.createEmptyBorder(10,195,10,0));
		
		try {
			jlPageWebTitle.setFont(UploaderFontsResource.uploadFont(ConstantGUI.FONT_NOSOTROS_TITLE, Font.BOLD, 19));
		} catch (FontFormatException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		jpPageWeb.add(jlPageWebTitle);
		
		JLabel jlPageWebText = new JLabel(ConstantGUI.WEBS_TEXT_SERVICE);
		jlPageWebText.setForeground(Color.WHITE);
		jlPageWebText.setBorder(BorderFactory.createEmptyBorder(20,80,0,0));
		
		try {
			jlPageWebText.setFont(UploaderFontsResource.uploadFont(ConstantGUI.FONT_NOSOTROS_TEXT, Font.PLAIN, 15));
		} catch (FontFormatException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		jpPageWeb.add(jlPageWebText);
		this.add(jpPageWeb);
		
	}

	private void addJPanelSoftware() {
		JPanel jpSoftware = new JPanel();
		jpSoftware.setLayout(new BoxLayout(jpSoftware, BoxLayout.Y_AXIS));
		jpSoftware.setBackground(Color.decode(ConstantGUI.BACKGROUNG_SERVICE));
		
		JLabel jlIcon = new JLabel(new ImageIcon(getClass().getResource(ConstantGUI.LOGO_SOFTWARE_SERVICE)));
		jlIcon.setBorder(BorderFactory.createEmptyBorder(5,160,20,200));
		jpSoftware.add(jlIcon);
		
		JLabel jlSoftwareTitle = new JLabel("DESARROLLO DE SOFTWARE");
		jlSoftwareTitle.setForeground(Color.WHITE);
		jlSoftwareTitle.setBorder(BorderFactory.createEmptyBorder(10,90,10,70));
		
		try {
			jlSoftwareTitle.setFont(UploaderFontsResource.uploadFont(ConstantGUI.FONT_NOSOTROS_TITLE, Font.BOLD, 19));
		} catch (FontFormatException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		jpSoftware.add(jlSoftwareTitle);
		
		JLabel jlSoftwareText = new JLabel(ConstantGUI.SOFTWARE_TEXT_SERVICE);
		jlSoftwareText.setForeground(Color.WHITE);
		jlSoftwareText.setBorder(BorderFactory.createEmptyBorder(20,80,0,0));
		jlSoftwareText.setFont(new Font(ConstantGUI.FONT_ARIAL, Font.PLAIN, 15));
		
		try {
			jlSoftwareText.setFont(UploaderFontsResource.uploadFont(ConstantGUI.FONT_NOSOTROS_TEXT, Font.PLAIN, 15));
		} catch (FontFormatException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		jpSoftware.add(jlSoftwareText);
		this.add(jpSoftware);
		
	}

}
