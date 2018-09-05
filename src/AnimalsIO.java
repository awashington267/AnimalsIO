import java.io.*;
import java.util.Scanner;

public class AnimalsIO {
    public static Talkable addCat()
    {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Hello");

        PrintWriter outFile = new PrintWriter(new BufferedWriter( new OutputStreamWriter(System.out)));
        try{
            outFile.print("Please enter the cat's name: ");


        }catch(Exception e){
            System.out.print("Enter a name.");
        }

        try{
            outFile.print("How many mice did kill?");

        }catch(Exception e){
            System.out.print("Enter a number. ");
        }
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        try {
            in.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        //addCat cat = new addCat(catName, miceKilled);
        return (addCat());
        //return(cat);

    }



    public static Talkable addDog()
    {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Hello");

        PrintWriter outFile = new PrintWriter(new BufferedWriter( new OutputStreamWriter(System.out)));
        try{
            outFile.print("Please enter the dog's name: ");

        }catch(Exception e){
            System.out.println("Enter a name.");
        }

        try{

            outFile.print("Is the dog friendly (Enter Y for Yes and N for No)");

        }catch(Exception e){
            System.out.println("Enter Y for Yes or N for No.");
        }

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        try {
            in.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return (addDog());
    }

    public static Talkable addStudent()
    {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Hello");

        PrintWriter outFile = new PrintWriter(new BufferedWriter( new OutputStreamWriter(System.out)));
        try{
            outFile.print("Please enter the Student's name.");

        }catch(Exception e){
            System.out.println("Please enter a name.")
        }

        try{
            outFile.print("How old is the student? ");
        }catch(Exception e){
            System.out.println("Enter a number.");
        }


        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        try {
            in.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return (addStudent());
    }
}
