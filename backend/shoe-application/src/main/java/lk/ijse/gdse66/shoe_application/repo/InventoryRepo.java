package lk.ijse.gdse66.shoe_application.repo;

import lk.ijse.gdse66.shoe_application.entity.Inventory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InventoryRepo extends JpaRepository<Inventory,String> {
}

