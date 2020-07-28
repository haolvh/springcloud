package com.example.feign.impl;

import com.example.entity.Student;
import com.example.feign.FeignProviderClient;
import org.springframework.stereotype.Component;

import java.util.Collection;

/**
 * @author LvHao
 * @Description :
 * @date 2020-07-28 18:17
 */
@Component
public class FeignError implements FeignProviderClient {
    @Override
    public Collection<Student> findAll() {
        return null;
    }
}
