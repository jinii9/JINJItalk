package util;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class CommonPanel extends JPanel {

  protected JLabel logoLabel;

  protected Image logoImg = UseImageFile.getImage("C:\\Users\\윤서진\\Pictures\\team_photo\\label.png");
  
  //CommonPanel p1 = new CommonPanel();
  //add(p1, BorderLayout.NORTH);
  
  
  
  
  
  
  protected CommonPanel() {

    setBackground(ColorSet.talkBackgroundColor);
    setLayout(null);

    logoLabel = new JLabel(new ImageIcon(logoImg));
    logoLabel.setBounds(-30, 0, 200, 50);
    add(logoLabel);
  }
}