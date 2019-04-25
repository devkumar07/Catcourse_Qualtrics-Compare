import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.StringTokenizer;
import java.util.Scanner;
import java.io.PrintWriter;
public class app{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the CSV file for catcourses");
    String data_cat=input.nextLine();
    System.out.println("Enter the CSV file for Qualtrics");
    String data_qualtrics=input.nextLine();
    ArrayList<Student_data> catcourses = new ArrayList<Student_data>();
    ArrayList<Student_data> qualtrics = new ArrayList<Student_data>();
    String name="";
    String email="";
    String first_name="";
    String last_name="";
    try {
        BufferedReader read_data_cat = new BufferedReader( new FileReader(data_cat));
        BufferedReader read_data_qualtrics = new BufferedReader( new FileReader(data_qualtrics));
        String strLine = null;
        StringTokenizer st = null;
        int lineNumber = 0, tokenNumber = 0;
        while( (data_cat = read_data_cat.readLine()) != null)
        {
          lineNumber++;
          //break comma separated line using ","
          st = new StringTokenizer(data_cat, ",");

          while(st.hasMoreTokens())
          {
            //display csv values
            tokenNumber++;
            if(tokenNumber==1){
              name=st.nextToken();
            }
            if(tokenNumber==2){
              email=st.nextToken();
            }
          }
          Student_data t1 = new Student_data(name,email);
          catcourses.add(t1);
          //reset token number
          tokenNumber = 0;
        }
        lineNumber=0;
        tokenNumber=0;
        while((data_qualtrics = read_data_qualtrics.readLine()) != null)
        {
          lineNumber++;
          //break comma separated line using ","
          st = new StringTokenizer(data_qualtrics, ",");

          while(st.hasMoreTokens())
          {
            //display csv values
            tokenNumber++;
            if(tokenNumber==1){
              first_name=st.nextToken();
            }
            if(tokenNumber==2){
              last_name=st.nextToken();
            }
            if(tokenNumber==3){
              email=st.nextToken();
            }
          }
          if(email.length()>=13){
            Student_data t2 = new Student_data(first_name,last_name,email.substring(0,email.length()-13));
            qualtrics.add(t2);
          }
          //reset token number
          tokenNumber = 0;
        }
  }
  catch (FileNotFoundException e) {
    			// TODO Auto-generated catch block
    			e.printStackTrace();
    		} catch (IOException e) {
    			// TODO Auto-generated catch block
    			e.printStackTrace();
    		}
}
}
