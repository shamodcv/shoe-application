package lk.ijse.gdse66.shoe_application.repo;

import lk.ijse.gdse66.shoe_application.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User,String> {
}
