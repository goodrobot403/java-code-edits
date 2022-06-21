package com.goodrobot.domain;

import com.goodrobot.annotation.Metadata;
import com.goodrobot.annotation.VisibleFor;

public class Employee {

    @Metadata(
            label = "Employee ID",
            visibleFor = @VisibleFor(category = {"Client"}, legalEntity = {"0865"}),
            cmAttribute = "cmEmployee.cmEmpId"
    )
    private String empId;

    @Metadata(
            label = "Employee Name",
            visibleFor = @VisibleFor(category = {"House"}, legalEntity = {"0316"}),
            cmAttribute = "cmEmployee.cmEmpName"
    )
    private String name;

    private String category;
    private String legalEntity;

    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getLegalEntity() {
        return legalEntity;
    }

    public void setLegalEntity(String legalEntity) {
        this.legalEntity = legalEntity;
    }
}
