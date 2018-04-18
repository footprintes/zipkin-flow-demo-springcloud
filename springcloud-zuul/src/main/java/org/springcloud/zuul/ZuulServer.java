package org.springcloud.zuul;

import org.springframework.boot.SpringApplication;  
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.ComponentScan;  
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;  
  
/** 
 * Spring could web程序主入口 
 * @author Administrator 
 * 
 */  
@Configuration//配置控制    
@EnableAutoConfiguration//启用自动配置    
@ComponentScan(value={"com.caicongyang.springCloudApp"})//组件扫描    
@EnableZuulProxy
public class ZuulServer {  
    public static void main(String[] args) {     
        SpringApplication.run(ZuulServer.class,args);     
    }
}

