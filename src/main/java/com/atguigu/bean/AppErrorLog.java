package com.atguigu.bean;

import lombok.Data;

/**
 * 错误日志
 */
@Data
@SuppressWarnings("unused")
public class AppErrorLog {

    private String errorBrief;    //错误摘要
    private String errorDetail;   //错误详情


}
