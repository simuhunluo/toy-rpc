package com.sinjinsong.toy.proxy.api;

import com.sinjinsong.toy.cluster.ClusterInvoker;
import com.sinjinsong.toy.protocol.api.Invoker;

/**
 * @author sinjinsong
 * @date 2018/7/14
 */
public interface RPCProxyFactory {
    <T> T createProxy(ClusterInvoker<T> invoker);

    <T> Invoker<T> getInvoker(T proxy, Class<T> type);
}
