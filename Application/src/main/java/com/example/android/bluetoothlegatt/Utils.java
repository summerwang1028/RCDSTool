package com.example.android.bluetoothlegatt;

/**
 * Created by summer on 2018/3/28.
 */

public class Utils {
    public static byte[] hexStringToByteArray(String s) {
        int len = s.length();
        byte[] data = new byte[len / 2];
        for (int i = 0; i < len; i += 2) {
            data[i / 2] = (byte) ((Character.digit(s.charAt(i), 16) << 4)
                    + Character.digit(s.charAt(i + 1), 16));
        }
        return data;
    }

    public static String byteToHexStr(byte[] b){
        return String.format("%02x", b);
    }
}
