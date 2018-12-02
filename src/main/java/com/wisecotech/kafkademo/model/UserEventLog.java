package com.wisecotech.kafkademo.model;

import lombok.Data;

import java.util.Date;

@Data
public class UserEventLog {

    /**
     * 用户ID
     */
    private Long id;

    /**
     * 导流平台的Source
     */
    private String source;

    /**
     * 点击跳转或操作的目标链接
     */
    private String target;

    /**
     * 操作的类型
     */
    private String action;

    /**
     * 操作的内容
     */
    private String content;

    /**
     * 本次操作的备注
     */
    private String comment;

    /**
     * 本条记录的创建时间
     */
    private Date gmt_create;

    /**
     * 本条记录的更改时间
     */
    private Date gmt_modified;

    /**
     * 用户请求中user-agent 等头信息
     */
    private String headers;

    /**
     * 用户ip，代理ip可能会被拼接进来
     */
    private String ip;

}
