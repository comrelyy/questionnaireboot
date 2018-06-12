package com.zhihuishu.questionnaire.questionnaireboot.controller;

import com.zhihuishu.questionnaire.questionnaireboot.model.GradeVO;
import com.zhihuishu.questionnaire.questionnaireboot.service.IGradeInfoService;
import com.zhihuishu.toolkit.log.LoggerTemplate;
import com.zhihuishu.toolkit.log.MDCInfoBuilder;
import com.zhihuishu.toolkit.log.Organization;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * $DISCRIPTION
 *
 * @author cairuirui
 * @create 2018-06-12
 */
@RestController
@RequestMapping("debug")
public class DebugController {

    LoggerTemplate logger =  LoggerTemplate.getLogger(DebugController.class);

    @Resource
    private IGradeInfoService gradeInfoService;

    @RequestMapping("/getStart")
    public String getStart(@RequestParam("name") String name){
        MDCInfoBuilder builder = MDCInfoBuilder.create(Organization.STUDENT,"debug")
                .setModule("getStart").put("name",name);

        logger.info(builder,"name:[{}],你好",name);
        return name + ", Hello !";
    }

    @RequestMapping("/getGradeDetail")
    public Object getGradeDetail(@RequestParam("userId") Long userId,Integer recruitId){
        MDCInfoBuilder builder = MDCInfoBuilder.create(Organization.STUDENT,"debug")
                .setModule("getGradeDetail").put("userId",userId).put("recruitId",recruitId);

        logger.info(builder,"查询用户评论信息开始");
        GradeVO gradeInfo = gradeInfoService.getGradeInfo(userId, recruitId);
        logger.info(builder,"查询用户评论信息结束");
        return gradeInfo;
    }
}
