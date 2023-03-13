import java.util.*;

class Solution {
    public String[] solution(String[] orders, int[] course) {
        List<String> answerList = new ArrayList<>(); // 정답을 저장할 리스트

        for (int i = 0; i < course.length; i++) {
            int courseLen = course[i];
            Map<String, Integer> orderCountMap = new HashMap<>(); // 각 메뉴 조합이 몇 번 주문되었는지를 저장하는 맵

            for (String order : orders) {
                char[] menuArr = order.toCharArray();
                Arrays.sort(menuArr);
                int orderLen = menuArr.length;

                if (orderLen < courseLen) continue;

                boolean[] visited = new boolean[orderLen];
                comb(orderLen, courseLen, visited, menuArr, orderCountMap, 0);
            }

            if (orderCountMap.isEmpty()) continue;

            List<Map.Entry<String, Integer>> tempList = new ArrayList<>(orderCountMap.entrySet());
            Collections.sort(tempList, (o1, o2) -> o2.getValue().compareTo(o1.getValue()));

            int maxOrderCount = tempList.get(0).getValue();
            if (maxOrderCount < 2) continue;

            for (int j = 0; j < tempList.size(); j++) {
                Map.Entry<String, Integer> entry = tempList.get(j);
                String menu = entry.getKey();
                int orderCount = entry.getValue();

                if (orderCount == maxOrderCount) answerList.add(menu);
                else break;
            }
        }

        Collections.sort(answerList);
        String[] answer = new String[answerList.size()];
        answer = answerList.toArray(answer);

        return answer;
    }

    private void comb(int n, int r, boolean[] visited, char[] menuArr, Map<String, Integer> orderCountMap, int start) {
        if (r == 0) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < n; i++) {
                if (visited[i]) sb.append(menuArr[i]);
            }
            String menuCombination = sb.toString();
            int orderCount = orderCountMap.getOrDefault(menuCombination, 0);
            orderCountMap.put(menuCombination, orderCount + 1);
            return;
        }

        for (int i = start; i < n; i++) {
            visited[i] = true;
            comb(n, r - 1, visited, menuArr, orderCountMap, i + 1);
            visited[i] = false;
        }
    }
}