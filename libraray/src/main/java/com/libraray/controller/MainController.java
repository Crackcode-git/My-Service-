package com.libraray.controller;

import com.libraray.Service.LibService;
import com.libraray.model.Library;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/main-dashboard-service")
public class MainController {

    @Autowired
    LibService libService;

    @PostMapping("/create")
    public ResponseEntity<?> createLibRequest (@RequestBody Library library){
        return libService.addlibrary(library);
    }

}
