package day06_PrimitiveTypesCastings;

public class PrimitiveCastings {

    public static void main(String[] args) {

        // implicit casting smaller primitives directly assigned to larger primitive type
        byte a = 21;
        double b = a;
        System.out.println(b);
        // compiler change automatic
        short x = 1000;
        long y = x;  // long y= (long)x ;

        //explicit casting large primitives assigned to small primitive
        //you can not directly assigned small primitive type. you hvae to do manually like (primitivestype) this.


        int c = 2000000000;
        short d = (short)c;
        System.out.println(d);

        // buyuk primitive kucugun araligindan buyuk ise kucugun araliginda ki en buyuk degerden sonra - degerden sifira dogru gelir.

        short e = 156;
        byte f = (byte) e;

        System.out.println(f);


            float g = 123.9f;
            int h = (int)g;
        System.out.println(h);

    }
}
