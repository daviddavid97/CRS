
/**
 * Created by zxy on 4/29/16.
 */
public class getcolor {

    public static int i = 0;
    public static int j = 1;
    public static int pixel = 1,r = 1, g = 1,b = 1;
    public static int p = 300;
    public static int q = 300;
    public static int w[]={ 85 , 250 , 416 , 581 };
    public static int h[]={ 312 , 543 , 773 , 1005 };


    public static void getcolour(){

        Bitmap bitmap = BitmapFactory.decodeFile("/sdcard/Pictures/Screenshots/Screenshot_20160420-223955.png");
        pixel = bitmap.getPixel(p, q);
        r = Color.red(pixel);
        g = Color.green(pixel);
        b = Color.blue(pixel);
    }

    public static void search() {
        boolean flag = false;
        for (; i < 4 && !flag; i++) {
            for (j = 0; j < 4 ; j++) {
                p = w[i];
                q = h[j];
                getcolour();
                System.out.println( w[i] + " " + h[j] + "          :" + r + " " + g + " " + b + " ");

                if (r >= 190 && r <= 240 && g >= 20 && g <= 50 && b >= 120 && b <= 180) {
                    flag = true;
                    System.out.println(w[i] + " " + h[j]);
                    break;
                }
                /**
                 * stop and jump out of the loop
                 */
            }
        }

    }


    public static void main(String []args){
        System.out.println("begin");
        search();
        FileWriter writer;
        try {
            writer = new FileWriter("/sdcard/zxy/hello.txt");
            writer.write(p + "\n" + q);
            writer.flush();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
