import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        float mat,fiz,trk,kmy,mzk,notOrtalamasi = 0;
        Scanner oku=new Scanner(System.in);

        System.out.print("\nMatematik notunuz : ");
        mat= oku.nextFloat();

        System.out.print("\nFizik notunuz : ");
        fiz= oku.nextFloat();

        System.out.print("\nKimya notunuz : ");
        kmy= oku.nextFloat();

        System.out.print("\nTurkce notunuz : ");
        trk= oku.nextFloat();

        System.out.print("\nMuzik notunuz : ");
        mzk=oku.nextFloat();

        if(mat<=100 && mat>=0){
            notOrtalamasi+=mat;
        }

        if(kmy<=100 && kmy>=0){
            notOrtalamasi+=kmy;
        }

        if(fiz<=100 && fiz>=0){
            notOrtalamasi+=fiz;
        }

        if(trk<=100 && trk>=0){
            notOrtalamasi+=trk;
        }

        if(mzk<=100 && mzk>=0){
            notOrtalamasi+=mzk;
        }
        
        notOrtalamasi=notOrtalamasi/5;

        if(notOrtalamasi<=55){
            System.out.println("\nDonem Tekrari\nNotunuz : "+notOrtalamasi);
        }
        else {
            System.out.println("\nGeçtiniz!!");
            System.out.println("Notunuz : "+notOrtalamasi);
        }

    }
}