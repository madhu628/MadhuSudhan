package behaviouralDP;

//Intent: Encapsulate a request as an object, thereby allowing parameterization of clients with
//         different requests, queueing of requests, and logging the requests.
//Example: GUI buttons implementing actions






//Command interface
interface Command {
 void execute();
}

//Receiver
class Receiver {
 public void action() {
     System.out.println("Action performed by receiver");
 }
}

//Concrete Command
class ConcreteCommand implements Command {
 private Receiver receiver;

 public ConcreteCommand(Receiver receiver) {
     this.receiver = receiver;
 }

 @Override
 public void execute() {
     receiver.action();
 }
}

//Invoker
class Invoker {
 private Command command;

 public void setCommand(Command command) {
     this.command = command;
 }

 public void invoke() {
     command.execute();
 }
}

//Client code
public class CommandPattern {
 public static void main(String[] args) {
     Receiver receiver = new Receiver();
     Command command = new ConcreteCommand(receiver);

     Invoker invoker = new Invoker();
     invoker.setCommand(command);
     invoker.invoke();  // Output: Action performed by receiver
 }
}

