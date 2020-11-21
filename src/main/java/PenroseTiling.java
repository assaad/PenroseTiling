import javax.swing.*;
import java.awt.*;

public class PenroseTiling extends JPanel {
    private final JFrame f;
    /**
     * Constructor for objects of class Reveal
     */
    public PenroseTiling(String name) {
        f = new JFrame();
        f.setTitle(name);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);

        //Sets the size of the window
        f.setSize(1500, 800);
        f.setResizable(false);


        /*Creating and setting contentPane Properties*/
        JPanel contentPane = new JPanel(new FlowLayout(FlowLayout.RIGHT, 2, 2));
        /*Creating and setting drawing panel Properties*/
        JPanel drawing = new JPanel();
        drawing.setPreferredSize(new Dimension(1240, 800));
        drawing.setBackground(new Color(240, 240, 255));

        /*Creating and setting right panel Properties*/
        JPanel rightPan = new JPanel(null);
        rightPan.setPreferredSize(new Dimension(250, 800));
        rightPan.setBackground(Color.GRAY);

        /*Add panels to contentPane*/
        contentPane.add(drawing);
        contentPane.add(rightPan);


        /*Setting content panel on the frame*/
        f.setContentPane(contentPane);
        setVisible(true);
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
                new PenroseTiling("Penrose Tiling");
            }
        });
    }

}