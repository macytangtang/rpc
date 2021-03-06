package com.linda.framework.rpc.exception;

import org.apache.log4j.Logger;

import com.linda.framework.rpc.RemoteCall;
import com.linda.framework.rpc.RpcObject;

public class SimpleRpcExceptionHandler implements RpcExceptionHandler{

	private Logger logger = Logger.getLogger(SimpleRpcExceptionHandler.class);
	
	@Override
	public void handleException(RpcObject rpc,RemoteCall call,Throwable e) {
		if(e instanceof RpcException){
			logger.info("rpcException "+e.getMessage());
		}else{
			e.printStackTrace();
		}
	}
}
