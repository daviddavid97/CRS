

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;

public class final2 {

        int x =300;
        int y =300;

        public void main(String []args){


                Bitmap bitmap = BitmapFactory.decodeFile("/sdcard/Pictures/Screenshots/Screenshot_20160430-182838.png");

                int pixel = bitmap.getPixel(x, y);
                int redValue = Color.red(pixel);
                int blueValue = Color.blue(pixel);
                int greenValue = Color.green(pixel);
        System.out.println(redValue + " " + blueValue + " " + greenValue);
        }
}

