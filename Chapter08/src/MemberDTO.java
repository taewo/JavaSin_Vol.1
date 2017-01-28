
public class MemberDTO {
    public  String name;
    public String phone;
    public String email;
    
    /**
     * �ƹ� ������ �� ��
     */
    public MemberDTO() {
    }
    
    /**
     * �̸��� �� ��
     * @param name
     */
    public MemberDTO(String name) {
        this.name = name;
    }
    
    /**
     * �̸��� ��ȭ��ȣ�� �� ��
     * @param name
     * @param phone
     */
    public MemberDTO(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }
    
    /**
     * ��� ������ �˰� ���� ��
     * @param name
     * @param phone
     * @param email
     */
    public MemberDTO(String name, String phone, String email) {
        this.name = name;
        this.phone = phone;
        this.email = email;
    }
    
    public static void staticMethod() {
        System.out.println("This is a static method.");
        //System.out.println(name);
    }
}

