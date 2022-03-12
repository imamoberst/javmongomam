package com.imamtaufik.springmongo.imam;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/imam")
public class ImamController {

    private final ImamService imamService;

    public ImamController(ImamService imamService) {
        this.imamService = imamService;
    }

    @GetMapping
    public List<String> getAll() {
        return imamService.getAll();
    }

    @GetMapping(path = "/string")
    public String getHello() {
        return imamService.hello();
    }

}
