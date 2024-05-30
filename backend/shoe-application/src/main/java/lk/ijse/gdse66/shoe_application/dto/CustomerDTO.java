package lk.ijse.gdse66.shoe_application.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.sql.Date;
import java.sql.Timestamp;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CustomerDTO implements Serializable {
    private String customerCode;
    private String name;
    private Gender gender;
    private String contactNo;
    private String email;
    private String joinDate;
    private Address address;
    private Level level;
    private Integer totalPoints;
    private Date dateOfBirth;
    private Timestamp recentPurchase;

    private List<Sale> sales;
}