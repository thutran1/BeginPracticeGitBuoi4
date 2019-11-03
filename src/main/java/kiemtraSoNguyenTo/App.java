package kiemtraSoNguyenTo;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {
        checkchiahet(3,5);
    }
    public static void tinhTong(){
        float x = 1.3f ;
        float y = 1.2f;
        float z = x+y;
        System.out.println(z);
    }
    public static void tinhThuong(){
        float x =  2;
        float y = 3 ;
        float z = x/y;
        System.out.println(z);
    }
    public static void checkchiahet(int a, int b){
        if (a%b == 0){
            System.out.println("a va b chia het ");
        };
    }

    public static void ptbac1(){
        float a = 3f;
        float b = 5f;
        float z = -5/3f;
        System.out.println(z);

    }

}
