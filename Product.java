package project;

// 상품 메뉴판 class (자식)
class Product extends Menu {

    // 접근 제어자
    private double price;

    public Product(String name, double price, String description) {
        super(name, description); // 부모 필드 변경 해주기
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
}