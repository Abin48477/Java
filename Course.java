
class Course {
    String title;
    int credit;
    String courseCode;

}
void setValues(String t,int c,String cc){
   this.title = t;

    this.credit = c;
    this.courseCode = cc;
}

void showValues(){
    System.out.println("Subjects:"+ title + "Credit hrs:" + credit + "Course Code is:"+ cc);
}

class qno1{
    public static void main(String[] args) {
Course[]courseList = new Course[5];
//add 5 course object and fill data
courseList[0] = new Course();
courseList[0].setValues("System Analysis and Design",3,"C101");

courseList[1] = new Course();
courseList[0].setValues("Staststic",2,"M12O");

courseList[2] = new Course();
courseList[2].setValues("Java",4,"C12RE");


courseList[3] = new Course();
courseList[3].setValues("WebTechnology",3,"CV33");

courseList[4] = new Course();
courseList[4].setValues("Data Structure and Algorithm");

//print 
for(int i = 0; i<5; i++) {
    if(courseList[i].title.startWith("C")){
        courseList[i].showValues();

             }
          }
    }
}
