package com.apigee.hr.adapter;

import com.apigee.hr.entity.HrEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import javax.annotation.PostConstruct;

@Component
public class HrAdapter {

    @Autowired
    private HrEntity hrEntity;

    @PostConstruct
    void initialize()
    {
        hrEntity = new HrEntity();
        hrEntity.setAadharNumber("Sas1234");
        hrEntity.setDob("02/10/1995");
        hrEntity.setId(122254);
        hrEntity.setKycName("SaswatSingh");
        hrEntity.setPan("PSPS1234");
        hrEntity.setDomain("PPL");
        hrEntity.setSubDomain("LegalIT");
        hrEntity.setAssignedManager("Shrikant-Chandrakant-Patil");
    }
    public HrEntity findAll() {

        return hrEntity;
    }
}
