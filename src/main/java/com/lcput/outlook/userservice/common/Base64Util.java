package com.lcput.outlook.userservice.common;

import org.apache.commons.codec.binary.Base64;
import org.apache.commons.lang.StringUtils;


import java.io.UnsupportedEncodingException;

public class Base64Util {


    /**
     * Base64加密
     *
     * @param binaryData
     * @return
     * @throws UnsupportedEncodingException
     */
    public static String encode(byte[] binaryData) throws UnsupportedEncodingException {
        if (null != binaryData && binaryData.length > 0) {
            return new String(Base64.encodeBase64(binaryData), "UTF-8");
        } else {
            return null;
        }
    }


    /**
     * Base64解密
     *
     * @param base64String
     * @return
     * @throws UnsupportedEncodingException
     */
    public static byte[] decode(String base64String) throws UnsupportedEncodingException {
        if (StringUtils.isNotEmpty(base64String)) {
            return Base64.decodeBase64(base64String.getBytes("UTF-8"));
        } else {
            return new byte[0];
        }
    }

}
