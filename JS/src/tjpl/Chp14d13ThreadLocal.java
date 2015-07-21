package tjpl;

public class Chp14d13ThreadLocal {

    class User {
        public String name = "";
        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }
        public String value = "";
        public String getValue() {
            return value;
        }
        public void setValue(String value) {
            this.value = value;
        }
        public static final String UNKNOWN_USER = "Unknown User";
        
        public User() {
            this.name = UNKNOWN_USER;
        }
        
        public User(String name) {
            this.name = name;
        }
    }
    
    private static ThreadLocal<User> users = new ThreadLocal<User> () {
        protected User initalValue() {
            Chp14d13ThreadLocal c = new Chp14d13ThreadLocal();
            User u = c.new User("");
            //If User is static, can directly use 
            //User u = new Chp14d13ThreadLocal.User("");
            //Or 
            //User u = new User("");
            return u;
        }
    };
    
    private static User currentUser() {
        return users.get();
    }
    
    public static void setUser(User newUser) {
        users.set(newUser);
    }

    public void setValue(int newValue) {
        User user = currentUser();
        if (!canChange(user)) {
            throw new SecurityException();
        }
        setValue(newValue);
    }
    
    private boolean canChange(User user) {
        // TODO Auto-generated method stub
        if ((user.getName()).equalsIgnoreCase(User.UNKNOWN_USER)) {
            return false;
        } else {
            return true;
        }
    }

    /**
     * FIXME: <A brief description of what the method does.> 
     * FIXME: Algorithm: <MUST exist if the method is more than 10 lines. Remove if it is simple.>
     * <An Algorithm in pure English, describing the logic used in the implementation. 
     * This should not contain to any Syntax of Java, in fact, it should be language independent, 
     * and should be targeted to any new comer in the maintenance of the code.>
     *
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Chp14d13ThreadLocal c = new Chp14d13ThreadLocal();
    }

}
