package ua.javarush.task.jdk13.task41.task4122;

public class Notepad {

    private TextWindow textWindow;

    // Added savedTextWindow:
    private TextWindow.TextWindowState savedTextWindow;

    public Notepad(TextWindow textWindow) {
        this.textWindow = textWindow;
    }

    public void write(String text) {
        textWindow.addText(text);
    }

    public void save() {
        // Added code here:
        savedTextWindow = textWindow.save();
    }

    public void undo() {
        // Added code here:
        if (savedTextWindow != null) {
            textWindow.restore(savedTextWindow);
        }
    }

    public String print() {
        return textWindow.getText();
    }
}
