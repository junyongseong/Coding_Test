function solution(answers) {
    //1) 12345
    //2) 21232425
    //3) 3311224455
    let 첫포자 =[1,2,3,4,5];
    let 둘포자 = [2,1,2,3,2,4,2,5];
    let 삼포자 = [3,3,1,1,2,2,4,4,5,5];
    let 정답 =[0,0,0];//기본 세팅
    
    for(let i =0; i<answers.length;i++){
        if(answers[i] === 첫포자[i%첫포자.length]){
            정답[0]++;
        }
        if(answers[i] === 둘포자[i%둘포자.length]){
            정답[1]++;
        }
        if(answers[i] === 삼포자[i%삼포자.length]){
            정답[2]++;
        } 
    }
    let 최대값 = Math.max(...정답);
    let 결과 = [];
    
    for (let i = 0; i < 정답.length; i++) {
        if (정답[i] === 최대값) {
            결과.push(i + 1);
        }
    }
    return 결과;
}