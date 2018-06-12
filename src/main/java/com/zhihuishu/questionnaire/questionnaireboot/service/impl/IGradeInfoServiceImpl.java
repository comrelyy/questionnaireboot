package com.zhihuishu.questionnaire.questionnaireboot.service.impl;

import com.zhihuishu.questionnaire.questionnaireboot.mapper.GradeInfoMapper;
import com.zhihuishu.questionnaire.questionnaireboot.model.GradeVO;
import com.zhihuishu.questionnaire.questionnaireboot.service.IGradeInfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * $DISCRIPTION
 *
 * @author cairuirui
 * @create 2018-06-12
 */
@Service("gradeInfoService")
public class IGradeInfoServiceImpl implements IGradeInfoService {

    @Resource
    private GradeInfoMapper gradeInfoMapper;


    @Override
    public GradeVO getGradeInfo(Long userId, Integer recruitId) {
        return gradeInfoMapper.getGradeInfoByUserId(userId,recruitId);
    }
}
