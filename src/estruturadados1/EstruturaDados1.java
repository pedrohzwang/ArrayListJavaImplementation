package estruturadados1;

import java.util.Arrays;
import structures.ArrayListSenai;

public class EstruturaDados1 {

    public static void main(String[] args) {
        ArrayListSenai array = new ArrayListSenai();
        
        array.add(10);
        array.add(11);
        array.add(12);
        array.add(13);
        
        System.out.print(array.toString());
    }
}
