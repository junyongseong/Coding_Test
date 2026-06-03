function solution(triangle) {
    var answer = 0;
    //점화식 dp[i][j] = triangle[i][j] + max(왼쪽위 최대값, 오른쪽 위 최대값)
    const n = triangle.length;
    
    const dp = Array.from({length :n},()=>Array(n).fill(0));
    
    dp[0][0] = triangle[0][0]
    
    for(let i =1;i<n;i++){
        for (let j=0;j<=i;j++){
            if(j===0){
                dp[i][j] = dp[i-1][j] + triangle[i][j]
            }else if(j===i){
                dp[i][j] = dp[i-1][j-1] + triangle[i][j];
            }else{
                dp[i][j] =Math.max(dp[i-1][j -1], dp[i-1][j]) + triangle[i][j];
            }
        }
    }
    return Math.max(...dp[n-1]);
}