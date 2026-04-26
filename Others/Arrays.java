import java.util.ArrayList;

public class Arrays {
  static void main(String[] args) {
    ArrayTest one = new ArrayTest();
    one.SetUpTest();
    one.StartTest();
    one.Result();
  }
}

class ArrayTest {
  private int sucess;
  private ArrayList<String> Txt = new ArrayList<String>();

  public void SetUpTest() {
    String hi = "Hello!";
    Txt.add(hi);
    sucess++;
  }

  public void StartTest() {
    System.out.println(Txt.get(0));
    sucess++;
  }

  public void Result() {
    System.out.println(sucess);
  }
}