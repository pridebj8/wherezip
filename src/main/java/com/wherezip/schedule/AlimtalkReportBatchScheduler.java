package com.wherezip.schedule;

import com.wherezip.service.AlimtalkReportBatchService;
import com.wherezip.service.AlimtalkSendBatchService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class AlimtalkReportBatchScheduler implements Scheduler {

    private final AlimtalkReportBatchService alimtalkReportBatchService;

    @Scheduled(initialDelay = 3000, fixedDelay = 3600 * 1000)
    @Override
    public void execute() {

    }
}
