import java.util.List;
import java.util.ArrayList;

public class NotOutOfMemoryMain {
    public static void main(String[] args){
        int i = 0;
        while(true) {
            String lixo = "Adicionando lixo " + i;
            System.out.println(lixo);
            i++;
        }
    }
}
