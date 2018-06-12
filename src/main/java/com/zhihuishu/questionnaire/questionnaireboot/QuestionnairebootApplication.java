package com.zhihuishu.questionnaire.questionnaireboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

@SpringBootApplication
/* 外挂配置 */
//@PropertySources({
//		@PropertySource("http://conf.zhihuishu.com/global/dubbo.properties"),
//		@PropertySource("http://conf.zhihuishu.com/global/zookeeper.properties"),
//		@PropertySource("http://conf.zhihuishu.com/global/redis.properties"),
//		@PropertySource("http://conf.zhihuishu.com/global/mysql.properties")
//})
/* 本地特殊配置 */
//@ImportResource({"calsspath:bean.xml"})
@MapperScan("com.zhihuishu.questionnaire.questionnaireboot.mapper")
public class QuestionnairebootApplication {

	public static void main(String[] args) {
		SpringApplication.run(QuestionnairebootApplication.class, args);
	}
}
