package com.bidanet.image;

import org.apache.commons.imaging.ImageReadException;
import org.apache.commons.imaging.ImageWriteException;

import java.io.IOException;

/**
 * Created by xuejike-pc on 2017/1/22.
 */
public class MainTest {

    public static void main(String[] param) throws IOException, ImageWriteException, ImageReadException {
        String base64 = Base64Image.getBase64("D:\\index.png");
        base64="data:image/png;base64,"+base64;
        Base64Image.getImage(base64,"D://index.bmp");

    }
}
