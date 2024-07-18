package GREEDY;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Job  {
    public int id, deadline, profit;
    public Job (int id, int deadline, int profit) {
        this.id = id;
        this.deadline = deadline;
        this.profit = profit;
    }
}
class JobComparator implements Comparator<Job> {
    @Override
    public int compare(Job o1, Job o2) {
        return o2.profit - o1.profit;
    }
}
class Main {
    public static int maxProfit(ArrayList<Job > jobs, int deadline) {
//        Collections.sort(jobs, new Comparator<Job >() {@Override public int compare(Job  o1, Job  o2) { return o2.profit - o1.profit; } });
//        Collections.sort(jobs,new JobComparator());
        Collections.sort(jobs, (o1, o2) -> o2.profit - o1.profit);
        //  Collections.sort() - method in Collections class to sorts a collection of objects in ascending order by default.
        //  However, you can also pass a Comparator object to the sort() method to specify a custom sorting order.
        //  Comparator object is a interface that defines a single method, compare().
        //     The compare() method takes two objects as input and returns an integer value that indicates how the two objects should be sorted.
        //     The lambda expression (o1, o2) -> o2.profit - o1.profit is a CONCISE WAY of defining a Comparator object
//
        boolean[] slot = new boolean[deadline];
        int[] result = new int[deadline];
        int profit = 0;
        for (int i = 0; i < jobs.size(); i++) {
            for (int j = Math.min(deadline - 1, jobs.get(i).deadline - 1); j >= 0; j--) {
                if (!slot[j]) {
                    slot[j] = true;
                    result[j] = jobs.get(i).id;
                    profit += jobs.get(i).profit;
                    break;
                }
            }
        }

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]+" | ");
        }
        System.out.println();

        return profit;
    }

    public static void main(String[] args) {
        /*
         Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of jobs: ");  int numJobs = scanner.nextInt();
        System.out.print("Enter the deadline: ");        int deadline = scanner.nextInt();
        ArrayList<Job> jobs = new ArrayList<>();
        for (int i = 1; i <= numJobs; i++) {
            System.out.println("Enter details for Job " + i + ":");
            System.out.print("   ID: ");        int id = scanner.nextInt();
            S ystem.out.print("   Deadline: ");  int jobDeadline = scanner.nextInt();
            System.out.print("   Profit: ");    int profit = scanner.nextInt();
            jobs.add(new Job(id, jobDeadline, profit));
        }
         */
        int deadline = 6;
        ArrayList<Job > jobs = new ArrayList<Job >();
        jobs.add(new Job (1, 4, 20));
        jobs.add(new Job (2, 5, 60));
        jobs.add(new Job (3, 6, 70));
        jobs.add(new Job (4, 6, 65));
        jobs.add(new Job (5, 4, 25));
        jobs.add(new Job (6, 2, 80));
        jobs.add(new Job (7, 2, 10));
        jobs.add(new Job (8, 2, 22));

        System.out.println(maxProfit(jobs, deadline));
    }
}