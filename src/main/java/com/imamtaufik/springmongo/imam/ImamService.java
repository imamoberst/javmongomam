package com.imamtaufik.springmongo.imam;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ImamService {

    public List<String> getAll() {
        return List.of("imam","taufik","alkhalifi");
    }

    public String hello() {
        return "hello Imam";
    }
}
