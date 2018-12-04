/**
 * ClearScheduledTriggerLog.java
 * Created at 2016-03-01
 * Created by Administrator
 * Copyright (C) 2016 LLSFW, All rights reserved.
 */
package com.llsfw.webcore.scheduler;

import org.quartz.DisallowConcurrentExecution;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.llsfw.core.scheduler.AbstractBaseJob;

/**
 * <p>
 * ClassName: ClearScheduledTriggerLog
 * </p>
 * <p>
 * Description: 清理计划任务执行日志
 * </p>
 * <p>
 * Author: wangkang
 * </p>
 * <p>
 * Date: 2014年3月7日
 * </p>
 */
@DisallowConcurrentExecution
public class Test extends AbstractBaseJob {

    /**
     * <p>
     * Field log: 日志
     * </p>
     */
    private Logger log = LoggerFactory.getLogger(this.getClass());
    private static int flag  = 1;
    @Override
    protected void executeInternal(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        /*StudyService ss = this.getApplicationContext().getBean(StudyService.class);
        List<Study> studyList = ss.getUserList(1, 50);
        for (Study study : studyList) {
        	study.setId(study.getId()+flag);
        	ss.addStudyBcaK(study);
		}*/
        this.log.info("任务已执行  : " + (flag++));
    }

}
