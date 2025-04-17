package id.co.bsi.walled_2.controller;

import id.co.bsi.walled_2.dto.request.LoginRequest;
import id.co.bsi.walled_2.dto.request.RegisterRequest;
import id.co.bsi.walled_2.dto.response.LoginResponse;
import id.co.bsi.walled_2.dto.response.RegisterResponse;
import id.co.bsi.walled_2.model.Users;
import id.co.bsi.walled_2.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsersController {
    @Autowired
    private UsersService usersService;

    @PostMapping("/api/register")
    public ResponseEntity<RegisterResponse> register(@RequestBody RegisterRequest registerRequest) {
        RegisterResponse registerResponse = new RegisterResponse();
        try {
            Users register = this.usersService.register(registerRequest);

            registerResponse.setStatus("OK");
            registerResponse.setMessage("berhasil register");

        } catch (Exception e) {

            registerResponse.setStatus("FAILED");
            registerResponse.setMessage(e.getMessage());
        }
        return ResponseEntity.ok(registerResponse);
    }

    @PostMapping("/api/login")
    public ResponseEntity<LoginResponse> login(@RequestBody LoginRequest loginRequest) {
        LoginResponse loginResponse = new LoginResponse();
        try {
            String token = this.usersService.login(loginRequest);
            loginResponse.setStatus("OK");
            loginResponse.setMessage("berhasil login");
            loginResponse.setToken(token);
        } catch (Exception e) {
            loginResponse.setStatus("FAILED");
            loginResponse.setMessage(e.getMessage());
        }
        return ResponseEntity.ok(loginResponse);

    }

}
