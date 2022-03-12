package com.imamtaufik.springmongo.student;

import lombok.Data;

@Data
public class AddedStudent {
    private int status;
    private String message;

    public AddedStudent(int status, String message) {
        this.status = status;
        this.message = message;
    }
}
