package lk.ijse.gdse66.shoe_application.dto.basic;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SupplierBasicDTO {
    private String supplierCode;
    private String name;
    private String email;
    // Exclude inventoryItems and other detailed data that may cause recursion
}