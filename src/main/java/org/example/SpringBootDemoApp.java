package org.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author zy
 */
@SpringBootApplication

@EnableScheduling
@EnableCaching   //开启缓存功能
@EnableSwagger2  //开启swagger生成网页文档
@EnableRedisHttpSession  //将网站的Session保存到redis中

public class SpringBootDemoApp {
    public static int state=1;
    public static ConfigurableApplicationContext ctx;
    public static void main(String[] args) {

        System.setProperty("spring.devtools.restart.enabled","false");
        ctx=SpringApplication.run(SpringBootDemoApp.class,args);
        System.out.println("智能电路系统启动");

        System.out.println("自我保护启动");

    }
}
