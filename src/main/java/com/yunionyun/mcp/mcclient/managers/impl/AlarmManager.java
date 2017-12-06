package com.yunionyun.mcp.mcclient.managers.impl;

import com.yunionyun.mcp.mcclient.managers.MonitorManager;

/**
 * 报警规则管理。
 * @author <a href="mailto:mynameisny@qq.com">Tony Joseph</a>
 * @version 1.0
 */
public class AlarmManager extends MonitorManager
{

    public AlarmManager()
    {
        super("alarm", "alarms", 
                new String[] {"id", "metricName", "alarmCondition", "template", "alarmLevel", "expireSeconds", "escalateSeconds", "status"}, 
                new String[] {"createBy", "updateBy", "deleteBy", "gmtCreate", "gmtModified", "gmtDelete", "isDeleted", "projectId", "remark"});
    }
    
}
