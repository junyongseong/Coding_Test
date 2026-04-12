function solution(numbers) {
    //ex) 17
    // 한자리씩 1, 7
    // 두자리씩 17, 71
    // 합치고 number로 캐스팅
    let 결과 =  new Set();
    
    function dfs(now, remain){
        if(now.length>0){
            결과.add(Number(now));
        }
        for(let i=0; i < remain.length; i++){
            dfs(now + remain[i],remain.slice(0, i) + remain.slice(i + 1)
            );
        }
    }
    function 소수찾기(num){
        if(num <=1)
            return false;
        for (let i = 2; i <= Math.sqrt(num); i++) {
            if (num % i === 0) return false;
        }
        return true
    }
    dfs("",numbers);
    let count = 0;
    
    for (let num of 결과) {
        if (소수찾기(num)) 
            count++;
    }    
    return count;
}