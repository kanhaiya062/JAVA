public class student{
    student(int age,String name){
        System.out.println("age of kanhaiya=" +age);
        System.out.println("iska name kya hai=" +name);
    }
    student(student s2){

    }
    }
        class show{
            public static void main(String[] args){
          student s1 = new student(23,"kanhaiya");
          student s2=new student(s1); //copy constuctor means jo s1 ka propertise hai usko s2 me store ho gya

            }
}
