package com.wherezip.schedule;

import com.wherezip.service.AlimtalkSendBatchService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Slf4j
@RequiredArgsConstructor
@Component
public class AlimtalkSendBatchScheduler implements Scheduler {

    private final AlimtalkSendBatchService alimtalkSendBatchService;

    @Scheduled(initialDelay = 3000, fixedDelay = 5000)
    @Override
    public void execute() {
        log.info("AlimtalkSendBatchScheduler Start.");
        alimtalkSendBatchService.sendMessage();
    }

}
