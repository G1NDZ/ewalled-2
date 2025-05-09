package id.co.bsi.walled_2.dto.request;

import lombok.Data;

@Data
public class TransferRequest {
    private String accountNumber;
    private Integer amount;
    private String transactionDate;
    private String note;
}
