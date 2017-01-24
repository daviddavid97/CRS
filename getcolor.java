import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;

/**
 * Created by zxy on 4/29/16.
 */
public class getcolor {

    public void getcolour(int p, int q , int pixel , int r , int g ,int b ){

        Bitmap bitmap = BitmapFactory.decodeFile("/sdcard/Pictures/Screenshots/Screenshot_20160430-182838.png");
        pixel = bitmap.getPixel(p, q);
        r = Color.red(pixel);
        g = Color.green(pixel);
        b = Color.blue(pixel);
    }

    public void search(int m, int n , int pixel ,int r , int g ,int b , int i , int j) {
        boolean flag = false;
        for (; i < 4; i++) {
            for (; j < 4 && !flag; j++) {
                getcolour(m, n , pixel ,r , g , b );
                if (r >= 70 && g <= 50 && b >= 80 && r <= 150 && b <= 150) {
                    System.out.println("found");
                    flag = true;
                    break;
                }
                /**
                 * stop and jump out of the loop
                 */
            }
        }

    }


    public int find(int pixel , int r , int g ,int b , int i ,int j){
        int w[]={105 ,271 , 437 , 602 };
        int h[]={309 ,545, 775, 1010};
        getcolour(602,1033 , pixel , r , g , b );
        if ( r > 210 && g > 220 && b > 220 && r < 230 && g < 250 && b < 250 ) {
            search( w[i] , h[j] , pixel ,r , g , b , i , j);
        }
        else
        {
            search( w[i] , h[j] + 34 , pixel ,r , g , b , i , j);
        }
        return 0;
    }

    public void main(String []args){
        System.out.println("begin");
        int i = 1;
        int j = 1;
        int pixel = 1,r = 1, g = 1,b = 1;
        int w[]={105 ,271 , 437 , 602 };
        int h[]={309 ,545, 775, 1010};
        find(pixel ,r , g ,b , i , j);
        System.out.println(w[i] + " " + h[j]);
    }

}
