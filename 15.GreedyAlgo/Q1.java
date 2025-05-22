import java.util.*;
public class Q1{
  public static void main(String[] args) {
    int start[] = {1,3,5,7,6};
    int end[] = {2,4,5,6,8};
    int maxAct = 0;
    ArrayList<Integer> ans = new ArrayList<>();
    maxAct=1;
    ans.get(0);
    int lastEnd = end[0];
    for (int i = 0;i<end.length ;i++){
      if(start[i]>= lastEnd){
        //Activities selection
        maxAct++;
        ans.add(i);
        lastEnd =end[i];
      }
    }
    System.out.println("Maximum Activities = "+maxAct);
    for(int i=0;i<ans.size();i++){
      System.out.println("A"+ans.get(i)+" ");
    }

  }
}