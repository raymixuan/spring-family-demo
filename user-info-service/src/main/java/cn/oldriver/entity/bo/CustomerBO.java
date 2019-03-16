package cn.oldriver.entity.bo;

/**
 * @Author kejx
 * @Date 2019/3/16 17:05
 */
public class CustomerBO {

    private String name;

    private String address;

    private String cardNo;

    private String cardType;

    private String sex;

    private String age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public String getCardType() {
        return cardType;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "CustomerBO{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", cardNo='" + cardNo + '\'' +
                ", cardType='" + cardType + '\'' +
                ", sex='" + sex + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}
