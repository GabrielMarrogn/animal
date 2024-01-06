import java.io.BufferedReader;
import java.io.InputStreamReader;

public class App {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(
        new InputStreamReader(System.in)); 

        String a = br.readLine();
        String b = br.readLine();
        String c = br.readLine();

        br.close();

        if(a.equals("vertebrado")){
            if(b.equals("ave")){
                if(c.equals("carnivoro")){
                    System.out.println("aguia");
                }else if(c.equals("onivoro")){
                    System.out.println("pomba");
                }
            }else if(b.equals("mamifero")){
                if(c.equals("onivoro")){
                    System.out.println("homem");
                }else if(c.equals("herbivoro")){
                    System.out.println("vaca");
                }
            }
        }
        
        else if(a.equals("invertebrado")){
            if(b.equals("inseto")){
                if(c.equals("hematofago")){
                    System.out.println("pulga");
                }else if(c.equals("herbivoro")){
                    System.out.println("lagarta");
                }
            }else if(b.equals("anelideo")){
                if(c.equals("hematofago")){
                    System.out.println("sanguessuga");
                }else if(c.equals("onivoro")){
                    System.out.println("minhoca");
                }
            }
        }
    }
}
