package com.southwind.feign.impl;

import com.southwind.Entity.Student;
import com.southwind.feign.FeginInterface;
import org.springframework.stereotype.Component;

import java.util.Collection;


@Component
public class FeginProviderClientImpl implements FeginInterface {
    @Override
    public Collection<Student> findAll() {
        return null;
    }

    @Override
    public String index() {
        return "服务器维护中...";
    }
}
