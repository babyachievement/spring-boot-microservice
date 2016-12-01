package com.oneapm.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Created by Administrator on 2016/12/1.
 */
@Document(collection="employees")
@Data
public class Employee {
    @Id
    private String id;

    private String email;
    private String fullName;
    private String managerEmail;
}
