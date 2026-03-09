function solution(progresses, speeds) {    //남은 작업 /속도 만큼
    var day = [];
    for(let i =0;i<progresses.length;i++){
        day.push(Math.ceil((100-progresses[i])/speeds[i]));
    }
    var answer =[];
    let current_day = day[0];
    let cnt = 1;
    for(let i=1;i<day.length;i++){
        if(day[i]<=current_day){
            cnt++;
        }
        else{
            answer.push(cnt);
            current_day = day[i];
            cnt =1;
        }
    }
    answer.push(cnt);
    return answer;
}