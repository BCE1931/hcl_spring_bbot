package org.demo_st.springboot.Async;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import java.util.concurrent.Executor;

@Configuration
public class ThreadPool {

    @Bean(name = "threadpooltaskexecutor")
    public Executor threadpooltaskexecutor() {

        ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
        executor.setCorePoolSize(2);
        executor.setMaxPoolSize(5);
        executor.setQueueCapacity(3);
        executor.setThreadNamePrefix("Thread--");
        executor.initialize();
        return executor;
    }

}

