package org.telegram.tl;

/**
 * TL Vector of integers. @see org.telegram.tl.TLVector
 *
 * @author Korshakov Stepan <me@ex3ndr.com>
 */
public class TLIntVector extends TLVector<Integer> {
    public TLIntVector() {
        setDestClass(Integer.class);
    }

    @Override
    public String toString() {
        return "vector<int>#1cb5c415";
    }
}
