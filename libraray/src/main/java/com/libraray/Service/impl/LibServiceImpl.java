package com.libraray.Service.impl;

import com.libraray.Service.LibService;
import com.libraray.dao.LibraryRepo;
import com.libraray.model.Library;
import com.libraray.util.Helper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class LibServiceImpl implements LibService {

    @Autowired
    LibraryRepo libraryRepo;

    @Autowired
    Helper helper;


    public ResponseEntity<?> addlibrary(Library library){
        libraryRepo.save(library);
        return helper.getSuccessResponse(null);
    }

}
