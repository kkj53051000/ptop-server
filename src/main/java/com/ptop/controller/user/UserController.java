package com.ptop.controller.user;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
public class UserController {
    @PostMapping("test")
    public String test() {
        return "test";
    }
}
