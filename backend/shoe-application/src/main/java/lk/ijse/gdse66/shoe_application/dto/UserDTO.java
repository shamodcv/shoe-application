package lk.ijse.gdse66.shoe_application.dto;

import lk.ijse.gdse66.shoe_application.dto.basic.EmployeeBasicDTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDTO {
    private String email;
    private String password;

    private EmployeeBasicDTO employee;
}

