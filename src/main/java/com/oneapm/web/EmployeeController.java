package com.oneapm.web;

import com.oneapm.dao.EmployeeRepository;
import com.oneapm.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Administrator on 2016/12/1.
 */
@RestController
@RequestMapping("/employee")
public class EmployeeController {
    @Autowired
    EmployeeRepository employeeRepository;

    @RequestMapping(method = RequestMethod.POST)
    public Employee create(@RequestBody Employee employee){

        Employee result = employeeRepository.save(employee);
        return result;
    }

    @RequestMapping(method = RequestMethod.GET, value="/{employeeId}")
    public Employee get(@PathVariable String employeeId){
        return employeeRepository.findOne(employeeId);
    }
}
