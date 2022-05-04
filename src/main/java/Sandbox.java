import java.util.ArrayList;
import java.util.List;

public class Sandbox {

    public Integer solutionMethod(Integer n){

        List<Integer> solutionList = new ArrayList<>();
        solutionList.add(0);
        solutionList.add(1);

        Integer currentValue = 0;
        Integer i = 1;
        while(currentValue < n){
            Integer currentIndex = solutionList.get(i);
            Integer prevIndex = solutionList.get(i-1);
            currentValue = currentIndex + prevIndex;
            solutionList.add(currentValue);
            i++;
        }

        Integer lastNumber = solutionList.get(solutionList.size()-1);
        Integer secondToLastNumber = solutionList.get(solutionList.size()-2);
        Integer finalNumber = lastNumber + secondToLastNumber;

        return finalNumber;
    }

    public static void main(String[] args) {
        Sandbox sandbox = new Sandbox();
        sandbox.solutionMethod(20);



    }


}


