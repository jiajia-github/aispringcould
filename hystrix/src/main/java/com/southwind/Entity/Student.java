package com.southwind.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor  //？？？？
@NoArgsConstructor      //？？？？
public class Student {
    private long id;
    private String name;
    private Integer age;

}
