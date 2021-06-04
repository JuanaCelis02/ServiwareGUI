package views.body;


import javax.swing.BoxLayout;
import javax.swing.JPanel;

public class JPContainerBody extends JPanel{
	
	private static final long serialVersionUID = 1L;
	private JPAboutUs jpAboutUs;
	private JPMissionAndVision jpMAndV;
	private JPReview jpReview;
	private JPServices jpServices;
	private JPServiceLow jpServiceLow;
	private JPButtonService jpButtonService;
	private JPanelPortafolio jpPortafolio;

	public JPContainerBody() {
		setAlignmentX(LEFT_ALIGNMENT);
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		setBackground(null);
		initComponents();
	}

	private void initComponents() {
		jpAboutUs = new JPAboutUs();
		this.add(jpAboutUs);
		
		jpMAndV = new JPMissionAndVision();
		this.add(jpMAndV);
		
		jpReview = new JPReview();
		this.add(jpReview);
		
		jpServices = new JPServices();
		this.add(jpServices);
		
		jpServiceLow = new JPServiceLow();
		this.add(jpServiceLow);
		
		jpButtonService = new JPButtonService();
		this.add(jpButtonService);
		
		jpPortafolio = new JPanelPortafolio();
		this.add(jpPortafolio);
		
	}
}
