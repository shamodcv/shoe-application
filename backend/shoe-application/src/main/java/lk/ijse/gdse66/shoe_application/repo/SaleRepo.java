package lk.ijse.gdse66.shoe_application.repo;

import lk.ijse.gdse66.shoe_application.entity.Sale;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface SaleRepo extends JpaRepository<Sale,String> {
    @Query(value = "SELECT orderNo FROM Sale ORDER BY orderNo DESC LIMIT 1", nativeQuery = true)
    String getLastId();
}
