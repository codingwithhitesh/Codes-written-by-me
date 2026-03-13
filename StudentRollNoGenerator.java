class StudentRollNoGenerator {

    private String RollNo ;
    private static int counter = 1 ;

    public StudentRollNoGenerator(String rollNo) {
        RollNo = rollNo;
    }    // In this code, Constructor is just for demo.. So, we initiated the objects S1,S2 and S3 with blank ""

    public String assignRollNo(){
        RollNo = ("IGNOU" + " -2026- " +counter);
        counter++;
        return RollNo;
    }



    public String getRollno (){
      return assignRollNo();
    }

    public static void main(String[] args) {
        StudentRollNoGenerator S1 = new StudentRollNoGenerator("");
        StudentRollNoGenerator S2 = new StudentRollNoGenerator("");
        StudentRollNoGenerator S3 = new StudentRollNoGenerator("");
        System.out.println(S1.getRollno());
        System.out.println(S2.getRollno());
        System.out.println(S3.getRollno());

    }
}
