package lk.ijse.gdse66.shoe_application.service;

import lk.ijse.gdse66.shoe_application.dto.SaleDTO;
import lk.ijse.gdse66.shoe_application.dto.SaleDetailDTO;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface SaleService {
    SaleDTO placeSale(@RequestBody SaleDTO saleDTO);

    List<SaleDTO> getAllOrders();

    List<SaleDetailDTO> getAllOrderDetails();

    void updateSale(String id, SaleDTO saleDTO);
}