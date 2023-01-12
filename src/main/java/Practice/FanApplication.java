package Practice;

public class FanApplication {
    public static void main(String[] args) {
        Fan f1=Fan.GetFan();
        Fan f2=Fan.GetFan("bajaj",654.21,"tablefan","black");
        Fan.GotFan(f1);
        Fan.GotFan(f2);
    }
}
