package builder;

public class Director {
    // If use static, won't create the Director instance.
    public static void construct(Builder builder) {
        builder.buildPartA();
        builder.buildPartB();
    }
}
