package views.body;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class JPTargetCustomer extends JPanel{

	private static final long serialVersionUID = 1L;
	private ImageIcon icon;
	private JLabel jlTitle;
	private JLabel jlImg;
	private JLabel jlDescription;
	private JButton jBViewPlace;
	
	public JPTargetCustomer(String title, String path, String desccription) {
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		
		jlTitle = new JLabel(title);
		add(jlTitle);
		
		Image image = new ImageIcon(getClass().getResource(path)).getImage();
		icon = new ImageIcon(this.getScaledImage(image, 200,150));
		jlImg = new JLabel(icon);
		add(jlImg);
		
		jlDescription = new JLabel(desccription);
		jlDescription.setFont(new Font("Arial", Font.PLAIN,14));
		jlDescription.setForeground(Color.WHITE);
		add(jlDescription);
		
		jBViewPlace = new JButton();
		jBViewPlace.setText("TEXTO BOTON");
		
	}

	private Image getScaledImage(Image image, int w, int h) {
		BufferedImage resizedImg = new BufferedImage(w, h, BufferedImage.TYPE_INT_ARGB);
		Graphics2D g2 = resizedImg.createGraphics();
		
		g2.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
		g2.drawImage(image, 0, 0, w, h, null);
		g2.dispose();
		
		return resizedImg;
	
	}
	
}
