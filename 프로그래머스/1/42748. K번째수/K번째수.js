function solution(array, commands) {
    var answer = [];
    for(let i of commands){
        let a= i[0];//2
        let b = i[1];//5
        let c = i[2];//3
        
        //자른 배열
        let d= array.slice(a-1,b);
        d.sort((j,k)=>j-k);
        answer.push(d[c-1]);
    }
    return answer;
}