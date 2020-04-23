public class View {
    public static void afisDisponibile(int n, Bijuterie A[]){
        FormatariT.capTabel33();
        for(int i=0;i<n;i++)
            if(A[i].getStocI()>A[i].getVandut()){
                FormatariT.Formatari33(n,i,A);
            }
        FormatariT.Linii(78,'-');
    }
    public static void afisRauVandute(int n, Bijuterie A[]) {
        FormatariT.capTabel22();
        long Suma=0;
        //for(int i=0;i<n;i++)
            //Suma+=A[i].getVandut()*A[i].getPretUnit();
        for(int i=0;i<n;i++){
            if(2*A[i].getVandut()<A[i].getStocI())
            {   FormatariT.Formatari66(n,i,A);
                Suma+=A[i].getVandut()*A[i].getPretUnit();
            }
        }
        FormatariT.Linii(85,'-');
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t Total="+Suma);
    }
}

class FormatariT{
    public static void capTabel33(){
        String sir="Denumire\t\t|Tip\t\t\t |Disponibile| PretUnit  |Valoare disponibile|";
        Linii(78,'=');
        System.out.println(sir);
        Linii(78,'=');
    }
    public static void capTabel22(){
        String sir="Denumire\t\t  |Tip\t\t\t  |StocInit  |Vandute      |PretUnit|Valoare vandute|";
        Linii(85,'=');
        System.out.println(sir);
        Linii(85,'=');
    }
    public static void Formatari33(int n,int i, Bijuterie A[] )
    {
        String []s=new String[5];
        s[0]=A[i].getNume();
        s[1]=A[i].getTip();
        //String []sInt=new String[2];
        int disponibil=A[i].getStocI()-A[i].getVandut();
        s[2]=Integer.toString(disponibil);
        s[3]=Integer.toString(A[i].getPretUnit());
        int valoare=disponibil*A[i].getPretUnit();
        s[4]=Integer.toString(valoare);
        System.out.printf("%-16s|%-16s|%11s|%11s|%20s|\n",s);
    }
    public static void Formatari66(int n,int i, Bijuterie A[] )
    {  //if(2*A[i].getVandut()<A[i].getStocI()) {
        String []s=new String[6];
        s[0]=A[i].getNume();
        s[1]=A[i].getTip();
        s[2]=Integer.toString(A[i].getStocI());
        s[3]=Integer.toString(A[i].getVandut());
        s[4]=Integer.toString(A[i].getPretUnit());
        int vandute=A[i].getVandut()*A[i].getPretUnit();
        s[5]=Integer.toString(vandute);
        //Suma+=A[i].getVandut()*A[i].getPretUnit();

        System.out.printf("%-18s|%-15s|%10s|%13s|%8s|%15s|\n",s);
    //}

    }
    public static void Linii (int nrLinii,char c){
        for(int i=0;i<nrLinii;i++){
            System.out.print(c);
        }
        System.out.println();
    }
}