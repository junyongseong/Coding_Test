function solution(people, limit) {
    var answer = 0;
    people.sort((a,b)=>a-b);
    while(people.length){
        //1) 제일 가벼운 사람 + 제일 마지막 삶
        if(people[0] + people.at(-1)<=limit){
            people.shift();
            people.pop();
            answer++;
        }else{
            people.pop();
            answer++;
        }
    }
    return answer;
}