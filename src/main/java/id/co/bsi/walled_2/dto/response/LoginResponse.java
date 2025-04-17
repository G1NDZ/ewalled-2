package id.co.bsi.walled_2.dto.response;

import lombok.Data;

@Data
public class LoginResponse {
    private String status;
    private String message;
    private String token;
}
