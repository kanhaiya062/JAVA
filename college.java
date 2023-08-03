public class college {
    college(){
        System.out.println("this is constractor");
    }
    college(String student, int roll_number){
        System.out.println("studennt nname of " +student);
        System.out.println(" roll number of student  " +roll_number);
    }
}
class show{
    public static void mai(String[] args){
        college s1=new college("kanhaiya mahto",31801221105);
    }
}
