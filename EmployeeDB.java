import java.io.*;
import java.util.*;
class Emp{
    private int EmpId;
    private double EmpSal;
    private String EmpName;

    public Emp(int empId, double empSal, String empName) {
        EmpId = empId;
        EmpSal = empSal;
        EmpName = empName;

    }

    public int getEmpId() {
        return EmpId;
    }

    public void setEmpId(int empId) {
        EmpId = empId;
    }

    public double getEmpSal() {
        return EmpSal;
    }

    public void setEmpSal(double empSal) {
        EmpSal = empSal;
    }

    public String getEmpName() {
        return EmpName;
    }

    public void setEmpName(String empName) {
        EmpName = empName;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "EmpId=" + EmpId +
                ", EmpSal=" + EmpSal +
                ", EmpName='" + EmpName + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Emp emp001 = new Emp(001,20000,"Harsh");

        emp001.setEmpSal(21000);

        System.out.println(emp001.toString());
    }
}