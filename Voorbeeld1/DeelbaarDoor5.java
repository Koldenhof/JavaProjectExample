public class DeelbaarDoor5
{
    int teller, a, b, c;
    String tekst;
    public DeelbaarDoor5(){
        teller = 195;
        while(teller < 496){
                teller = teller + 5;
                print("getal: " + teller);
        }
    }
        public void print(String t){
        System.out.println(t);
    }
}
