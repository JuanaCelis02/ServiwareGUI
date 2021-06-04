package views.footer;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JPanel;

import views.ConstantGUI;

public class JPContainerFooter extends JPanel{

	private static final long serialVersionUID = 1L;
	private JPContactButtons jpContactButtons;
	private JPSendMessage jpSendMessagelUp;
	private JPpenultimate jpPenultimate;
	private JPLatest jpLatest;
	
	public JPContainerFooter() {
		
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		setAlignmentX(LEFT_ALIGNMENT);
		//setPreferredSize(new Dimension(1349,494));
		setBackground(Color.decode(ConstantGUI.BACKGROUND_FOOTER));
		initComponents();
	}
	
	
	private void initComponents() {
		
		addComponentsX();
		
		jpPenultimate = new JPpenultimate();
		add(jpPenultimate);
		
		jpLatest = new JPLatest();
		add(jpLatest);
	}

	private void addComponentsX() {
		
		JPanel panelX = new JPanel();
		panelX.setPreferredSize(new Dimension(1349,450));
		panelX.setBorder(BorderFactory.createEmptyBorder(120,0,0,0));
		panelX.setBackground(Color.decode(ConstantGUI.BACKGROUND_FOOTER));
		panelX.setLayout(new BoxLayout(panelX, BoxLayout.X_AXIS));
		
		jpContactButtons = new JPContactButtons();
		panelX.add(jpContactButtons);
		
		jpSendMessagelUp = new JPSendMessage();
		panelX.add(jpSendMessagelUp);
		add(panelX);
		
	}
}
