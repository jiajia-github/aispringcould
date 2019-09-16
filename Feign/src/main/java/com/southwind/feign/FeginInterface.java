package com.southwind.feign;

import com.southwind.Entity.Student;
import com.southwind.feign.impl.FeginProviderClientImpl;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Collection;

@FeignClient(value = "provider",fallback = FeginProviderClientImpl.class)
public interface FeginInterface  {

    @GetMapping("/student/findAll")
    public Collection<Student> findAll();

    @GetMapping("/student/index")
    public String index();

}
