package lk.ijse.gdse66.shoe_application.dto;


import lk.ijse.gdse66.shoe_application.dto.basic.InventoryBasicDTO;
import lk.ijse.gdse66.shoe_application.entity.embedded.Address;
import lk.ijse.gdse66.shoe_application.entity.embedded.ContactNo;
import lk.ijse.gdse66.shoe_application.util.entityUtil.supllierUtil.Category;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SupplierDTO {
    private String supplierCode;
    private String name;
    private Category category;
    private Address address;
    private ContactNo contactNo;
    private String email;

    private List<InventoryBasicDTO> inventoryItems;
}
