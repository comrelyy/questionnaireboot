package com.zhihuishu.questionnaire.questionnaireboot.service;

import com.zhihuishu.questionnaire.questionnaireboot.model.GradeVO;

/**
 * $DISCRIPTION
 *
 * @author cairuirui
 * @create 2018-06-12
 */
public interface IGradeInfoService {

    GradeVO getGradeInfo(Long userId,Integer recruitId);
}
