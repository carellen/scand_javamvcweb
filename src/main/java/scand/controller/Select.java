package scand.controller;

import com.opensymphony.xwork2.ActionSupport;
import scand.entities.Employee;
import scand.model.EmployeeModel;

import java.util.ArrayList;
import java.util.List;

public class Select extends ActionSupport {

    private static List<Employee> entityList = new ArrayList<>();
    private EmployeeModel model = new EmployeeModel();
    private Employee employee = new Employee();
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public List<Employee> getEntityList() {
        return entityList;
    }

    public String execute() throws Exception {
       entityList = model.findAll();
        return SUCCESS;
    }
    public String click() throws Exception {
        employee = entityList.stream()
                .filter(employee -> this.id == employee.getId())
                .findAny().orElse(null);
        return SUCCESS;
    }
    public String save() throws Exception {
       model.update(employee);
       entityList = model.findAll();

        return SUCCESS;
    }
}
