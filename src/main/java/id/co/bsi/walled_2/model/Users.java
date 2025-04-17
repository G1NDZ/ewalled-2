package id.co.bsi.walled_2.model;


import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table

public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String email;
    private String username;
    private String fullname;
    private String password;
    private String avatar_url;
}
