package behavior.command.ver2;

/** ConcreteCommand */
public class CopyCommand extends Command {

  CopyCommand(Editor editor) {
    super(editor);
  }

  @Override
  public boolean execute() {
    editor.clipboard = editor.textField.getSelectedText();
    System.out.println("Copied to Clipboard!");
    return false;
  }
}
