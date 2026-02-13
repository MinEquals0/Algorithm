import java.util.*;

class Solution {
    public int[] solution(String[] genres, int[] plays) {
        // 장르별 재생 횟수
        Map<String, Integer> map = new HashMap<>();
        for(int i = 0; i < genres.length; i++){
            map.put(genres[i], map.getOrDefault(genres[i],0)+plays[i]);
        }

        // 재생 횟수 높은 순으로 내림차순 정렬
        // [ (POP,900), (BALLAD,200), (HIPHOP,400) ] 구성
        List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());
        list.sort((a,b) -> b.getValue() - a.getValue());

        /* 출력
        for(Map.Entry<String, Integer> e : list){
            System.out.println(e.getKey() + " : " + e.getValue());
        } */

        // 장르 별로 노래 리스트 만들기
        // classic -> [(0,500), (2,150), (3,800)]
        // pop     -> [(1,600), (4,2500)] 이런 구조
        Map<String, List<Song>> songMap = new HashMap<>();

        for(int i = 0; i < genres.length; i++){
            // 해당 장르 리스트 없으면 새로 만듦
            songMap.putIfAbsent(genres[i], new ArrayList<>());

            // 해당 장르 리스트에 노래 추가
            songMap.get(genres[i]).add(new Song(i, plays[i]));
        }
        
        // 결과 저장
        List<Integer> result = new ArrayList<>();

        // 장르 순서대로 반복
        for(Map.Entry<String, Integer> e : list){
            // 현재 탐색 중인 장르 이름
            String genre = e.getKey();
            // 이 장르에 속한 모든 노래 목록
            List<Song> songs = songMap.get(genre);

            // 노래 정렬
            songs.sort((a,b) -> {
                // 재생수 같으면 index(고유번호) 낮은 순
                if(b.play == a.play) {
                    return a.index - b.index;
                }
                return b.play - a.play;
            });

            // 상위 2개 저장
            for(int i = 0; i < Math.min(2, songs.size()); i++){
                result.add(songs.get(i).index);
            }
        }

        // 배열 변환
        int[] answer = new int[result.size()];
        for(int i = 0; i < result.size(); i++){
            answer[i] = result.get(i);
        }
        
        return answer;
    }
    
    static class Song{
        public int index;
        public int play;

        Song (int index, int play){
            this.index = index;
            this.play = play;
        }
    }
}
