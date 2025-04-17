package id.co.bsi.walled_2.service;

import id.co.bsi.walled_2.dto.request.RegisterRequest;
import id.co.bsi.walled_2.model.Users;
import id.co.bsi.walled_2.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UsersService {
    @Autowired
    private UsersRepository usersRepository;

    public Users register(RegisterRequest registerRequest) {

        Optional<Users> checkUserByEmail = this.usersRepository.findByEmail(registerRequest.getEmail());

        if (checkUserByEmail.isPresent()) {
            throw new RuntimeException("Email already exists");
        }

        Users users = new Users();
        users.setEmail(registerRequest.getEmail());
        users.setPassword(registerRequest.getPassword());
        users.setUsername(registerRequest.getUsername());
        users.setFullname(registerRequest.getFullname());


        return this.usersRepository.save(users);
    }


}
