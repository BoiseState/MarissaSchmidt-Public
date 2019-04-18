import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;

/**
 * Demonstrates the use of a scroll pane, text area, and file chooser.
 * @author CS121 Instructors
 */
@SuppressWarnings("serial")
public class FileReaderPanel extends JPanel
{
	private JTextArea filePreviewTextArea;
	private JButton openFileButton;
	private JScrollPane filePreviewScrollPane;
	
	/**
	 * Opens a file chooser dialog, reads the selected file and loads it into a
	 * text area.
	 */
	public FileReaderPanel()
	{
		setLayout(new BorderLayout());
		
		JPanel buttonPanel = new JPanel();
		buttonPanel.setLayout(new BoxLayout(buttonPanel, BoxLayout.Y_AXIS));
		openFileButton = new JButton("Select File");
		openFileButton.addActionListener(new ButtonActionListener());
		
		buttonPanel.add(Box.createVerticalGlue());
		buttonPanel.add(openFileButton);
		buttonPanel.add(Box.createVerticalGlue());
		
		filePreviewTextArea = new JTextArea(20, 30);
		filePreviewTextArea.setEditable(false);
		
		filePreviewTextArea.setText("lkjasldkjflakjdsf\nkljasdlkfjaf\nlkjasldkjflakjdsf\nkljasdlkfjaf\nlkjasldkjflakjdsf\nkljasdlkfjaf\nlkjasldkjflakjdsf\nkljasdlkfjaf\nlkjasldkjflakjdsf\nkljasdlkfjaf\nlkjasldkjflakjdsf\nkljasdlkfjaf\nlkjasldkjflakjdsf\nkljasdlkfjaf\nlkjasldkjflakjdsf\nkljasdlkfjaf\nlkjasldkjflakjdsf\nkljasdlkfjaf\nlkjasldkjflakjdsf\nkljasdlkfjaf\nlkjasldkjflakjdsf\nkljasdlkfjaf\nlkjasldkjflakjdsf\nkljasdlkfjaf\n");
		
		// Add new AdjustmentListener to scroll bar
		
		filePreviewScrollPane = new JScrollPane(filePreviewTextArea);
		filePreviewScrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		filePreviewScrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		
		// Make sure the scroll bar is at the top of the text
		
		JScrollBar vScrollBar = filePreviewScrollPane.getVerticalScrollBar();
		vScrollBar.addAdjustmentListener(new PreviewScrollBarListener());

		
		add(filePreviewScrollPane, BorderLayout.CENTER);
		add(buttonPanel, BorderLayout.EAST);
	}
	
	private class PreviewScrollBarListener implements AdjustmentListener
	{

		@Override
		public void adjustmentValueChanged(AdjustmentEvent e)
		{
			System.out.println("Hi! I moved.");
			
			JScrollBar vScrollBar = filePreviewScrollPane.getVerticalScrollBar();
			System.out.println("Block increment: " + vScrollBar.getBlockIncrement(1));
			System.out.println("MAx: " + vScrollBar.getMaximum());
			System.out.println("min: " + vScrollBar.getMinimum());
			System.out.println("Current: " + vScrollBar.getValue());

		}
		
	}
	
	private class ButtonActionListener implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent event)
		{
			// The following starts in the home folder
			//JFileChooser chooser = new JFileChooser();
			
			// The following starts in the current folder, which is often convenient
			JFileChooser chooser = new JFileChooser(".");
			int status = chooser.showOpenDialog(null);

			if (status != JFileChooser.APPROVE_OPTION) {
				filePreviewTextArea.setText("No File Chosen");
			} else {
				File file = chooser.getSelectedFile();
				
				// Read the contents of the file and display.
				// We don't have to read the contents, we could just pass the
				// File along.
				try {
					Scanner scan = new Scanner(file);
					while (scan.hasNext()) {
						String line = scan.nextLine() + "\n";
						filePreviewTextArea.append(line);
					}
					scan.close();
				} catch(FileNotFoundException e) {
					filePreviewTextArea.setText("Could not open file: " + file.getPath());
				}
			}
			
			// Set the cursor/caret position to the top to fix annoying bug where scroll bar is at bottom
			filePreviewTextArea.setCaretPosition(0);
			
//			JScrollBar vScrollBar = filePreviewScrollPane.getVerticalScrollBar();
//			System.out.println("Scroll bar value before: " + vScrollBar.getValue());
//			
//			vScrollBar.setValue(0);
//			
//			System.out.println("Scroll bar value after: " + vScrollBar.getValue());
		}
	}
}
