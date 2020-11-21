import javax.swing.*;
import java.awt.*;

public class PenroseTiling {
    private static JFrame frame;
    private static JPanel leftPanel;
    private static JPanel picturePanel;



    public static void main(String[] args) throws Exception{
        SwingUtilities.invokeAndWait(new Runnable(){
            @Override
            public void run() {
                final int MINIMUM = 600;
                frame = new JFrame();
                frame.add(new JToolBar(), BorderLayout.NORTH);

                leftPanel = new JPanel();
                picturePanel = new JPanel();

                //Create a split pane with the two scroll panes in it.
                JSplitPane splitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT,
                        leftPanel, picturePanel);
                splitPane.setOneTouchExpandable(false);
                splitPane.setDividerLocation(250);

                picturePanel.setBackground(Color.green);
                picturePanel.setOpaque(true);
                picturePanel.setPreferredSize(new Dimension(1250, 800));//hint at size
                picturePanel.setMinimumSize(new Dimension(550, 600));

                leftPanel.setBackground(Color.cyan);
                leftPanel.setOpaque(true);
                leftPanel.setPreferredSize(new Dimension(250, 800));//hint at size
                leftPanel.setMinimumSize(new Dimension(250, 800));//hint at size

                frame.setMinimumSize(new Dimension(800, 600));
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setTitle("Penrose Tiling");
                frame.add(splitPane);

                frame.pack();
                frame.setSize(1500, 800);
                frame.setVisible(true);
            }

        });
    }

}