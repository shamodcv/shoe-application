package lk.ijse.gdse66.shoe_application.service;

import lk.ijse.gdse66.shoe_application.dto.UserDTO;

import java.util.List;

public interface UserService {
    List<UserDTO> getAllUsers();
    UserDTO getUserDetails(String id);
    UserDTO saveUser(UserDTO userDTO);
    void updateUser(String id, UserDTO userDTO);
    void deleteUser(String id);
}