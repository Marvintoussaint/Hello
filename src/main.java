import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class main {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        ArrayList<String> newList = new ArrayList<>();
        String status = "Low";
        list.add("Power 1");
        list.add("Power 2");
        list.add("Power  3");
        list.add("Power 4");
        list.add("Power 5");
        list.add("Power 6");

     list.stream()
             .forEach( i ->{
                 if(status == "Bug" && i.equals("Power 1"))
                 {

                 }
             });


    }




}
