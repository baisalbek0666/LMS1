public class School {
    private String name;
    private int numberStudents;
    private String principal;

    public School(String name, int numberOfStudents, String principal) {
        this.name = name;
        this.numberStudents = numberOfStudents;
        this.principal = principal;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfStudents() {
        return numberStudents;
    }

    public void setNumberOfStudents(int numberOfStudents) {
        this.numberStudents = numberOfStudents;
    }

    public String getPrincipal() {
        return principal;
    }

    public void setPrincipal(String principal) {
        this.principal = principal;
    }


    public String toString(){
       return String.format("""
               name: %s
               numberStudents: %s
               principal: %S
               """,name,numberStudents,principal);
    }
}