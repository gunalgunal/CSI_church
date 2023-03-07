package com.church.Church_CSI.backend.controller;


import com.church.Church_CSI.backend.model.UserDetails;
import com.church.Church_CSI.backend.service.CSIService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CSIController {

    private CSIService csiService;
    public CSIController(CSIService service)
    {
        this.csiService=service;
    }

    @PostMapping("/save/details")
    public ResponseEntity<String> toSaveUser(@RequestBody UserDetails user)
    {
        csiService.saveTheUserDetails(user);
        return ResponseEntity.ok("user saved successfully");
    }
}
