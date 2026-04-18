function solution(brown, yellow) {
    //세로+2 가로+2 
    for(let 세로 = 1; 세로 <= Math.sqrt(yellow);세로 ++ ){
        if(yellow % 세로 ===0){
            let 가로 = yellow / 세로;
            
            let 전체가로 = 가로 + 2;
            let 전체세로 = 세로 + 2;
            
            if (전체가로 * 전체세로 === brown + yellow) {
                // console.log([전체가로 ,전체세로])
                return [전체가로, 전체세로];
            }
        }
    }
}