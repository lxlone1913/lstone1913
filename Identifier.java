package apackage.a;

/****author lxlone1913@163.com
 ***Persistence is Victory
 */

public class Identifier {
    /*private  long id;
    private static final String DEFAULT_PASSERWORD ="hhhhh";
    private String userName;*/

    /* bai ji bai qian
    * gong ji wu wen qqian yi zhi ,mu ji san wen qian yi zhi ,xiao ji yi wen qian  san zhi
    * hua gang yi bai wen mai yi zhi ji
    * */
/*zhong xin
*
*
*
*
* */

    public static void main(String[] args) {


        for (int rooster = 0; rooster <=100; rooster++) {//gong ji

            for (int hen = 0; hen <=100 ; hen++) {
                for (int chick = 0; chick <=100 ; chick++) {
                    if (chick%3==0&&rooster+hen+chick==100&&rooster+hen+chick/3==100){}
                    System.out.println("%6d %6d %6d %6d %6d %6.1f\n");
                }

            }

        }

    }


}
