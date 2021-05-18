package com.mihir.springbatch.job;

import lombok.*;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.launch.JobLauncher;

import java.util.Map;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class JobContainer {
    private JobLauncher synchJobLauncher;
    private Map<String, Job> jobs;
}
