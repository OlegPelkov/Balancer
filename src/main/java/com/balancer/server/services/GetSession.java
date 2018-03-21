package com.balancer.server.services;

import com.balancer.server.data.FiscalPrinter;
import com.balancer.server.data.PrinterList;
import com.balancer.server.data.Session;
import com.balancer.server.data.SessionList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by o.pelkov on 21.03.2018.
 */
@Service
public class GetSession {

    @Autowired
    SessionList sessionList;

    @Autowired
    PrinterList printerList;

    public Session get(){
        FiscalPrinter fr =printerList.poll();
        if(fr!=null){
            Session session = new Session(fr.getId());
            sessionList.add(session);
            return session;
        } else {
            return null;
        }
    }

}
