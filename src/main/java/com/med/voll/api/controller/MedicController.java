package com.med.voll.api.controller;

import com.med.voll.api.dto.MedicDTO;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/medics")
public class MedicController {

    @PostMapping
    public void submit( @RequestBody MedicDTO infos ){
    }
}
