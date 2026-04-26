function solution(name) {
    var answer = 0;
    //시작점은 A
    //커서를 상하 이동
    //커서를 좌우로 이동
    
    let move = name.length -1;
    for(let i =0; i<name.length; i++){
        const c = name.charCodeAt(i) - 65; //A가 65
        
        //상하 이동 먼저 체크 J로 가정하면 위로 9 번 아래로는 17번 즉 9
        answer += Math.min(c,26-c);
        
        //이제 좌우 이동 체크 해야하는데 A연속
        let next = i + 1;
        while (next < name.length && name[next] === 'A') {
            next++;
        }
        //좌우 이동 Math.min
        //1) i가 오른쪽으로 갔다가 다시 왼쪽 갔다가 그 뒤 문자 처리 i*2 + name.length -next
        //2) 뒤쪽 처리하고 오른쪽으로 가는 문자 처리 i + (name.length - next) *2
        move = Math.min(move ,i*2 + name.length -next, i + (name.length - next) *2)
    }
    
    return answer+ move;
}