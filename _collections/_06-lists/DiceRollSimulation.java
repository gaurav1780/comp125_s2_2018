import java.util.*;

public class DiceRollSimulation {
    public static void main(String[] args) {
    //1.
    Random rand = new Random(); //needs import java.util.Random;
    int N = rand.nextInt(1000); //N is in the range [0, 1000)
                                //`[` means inclusive, `)` means exclusive

    ArrayList<Integer> outcomes = new ArrayList<Integer>();
    for(int i=0; i < N; i++) {
       int current = rand.nextInt(6) + 1;
    	outcomes.add(current);
    }
    System.out.println(outcomes);

    //2.
    int nSixes = 0;
    for(int i=0; i < outcomes.size(); i++) {
    	if(outcomes.get(i) == 6) {
    		nSixes++;
    	}
    }
    System.out.println("Number of sixes: "+nSixes);

    //3.
    int total = 0;
    for(int i=0; i < outcomes.size(); i++) {
    	total = total + outcomes.get(i);
    }
    double average = total / (double)outcomes.size(); //without (double), it'd be int/int
    System.out.println("Average: "+average);

    //4.
    boolean noTwoAdjSame = true;
    for(int i=0; i < outcomes.size() - 1 && noTwoAdjSame; i++) {
    	//for all but last item and as long as noTwoAdjSame is true
    	if(outcomes.get(i) == outcomes.get(i+1)) { //same outcome one after the other
    		noTwoAdjSame = false;
    	}
    }
    if(noTwoAdjSame) {
      System.out.println("None of two adjacent outcomes are the same");
    }
    else {
      System.out.println("Adjacent outcomes same at least once");
    }
    //5.
    int[] freqs = new int[6];
    /*
    frequency of rolling a one is stored at index 0
    frequency of rolling a two is stored at index 1
    ...
    frequency of rolling a six is stored at index 5
    */
    for(int i=0; i < outcomes.size(); i++) {
    	freqs[outcomes.get(i) - 1]++; //updated frequency of encountered outcome
    }

    int maxIndex = 0; //assume 1 was rolled the most times (frequency is at index 0)
    for(int i=1; i < freqs.length; i++) {
    	if(freqs[i] > freqs[maxIndex]) {
    		maxIndex = i;
    	}
    }

    int mostFreq = maxIndex + 1; //add the offset to get outcome from index
    System.out.println("Most frequent outcome: "+mostFreq+" with "+freqs[maxIndex]+" occurrences");
  }
}
