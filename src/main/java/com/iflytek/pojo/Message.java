package com.iflytek.pojo;

import java.util.Date;
import javax.persistence.*;

public class Message {
    /**
     * 主键ID
     */
    @Id
    private Long id;

    /**
     * 1-系统消息;2-审核消息;3-账户消息;4-平台公告;5-资源消息
     */
    private Boolean mtype;

    /**
     * 消息名称
     */
    private String name;

    /**
     * 消息状态（0：删除，1：正常）
     */
    private Boolean status;

    /**
     * 创建时间
     */
    private Date mtime;

    /**
     * 创建人ID
     */
    private Integer mid;

    /**
     * 消息内容
     */
    private String message;

    /**
     * 获取主键ID
     *
     * @return id - 主键ID
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置主键ID
     *
     * @param id 主键ID
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取1-系统消息;2-审核消息;3-账户消息;4-平台公告;5-资源消息
     *
     * @return mtype - 1-系统消息;2-审核消息;3-账户消息;4-平台公告;5-资源消息
     */
    public Boolean getMtype() {
        return mtype;
    }

    /**
     * 设置1-系统消息;2-审核消息;3-账户消息;4-平台公告;5-资源消息
     *
     * @param mtype 1-系统消息;2-审核消息;3-账户消息;4-平台公告;5-资源消息
     */
    public void setMtype(Boolean mtype) {
        this.mtype = mtype;
    }

    /**
     * 获取消息名称
     *
     * @return name - 消息名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置消息名称
     *
     * @param name 消息名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取消息状态（0：删除，1：正常）
     *
     * @return status - 消息状态（0：删除，1：正常）
     */
    public Boolean getStatus() {
        return status;
    }

    /**
     * 设置消息状态（0：删除，1：正常）
     *
     * @param status 消息状态（0：删除，1：正常）
     */
    public void setStatus(Boolean status) {
        this.status = status;
    }

    /**
     * 获取创建时间
     *
     * @return mtime - 创建时间
     */
    public Date getMtime() {
        return mtime;
    }

    /**
     * 设置创建时间
     *
     * @param mtime 创建时间
     */
    public void setMtime(Date mtime) {
        this.mtime = mtime;
    }

    /**
     * 获取创建人ID
     *
     * @return mid - 创建人ID
     */
    public Integer getMid() {
        return mid;
    }

    /**
     * 设置创建人ID
     *
     * @param mid 创建人ID
     */
    public void setMid(Integer mid) {
        this.mid = mid;
    }

    /**
     * 获取消息内容
     *
     * @return message - 消息内容
     */
    public String getMessage() {
        return message;
    }

    /**
     * 设置消息内容
     *
     * @param message 消息内容
     */
    public void setMessage(String message) {
        this.message = message;
    }
}