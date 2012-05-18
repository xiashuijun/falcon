package org.apache.ivory.resource.channel;

import org.apache.ivory.IvoryException;

import java.util.Properties;

public interface Channel {

    void init(String colo, String serviceName) throws IvoryException;

    <T> T invoke(String methodName, Object... args) throws IvoryException;
}