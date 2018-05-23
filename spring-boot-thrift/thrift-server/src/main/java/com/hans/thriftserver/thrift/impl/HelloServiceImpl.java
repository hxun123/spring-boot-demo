package com.hans.thriftserver.thrift.impl;

import com.hans.thriftserver.thrift.Hello;
import org.apache.thrift.TException;

public class HelloServiceImpl implements Hello.Iface {

    @Override
    public String helloString(String param) throws TException {
        return "hello: " + param;
    }
}
