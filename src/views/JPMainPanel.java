package views;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JPanel;

import views.body.JPContainerBody;
import views.footer.JPContainerFooter;
import views.header.JPContainerHeader;

public class JPMainPanel extends JPanel{

	private static final long serialVersionUID = 1L;
	private JPContainerHeader jpcontainerHeader;
	private JPContainerBody jpcontainerBody;
	private JPContainerFooter jpcontainerFooter;
	
	public JPMainPanel() {
		setLayout(new BorderLayout());
		setBackground(Color.decode(ConstantGUI.COLOR_HEADER_BLUE));
		initComponents();
	}

	private void initComponents() {
		jpcontainerHeader = new JPContainerHeader();
		add(jpcontainerHeader, BorderLayout.PAGE_START);
		
		jpcontainerBody = new JPContainerBody();
		add(jpcontainerBody, BorderLayout.CENTER);
		
		jpcontainerFooter = new JPContainerFooter();
		add(jpcontainerFooter, BorderLayout.PAGE_END);
	}
}
