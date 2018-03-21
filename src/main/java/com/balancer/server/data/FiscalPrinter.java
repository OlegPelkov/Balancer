package com.balancer.server.data;

/**
 * Created by o.pelkov on 21.03.2018.
 */
public class FiscalPrinter {

    private String id = "0123456";

    public FiscalPrinter(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
