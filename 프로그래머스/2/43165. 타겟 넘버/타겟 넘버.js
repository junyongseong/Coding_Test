function solution(numbers, target) {
    var answer = 0;
    
    dfs(0,0);
    function dfs(a,b){
        if(a === numbers.length){
            if(b === target){
                answer++;
            }
            return;
        }
        
        dfs(a+1,b+numbers[a]);
        dfs(a+1,b-numbers[a]);
    }
    return answer;
}