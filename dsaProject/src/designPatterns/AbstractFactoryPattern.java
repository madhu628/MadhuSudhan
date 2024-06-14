package designPatterns;

//Button interface
interface Button {
 void paint();
}

//WinButton class
class WinButton implements Button {
 public void paint() {
     System.out.println("Painting a Windows button.");
 }
}

//MacButton class
class MacButton implements Button {
 public void paint() {
     System.out.println("Painting a Mac button.");
 }
}

//GUIFactory interface
interface GUIFactory {
 Button createButton();
}

//WinFactory class
class WinFactory implements GUIFactory {
 public Button createButton() {
     return new WinButton();
 }
}

//MacFactory class
class MacFactory implements GUIFactory {
 public Button createButton() {
     return new MacButton();
 }
}

//Main class to test the GUIFactory
public class AbstractFactoryPattern {
 public static void main(String[] args) {
     // Create a WinFactory and MacFactory
     GUIFactory winFactory = new WinFactory();
     GUIFactory macFactory = new MacFactory();

     // Create buttons using the factories
     Button winButton = winFactory.createButton();
     Button macButton = macFactory.createButton();

     // Paint the buttons
     winButton.paint();
     macButton.paint();
 }
}

