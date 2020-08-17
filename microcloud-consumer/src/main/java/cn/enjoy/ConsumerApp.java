package cn.enjoy;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
//import org.springframework.cloud.netflix.ribbon.RibbonClient;

//import cn.xiangxue.config.RibbonConfig;

@SpringBootApplication
@EnableEurekaClient
//@RibbonClient(name ="MICROCLOUD-PROVIDER-PRODUCT" ,configuration = RibbonConfig.class)
public class ConsumerApp {
    public static void main(String[] args) {
        SpringApplication.run(ConsumerApp.class,args);
    }
}