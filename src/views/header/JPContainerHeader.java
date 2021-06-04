package views.header;

import java.awt.Color;

import javax.swing.BoxLayout;
import javax.swing.JPanel;
import views.ConstantGUI;

public class JPContainerHeader extends JPanel{

	private static final long serialVersionUID = 1L;
	private JPBanner jpBanner;
	private JPContactInfo jpContactInfo;
	private JPButtonsHeader jpButtons;
	
	
	public JPContainerHeader() {
		
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		setBackground(Color.decode(ConstantGUI.COLOR_HEADER_BLUE));
		initComponents();
	}

	private void initComponents() {
		
		jpContactInfo = new JPContactInfo();
		this.add(jpContactInfo);
		
		jpButtons = new JPButtonsHeader();
		this.add(jpButtons);
		
		
		jpBanner = new JPBanner();
		this.add(jpBanner);
		
	}
}
