package org.kie.kogito.examples.hr;

import java.util.Map;
import java.util.HashMap;

public class IdModel {
    
    private org.kie.kogito.examples.hr.Employee employee;

    public org.kie.kogito.examples.hr.Employee getEmployee() {
        return employee;
    }

    public void setEmployee(org.kie.kogito.examples.hr.Employee employee) {
        this.employee = employee;
    }

    private java.lang.String employeeId;

    public java.lang.String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(java.lang.String employeeId) {
        this.employeeId = employeeId;
    }

    private java.lang.String email;

    public java.lang.String getEmail() {
        return email;
    }

    public void setEmail(java.lang.String email) {
        this.email = email;
    }
}
