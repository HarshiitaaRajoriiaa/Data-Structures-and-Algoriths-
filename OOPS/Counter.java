package OOPS;
//https://www.codechef.com/learn/course/college-oops-java/CPOPJA01/problems/OPJA09
class Counter {
    public static void main(String[] args) {
        Counter c1 = new Counter(5);
        Counter c2 = c1;
        
        c1.increment();
        
        System.out.println(c2.getCount());
    }
    private int count;

    public Counter(int count) {
        this.count = count;
    }

    public void increment() {
        count++;
    }

    public int getCount() {
        return count;
    }
}

