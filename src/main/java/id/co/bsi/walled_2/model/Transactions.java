package id.co.bsi.walled_2.model;


import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Data
@Entity
@Table
public class Transactions {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long wallet_id;
    private String  transaction_type;
    private Integer amount;
    private Long recipient_wallet_id;
    private Date transaction_date;
    private String description;
}
