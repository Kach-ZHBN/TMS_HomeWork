package homework.homework32.dto.service;

import homework.homework32.dto.model.UserDTO;

public class UserService {
    public UserDTO getUserDetails(){
        //Логика получения из БД данных для UserDTO
        UserDTO userDTO = new UserDTO("vlad_kachko", "vladkachko@");
        //Завершение логики
        return userDTO;
    }

}
