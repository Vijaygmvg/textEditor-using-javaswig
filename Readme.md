## Text Editor Application
This project is a Java-based Text Editor Application built using Swing. It provides a graphical user interface for creating, editing, saving, and opening text files, as well as customizing the application's appearance.

##  Features
File Operations
New: Clears the text area to create a new document.
Clear: Clears the content of the text area.
Open: Opens an existing text file and displays its content in the text area.
Save: Saves the current content of the text area to the existing file.
Save As: Saves the current content to a new file specified by the user.
Exit: Exits the application after confirming with the user.
Edit Operations
Cut and Paste: (Currently disabled)
## Theme Selection: Allows switching between predefined themes or setting custom colors for various components using a color picker.
Font Size Adjustment: Users can change the font size of the text area and menu bar to a value between 10 and 60.
## Themes
Predefined Themes: Includes t1, t2, t3, t4, and t5 with distinct color schemes.
Custom Theme: Users can set custom colors for:
Menu bar background
Text area background
Text area foreground
Application background
Technical Details
Tools and Technologies
Language: Java
GUI Framework: Swing
File Handling: Supports reading from and writing to text files using FileReader and FileWriter.
Event Handling: Utilizes ActionListener to handle menu and button actions.
Dynamic UI Updates: Supports real-time updates for themes and font adjustments.
Components Used
JFrame: Main application window.
JMenuBar: Provides menu options for file and edit operations.
JMenu and JMenuItem: For organizing menu options.
TextArea: For displaying and editing the text content.
JColorChooser: For picking custom colors in the custom theme.
JFileChooser: For selecting files to open or save.
JOptionPane: For displaying dialogs and confirmation pop-ups.
JComboBox: For selecting themes.
Usage
## Running the Application
Compile the program using javac swing10.java.
Run the program using java swing10.
Interacting with the Application
Use the File menu for file-related operations.
Use the Edit menu to change themes or adjust font size.
Customize the application's appearance through the Theme option in the Edit menu.
Folder Structure
src: Contains the source code (swing10.java).
docs: Any related documentation or screenshots.
## Future Enhancements
Enable Cut and Paste functionalities.
Add support for rich text formatting (bold, italic, underline).
Implement undo and redo functionalities.
## Author
This application was developed by [vijay g m]. Feel free to contribute or suggest improvements. 😊