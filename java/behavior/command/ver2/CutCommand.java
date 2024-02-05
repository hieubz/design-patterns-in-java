package behavior.command.ver2;

/** ConcreteCommand */
public class CutCommand extends Command {

  CutCommand(Editor editor) {
    super(editor);
  }

  @Override
  public boolean execute() {
    if (editor.textField.getSelectedText().isEmpty()) return false;
    backup();
    String source = editor.textField.getText();
    editor.clipboard = editor.textField.getSelectedText();
    System.out.println("Cut and copied to Clipboard!");
    // update text after cut
    editor.textField.setText(cutString(source));
    return false;
  }

  private String cutString(String source) {
    String start = source.substring(0, editor.textField.getSelectionStart());
    String end = source.substring(editor.textField.getSelectionEnd());
    return start + end;
  }
}
