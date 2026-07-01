package com.example.application.controller;

import com.example.application.model.ExecuteRequest;
import com.example.application.model.ExecuteResponse;
import com.example.application.service.ExecuteService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/execute")
public class ExecuteController {
    private final ExecuteService executeService;

    public ExecuteController(ExecuteService executeService) {
        this.executeService = executeService;
    }

    @PostMapping
    public ExecuteResponse execute(@RequestBody ExecuteRequest request) throws Exception {
        return executeService.execute(request);
    }
}
