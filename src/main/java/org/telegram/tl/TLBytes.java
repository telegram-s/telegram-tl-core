package org.telegram.tl;

/**
 * Created by ex3ndr on 10.02.14.
 */
public class TLBytes {
    private byte[] data;
    private int offset;
    private int len;

    public TLBytes(byte[] data, int offset, int len) {
        this.data = data;
        this.offset = offset;
        this.len = len;
    }

    public byte[] getData() {
        return data;
    }

    public int getOffset() {
        return offset;
    }

    public int getLen() {
        return len;
    }
}
