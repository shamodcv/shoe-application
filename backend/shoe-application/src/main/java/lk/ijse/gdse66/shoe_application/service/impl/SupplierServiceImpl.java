package lk.ijse.gdse66.shoe_application.service.impl;

import lk.ijse.gdse66.shoe_application.dto.SupplierDTO;
import lk.ijse.gdse66.shoe_application.entity.Supplier;
import lk.ijse.gdse66.shoe_application.repo.SupplierRepo;
import lk.ijse.gdse66.shoe_application.service.SupplierService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.UUID;

@Service
@Transactional
public class SupplierServiceImpl implements SupplierService {
    private SupplierRepo supplierRepo;
    private ModelMapper modelMapper;

    public SupplierServiceImpl(SupplierRepo supplierRepo, ModelMapper modelMapper) {
        this.supplierRepo = supplierRepo;
        this.modelMapper = modelMapper;
    }


    @Override
    public String generateNewID() {
        String lastID = supplierRepo.findLastSupplierCode();

        if (lastID == null){
            return "SUP00001";
        }
        String numericPart = lastID.substring(5);
        int numericValue = Integer.parseInt(numericPart);

        // Increment the numeric value
        numericValue++;

        // Format the new ID with leading zeros
        String newID = String.format("SUP%05d", numericValue);

        return newID;
    }

    @Override
    public List<SupplierDTO> getAllSuppliers() {
        return supplierRepo.findAll().stream().map(
                suppliers -> modelMapper.map(suppliers,SupplierDTO.class)).toList();
    }

    @Override
    public SupplierDTO getSupplierDetails(String id) {
        if (!supplierRepo.existsById(id)) throw new RuntimeException("Id not exists !");
        return modelMapper.map(supplierRepo.findById(id).get(), SupplierDTO.class);
    }

    @Override
    public SupplierDTO saveSupplier(SupplierDTO supplierDTO) {
        if (supplierDTO.getSupplierCode() == null || supplierDTO.getSupplierCode().isEmpty()) {
            supplierDTO.setSupplierCode(UUID.randomUUID().toString()); // Generate new UUID only if necessary
        }
        Supplier supplierEntity = modelMapper.map(supplierDTO, Supplier.class);
        Supplier savedSupplier = supplierRepo.save(supplierEntity);
        return modelMapper.map(savedSupplier, SupplierDTO.class);
    }

    @Override
    public void updateSupplier(String id, SupplierDTO supplierDTO) {
        Supplier existingSupplier = supplierRepo.findById(id).orElseThrow(() -> new RuntimeException("Supplier not found with ID: " + id));
        modelMapper.map(supplierDTO, existingSupplier);
        supplierRepo.save(existingSupplier);
    }

    @Override
    public void deleteSupplier(String id) {
        if (!supplierRepo.existsById(id)) {
            throw new RuntimeException("Cannot delete as supplier does not exist with ID: " + id);
        }
        supplierRepo.deleteById(id);
    }

    @Override
    public List<SupplierDTO> findSuppliersByName(String name) {
        return supplierRepo.findSuppliersByName(name).stream().map(
                supplier -> modelMapper.map(supplier,SupplierDTO.class)).toList();
    }
}

