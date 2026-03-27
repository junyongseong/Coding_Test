import java.util.*;
class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        
        for( int a: scoville){
            pq.offer(a);
        }
        while (pq.size() > 1) {
            int first = pq.poll();

            if (first >= K) {
                return answer;
            }

            int second = pq.poll();
            int mixed = first + (second * 2);

            pq.offer(mixed);
            answer++;
        }
        return pq.poll()>=K ?answer :-1;
    }
}