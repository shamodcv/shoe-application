package lk.ijse.gdse66.shoe_application.dto;


import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lk.ijse.gdse66.shoe_application.dto.basic.SupplierBasicDTO;
import lk.ijse.gdse66.shoe_application.entity.SaleDetail;
import lombok.*;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class InventoryDTO {
    private String itemCode;
    private String description;
    private String picture;
    private String category;
    private Integer size;
    private Double buyingPrice;
    private Double salePrice;
    private Double expectProfit;
    private Double profitMargin;
    private String status;

    private SupplierBasicDTO supplier;
    private List<SaleDetail> saleDetail;
}
