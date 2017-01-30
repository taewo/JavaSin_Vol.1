package c.inheritance;

public class MemberDTO {
    public String name;
    public String phone;
    public String email;
    
    public MemberDTO() {
    }
    
    public MemberDTO(String name) {
        this.name = name;
    }
    
    public MemberDTO(String name, String phone, String email) {
        this.name = name;
        this.phone = phone;
        this.email = email;
    }

    public boolean equals(Object obj) {
        if(this == obj) return true;    // �ּҰ� �����Ƿ� �翬�� true
        if(obj == null) return false;   // obj�� null �̹Ƿ� �翬�� false
        if(getClass() != obj.getClass()) return false;  // Ŭ������ ������ �ٸ��Ƿ� false
        
        MemberDTO other = (MemberDTO) obj; // ���� Ŭ�����̹Ƿ� �� ��ȯ ����
        
        // �������ʹ� �� �ν��Ͻ��� ������ ������ ���ϴ� �۾� ����
        if(name == null) { // name �� null �� ��
            if(other.name != null) return false; // �� ����� name�� null�� �ƴϸ� false
        } else if (!name.equals(other.name)) return false; // �� ���� name ���� �ٸ��� false
        
        // name�� ���� �� ����
        if(phone == null) {
            if(other.phone != null) return false;
        } else if (!phone.equals(other.phone)) return false;
        
        if(email == null) {
            if(other.email != null) return false;
        } else if (!email.equals(other.email)) return false;
        
        // ��� ������ ���ļ� false�� �������� �ʴ� ��ü�� ���� ���� ������ ��ü�� �����ؼ� true ����
        return true;
    }
    
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((email == null) ? 0 : email.hashCode());
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((phone == null) ? 0 : phone.hashCode());
        return result;
    }
    
    public String toString() {
        return "Name = " + name + ", Phone = " + phone + ", Email = " + email;
    }
    
}
