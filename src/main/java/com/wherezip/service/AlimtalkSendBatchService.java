package com.wherezip.service;

import org.springframework.boot.autoconfigure.web.client.RestTemplateAutoConfiguration;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlimtalkSendBatchService implements BatchService {

    @Override
    public List<?> request() {
        return null;
    }
}
