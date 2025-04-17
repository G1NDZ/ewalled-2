package id.co.bsi.walled_2.dto.request;

import lombok.Data;

@Data
public class RegisterRequest {
    private String email;
    private String username;
    private String fullname;
    private String password;
}
