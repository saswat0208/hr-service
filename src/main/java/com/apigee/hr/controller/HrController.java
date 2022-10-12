package com.apigee.hr.controller;


import com.apigee.hr.adapter.HrAdapter;
import com.apigee.hr.entity.HrEntity;
import org.apache.coyote.Adapter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Validated
@RestController
@RequestMapping("v1/hr")

public class HrController {

    @Autowired
    private HrAdapter hrAdapter;

    @GetMapping(value = "/gethrdata")
    public ResponseEntity<HrEntity> getKyc(){
        return new ResponseEntity<>(hrAdapter.findAll(), HttpStatus.OK);
    }


}
