package com.balancer.server.data;

import org.springframework.stereotype.Component;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * Created by o.pelkov on 21.03.2018.
 */
@Component
public class PrinterList {

    private BlockingQueue<FiscalPrinter> printerList = new LinkedBlockingQueue<FiscalPrinter>();

    public PrinterList() {
        this.printerList.add(new FiscalPrinter("0001"));
        this.printerList.add(new FiscalPrinter("0002"));
        this.printerList.add(new FiscalPrinter("0003"));
    }

    public boolean add(FiscalPrinter session) {
        return printerList.add(session);
    }

    public FiscalPrinter poll() {
        return printerList.poll();
    }

    public int size() {
        return printerList.size();
    }

    public boolean isEmpty() {
        return printerList.isEmpty();
    }
}
