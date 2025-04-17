package id.co.bsi.walled_2.controller;

import id.co.bsi.walled_2.dto.request.LoginRequest;
import id.co.bsi.walled_2.utils.JWTTokenUtils;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class AuthController {

    @Autowired
    private JWTTokenUtils jwtTokenUtils;

    @Data
    static class User {
        private String username;
        private String password;
    }

    @PostMapping("/auth/login")
    public ResponseEntity<?> login(@RequestBody AuthController.User user) {
        String token = jwtTokenUtils.generateToken(user.getUsername());

        Map<String, String> result = new HashMap<>();
        result.put("token", token);

        return ResponseEntity.ok(result);
    }
}
