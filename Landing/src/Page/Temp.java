package Page;
import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Temp extends JFrame {
	private static final long serialVersionUID = 1L;

	public Temp() {
        setTitle("Navigation Bar Example");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setExtendedState(JFrame.MAXIMIZED_BOTH);

        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());

        JButton homeButton = new JButton("Home");
        JButton aboutButton = new JButton("About");
        JButton contactButton = new JButton("Contact");
        JButton categoryButton = new JButton("Category");

        homeButton.addActionListener(new ActionListener() {
             
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "You clicked Home button");
            }
        });

        aboutButton.addActionListener(new ActionListener() {
             
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "You clicked About button");
            }
        });

        contactButton.addActionListener(new ActionListener() {
             
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "You clicked Contact button");
            }
        });

        categoryButton.addActionListener(new ActionListener() {
             
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "You clicked Category button");
            }
        });

        panel.add(homeButton);
        panel.add(aboutButton);
        panel.add(contactButton);
        panel.add(categoryButton); // Adding the Category button

        add(panel);

        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
 
            public void run() {
                new Temp();
                
            }
        });
        
        MyCanvas m=new MyCanvas();  
        JFrame f=new JFrame();  
        f.add(m);  
        f.setSize(400,400);  
        f.setVisible(true);  
    }
}
//class MyCanvas extends Canvas{  
//	
//	private static final long serialVersionUID = 1L;
//
//	public void paint(Graphics g) {  
//  
//        Toolkit t=Toolkit.getDefaultToolkit();  
//        Image i=t.getImage("https://upload.wikimedia.org/wikipedia/commons/0/00/Spotify_logo_horizontal_white.");  
//        g.drawImage(i, 120,100,this);  
//          
//    }  }