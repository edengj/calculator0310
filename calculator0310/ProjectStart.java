public class ProjectStart {
int a=50;
int b = 7;
    public static void main(String[] args) {

        Add add new Add();
        Comparemin comparemin = new Comparemin();
        Pow pow = new Pow();
        Divide devide = new Devide();
        Max max = new Max();
        Mod mod = new Mod();
        Multiply Multiply = new Muliply();
        subtraction subtraction = new subtraction();

        System.out.println(a+","+b);
        System.out.println("add : "add.getAdd(a,b));
        System.out.println("comparemin : "comparemin.Compare(a,b));
        System.out.println("devide : "+devide.Divide(a,b));
        System.out.println("comparemax : " +max.CompareMax(a,b));
        System.out.println("calculatemod : "+mod.calculateMod(a,b));
        System.out.println("multiply : "+Multiply.multiply(a,b));
        System.out.println("pow : "+pow.getPow(a,b));
        System.out.println("substraction : "+subtraction.getSubtraction(a,b));




    }
}