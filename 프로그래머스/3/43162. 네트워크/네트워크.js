function solution(n, computers) {
    //컴퓨터의 개수 n, 배열 computers 네트워크 개수 answer
    var answer = 0;
    
    let visit = Array(n).fill(0);
    
    for (let i=0; i<n;i++){
        if(!visit[i]){
            answer ++;
            Avisit(i);
        }
    }
    return answer;
    
    function Avisit(A){
        visit[A] = true;
        
        const com= computers[A];
        for(let i = 0; i< com.length;i++){
            const conn = com[i]=== 1 ? 1 : 0;
            
            if(!visit[i] && conn){
                Avisit(i);
            }
        }
    }
}