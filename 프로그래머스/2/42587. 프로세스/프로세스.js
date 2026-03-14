function solution(priorities, location) {
    //[2,0],[1,1]이런식으로 만들기
    const q = priorities.map((priority,index)=>[priority,index]);
    let cnt =0;
    while(q.length>0){
        //맨앞 꺼내기
        const first = q.shift();
        //높은 우선 순위
        const highpri = q.some(item=>item[0]>first[0]);
        
        if(highpri){
            q.push(first);
        }else{
            cnt++;
            if(first[1]===location)
                return cnt;
        }
    }
}