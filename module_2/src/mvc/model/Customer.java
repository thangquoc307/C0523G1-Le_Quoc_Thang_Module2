package mvc.model;

public class Customer {
    private Integer id;
    private String name;
    private Integer age;
    private String typeCustomer;

    public Customer(Integer id, String name, Integer age, String typeCustomer) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.typeCustomer = typeCustomer;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getTypeCustomer() {
        return typeCustomer;
    }

    public void setTypeCustomer(String typeCustomer) {
        this.typeCustomer = typeCustomer;
    }
}
