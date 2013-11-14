package org.telegram.tl;

/**
 * TL Vector of strings. @see org.telegram.tl.TLVector
 *
 * @author Korshakov Stepan <me@ex3ndr.com>
 */
public class TLStringVector extends TLVector<String> {
    public TLStringVector() {
        setDestClass(String.class);
    }

    @Override
    public String toString() {
        return "vector<string>#1cb5c415";
    }
}
