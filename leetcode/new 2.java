public class Main{
	
	public String help(char[] str) {
		if(str.lenght == 0) {
			return "";
		}
		HashMap<String,Integer> map = new HashMap<>();
		LinkedList<String> list = new LinkedList<>();
		for(int i = 0; i < str.lenght; i++) {
			if(map.containsKay(str[i]) {
				map.put(str[i], map.ged(str[i]) + 1);
			}else {
				map.put(str[i],1);
				list.add(str[i]);
			}
		}
		int min = Integer.MAX_VALUE;
		String res = "";
		int len = list.size();
		for(int i = 0; i < len; i++) {
			String ch = list.pop()
			int temp = map.get(ch);
			if(min > temp) {
				min = temp;
				res = ch;
			}
		}
		return res;
		System.out.println(res);
	}

	
}