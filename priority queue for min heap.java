import java.util.*;
class Main {
    public static void main(String[] args) {
       PriorityQueue<Integer> st=new PriorityQueue<>();
       st.add(10);
       st.add(7);
       st.add(8);
       while(!st.isEmpty()){
           System.out.println(st.poll());
       }
       
    }
}