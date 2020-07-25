package com.wherezip.schedule;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class AlimtalkReportBatchScheduler implements Scheduler {

    @Scheduled(initialDelay = 3000, fixedDelay = 3600 * 1000)
    @Override
    public void execute() {

    }
}
