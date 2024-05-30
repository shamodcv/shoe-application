package lk.ijse.gdse66.shoe_application.service;

import lk.ijse.gdse66.shoe_application.dto.SupplierDTO;

import java.util.List;

public interface SupplierService {
    List<SupplierDTO> getAllSuppliers();
    SupplierDTO getSupplierDetails(String id);
    SupplierDTO saveSupplier(SupplierDTO supplierDTO);
    void updateSupplier(String id, SupplierDTO supplierDTO);
    void deleteSupplier(String id);

    String generateNewID();
    List<SupplierDTO> findSuppliersByName(String name);
}

