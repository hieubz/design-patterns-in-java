package behavior.command.ver2;

public abstract class Command {
  public Editor editor;
  private String backup;

  Command(Editor editor) {
    this.editor = editor;
  }

  public abstract boolean execute();

  void backup() {
    backup = editor.textField.getText();
  }

  public void undo() {
    editor.textField.setText(backup);
  }
}
