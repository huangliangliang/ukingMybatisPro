package com.uking.mbpro.bean;

import java.util.Date;

public class UserInfo {
    private String id;

    private String name;

    private String employeeNo;

    private String employeeType;

    private Integer employeeState;

    private String email;

    private String password;

    private String telephone;

    private String departmentId;

    private Boolean departmentLeader;

    private Integer departmentIndex;

    private String tenantId;

    private Date createTime;

    private Date modifiedTime;

    private Integer recordStatus;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getEmployeeNo() {
        return employeeNo;
    }

    public void setEmployeeNo(String employeeNo) {
        this.employeeNo = employeeNo == null ? null : employeeNo.trim();
    }

    public String getEmployeeType() {
        return employeeType;
    }

    public void setEmployeeType(String employeeType) {
        this.employeeType = employeeType == null ? null : employeeType.trim();
    }

    public Integer getEmployeeState() {
        return employeeState;
    }

    public void setEmployeeState(Integer employeeState) {
        this.employeeState = employeeState;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone == null ? null : telephone.trim();
    }

    public String getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(String departmentId) {
        this.departmentId = departmentId == null ? null : departmentId.trim();
    }

    public Boolean getDepartmentLeader() {
        return departmentLeader;
    }

    public void setDepartmentLeader(Boolean departmentLeader) {
        this.departmentLeader = departmentLeader;
    }

    public Integer getDepartmentIndex() {
        return departmentIndex;
    }

    public void setDepartmentIndex(Integer departmentIndex) {
        this.departmentIndex = departmentIndex;
    }

    public String getTenantId() {
        return tenantId;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId == null ? null : tenantId.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getModifiedTime() {
        return modifiedTime;
    }

    public void setModifiedTime(Date modifiedTime) {
        this.modifiedTime = modifiedTime;
    }

    public Integer getRecordStatus() {
        return recordStatus;
    }

    public void setRecordStatus(Integer recordStatus) {
        this.recordStatus = recordStatus;
    }
}