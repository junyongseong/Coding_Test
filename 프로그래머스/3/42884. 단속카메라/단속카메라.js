function solution(routes) {
    var answer = 0;
    //가장 빨리 나가는 차를 기준으로 그 끝에 카메라를 설치
    routes.sort((a,b)=>a[1] -b[1]);//정렬
    let cam = -30001;
    
    for (const [start, end] of routes) {//배열의 구조뷴해
    if (start > cam){//현재 차량이 기존 카메라 지나가지 않았음
        cam = end;
        answer++;
        }
    }
    return answer;
}