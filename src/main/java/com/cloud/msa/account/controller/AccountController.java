package com.cloud.msa.account.controller;

import com.cloud.msa.account.common.vo.Response;
import com.cloud.msa.account.domain.vo.AccountDto;
import com.cloud.msa.account.service.AccountService;
import com.cloud.msa.account.service.StatisticsService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/account")
@AllArgsConstructor
public class AccountController {

    private final AccountService accountService;
    private final StatisticsService statisticsService;

    @GetMapping("/raw")
    public ResponseEntity<Response> getAccountData(AccountDto param) {

        return accountService.getRawDataByCondition(param);
    }
}
