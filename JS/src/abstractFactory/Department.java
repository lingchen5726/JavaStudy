package abstractFactory;

public class Department {
    int departmentId;
    String departmentName;
    
    public Department(int id, String name) {
        setDepartmentId(id);
        setDepartmentName(name);
    }
    
    public int getDepartmentId() {
        return departmentId;
    }
    public void setDepartmentId(int departmentId) {
        this.departmentId = departmentId;
    }
    public String getDepartmentName() {
        return departmentName;
    }
    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }
}
