package com.web.entity;

import java.io.Serializable;

/**
 * Created by zhyuanyuan on 2016/3/13.
 */
public class EntityTestTable  implements Serializable {
    private String id;
    private String username;
    private String userpwd;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUserpwd() {
        return userpwd;
    }

    public void setUserpwd(String userpwd) {
        this.userpwd = userpwd;
    }
}
