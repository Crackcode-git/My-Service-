package com.libraray.util;

import com.libraray.response.LibResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import java.util.Collections;

@Component
@Slf4j
public class Helper {

    public ResponseEntity<?> getSuccessResponse(Object data) {
        LibResponse response = new LibResponse();
        if (null != data) {
            response.setData(data);
        } else {
            response.setData(Collections.emptyList());
        }
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}
