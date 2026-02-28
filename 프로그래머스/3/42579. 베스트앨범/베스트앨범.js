function solution(genres, plays) {
//     노래의 장르 genres[]배열 노래별 재생횟수 plays배열
    var answer =[];
    //1단계 장르별 총 재생수를 구해 가장 높은것부터 정렬(Map사용)
    const genreCountByType = new Map();
    for(let i =0; i<genres.length;i++){
        genreCountByType.set(genres[i],
            (genreCountByType.get(genres[i]) ?? 0)+plays[i])//??0 이거 안해주면 undefined나올수도
    }
    const sortedgenreCountByType =[...genreCountByType.entries()]
    .sort((a,b)=>b[1]-a[1]).map(p=>p[0]);//장르 담기
    
    const SongsByGeneres = new Map();
    
    for(let i =0; i<genres.length;i++){
        if(!SongsByGeneres.has(genres[i]))
            SongsByGeneres.set(genres[i],[]);//없으면 빈배열
        
        //해당 장르배열에 노래 추가
        SongsByGeneres.get(genres[i]).push({id:i,play:plays[i]});
    }
    for (const genre of sortedgenreCountByType) {
    const list = SongsByGeneres.get(genre);

        //정렬해서 표현
    list.sort((a, b) => {
      if (b.play === a.play) 
          return a.id - b.id;
      return b.play - a.play;
    });

    answer.push(list[0].id);
    if (list.length > 1) 
        answer.push(list[1].id);
  }
    return answer;
}