function solution(word) {
    var answer = 0;
    const dic = ['A','E','I','O','U']
    //1 5 25 125 625
    const ww=[781, 156, 31,6,1]
    for (let i = 0; i < word.length; i++) {
        answer += dic.indexOf(word[i]) * ww[i] + 1;
    }
    return answer;
}