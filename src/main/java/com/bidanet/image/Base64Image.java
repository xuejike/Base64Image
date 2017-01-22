package com.bidanet.image;

import org.apache.commons.codec.binary.Base64;
import org.apache.commons.imaging.*;
import org.apache.commons.io.FileUtils;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by xuejike-pc on 2017/1/22.
 */
public class Base64Image {
    public static String getBase64(String path) throws IOException {
        byte[] bytes = FileUtils.readFileToByteArray(new File(path));
        String base64String = Base64.encodeBase64String(bytes);
        return base64String;

    }

    public static void getImage(String base64,String outPath) throws IOException, ImageReadException, ImageWriteException {
        if (base64!=null&&!"".equals(base64)){
            int i = base64.lastIndexOf(",");
            if (i>=0){
                base64=base64.substring(i);
            }
            byte[] bytes = Base64.decodeBase64(base64);

            BufferedImage bufferedImage = Imaging.getBufferedImage(bytes);
            Map<String, Object> params = new HashMap<String,Object>();

            Imaging.writeImage(bufferedImage,new File(outPath), ImageFormats.BMP, params);

        }
    }
}
