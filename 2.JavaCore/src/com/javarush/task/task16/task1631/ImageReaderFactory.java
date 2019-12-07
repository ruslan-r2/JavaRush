package com.javarush.task.task16.task1631;

import com.javarush.task.task16.task1631.common.*;

public class ImageReaderFactory {

    private static ImageReader imageReader;

    public static ImageReader getImageReader( ImageTypes imageType ){
        if ( imageType == ImageTypes.BMP ){
            imageReader = new BmpReader();
        }else if( imageType == ImageTypes.JPG ){
            imageReader = new JpgReader();
        }else if ( imageType == ImageTypes.PNG ){
            imageReader = new PngReader();
        }else{
            throw new IllegalArgumentException("Неизвестный тип картинки");
        }

        return imageReader;
    }

}
