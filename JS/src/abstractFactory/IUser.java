package abstractFactory;

public interface IUser {
    //Can't add public here, or the code in Client has compilation error
    public void addUser(User user);
    public User getUser(int id);
}
