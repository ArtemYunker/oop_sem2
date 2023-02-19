import javax.lang.model.element.Name;
import java.util.Scanner;
import java.util.ArrayList;

public class dz3 {
    
    public static void main(String[] args) {


        Person ivanov = new Person("timur", "ivanov", "21.05.1994",
        "nadezhda ivanova" ,"artem ivanov" );
        Person ivanov1 = new Person("nadezhda", "ivanova", "07.08.1995",
        "olga ivanova" ,"ivan ivanov" );
        Person ivanov2 = new Person("artem", "ivanov", "21.05.1993",
        "anna ivanova", "igor ivanov");
        System.out.println();
        ivanov.array();

        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите Имя и Фамилию : ");
        String n = iScanner.next();
        iScanner.close();
        


        find findParents = new find() {
            @Override
            public void find() {

                if(ivanov.name.equals(n)){
                    System.out.printf("Отец: %s , Mать:%s \n",ivanov.nameDad,ivanov.nameMam);
                    
                }
                if(ivanov1.name.equals(n)){
                    System.out.printf("Отец: %s , Mать:%s \n",ivanov1.nameDad,ivanov1.nameMam);
                }
                if(ivanov2.name.equals(n)){
                    System.out.printf("Отец: %s , Mать:%s \n",ivanov2.nameDad,ivanov2.nameMam);
                }
                
            }
        };
        findParents.find();
    }

}


