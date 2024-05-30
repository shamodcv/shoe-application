package lk.ijse.gdse66.shoe_application.service;

import lk.ijse.gdse66.shoe_application.dto.EmployeeDTO;

import java.util.List;

public interface EmployeeService {
    List<EmployeeDTO> getAllEmployees();
    EmployeeDTO getEmployeeDetails(String id);
    EmployeeDTO saveEmployee(EmployeeDTO employeeDTO);
    void updateEmployee(String id, EmployeeDTO employeeDTO);
    void deleteEmployee(String id);

    String generateNewID();
    List<EmployeeDTO> findEmployeesByName(String name);
}
