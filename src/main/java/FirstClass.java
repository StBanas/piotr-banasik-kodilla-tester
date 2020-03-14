public class FirstClass {
    public static void main(String[] args) {

        int year =  2040;
        LeapYear leapYear = new LeapYear(year);
        System.out.println("Rok "+ year +  " jest rokiem przestępnym : " + leapYear.checkYear());
        System.out.println("..........................................................................");
        System.out.println("..........................................................................");

        Notebook notebook = new Notebook(600, "notebook", 1000);
        System.out.println("To jest " + notebook.rename + " ważący " + notebook.weight + " gramów o wartości " + notebook.price + " jednostek monetarnych.");
        notebook.checkPrice();
        notebook.checkWeight();
        System.out.println("---------------------------------------------------------------------");

        Notebook heavyNotebook = new Notebook(2000, "heavyNotebook", 1500);
        System.out.println("To jest " + heavyNotebook.rename + " ważący " + heavyNotebook.weight + " gramów  o wartości " + heavyNotebook.price + " jednostek monetarnych.");
        heavyNotebook.checkPrice();
        heavyNotebook.checkWeight();
        System.out.println("---------------------------------------------------------------------");

        Notebook oldNotebook = new Notebook(1600, "oldNotebood", 500);
        System.out.println("To jest " + oldNotebook.rename + " ważący " + oldNotebook.weight + " gramów  o wartości " + oldNotebook.price + " jednostek monetarnych." );
        oldNotebook.checkPrice();
        oldNotebook.checkWeight();
        System.out.println("---------------------------------------------------------------------");


        System.out.println("Wniosek generalny = cena nie idzie w parze z wagą");
        System.out.println("--------------------------------------------------------------------");

//        if (1>2)
//            {
//                System.out.println("");
//                System.out.println("  1 > 2  : Niesamowite - zawsze myślałem że 2 jest mniejsze od 1");
//            }
//        else if (1<2)
//            System.out.println("  1 < 2  : Uff! Wszysto po staremu: 1 jest mniejsze od 2.");
//        int[] book = {notebook.price, heavyNotebook.price, oldNotebook.price};
//        String[] nameTemp = {notebook.rename, heavyNotebook.rename, oldNotebook.rename};
//        String[] weightTemp = {notebook.weight, heavyNotebook.weight, oldNotebook.weight};
//
//        for (int i = 0; i < book.length; i++) {
//
//            if (book[i] < 900)
//                System.out.println("The notebook " + nameTemp[i] + " is cheap.");
//            else if (book[i] > 1200)
//                System.out.println("The notebook " + nameTemp[i] + " is expensive");
//        for (int i=0; i<3; i++)
        /* W jaki sposób wywołać te obiekty w pętli?*   :    nameTemp[i].checkPrice();   */


    }



}
