import java.util.Scanner;
public class igraSam {
        public static void main(String[] args) {
            Scanner igra =new Scanner(System.in);
            System.out.println("Вгадайка");
            int rang=10;
            int number = (int) (Math.random()*rang);
            while(true){
            System.out.println("Вгадай число від 0 до" + rang);
            int input_number = igra.nextInt();

        }
}
