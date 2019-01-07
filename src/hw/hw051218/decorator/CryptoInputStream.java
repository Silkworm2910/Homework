package hw.hw051218.decorator;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public class CryptoInputStream extends FilterInputStream {
    /**
     * Creates a <code>FilterInputStream</code>
     * by assigning the  argument <code>in</code>
     * to the field <code>this.in</code> so as
     * to remember it for later use.
     *
     * @param in the underlying input stream, or <code>null</code> if
     * this instance is to be created without an underlying stream.
     */
    private byte[] key;
    private int currentPos;

    public CryptoInputStream(InputStream in, String stringKey) {
        super(in);
        this.key = stringKey.getBytes();
    }

    @Override
    public int read() throws IOException {
        int buffer = super.read();
            buffer = buffer ^ key[currentPos % key.length];
            currentPos++;
        return buffer;
    }
}

