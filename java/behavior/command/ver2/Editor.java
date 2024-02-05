package behavior.command.ver2;

import java.awt.*;
import javax.swing.*;

/**
 * Editor is an Invoker (routing). In this case, there is no Receiver, and the execution will be
 * handled by ConcreteCommand classes
 */
public class Editor {
  public JTextArea textField;
  public String clipboard;
  private final CommandHistory history = new CommandHistory();

  public void init() {
    JFrame frame = new JFrame("Text editor (type & use buttons, Luke!)");
    JPanel content = new JPanel();
    frame.setContentPane(content);
    frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    content.setLayout(new BoxLayout(content, BoxLayout.Y_AXIS));
    textField = new JTextArea();
    textField.setLineWrap(true);
    content.add(textField);
    JPanel buttons = new JPanel(new FlowLayout(FlowLayout.CENTER));
    JButton ctrlC = new JButton("Ctrl+C");
    JButton ctrlX = new JButton("Ctrl+X");
    JButton ctrlP = new JButton("Ctrl+P");
    JButton ctrlZ = new JButton("Ctrl+Z");
    Editor editor = this;
    ctrlC.addActionListener(e -> executeCommand(new CopyCommand(editor)));
    ctrlX.addActionListener(e -> executeCommand(new CutCommand(editor)));
    ctrlP.addActionListener(e -> executeCommand(new PasteCommand(editor)));
    ctrlZ.addActionListener(e -> undo());
    buttons.add(ctrlC);
    buttons.add(ctrlX);
    buttons.add(ctrlP);
    buttons.add(ctrlZ);
    content.add(buttons);
    frame.setSize(450, 200);
    frame.setLocationRelativeTo(null);
    frame.setVisible(true);
  }

  private void executeCommand(Command command) {
    if (command.execute()) {
      history.push(command);
    }
  }

  private void undo() {
    if (history.isEmpty()) return;

    Command command = history.pop();
    if (command != null) command.undo();
  }
}
