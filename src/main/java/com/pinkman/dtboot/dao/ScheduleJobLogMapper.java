package com.pinkman.dtboot.dao;

import com.pinkman.dtboot.entity.ScheduleJobLog;

public interface ScheduleJobLogMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table schedule_job_log
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Long logId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table schedule_job_log
     *
     * @mbggenerated
     */
    int insert(ScheduleJobLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table schedule_job_log
     *
     * @mbggenerated
     */
    int insertSelective(ScheduleJobLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table schedule_job_log
     *
     * @mbggenerated
     */
    ScheduleJobLog selectByPrimaryKey(Long logId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table schedule_job_log
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(ScheduleJobLog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table schedule_job_log
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(ScheduleJobLog record);
}