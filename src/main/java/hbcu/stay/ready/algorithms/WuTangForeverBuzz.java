package hbcu.stay.ready.algorithms;

public class WuTangForeverBuzz {

    public String wuTangClan(int n){

        StringBuilder output = new StringBuilder("1");

        for(int i = 2; i <= n; i++){
            output.append("\n");
            if(i%3==0) output.append("Wu");
            if(i%5==0) output.append("Tang");
            if(i%15==0) output.append(" Forever");
            if(i%3!=0 && i%5!=0) output.append(i);
        }

        return output.toString();

    }
}
