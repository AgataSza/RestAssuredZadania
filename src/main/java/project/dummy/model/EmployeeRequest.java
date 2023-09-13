package project.dummy.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Employee {
    private final String id;
    private final String employee_name;
    private final String employee_salary;
    private final String employee_age;
    private final String profile_image;
}
