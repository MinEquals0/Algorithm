import java.util.*;

class Solution {
    public int[] solution(String[] genres, int[] plays) {
        
        Map<String, Integer> map = new HashMap<>();
        for(int i = 0; i < genres.length; i++){
            map.put(genres[i], map.getOrDefault(genres[i],0)+plays[i]);
        }

        // 재생 횟수 높은 순으로 내림차순 정렬
        List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());
        list.sort((a,b) -> b.getValue() - a.getValue());

        // 장르 별로 노래 리스트 만들기
        Map<String, List<Song>> songMap = new HashMap<>();

        for(int i = 0; i < genres.length; i++){
            songMap.putIfAbsent(genres[i], new ArrayList<>());

            songMap.get(genres[i]).add(new Song(i, plays[i]));
        }
        // 결과 저장
        List<Integer> result = new ArrayList<>();

        // 장르 순서대로 반복
        for(Map.Entry<String, Integer> e : list){
            String genre = e.getKey();
            List<Song> songs = songMap.get(genre);

            // 노래 정렬
            songs.sort((a,b) -> {
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
