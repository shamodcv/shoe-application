package lk.ijse.gdse66.shoe_application.entity;

import jakarta.persistence.*;
import lk.ijse.gdse66.shoe_application.entity.embedded.Address;
import lk.ijse.gdse66.shoe_application.entity.embedded.ContactNo;
import lk.ijse.gdse66.shoe_application.util.entityUtil.supllierUtil.Category;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
public class Supplier {
    @Id
    private String supplierCode;
    private String name;
    private Category category;
    @Embedded
    private Address address;
    @Embedded
    private ContactNo contactNo;
    private String email;

    @OneToMany(mappedBy = "supplier", cascade = CascadeType.ALL)
    private List<Inventory> inventoryItems;
}
