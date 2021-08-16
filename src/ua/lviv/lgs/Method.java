/**
 *
 *It's my code,then only .Only I can using him,because have author rights for him
 * But I am allow for them in order to using him too))))))))))))))))))))
 */

package ua.lviv.lgs;

/**
 * @since java 1.8
 * @author Roma
 * @version 1.1
 */
public class Method {

    //this method work plus two values ,first variant
    public  void Plus1(int a ,int b)   {
        int c;
        c=a+b;
        if (a<0 || b<0){
            String d = "valus must be bigger zero";
            throw new IllegalArgumentException(d);
        }

        System.out.println("Result: "+c);
    }
    //this method work plus two values ,second variant
    public  void Plus2(int a ,int b)   {
        int c;
        c=a+b;
        if (a==0 || b!=0 ){
            String d = "valus don't must be (first number) equalent"
                    +" zero ,but (secont number)  equalent zero ";
            throw new ArithmeticException(d);
        }
        System.out.println("Result: "+c);
    }
    //this method work plus two values ,third variant
    public  void Plus3(int a ,int b)   {
        int c;
        c=a+b;
        if (a!=0 || b==0){
            String d = "valus must be (first number)  equalent "+
                    "zero ,but (secont number) don't must be equalent zero ";
            throw new ArithmeticException(d);
    }
        System.out.println("Result: "+c);
    }
    //this method work plus two values ,fourth variant
    public  void Plus4(int a ,int b)   {
        int c;
        c=a+b;
        if (a==0 || b==0){
            String d ="valus don't must be (first number)  equalent "+
                    "zero ,but (secont number) don't must be equalent zero too ";
            throw new IllegalArgumentException(d);
    }
        System.out.println("Result: "+c);
    }
    //this method work plus two values ,fifth variant
    public  void Plus5(int a ,int b) throws MyException {
        int c;
        c=a+b;
        if (a>0 || b>0){
            String mesenger = "valus must be smaller zero";
            throw new MyException(mesenger);
    }
        System.out.println("Result: "+c);
    }
    //this method work minus two values ,first variant
    public  void Minus(int a ,int b)   {
        int c;
        c=a-b;
        if (a<0 || b<0){
            String d = "valus must be bigger zero";
            throw new IllegalArgumentException(d);
        }

        System.out.println("Result: "+c);
    }
    //this method work minus two values ,second variant
    public  void Minus2(int a ,int b)   {
        int c;
        c=a-b;
        if (a==0 || b!=0 ){
            String d = "valus don't must be (first number) equalent"
                    +" zero ,but (secont number)  equalent zero ";
            throw new ArithmeticException(d);
    }

        System.out.println("Result: "+c);
    }
    //this method work minus two values ,third variant
    public  void Minus3(int a ,int b)   {
        int c;
        c=a-b;
        if (a!=0 || b==0){
            String d = "valus must be (first number)  equalent "+
                    "zero ,but (secont number) don't must be equalent zero ";
            throw new ArithmeticException(d);
    }

        System.out.println("Result: "+c);
    }
    //this method work minus two values ,fourth variant
    public  void Minus4(int a ,int b)   {
        int c;
        c=a-b;
        if (a==0 || b==0){
            String d ="valus don't must be (first number)  equalent "+
                    "zero ,but (secont number) don't must be equalent zero too ";
            throw new IllegalArgumentException(d);
    }

        System.out.println("Result: "+c);
    }
    //this method work minus two values ,fifth variant
    public  void Minus5(int a ,int b) throws MyException {
        int c;
        c=a-b;
        if (a>0 || b>0){
            String v = "valus must be smaller zero";
            throw new MyException(v);
    }

        System.out.println("Result: "+c);
    }
    //this method work myltyply two values ,first variant
    public void Myltiply(int a ,int b)  {
        int c;
        c=a*b;
        if (a<0 || b<0){
            String d = "valus must be bigger zero";
            throw new IllegalArgumentException(d);
        }

    }
    //this method work myltyply two values ,second variant
    public void Myltiply2(int a ,int b) {
        int c;
        c=a*b;
        if (a==0 || b!=0 ){
            String d = "valus don't must be (first number) equalent"
                    +" zero ,but (secont number)  equalent zero ";
            throw new ArithmeticException(d);
    }
        System.out.println("Result: "+c);
    }
    //this method work myltyply two values ,third variant
    public void Myltiply3(int a ,int b)  {
        int c;
        c=a*b;
        if (a!=0 || b==0){
            String d = "valus must be (first number)  equalent "+
                    "zero ,but (secont number) don't must be equalent zero ";
        throw new ArithmeticException(d);
    }
        System.out.println("Result: "+c);
    }
    //this method work myltyply two values ,fourth variant
    public void Myltiply4(int a ,int b)  {
        int c;
        c=a*b;
        if (a==0 || b==0){
            String d ="valus don't must be (first number)  equalent "+
                    "zero ,but (secont number) don't must be equalent zero too ";
            throw new IllegalArgumentException(d);
    }
        System.out.println("Result: "+c);
    }
    //this method work myltyply two values ,fifth variant
    public void Myltiply5(int a ,int b) throws MyException {
        int c;
        c=a*b;
        if (a>0 || b>0){
            String v = "valus must be smaller zero";
            throw new MyException(v);
    }
        System.out.println("Result: "+c);
    }
    //this method work devil two values ,first variant
    public void Devil(int a, int b)  {
        int c;
        c=a*b;
        if (a<0 || b<0){
            String d = "valus must be bigger zero";
            throw new IllegalArgumentException(d);
        }

        System.out.println("Result: "+c);
    }
    //this method work devil two values ,second variant
    public void Devil2(int a, int b)  {
        int c;
        c=a*b;
        if (a==0 || b!=0 ){
            String d = "valus don't must be (first number) equalent"
                    +" zero ,but (secont number)  equalent zero ";
            throw new ArithmeticException(d);
    }

        System.out.println("Result: "+c);
    }
    //this method work devil two values ,third variant
    public void Devil3(int a, int b)  {
        int c;
        c=a*b;
        if (a!=0 || b==0){
            String d = "valus must be (first number)  equalent "+
                    "zero ,but (secont number) don't must be equalent zero ";
            throw new ArithmeticException(d);
    }

        System.out.println("Result: "+c);
    }
    //this method work devil two values ,fourth variant
    public void Devil4(int a, int b)  {
        int c;
        c=a*b;
        if (a==0 || b==0){
            String d ="valus don't must be (first number)  equalent "+
                    "zero ,but (secont number) don't must be equalent zero too ";
            throw new IllegalArgumentException(d);
    }

        System.out.println("Result: "+c);
    }
    //this method work devil two values ,first variant
    public void Devil5(int a, int b) throws MyException {
        int c;
        c=a*b;
        if (a>0 || b>0){
            String mesenger = "valus must be smaller zero";
            throw new MyException(mesenger);
    }

        System.out.println("Result: "+c);
    }

    /**
     * @param no input params
     * @exception ArithmeticException,IllegalArgumentException,MyException
     * @author Roma
     * @return null
     * @see java code convention
     **/

    public static void main(String[] args) throws MyException {
        Method m = new Method();
        m.Plus1(1,1);
        m.Plus2(1,0);
        m.Plus3(0,5);
        m.Plus4(1,1);
        m.Plus5(-23,-34);
        System.out.println();
        m.Devil(1,1);
        m.Devil2(1,0);
        m.Devil3(0,5);
        m.Devil4(1,1);
        m.Devil5(-23,-34);
        System.out.println();
        m.Myltiply(1,1);
        m.Myltiply2(1,0);
        m.Myltiply3(0,5);
        m.Myltiply4(1,1);
        m.Myltiply5(-23,-34);
        System.out.println();
        m.Minus(1,1);
        m.Minus2(1,0);
        m.Minus3(0,5);
        m.Minus4(1,1);
        m.Minus5(-23,-34);
    }
}
