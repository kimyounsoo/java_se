package network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class URLTest2 {
		public static void main(String[] args) throws IOException {
			URL url = new URL("http://www.liebli.com/");
			BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));
			
			String line = null;
			int index = 0;
			int count = 0;
			
			while( (line = br.readLine())!=null) {// line이 null이 될때 즉 아무것도 읽을게 없을때 까지 while문
				line = line.toLowerCase();
				while((index = line.indexOf("14k",index))!= -1) {//-1 이면찾을것이 없는것이므로 -1이 아닐동안 와일문
					index = index+("14k".length());
					count++;
					//한줄에 14k 가 여러개면 찾고 인덱스가 0이 되기 때문에 14k가 있는 글자 수 부터 다시 찾게 하기위해서 이렇게 한다
				}//while	
				
			}//while
			System.out.println("14k의 개수 = "+ count);
			br.close();
	}
}

//대소문자 구별없이 다 찾으세요 14k 14K
