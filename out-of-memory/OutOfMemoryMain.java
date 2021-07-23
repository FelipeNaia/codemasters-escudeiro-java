import java.util.List;
import java.util.ArrayList;

public class OutOfMemoryMain {
    public static void main(String[] args){
        List<String> list = new ArrayList<>();
        int i = 0;
        while(true) {
            String lixo = "Adicionando lixo " + i;
            list.add(lixo);
            System.out.println(lixo);
            i++;
        }
    }
}
