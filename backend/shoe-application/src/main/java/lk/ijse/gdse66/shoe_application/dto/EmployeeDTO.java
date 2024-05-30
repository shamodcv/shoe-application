package lk.ijse.gdse66.shoe_application.dto;


import lk.ijse.gdse66.shoe_application.dto.basic.UserBasicDTO;
import lk.ijse.gdse66.shoe_application.entity.Sale;
import lk.ijse.gdse66.shoe_application.entity.embedded.Address;
import lk.ijse.gdse66.shoe_application.util.entityUtil.Gender;
import lk.ijse.gdse66.shoe_application.util.entityUtil.Role;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.sql.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeDTO implements Serializable {
    private String employeeCode;
    private String name;
    private String profilePic;
    private Gender gender;
    private String status;
    private String designation;
    private Role role;
    private Date dateOfBirth;
    private Date dateOfJoin;
    private String branch;
    private Address address;
    private String ContactNo;
    private String email;
    private String guardianName;
    private String EmergencyContactNo;

    private UserBasicDTO user;
    private List<Sale> sales;
}