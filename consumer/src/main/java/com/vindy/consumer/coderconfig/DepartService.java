package com.vindy.consumer.coderconfig;

import com.vindy.consumer.bean.Depart;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "provider")
public interface DepartService {
    @GetMapping(value = "/api/provider/depart/get/{id}")
    Depart getById(@PathVariable("id") String id);
}