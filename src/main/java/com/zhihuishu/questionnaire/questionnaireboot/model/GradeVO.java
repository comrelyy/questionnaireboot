package com.zhihuishu.questionnaire.questionnaireboot.model;

import java.util.Date;

/**
 * $DISCRIPTION
 *
 * @author cairuirui
 * @create 2018-06-12
 */
public class GradeVO {

    private Integer id;
    private Long userId;
    private Integer recruitId;
    private Integer grade;
    private String comment;
    private String createTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Integer getRecruitId() {
        return recruitId;
    }

    public void setRecruitId(Integer recruitId) {
        this.recruitId = recruitId;
    }

    public Integer getGrade() {
        return grade;
    }

    public void setGrade(Integer grade) {
        this.grade = grade;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "GradeVO{" +
                "id=" + id +
                ", userId=" + userId +
                ", recruitId=" + recruitId +
                ", grade=" + grade +
                ", comment='" + comment + '\'' +
                ", createTime=" + createTime +
                '}';
    }
}
