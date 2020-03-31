import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;

/**
 * Demonstrates the use of a scroll pane and text area.
 * @author CS121 Instructors
 */
@SuppressWarnings("serial")
public class FileReaderPanel extends JPanel
{
	private JTextArea filePreviewTextArea;
	private JLabel filePathLabel;
	private JTextField filePathField;
	private JButton loadFileButton;
	
	/**
	 * Initializes all of the components of the FileReaderPanel.
	 */
	public FileReaderPanel()
	{
		// Set layout of this FileReaderPanel to BorderLayout.
		setLayout(new BorderLayout());
		
		
		// Initialize load file sub-panel.
		JPanel loadFilePanel = new JPanel();
		loadFilePanel.setLayout(new BoxLayout(loadFilePanel, BoxLayout.X_AXIS));
		
		// Initialize components of load file sub-panel.
		filePathLabel = new JLabel("File path: ");
		filePathField = new JTextField(15);
		loadFileButton = new JButton("Load File");
		
		// Add the same action listener to the button and input field
		LoadFileListener listener = new LoadFileListener();
		filePathField.addActionListener(listener);
		loadFileButton.addActionListener(listener);
		
		// Add components to load file sub-panel.
		loadFilePanel.add(filePathLabel);
		loadFilePanel.add(filePathField);
		loadFilePanel.add(loadFileButton);
		
		// Add the load file sub-panel to the south of this panel.
		add(loadFilePanel, BorderLayout.SOUTH);
		
		
		// Initialize file preview text area.
		filePreviewTextArea = new JTextArea(30, 50);
		filePreviewTextArea.setEditable(false);
		filePreviewTextArea.setText("Please load a file.");
		
		// Initialize scroll pane containing the file preview text area.		
		JScrollPane filePreviewScrollPane = new JScrollPane(filePreviewTextArea);
		filePreviewScrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		filePreviewScrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		
		// Add the scroll pane to the center of this panel.
		add(filePreviewScrollPane, BorderLayout.CENTER);
	}
	
	private class LoadFileListener implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent event)
		{
			// Read file path from input field and validate.
			String filePath = filePathField.getText();
			if(filePath.isBlank())
			{
				JOptionPane.showMessageDialog(null, "Input cannot be blank. Please enter a valid file path.",
						"Invalid Input", JOptionPane.ERROR_MESSAGE);
			}
			else
			{
				// Create file from given filePath and read through it using Scanner.
				File file = new File(filePath);
				try
				{
					String fileText = "";
					
					// Read contents of file and create string containing all lines of text.
					Scanner scan = new Scanner(file);
					while (scan.hasNextLine())
					{
						String line = scan.nextLine() + "\n";
						fileText += line;
					}
					scan.close();
					
					// Set the text of the text area to the string we just created.
					filePreviewTextArea.setText(fileText);
					
					// Set the cursor/caret position to the top to fix annoying bug where scroll bar is at bottom
					filePreviewTextArea.setCaretPosition(0);
				}
				catch(FileNotFoundException e)
				{
					filePreviewTextArea.setText("Could not open file: " + file.getPath());
				}
			}
		}
	}
}
