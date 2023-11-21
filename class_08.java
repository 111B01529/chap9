package L9;
class CWin {
    private static int cnt = 0; // 用于追踪CWin对象的个数
    private String color;
    private int width;
    private int height;

    // (a) 构造函数，每创建一个对象，cnt加1
    public CWin(String str, int w, int h) {
        color = str;
        width = w;
        height = h;
        cnt++;
    }

    // (c) 无参数的构造函数，设置默认值
    public CWin() {
        color = "Red";
        width = 2;
        height = 2;
        cnt++;
    }
    public String cwincolor(){
        return color;
    }
        public int cwinwidth(){
        return width;
    }
        public int cwinheight(){
        return height;
    }
    public String  printcwin() {
        // System.out.println("color:"+color+" width:"+width+" height:"+height);
        return "color: " + color + " width: " + width + " height: " + height;
    }


    // (d) 函数，用于将cnt的值设置为0
    public static void setZero() {
        cnt = 0;
    }

    // (e) 函数，用于将cnt的值设置为n
    public static void setCount(int n) {
        cnt = n;
    }

    // (g) 函数，用于返回CWin对象的个数
    public int getCount() {
        return cnt;
    }
}

    

public class Ex08 {
    public static void main(String[] args) {
        CWin obj1 = new CWin("Blue", 5, 6);
        CWin obj2 = new CWin();
        CWin obj3 = new CWin();

        System.out.println("a: " + obj1.getCount());
        System.out.println("b:"+obj1.printcwin());
        System.out.println("c:"+obj2.printcwin());


        obj1.setZero();
        System.out.println("d: " + obj1.getCount());

        obj3.setCount(10);
        System.out.println("e: " + obj3.getCount());
        System.out.println("f:類別函數，因為要用來追蹤所有Cwin的個數");
        System.out.println("g:類別函數，因為可以方便直接的使用他");
    }
}
