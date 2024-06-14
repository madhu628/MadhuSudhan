package structuralDP;

//Intent: Attach additional responsibilities to objects dynamically.
//Example: java.io.BufferedInputStream decorates an input stream with buffering

//Component interface
interface Component1 {
 void operation();
}

//Concrete Component
class ConcreteComponent implements Component1 { 
 public void operation() {
     System.out.println("ConcreteComponent operation");
 }
}

//Decorator
abstract class Decorator implements Component1 {
 protected Component1 component;

 public Decorator(Component1 component) {
     this.component = component;
 }

 public void operation() {
     component.operation();
 }
}

//Concrete Decorator
class ConcreteDecorator extends Decorator {
 public ConcreteDecorator(Component1 component) {
     super(component);
 }

 @Override
 public void operation() {
     super.operation();
     addedBehavior();
 }

 private void addedBehavior() {
     System.out.println("Added behavior by ConcreteDecorator");
 }
}

//Client code
public class DecoratorPattern {
 public static void main(String[] args) {
     Component1 component = new ConcreteComponent();
     Component1 decoratedComponent = new ConcreteDecorator(component);
     decoratedComponent.operation();
 }
}
