import java.io.*;
import java.util.*;

class Person implements Comparable<Person>{
    private int age;
    private String name;
    public Person(int age, String name){
        this.age = age;
        this.name = name;
    }
    public int getAge(){
        return age;
    }
    public String getName(){
        return name;
    }

    @Override
    public int compareTo(Person other){
        //나이가 다르다면, 나이가 적은 순으로 정렬
        if(this.age != other.age){
            return Integer.compare(this.age, other.age);
        } else { // 나이가 같다면, 입력한 순으로 출력
            return 0;
        }
    }
}

public class Main{
    public static void main(String args[]) throws IOException {
        scan();
    }
    public static void scan() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());

        List<Person> person = new ArrayList<>();
        for(int i = 0 ; i < n ; i ++){
            String[] input = br.readLine().split(" ");
            int age = Integer.parseInt(input[0]);
            String name = input[1];
            person.add(new Person(age, name));
        }

        Collections.sort(person);
        for(Person p : person){
            bw.write(p.getAge() + " " + p.getName() + "\n");
        }

        bw.flush();
        bw.close();
    }
}
