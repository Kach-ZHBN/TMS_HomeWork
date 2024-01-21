package homework.homework32.dto;

import homework.homework32.dto.model.UserDTO;
import homework.homework32.dto.service.UserService;

public class DTOTest {
    public static void main(String[] args) {
        UserService userService = new UserService();
        UserDTO userDTO = userService.getUserDetails();

        System.out.println(userDTO);
    }
}
