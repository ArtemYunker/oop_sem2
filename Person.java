import java.lang.reflect.Array;
import java.util.ArrayList;



public class Person {
    
        public String name;
        public String surname;
        public String dayOfBirth;
        public String nameMam;
        public String nameDad;

    
      
        public Person( String name,String surname, String dayOfBirth, String nameMam,String nameDad) {
    
          this.name = name;
          this.surname = surname;
          this.dayOfBirth = dayOfBirth;
          this.nameMam = nameMam;
          this.nameDad = nameDad;
        }
        public void display(){
          System.out.println(this.name +" "+this.surname +" "+this.dayOfBirth+"  Мать: "+this.nameMam +
           ",  Отец: "+this.nameDad);

        }
        
        public  String array(){
            ArrayList<String> list = new ArrayList<String>();
            list.add(name + " " + surname);
            list.add(nameMam);
            list.add(nameDad);
            System.out.println(list.toString());          
            return name;
          }
        

}    
    

