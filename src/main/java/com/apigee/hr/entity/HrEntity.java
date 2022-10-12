package com.apigee.hr.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor

@Component
public class HrEntity {

    private int id ;
    private String kycName;
    private String aadharNumber;
    private String panNumber;
    private String dob;
    private String domain;
    private String subDomain;
    private String assignedManager;

    public void setId(int id){
        this.id = id;
    }
    public void setAadharNumber(String aadharNumber){
        this.aadharNumber = aadharNumber;
    }
    public void setDob(String dob){
        this.dob = dob;
    }
    public void setKycName(String kycName){
        this.kycName = kycName;
    }
    public void setPan(String panNumber){
        this.panNumber = panNumber;
    }

    public void setAssignedManager(String assignedManager) {
        this.assignedManager = assignedManager;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public void setSubDomain(String subDomain) {
        this.subDomain = subDomain;
    }
}
