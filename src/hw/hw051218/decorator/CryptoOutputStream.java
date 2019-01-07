package hw.hw051218.decorator;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class CryptoOutputStream extends FilterOutputStream {
    /**
     * Creates an output stream filter built on top of the specified
     * underlying output stream.
     *
     * @param out the underlying output stream to be assigned to
     *            the field <tt>this.out</tt> for later use, or
     *            <code>null</code> if this instance is to be
     *            created without an underlying stream.
     */

    private byte[] key;
    private int currentPos;

    public CryptoOutputStream(OutputStream out, String stringKey) {
        super(out);
        this.key = stringKey.getBytes();
    }

    @Override
    public void write(int b) throws IOException {
            b = b ^ key[currentPos % key.length];
            currentPos++;
            super.write(b);
    }
}

