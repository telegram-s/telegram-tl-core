package org.telegram.tl;

import java.io.IOException;

/**
 * Basic class of rpc method index class
 */
@Deprecated
public abstract class RequestExecutor {
    public abstract byte[] doRpcCall(byte[] request) throws IOException;
}
