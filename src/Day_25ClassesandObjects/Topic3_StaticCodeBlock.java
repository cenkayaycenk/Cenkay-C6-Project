package Day_25ClassesandObjects;

public class Topic3_StaticCodeBlock {



    // Instance code block will get executed only if you create an instance(Object) of that class

    {
        System.out.println("Hello from code Block ");
    }
    // Static code blocks get executed bofore anything else
    static {
        System.out.println("Hello from Static Code Block ");
    }

    public static void main(String[] args) {
        System.out.println("This is Ziya");

        Topic3_StaticCodeBlock newST = new Topic3_StaticCodeBlock();

    }
}
