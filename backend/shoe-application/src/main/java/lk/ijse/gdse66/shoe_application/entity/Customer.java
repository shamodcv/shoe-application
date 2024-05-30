package lk.ijse.gdse66.shoe_application.entity;

import jakarta.persistence.*;
import lk.ijse.gdse66.shoe_application.entity.embedded.Address;
import lk.ijse.gdse66.shoe_application.util.entityUtil.Gender;
import lk.ijse.gdse66.shoe_application.util.entityUtil.cutomerUtil.Level;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.sql.Date;
import java.sql.Timestamp;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
public class Customer {
    @Id
    private String customerCode;
    private String name;
    private Gender gender;
    private String contactNo;
    private String email;
    private String joinDate;
    @Embedded
    private Address address;
    private Level level;
    private Integer totalPoints;
    private Date dateOfBirth;
    private Timestamp recentPurchase;

    @OneToMany(mappedBy = "customer", cascade = CascadeType.ALL)
    private List<Sale> sales;
}