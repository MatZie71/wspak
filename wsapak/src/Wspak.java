import java.util.Scanner;
public class Wspak {
    String wyraz;

    public void getWyraz(String wejscie){
       wyraz=wejscie;
int dlugoscSlowa=wejscie.length();
int y=dlugoscSlowa;
for(int x=0;x<dlugoscSlowa;x++){

    char litera = wejscie.charAt(--y);
    System.out.print(litera);


}

    }

}

class WspakTest{
    public  static void main(String[] args)
    {

        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj wyraz");
        String podanyWyraz = scan.nextLine();

        Wspak Wspak=new Wspak();
        Wspak.getWyraz(podanyWyraz);

    }
}
