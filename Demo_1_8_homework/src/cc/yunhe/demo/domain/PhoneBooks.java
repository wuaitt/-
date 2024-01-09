package cc.yunhe.demo.domain;

public class PhoneBooks {

    //定义电话本的属性
    private int id;
    private String phone;
    private String sex;
    private int age;

    public PhoneBooks() {
    }

    public PhoneBooks(int id, String phone, String sex, int age) {
        this.id = id;
        this.phone = phone;
        this.sex = sex;
        this.age = age;
    }

    /**
     * 获取
     * @return id
     */
    public int getId() {
        return id;
    }

    /**
     * 设置
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * 获取
     * @return phone
     */
    public String getPhone() {
        return phone;
    }

    /**
     * 设置
     * @param phone
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * 获取
     * @return sex
     */
    public String getSex() {
        return sex;
    }

    /**
     * 设置
     * @param sex
     */
    public void setSex(String sex) {
        this.sex = sex;
    }

    /**
     * 获取
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        return "doMain{id = " + id + ", phone = " + phone + ", sex = " + sex + ", age = " + age + "}";
    }
}
