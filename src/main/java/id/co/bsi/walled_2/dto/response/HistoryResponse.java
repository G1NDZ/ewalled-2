package id.co.bsi.walled_2.dto.response;

import lombok.Data;

@Data
public class HistoryResponse {
    private String date;
    private String type;
    private String fromTo;
    private String description;
    private int amount;

}
