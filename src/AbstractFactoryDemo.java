interface Button {
    void paint();
}

interface Checkbox {
    void paint();
}

class WinButton implements Button {
    @Override
    public void paint() {
        System.out.println("Отрисован Windows Button");
    }
}

class WinCheckbox implements Checkbox {
    @Override
    public void paint() {
        System.out.println("Отрисован Windows Checkbox");
    }
}

class MacButton implements Button {
    @Override
    public void paint() {
        System.out.println("Отрисован Mac Button");
    }
}

class MacCheckbox implements Checkbox {
    @Override
    public void paint() {
        System.out.println("Отрисован Mac Checkbox");
    }
}

interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
}

class WinFactory implements GUIFactory {
    @Override
    public Button createButton() { return new WinButton(); }
    @Override
    public Checkbox createCheckbox() { return new WinCheckbox(); }
}

class MacFactory implements GUIFactory {
    @Override
    public Button createButton() { return new MacButton(); }
    @Override
    public Checkbox createCheckbox() { return new MacCheckbox(); }
}

public class AbstractFactoryDemo {
    public static void main(String[] args) {
        GUIFactory factory;

        factory = new WinFactory();
        Button winButton = factory.createButton();
        Checkbox winCheckbox = factory.createCheckbox();
        winButton.paint();
        winCheckbox.paint();

        factory = new MacFactory();
        Button macButton = factory.createButton();
        Checkbox macCheckbox = factory.createCheckbox();
        macButton.paint();
        macCheckbox.paint();
    }
}
