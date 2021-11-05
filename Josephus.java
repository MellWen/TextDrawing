import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Josephus {
 
 public Josephus(int n,int s,int d){
  
  //创建顺序表对象
  List<String> list = new ArrayList<String>(n);
  //输入顺序表的数据内容
  for (int i=0;i<n;i++){
   list.add((char)('A'+i)+"");
  }
  //输出初始时表中的内容
  System.out.print("约瑟夫环 ("+n+","+s+","+d+"),");
  System.out.println(list.toString());
  
  //从第s个元素开始，依次计数，每数到d，就将对应元素删除
  int index = s; //计数起始位置
  while( list.size()>1) //多余一个对象时循环
  {
   index = (index+d-1) % list.size();
   String str = list.remove(index);
   
   System.out.print("删除" + str.toString() + ",留");
   System.out.println(list.toString());
  }
  
  //重复计数并删除元素，最后只剩下一个元素，输出被赦免者
  System.out.println("被赦免者是" + list.get(0).toString());
 }
 
 public static void main(String[] atrs){
  Scanner input = new Scanner(System.in);
  Josephus josephus = new Josephus(input.nextInt(),input.nextInt(),input.nextInt());

 }

}
