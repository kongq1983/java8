import javax.print.DocFlavor;
import javax.print.PrintService;
import javax.print.PrintServiceLookup;
import javax.print.attribute.HashPrintRequestAttributeSet;
import javax.print.attribute.PrintRequestAttributeSet;

/**
 * @author kq
 * @date 2020-09-09 17:07
 * @since 2020-0630
 */
public class PrinterDemo {

    public static void main0(String[] args) {
        getPrintService();
    }

    private static void getPrintService() {

        PrintRequestAttributeSet pras = new HashPrintRequestAttributeSet();
//        pras.add(new Copies(1));

        DocFlavor flavor = DocFlavor.BYTE_ARRAY.PNG;
//        DocFlavor flavor = DocFlavor.STRING.TEXT_HTML;
//
        PrintService printService[] = PrintServiceLookup.lookupPrintServices(flavor, pras);

        if (printService != null) {
            for (PrintService p : printService) {
                System.out.println("printname=["+p.getName()+"]");
            }
        }
    }

    public static void main(String[] args) {
//        String name1 = "XP-80C22";//"-"
//        String name2 = "XP-80C22";//"-"
        String name1 = "-";//"-"
        String name2 = "-";//"-"

        if (name1.equals(name2)) {
            System.out.println("equeal");
        }else {
            System.out.println("not equeal");
        }

    }


}
