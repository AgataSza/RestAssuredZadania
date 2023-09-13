package project.dummy.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@AllArgsConstructor
@Data
public class EmployeesResponse {
    private final String status;
    private final List<Employee> data;
}

