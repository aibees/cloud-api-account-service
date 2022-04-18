package com.cloud.msa.account.service;

import com.cloud.msa.account.common.vo.Response;
import com.cloud.msa.account.domain.vo.AccountDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class AccountService {

    public ResponseEntity<Response> getRawDataByCondition(AccountDto param) {

        return new ResponseEntity<Response>(
                Response.builder().status(HttpStatus.OK).data("TEST").build(),
                HttpStatus.OK);
    }
}
