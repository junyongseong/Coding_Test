function solution(n, lost, reserve) {
    lost.sort((a,b)=>a-b);
    reserve.sort((a,b)=>a-b);
    
    let 잃어버린놈 = lost.filter(l => !reserve.includes(l));
    let 빌려준사람 = reserve.filter(r => !lost.includes(r));
    
    for (let r of 빌려준사람) {
        if (잃어버린놈.includes(r - 1)) 
        {
            잃어버린놈 = 잃어버린놈.filter(l => l !== r - 1);
        } else if (잃어버린놈.includes(r + 1)) 
        {
            잃어버린놈 = 잃어버린놈.filter(l => l !== r + 1);
        }
    }
    var answer = n -잃어버린놈.length

    return answer;
}