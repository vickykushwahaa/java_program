class StudentToSring {
    String name;
    int age;
    String rollnumber;
 
  public StudentToSring(String name,int age,String rollnumber){
     this.name=name;
     this.age=age ;
     this.rollnumber=rollnumber;
 }
    @Override
    public String toString() {
       return "Student Details:{name: "+ name +" age: "+  age +" rollnumber: "+  rollnumber +"}";
 }
    public static void main(String[] args) {
       StudentToSring student=new StudentToSring(" vicky ", 20 ," 09F1 ");
       System.out.println(student);
   } 
  }


