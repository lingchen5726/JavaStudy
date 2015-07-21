package abstractFactory;

public class OracleFactory implements IFactory {

    @Override
    public IUser createUser() {
        // TODO Auto-generated method stub
        return new OracleUser();
    }

    @Override
    public IDepartment createDepartment() {
        // TODO Auto-generated method stub
        return new OracleDepartment();
    }

}
