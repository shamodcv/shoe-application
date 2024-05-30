package lk.ijse.gdse66.shoe_application.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SaleDetail_ID implements Serializable {
    private String itemCode;
    private String orderNo;
}
