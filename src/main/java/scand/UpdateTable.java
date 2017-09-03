package scand;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import scand.model.Employee;
import scand.model.Entity;
import scand.service.DBHelper;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class UpdateTable extends ActionSupport {

    private List<Entity> entityList = new ArrayList<>();

    private int id;
    private String firstName;
    private String lastName;
    private String position;
    private String department;
    private String characteristic;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getCharacteristic() {
        return characteristic;
    }

    public void setCharacteristic(String characteristic) {
        this.characteristic = characteristic;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setEntityList(List<Entity> entityList) {
        this.entityList = entityList;
    }

    public List<Entity> getEntityList() {
        return entityList;
    }

    public String execute() throws Exception {
        DBHelper.getInstance().update(
                (int)ActionContext.getContext().getValueStack().findValue("id"),
                (String)ActionContext.getContext().getValueStack().findValue("firstName"),
                (String)ActionContext.getContext().getValueStack().findValue("lastName"),
                (String)ActionContext.getContext().getValueStack().findValue("position"),
                (String)ActionContext.getContext().getValueStack().findValue("department"),
                (String)ActionContext.getContext().getValueStack().findValue("characteristic")
        );
        ResultSet resultSet = DBHelper.getInstance().readAll();
        while (resultSet.next()) {
            Employee employee = new Employee(
                    resultSet.getInt("id"),
                    resultSet.getString("firstname"),
                    resultSet.getString("lastname"),
                    resultSet.getString("position"),
                    resultSet.getString("department"),
                    resultSet.getString("characteristic")
            );
            entityList.add(employee);
        }
        return SUCCESS;
    }
}
