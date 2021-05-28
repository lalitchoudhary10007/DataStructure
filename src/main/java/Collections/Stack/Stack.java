package Collections.Stack;

public class Stack {

    public static void main(String[] args) {

        StackImpl<String> stack = new StackImpl("hello"); //stack initiliaze with data
        stack.push("Welcome");
        stack.push("Lalit");
        stack.pop();
        System.out.println(stack.toString());
    }

}
