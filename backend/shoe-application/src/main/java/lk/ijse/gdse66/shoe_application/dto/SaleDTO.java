package lk.ijse.gdse66.shoe_application.dto;

import lk.ijse.gdse66.shoe_application.entity.Customer;
import lk.ijse.gdse66.shoe_application.entity.Employee;
import lk.ijse.gdse66.shoe_application.entity.SaleDetail;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SaleDTO {
    private String orderNo;
    private String customerName;
    private Double total;
    private Date purchaseDate;
    private String paymentMethod;
    private Integer lastDigitsOfCard;
    private Double addedPoints;

    private Customer customer;
    private Employee employee;
    private List<SaleDetail> saleDetail;
}