package origin;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

 
public class FileTest {
    
    public static void main(String[] args) throws IOException{
       
        String oriFilePath = "D:/java_data/1234.txt";                 
               
        try {            
            BufferedReader prev = new BufferedReader(new InputStreamReader(new FileInputStream(oriFilePath),"UTF-8")); 
           
            while(prev.ready()) {
            	System.out.println("���� �ε� �Ϸ�");
            	System.out.println("���� ���� : " + prev.readLine());
            }
           
            prev.close();               
            
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            System.out.println("���� �ε� ����");
        } 
    }
}