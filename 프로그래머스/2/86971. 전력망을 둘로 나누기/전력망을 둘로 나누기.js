function solution(n, wires) {
    var answer = 100;
    for(let i=0; i<wires.length; i++){
        const g = Array.from({length:n+1},()=>[]);
        
        for(let j=0; j<wires.length;j++){
            if(i=== j)
                continue;
            const [a,b] = wires[j];
            g[a].push(b);
            g[b].push(a);
        }
        const visit= Array(n+1).fill(false);
        
        function dfs(n){
            visit[n] = true;
            let cnt = 1;
            for(const next of g[n]){
                if(!visit[next]){
                    cnt +=dfs(next);
                }
            }
            return cnt;
        }
        const cnt = dfs(1);
        const dif = Math.abs(cnt -(n-cnt));
        
        answer = Math.min(answer,dif)
    }
    return answer;
}