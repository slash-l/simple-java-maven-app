package cn.newtouch.demo.example;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.boot.web.support.SpringBootServletInitializer;

/**
 * @author mumu
 * @vervion v1.0
 * @description
 * @date 2017/8/21 2017, 上午11:41
 */
@Slf4j
@ServletComponentScan //配置Druid的监控页面需要用到的注解
@SpringBootApplication
public class BootApplication extends SpringBootServletInitializer {

    /**
     * 用于 war 部署配置
     * @param application
     * @return
     */
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(BootApplication.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(BootApplication.class, args);
        log.info("============= Boot App Start Success =============");
    }

}
