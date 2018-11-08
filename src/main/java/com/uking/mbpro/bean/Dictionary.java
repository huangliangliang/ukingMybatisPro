package com.uking.mbpro.bean;

import java.util.Date;

public class Dictionary {
    private String id;

    private Integer dicType;

    private String dicName;

    private Integer dicDescription;

    private String dicDomain;

    private Integer dicCode;

    private String dicValue;

    private Integer parentType;

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

    public Integer getDicType() {
        return dicType;
    }

    public void setDicType(Integer dicType) {
        this.dicType = dicType;
    }

    public String getDicName() {
        return dicName;
    }

    public void setDicName(String dicName) {
        this.dicName = dicName == null ? null : dicName.trim();
    }

    public Integer getDicDescription() {
        return dicDescription;
    }

    public void setDicDescription(Integer dicDescription) {
        this.dicDescription = dicDescription;
    }

    public String getDicDomain() {
        return dicDomain;
    }

    public void setDicDomain(String dicDomain) {
        this.dicDomain = dicDomain == null ? null : dicDomain.trim();
    }

    public Integer getDicCode() {
        return dicCode;
    }

    public void setDicCode(Integer dicCode) {
        this.dicCode = dicCode;
    }

    public String getDicValue() {
        return dicValue;
    }

    public void setDicValue(String dicValue) {
        this.dicValue = dicValue == null ? null : dicValue.trim();
    }

    public Integer getParentType() {
        return parentType;
    }

    public void setParentType(Integer parentType) {
        this.parentType = parentType;
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