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

    public static void main(String[] args) {
        getPrintService();
    }

    private static void getPrintService() {

        PrintRequestAttributeSet pras = new HashPrintRequestAttributeSet();
        //1份
//        pras.add(new Copies(1));

        DocFlavor flavor = DocFlavor.BYTE_ARRAY.PNG;
//        DocFlavor flavor = DocFlavor.STRING.TEXT_HTML;
//
        //可用的打印机列表(字符串数组)
        PrintService printService[] = PrintServiceLookup.lookupPrintServices(flavor, pras);

        if (printService != null) {
            for (PrintService p : printService) {
                System.out.println("printname="+p.getName());
            }
        }
    }

}
