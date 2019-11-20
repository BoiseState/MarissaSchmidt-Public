import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/**
 * Demonstrates putting a JTextArea in a JScrollPane.
 * @author marissa
 */
@SuppressWarnings("serial")
public class JTextAreaDemoPanel extends JPanel
{
	private JScrollPane scrollPane;
	private JLabel statsLabel;
	
	/**
	 * @param args unused
	 */
	public JTextAreaDemoPanel()
	{
		setLayout(new BorderLayout());
		
		initTextScrollPane();
		
		initStatsPanel();
	}

	/**
	 * Creates and adds the scroll pane containing the text area
	 * to the center quadrant of this panel.
	 */
	private void initTextScrollPane()
	{
		// Create text area with desired text content.
		JTextArea textArea = new JTextArea();
		textArea.setWrapStyleWord(true);
		textArea.setText("Here's some text.\n\nLook! Multiple lines.\nIsn't that cool?\n\nTry adding another line.\n");
		
		// Create a scroll pane with the pre-populated text area inside of it.
		scrollPane = new JScrollPane(textArea);
		scrollPane.setPreferredSize(new Dimension(200, 120));//text area will fill scroll pane and panel will expand to contain scroll pane
		scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS); //can make scroll bar always show
		
		// Add scrollPane to the center of this main panel.
		add(scrollPane, BorderLayout.CENTER);
	}
	
	/**
	 * Creates and adds the stats sub-panel to the south quadrant of this panel.
	 */
	private void initStatsPanel()
	{
		// Create stats sub-panel.
		JPanel outputPanel = new JPanel();
		
		// Create and add stat label to the sub-panel
		statsLabel = new JLabel("test");
		outputPanel.add(statsLabel);
		
		// Add the sub-panel to the south quadrant of this main panel.
		add(outputPanel, BorderLayout.SOUTH);
	}
}