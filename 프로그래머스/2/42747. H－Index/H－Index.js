function solution(citations) {
    var answer = 0;
    citations.sort((a,b)=>b-a);
    let h=0;
    for(let i =0; citations.length;i++){
        if (citations[i] >= i + 1){
            h = i + 1;
        } 
        else{
            break;
        }
            
    }
    return h;
}