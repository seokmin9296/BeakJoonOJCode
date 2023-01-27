import java.util.*;
public class Main{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        List<Integer> passStudent = new ArrayList<Integer>();
        int[] chk = new int[30];
        
        for(int i = 0; i < 28 ; i ++){
            int a = sc.nextInt();
            passStudent.add(a);
        }
        int[] result = result(passStudent, chk);
        for(int i = 0; i < result.length ; i ++){
            if(result[i]==0){
                System.out.println(i+1);
            }
        }
        sc.close();
    }
    public static int[] result(List<Integer> student, int[] chk){
        for(int i = 0; i < chk.length; i ++){
            for(int j = 0; j < student.size(); j++){
                if(student.get(j) == i+1){
                    chk[i] = 1;
                    break;
                }else{
                    chk[i] = 0;
                }
            }
        }
        return chk;
    }
}