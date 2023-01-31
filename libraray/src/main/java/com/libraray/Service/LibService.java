package com.libraray.Service;

import com.libraray.model.Library;
import org.springframework.http.ResponseEntity;

public interface LibService {

    ResponseEntity<?> addlibrary(Library library);


}
