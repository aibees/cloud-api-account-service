package com.cloud.msa.account.domain.vo;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class AccountDto {
    private String bankcd;
    private String usage;
    private String payway;
    private String search;
    private String frdate;
    private String todate;
}
