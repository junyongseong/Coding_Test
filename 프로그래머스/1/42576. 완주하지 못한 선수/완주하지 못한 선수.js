function solution(participant, completion) {
    participant.sort();
    completion.sort();
    for(var i=0; participant.length;i++){
        if(participant[i] !==completion[i])
            return(participant[i]);
    }
}