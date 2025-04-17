package id.co.bsi.walled_2.utils;

import id.co.bsi.walled_2.model.Users;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Component
public class JWTTokenUtils {

    @Value("${jwt.key}")
    private String jwtKey;

    public String generateToken(String username) {
        Map<String, Object> addtionalPayload = new HashMap<>();
        addtionalPayload.put("data1", "inidata1");
        addtionalPayload.put("data2", "inidata2");
        addtionalPayload.put("data3", "inidata3");

        return  Jwts.builder()
                .addClaims(addtionalPayload)
                .setSubject(username)
                .setAudience("bsi")
                .setIssuedAt(new Date(System.currentTimeMillis()))
                .setExpiration(new Date(System.currentTimeMillis() + 1000 * 60 * 60 * 24))
                .signWith(SignatureAlgorithm.HS256, jwtKey)
                .compact();

    }

//    public String validateToken(String token) {
//
//    }
}
