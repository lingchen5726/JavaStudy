package template;

//Whether add key word "abstract" has the same output.
public abstract class Template {

    /**
     * FIXME: <A brief description of what the method does.> 
     * FIXME: Algorithm: <MUST exist if the method is more than 10 lines. Remove if it is simple.>
     * <An Algorithm in pure English, describing the logic used in the implementation. 
     * This should not contain to any Syntax of Java, in fact, it should be language independent, 
     * and should be targeted to any new comer in the maintenance of the code.>
     *
     * @param args
     */
    
    String name = "";
    
    Template(String name) {
        this.name = name;
    }
    
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Template robert = new ConcreteAnswer("Robert");
        robert.question();
    }

    public void question() {
        System.out.println("How to implement the templateMethod? a. Google b. Eclipse c. Baidu");
        System.out.println(this.name + "'s answer is "+answer());
    }

    /*If it's private, then can't be overrided, the output will "is ", 
     * and if protected, it's overrided, and the output is:
     * How to implement the templateMethod? a. Google b. Eclipse c. Baidu
        Robert's answer is a*/
    protected abstract String answer();
    /* {
        // TODO Auto-generated method stub
        return "";
    }*/
}
