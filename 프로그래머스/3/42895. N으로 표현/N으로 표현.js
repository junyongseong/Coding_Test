function solution(N, number) {
    const dp = Array.from({length:9},()=> new Set());
    //dp[1] = 5 dp[2] =55,5+5,5-5,5*5,5/5
    //j개 + i-j개
    if(N === number)
        return 1;
    
    for(let i=1; i<9;i++){
        //String으로 만들고 반복 ex 55,555,5555
        dp[i].add(Number(String(N).repeat(i)));
        for(let j=1;j<i;j++){
            for(const a of dp[j]){
                for(const b of dp[i-j]){
                    dp[i].add(a+b);
                    dp[i].add(a-b);
                    dp[i].add(a*b);
                    if(b !==0)
                    dp[i].add(Math.floor(a/b))
                }
            }
        }
        if(dp[i].has(number))
        return i;
    }
    return -1;
    
}