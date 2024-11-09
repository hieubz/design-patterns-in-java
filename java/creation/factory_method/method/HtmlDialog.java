package creation.factory_method.method;

public class HtmlDialog extends Dialog {

    // subclasses override this method to instantiate specific objects.
    @Override
    Button createButton() {
    return new HtmlButton();
    }
}
