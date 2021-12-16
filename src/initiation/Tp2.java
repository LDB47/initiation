package initiation;

/**
 *
 * @author laure
 */
public class Tp2 {

    public static void main(String[] args) {
//    int entier = 2;
//    double decimal = 3.45;
//    char c = 'A';
//    byte b = 4;
//    short s = 1;
//    float f = 2.22f;
//    long l = 12345;
//    boolean bool = true;
//    String test = "A";
//    int somme = b + s;
////        System.out.println(somme);
//        
//        int a = 10;
//        System.out.println(a += 10);
//        System.out.println(a -= 10);
//        System.out.println(a *= 10);
//        System.out.println(a /= 10);
//        System.out.println(a %= 10);
//        System.out.println(a ^= 10);
//        System.out.println(a <<= 10);
//        System.out.println(a >>= 10);
//        System.out.println(a >>>= 10);
//        
//        int i = 10;
//              System.out.println( "i = " + i + ";\t(++i*2) = " + (++i*2) + ";\ti = " + i + ";");
//              i = 10;
//              System.out.println("i = " + i + ";\t(i++*2) = " + (i++*2) + ";\ti = " + i + ";");
//              
//              boolean egal=(3==4);
//        System.out.println(egal);
//        //
//        int x=3,y=4;
//        boolean diff=((x<y)||(x>y));
//        System.out.println(diff);
//        //
//        boolean bool1=(3==4);
//        System.out.println(bool1);
//        //
//        boolean bool2=(3.0==4.0);        
//        System.out.println(bool2);
//        
//        int z;
//         System.out.println( "Premier = " + (z=10)*2 + ";\t" + "Second = " + z + ";");

        int n;
        double x;
        n = 5;
        x = 2 * n + 1.5;
        System.out.println("n = " + n);
        System.out.println("x = " + x);
        double y;
        y = n * x + 12;
        System.out.println("y = " + y);
        
        char code = 'Z';
        int index = code - 'A';
        System.out.println("index " + index);
        //valeur decimale table ASCII Z vaut 90, A vaut 65
        
        int n1 = 0;
        int n2 = 0;
        System.out.println("n1 = " + n1 + " n2 = " + n2);
        n1 = n2++;
        // tu affectes puis tu fais le calcul
        System.out.println("n1 = " + n1 + " n2 = " + n2);
        n1 = ++n2;
        // tu fais le calcul avant et t'affectes après
        System.out.println("n1 = " + n1 + " n2 = " + n2);
        n1 = n1++;
        // j'ai déjà 2
        System.out.println("n1 = " + n1 + " n2 = " + n2);
        
        Integer i1 = new Integer(47);
        Integer i2 = new Integer(47);
        System.out.println(i1 == i2);
        System.out.println(i1 != i2);
        System.out.println(i1.equals(i2));
        
    }
}
