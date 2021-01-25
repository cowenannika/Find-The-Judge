public class findTheJudge{
    public findTheJudge(){};

    public int findJudge(int n, int[][] trust){
        //don't include zero
        int[] count = new int[n + 1];
        for(int[] i: trust){
            //trust someone you are not the judge
            count[i[0]]--;
            //trusted could be judge
            count[i[1]]++;
        }
        for(int i = 1; i <= n; i++){
            //judge trusted by n - 1 people
            if(count[i] == n - 1){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args){
        int[][] trust = new int[][] {{1, 3}, {1, 4}, {2, 3}, {2, 4}, {4, 3}};
        int n = 4;
        findTheJudge judge = new findTheJudge();

        System.out.println(judge.findJudge(n, trust));
    }
}
