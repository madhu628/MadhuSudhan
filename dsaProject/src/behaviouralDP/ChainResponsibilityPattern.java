package behaviouralDP;

//Intent: Pass a request along a chain of handlers. Each handler decides either to process the request or to pass it to the 
//next handler in the chain.
//Example: Logging frameworks with different log levels (e.g., error, debug).

//Handler interface
abstract class Handler {
 protected Handler next;

 public void setNext(Handler next) {
     this.next = next;
 }

 public void handleRequest(String request) {
     if (next != null) {
         next.handleRequest(request);
     }
 }
}

//Concrete Handlers
class ConcreteHandlerA extends Handler {
 @Override
 public void handleRequest(String request) {
     if (request.equals("A")) {
         System.out.println("Handled by ConcreteHandlerA");
     } else {
         super.handleRequest(request);
     }
 }
}

class ConcreteHandlerB extends Handler {
 @Override
 public void handleRequest(String request) {
     if (request.equals("B")) {
         System.out.println("Handled by ConcreteHandlerB");
     } else {
         super.handleRequest(request);
     }
 }
}

//Client code
public class ChainResponsibilityPattern {
 public static void main(String[] args) {
     Handler handlerA = new ConcreteHandlerA();
     Handler handlerB = new ConcreteHandlerB();

     handlerA.setNext(handlerB);

     handlerA.handleRequest("B");  // Output: Handled by ConcreteHandlerB
 }
}

