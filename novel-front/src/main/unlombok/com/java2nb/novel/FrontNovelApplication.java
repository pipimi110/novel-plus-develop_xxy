// Generated by delombok at Mon May 09 23:17:28 CST 2022
package com.java2nb.novel;

import com.github.tobato.fastdfs.FdfsClientConfig;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Import;
import org.springframework.scheduling.TaskScheduler;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.concurrent.ThreadPoolTaskScheduler;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import java.net.InetAddress;
//@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
/**
 * @author Administrator
 */
@SpringBootApplication
@EnableTransactionManagement
@EnableScheduling
@EnableCaching
@ServletComponentScan
@MapperScan(basePackages = {"com.java2nb.novel.mapper"})
@Import(FdfsClientConfig.class)
public class FrontNovelApplication {
    @java.lang.SuppressWarnings("all")
    private static final org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(FrontNovelApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(FrontNovelApplication.class);
    }

    @Bean
    public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
        return args -> {
            log.info("项目启动啦，访问路径：{}", "http://" + InetAddress.getLocalHost().getHostAddress() + ":" + ctx.getEnvironment().getProperty("server.port"));
        };
    }

    /**
     * 解决同一时间只能一个定时任务执行的问题
     */
    @Bean
    public TaskScheduler taskScheduler() {
        ThreadPoolTaskScheduler taskScheduler = new ThreadPoolTaskScheduler();
        taskScheduler.setPoolSize(5);
        return taskScheduler;
    }
}
