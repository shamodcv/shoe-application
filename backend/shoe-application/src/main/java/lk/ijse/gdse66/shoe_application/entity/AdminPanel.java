package lk.ijse.gdse66.shoe_application.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
public class AdminPanel {
    @Id
    private String dataId;
    private Double totalSales;
    private Double totalProfit;
    private String mostSaleItem;
    private String picOfMostSaleItem;
    private Integer mostSaleItemQty;
}
