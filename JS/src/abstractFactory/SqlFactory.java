package abstractFactory;

public class SqlFactory implements IFactory {

    @Override
    public IUser createUser() {
        // TODO Auto-generated method stub
        return new SqlUser();
    }

    @Override
    public IDepartment createDepartment() {
        // TODO Auto-generated method stub
        return new SqlDepartment();
    }

}
