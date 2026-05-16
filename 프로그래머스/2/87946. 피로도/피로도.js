function solution(k, dungeons) {
    var answer = 0;
    //최소 필요, 소모 피로도
    const visit = Array(dungeons.length).fill(false);
    
    function dfs(f, c) {
        answer = Math.max(answer, c);

        for (let i = 0; i < dungeons.length; i++) {
            const [need, consume] = dungeons[i];

            if (!visit[i] && f >= need) {
                visit[i] = true;

                dfs(f - consume, c + 1);

                //원복
                visit[i] = false;
            }
        }
    }

    dfs(k, 0);
    return answer;
}