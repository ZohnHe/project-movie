package com.movie.dao.pojo;

import javax.persistence.*;

@Table(name = "back_admin")
public class BackAdmin {
    @Id
    private Integer id;

    private String username;

    private String password;

    /**
     * 1 = 存在，0 = 删除
     */
    @Column(name = "pseudo_deletion")
    private Integer pseudoDeletion;

    /**
     * 1 = 登录，0 = 未登录
     */
    @Column(name = "session_id")
    private Integer sessionId;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return username
     */
    public String getUsername() {
        return username;
    }

    /**
     * @param username
     */
    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    /**
     * @return password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * 获取1 = 存在，0 = 删除
     *
     * @return pseudo_deletion - 1 = 存在，0 = 删除
     */
    public Integer getPseudoDeletion() {
        return pseudoDeletion;
    }

    /**
     * 设置1 = 存在，0 = 删除
     *
     * @param pseudoDeletion 1 = 存在，0 = 删除
     */
    public void setPseudoDeletion(Integer pseudoDeletion) {
        this.pseudoDeletion = pseudoDeletion;
    }

    /**
     * 获取1 = 登录，0 = 未登录
     *
     * @return session_id - 1 = 登录，0 = 未登录
     */
    public Integer getSessionId() {
        return sessionId;
    }

    /**
     * 设置1 = 登录，0 = 未登录
     *
     * @param sessionId 1 = 登录，0 = 未登录
     */
    public void setSessionId(Integer sessionId) {
        this.sessionId = sessionId;
    }
}