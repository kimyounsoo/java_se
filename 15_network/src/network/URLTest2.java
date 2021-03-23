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
			
			while( (line = br.readLine())!=null) {// line�� null�� �ɶ� �� �ƹ��͵� ������ ������ ���� while��
				line = line.toLowerCase();
				while((index = line.indexOf("14k",index))!= -1) {//-1 �̸�ã������ ���°��̹Ƿ� -1�� �ƴҵ��� ���Ϲ�
					index = index+("14k".length());
					count++;
					//���ٿ� 14k �� �������� ã�� �ε����� 0�� �Ǳ� ������ 14k�� �ִ� ���� �� ���� �ٽ� ã�� �ϱ����ؼ� �̷��� �Ѵ�
				}//while	
				
			}//while
			System.out.println("14k�� ���� = "+ count);
			br.close();
	}
}

//��ҹ��� �������� �� ã������ 14k 14K
