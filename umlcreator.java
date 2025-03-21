import java.util.Scanner;

public class umlcreator {
    String Classname;
    String[] attributes;
    String[] methods;

    public umlcreator(String name, int attrcount, int methodcount) {

        Classname = name;
        attributes = new String[attrcount];
        methods = new String[methodcount];
    }

    public void addattributes(Scanner scan) {
        Scanner input=new Scanner(System.in);
        for (int i = 0; i <attributes.length; i++) {
            System.out.println("enter name of attribute " + (i+1) + " format:datatype attribute name");
            attributes[i] = input.nextLine();
        }


    }

    public void addmethods(Scanner scan) {
        Scanner input=new Scanner(System.in);
        for (int i = 0; i < methods.length; i++) {
            System.out.println("enter name of method " + (i+1) + " (format:return type method name)");
            methods[i] = input.nextLine();
        }
    }

    public void printuml() {
        System.out.println("\n---------------------");
        System.out.println("|     " + Classname + "     |");
        System.out.println("-----------------------");
        for (String attr : attributes) {
            System.out.println("| " + attr + " |");

        }
        System.out.println("------------------");
        for (String method : methods) {
            System.out.println("| " + method + " |");
        }
        System.out.println("----------------------");
    }


}
class makeuml{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("enter name of your class");
        String nameclass=input.nextLine();


        System.out.println("enter number of attributes you want");
        int countattr= input.nextInt();


        System.out.println("enter number of methods you want");
        int countmethod=input.nextInt();


        umlcreator uml1=new umlcreator(nameclass,countattr,countmethod);
        uml1.addattributes(input);
        uml1.addmethods(input);
        uml1.printuml();

    }
}

