package day0922;

public class Ex01MVC {
   /*
    *  ��ü������ 5��Ģ ��
    *  ����å�ӿ�Ģ(SRP)��� ��Ģ�� �ִ�.
    *  �� ��Ģ�� Ŭ������ �� �ϳ��� å���� ����� �Ѵٰ� ���Ѵ�.
    *  �ϳ��� å���̶�, UI�� ����ϴ� Ŭ������ UI�� ����ϰ�, 
    *  ������ ��Ʈ���� ����ϴ� Ŭ������ ������ ��Ʈ�Ѹ� ����ؾ��Ѵٰ� �ϴ°��̴�.
    *  UI�� ����ڰ� ���� ���α׷� ȭ���� UI��� �Ѵ�.(User Interface)
    *  
    *  ������ ���ݱ��� �츮�� ������� Ŭ�������� �̷��� ����å�ӿ�Ģ�� ��Ű�� �ʾҴ�.
    *  �츮�� ���ݱ��� ������� Ŭ�������� Student�� Car Ŭ������ �����ϰ� ��������
    *  ��δ� ���� �޼ҵ尡 �ִ� Ex ��� Ŭ������ �� �����ھҴ�.
    *  
    *  �̷��� �Ǿ��� ������ �츮�� ���α׷� ������ �ٲٰų� UI�� �ٲٱ� ���ؼ���
    *  Ex�� ������ ��� �ٲ��� �Ѵ�!
    *  
    *  ���� ����å�ӿ�Ģ�� ����� ������ ���α׷��̶��
    *  �츮�� ���� ������ ������ �ִٸ� �ش��ϴ� Ŭ�����鸸 ������ �����ָ� �ȴ�.
    *  
    *  �̷� ����å�ӿ�Ģ�� ��Ű�� ���� ������ ������ ���� �����Ѱ� �ٷ�
    *  MVC �����̶� ���̴�.
    *  
    *  MVC �����̶� Ŭ������ ������ 3���� �����
    *  ���ε��� ������ Ŭ������ �Ѱ��� å���� ������ ����� �����̴�.
    *  
    *  M: Model
    *     ���̶�, �ش� ���α׷����� ����� �������� Ʋ�� �����س��� Ŭ�����̴�.
    *     �ʵ�, ����/����, equals(), toString() ������ �޼ҵ常 ���� ���� ������ ������ Ŭ�����̸� 
    *     �ʵ��� ��� ���� �����ͺ��̽��� ���� ��� ���̺��� �Ȱ��� �����ش�.
    *     ���� ��� ���̺��� �ִ� �÷��� int id, String name, ����� �÷��� ������
    *     �Ȱ��� ������ָ� �ȴ�!
    *     �̸����� �׻� DTO(Data Transfer Object)�� VO(Value Object)�� ����.
    * 
    *  V: View
    *     ���, ����ڰ� ������ ���ԵǴ� ȭ���� ���� �Ѵ�.
    *     �����е��� ���� �� ���α׷����� �ϰ� �ȴٸ� ��� �� ���������� �ߴ� HTML �Ǵ� JSP�� �ȴ�.
    *     �����е��� ����� ���α׷����� �ϰ� �ȴٸ� �ȵ���̵� Ȥ�� iOS���� ��µǴ� ȭ���� �䰡 �ȴ�.
    *  
    *  C: Controller // �����ͺ��̽��� ����Ǵ� ���� ��Ʈ�ѷ� ���̶�� �Ѵ�
    *     ��Ʈ�ѷ��� �信�� ����ڰ� ��û�� ������ �𵨿� ��Ƽ� �ٽ� ��� �����ִ� ������ �߰��ٸ� ������ �ϴ� Ŭ�����̴�.
    *     ���� ���, �Խ��� ��� ���⸦ ����ڰ� �����ϸ� ��Ʈ�ѷ��� �ش��ϴ� ������ ArrayList�� ��Ƽ�
    *     �ٽ� ��� �����ִ� ������ �ϰ� �ȴ�.
    *     
    *  ���� MVC ������ ������ ���� �帧���� ������ �ȴ�.
    *  �信�� ��û -> ��Ʈ�ѷ��� �ش� ��û�� ���߾� �����͸� ���� �� �ٽ� ����� ��� ����
    *  �̷��� �о��� �Ǿ��ֱ� ������ ���� UI�� �����ϸ� �並 �����ϱ⸸ �ϸ� �ǰ� ������ ������ ���ľ� �Ѵٸ� ��Ʈ�ѷ��ʸ� �����ָ� �ȴ�.
    *  
    */
}












