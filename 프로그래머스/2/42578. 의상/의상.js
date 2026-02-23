function solution(clothes) {
//  종류별 개수만 필요
    var count = new Map();
    
    //구조분해 name, type
    for (const [name, type] of clothes) 
    {
    count.set(type, (count.get(type) || 0) + 1);
    }
    let answer = 1;
    for (const cnt of count.values()) {
    answer *= (cnt + 1);
    }
    return answer - 1;//아무것도 안입는 케이스 제외
}