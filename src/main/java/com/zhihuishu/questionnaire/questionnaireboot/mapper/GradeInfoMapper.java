package com.zhihuishu.questionnaire.questionnaireboot.mapper;

import com.zhihuishu.questionnaire.questionnaireboot.model.GradeVO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * $DISCRIPTION
 *
 * @author cairuirui
 * @create 2018-06-12
 */
@Mapper
public interface GradeInfoMapper {

    GradeVO getGradeInfoByUserId(@Param("userId")Long userId,@Param("recruitId") Integer recruitId);
}
