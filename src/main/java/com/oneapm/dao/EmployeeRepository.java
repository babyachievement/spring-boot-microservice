package com.oneapm.dao;

import com.oneapm.entity.Employee;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by Administrator on 2016/12/1.
 */
public interface EmployeeRepository extends MongoRepository<Employee, String> {
}
