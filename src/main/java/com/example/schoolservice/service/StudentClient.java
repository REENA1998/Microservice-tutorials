package com.example.schoolservice.service;

import com.example.schoolservice.interceptor.FeignOAuth2Config;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.List;

@FeignClient(
        name = "student-service",
        url = "http://localhost:8082",
        configuration = FeignOAuth2Config.class
)
public interface StudentClient {
    @GetMapping("/students")
    List<String> getStudents();
}