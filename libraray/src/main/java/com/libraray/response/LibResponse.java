package com.libraray.response;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;


@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class LibResponse {
    private Boolean status = true;
    private String message = "request created sucessfully";
    private transient Object data;
}
