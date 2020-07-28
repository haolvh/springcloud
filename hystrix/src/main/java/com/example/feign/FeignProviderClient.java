package com.example.feign;

import com.example.entity.Student;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Collection;

/**
 * @author LvHao
 * @Description :
 * @date 2020-07-28 18:59
 */
@FeignClient(value = "provider")
public interface FeignProviderClient {

    @GetMapping("/student/findAll")
    public Collection<Student> findAll();
}