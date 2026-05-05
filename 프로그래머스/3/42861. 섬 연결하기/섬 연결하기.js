function solution(n, costs) {
    var answer = 0;
    //mst문제 크루스칼 or 프림 
    //1) 정렬, 길이가 짧은 순서대로[2]
    costs.sort((a,b)=>a[2]-b[2]);
    
    //길이 n짜리 배열 만들고 인덱스에 본인 넣기
    const p = Array.from({length:n},(_,i)=>i);
    
    //부모 찾기 재귀
    function findP(i){
        if(p[i]===i)
            return i;
        return p[i] = findP(p[i]);
    }
    //합치기 함수 a,b
    function sum(a,b){
        const A = findP(a);
        const B = findP(b);
        
        if(A === B)
            return false;
        
        p[B] = A;
        return true;
    }
    //연결 즉 true니깐 연결
    for( const [a,b, cost] of costs){
        if(sum(a,b)){
            answer +=cost;
        }
    }
    return answer;
}