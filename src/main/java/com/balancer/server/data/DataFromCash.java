package com.balancer.server.data;

/**
 * Created by o.pelkov on 21.03.2018.
 */
public class DataFromCash {

    private String session;
    private String data;

    public DataFromCash(String session, String data) {
        this.session = session;
        this.data = data;
    }

    public DataFromCash() {
    }

    public String getSession() {
        return session;
    }

    public void setSession(String session) {
        this.session = session;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
