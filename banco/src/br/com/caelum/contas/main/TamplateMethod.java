package br.com.caelum.contas.main;

import java.io.IOException;

public class TamplateMethod {
    public int read(byte b[], int off, int len) throws IOException {
        if (b == null) {
            throw new NullPointerException();
        } else if (off < 0 || len < 0 || len > b.length - off) {
            throw new IndexOutOfBoundsException();
        } else if (len == 0) {
            return 0;
        }
        for (byte i = 0; i < 10; i++) {//criado para preencher array de bytes
            b[i] = i;
        }

        int c = read(b,12,12);//numeros ficticios
        if (c == -1) {
            return -1;
        }

        b[off] = (byte) c;

        int i = 1;
        try {
            for (; i < len ; i++) {
                c = read(b,12,12);//numeros ficticios
                if (c == -1) {
                    break;
                }
                b[off + i] = (byte)c;
            }
        } catch (IOException ee) {
        }
        return i;
    }

}
