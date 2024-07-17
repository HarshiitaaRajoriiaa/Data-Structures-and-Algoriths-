package QUESTIONS.OOPS;
//https://www.codechef.com/learn/course/college-oops-java/CPOPJA01/problems/OPJA05
public class SetterGetter {
    private int myField;

    public int getMyField() {
        return myField;
    }

    public void setMyField(int value) {
        myField = value;
    }
    public static void main(String[] args) {
        SetterGetter sg = new SetterGetter();
        sg.setMyField(100);
        int value = sg.getMyField();
        System.out.println("Value of myField: " + value);
    }

}
