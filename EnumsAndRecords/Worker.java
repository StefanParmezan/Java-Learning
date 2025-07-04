package EnumsAndRecords;

public enum Worker {
    PROGRAMMER(120000, "Monday"), COOKER(70000, "Thursday"), BARISTA(60000, null);

    private int Salary;
    private String Weekend;

    Worker(int Salary, String weekend){
        this.Salary = Salary;
        this.Weekend = weekend;
    }
    public int getSalary(){
        return Salary;
    }
    public String getWeekend(){
        return Weekend;
    }
    public void display(){
        System.out.println("Salary: " + Salary);
        System.out.println("Weekend: " + Weekend);
    }
    public int CalculateSalaryPerDay (int Salary){
        return Salary / 30;
    }
}
