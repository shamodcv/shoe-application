package lk.ijse.gdse66.shoe_application.dto;

import lk.ijse.gdse66.shoe_application.entity.Inventory;
import lk.ijse.gdse66.shoe_application.entity.Sale;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SaleDetailDTO {
    private String itemCode;
    private String orderNo;
    private Integer qty;

    private Sale sale;
    private Inventory inventory;
}