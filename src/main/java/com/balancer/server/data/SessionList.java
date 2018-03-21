package com.balancer.server.data;

import org.springframework.stereotype.Component;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * Created by o.pelkov on 21.03.2018.
 */
@Component
public class SessionList {

    private BlockingQueue<Session> printerList = new LinkedBlockingQueue<Session>();

    public SessionList() {
    }

    public boolean add(Session session) {
        return printerList.add(session);
    }

    public Session poll() {
        return printerList.poll();
    }

    public int size() {
        return printerList.size();
    }

    public boolean isEmpty() {
        return printerList.isEmpty();
    }
}
