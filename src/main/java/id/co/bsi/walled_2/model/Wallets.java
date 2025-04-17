package id.co.bsi.walled_2.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Data
@Entity
@Table

public class Wallets {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long user_id;
    private Integer account_number;
    private Integer balance;
    private Date created_at;
    private Date updated_at;
}
