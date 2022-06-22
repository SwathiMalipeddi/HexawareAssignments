package com.TeamAssessment.Rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import data.Emp;
import data.EmpDataBase;

import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

public class RetrieveEmployee {

    public static final Logger LOGGER = LoggerFactory.getLogger(RetrieveEmployee.class);

    public static Map<String, Long> employeeCountByDept(){
        Map<String, Long> empList = EmpDataBase.getAllEmployees()
                .stream()
                .collect(groupingBy(Emp::getDepartment,counting()));
        return empList;

    }
    public static Map<String, List<String>> employeesByDept(){
        Map<String, List<Emp>> empList = EmpDataBase.getAllEmployees()
                .stream()
                .collect(groupingBy(Emp::getDepartment));
        Map<String, List<String>> empListByDept = empList.entrySet()
                .stream()
                .collect(Collectors.toMap(key->String.valueOf(key.getKey()),
                        value->value.getValue()
                                .stream()
                                .map(Emp::getName)
                                .collect(Collectors.toList())
                ));
       return empListByDept;

    }


    public static void main(String[] args) {
        LOGGER.info("Employee count by Department");
        Map<String, Long> empList = employeeCountByDept();
        empList.forEach((department,count) -> {
            LOGGER.info(department + ":" +count);
        });
        LOGGER.info("Employee Names by department");
        Map<String, List<String>> deptEmployees = employeesByDept();
        deptEmployees.entrySet().stream().forEach(System.out::println);
    }
}
